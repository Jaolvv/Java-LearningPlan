package com.zcloud.issue.dao;

import com.zcloud.issue.entity.Issue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IssueDao {
    /**
     *添加缺陷
     * @return
     */
    public    void create(Issue issue){
        String[] sql = new String[1];

        sql[0]= "insert  into issue_list "
                +" ( id, name , type , remark , state )"
                +" values ( "
                +"'"+issue.getId()+"',"
                +"'"+issue.getName()+"',"
                +"'"+issue.getType()+"',"
                +"'"+issue.getRemark()+"',"
                +"'"+issue.getState()+"'"
                +" ) ";

        Dao.updateBatch(sql[0]);
    }

    /**
     *更新缺陷
     * @return
     */
    public    void update(Issue issue){
        String[] sql = new String[1];
        sql[0]= "update issue_list set"
                +" name = "+"'"+issue.getName()+"',"
                +" type = "+"'"+issue.getType()+"',"
                +" remark = "+"'"+issue.getRemark()+"',"
                +" state = "+"'"+issue.getState()+"'"
                +" where id = "+issue.getId();
        Dao.updateBatch(sql[0]);
    }

    /**
     * 删除缺陷
     */
    public   void delete(String id){
        String[] sql = new String[1];
        sql[0]= " delete from issue_list where id="+id;
        Dao.updateBatch(sql);
    }

    /**
     * 查询缺陷列表
     * @param
     * @return
     */
    public    List<Issue> findIssueList(){
        List<Issue> issues =new ArrayList<>();
        String  sql= " select * from  issue_list order by id";
        for (Map<String, String> map:Dao.queryForList(sql)){
            Issue issue =new Issue();
            issue.setId(map.get("id"));
            issue.setName(map.get("name"));
            issue.setType(map.get("type"));
            issue.setRemark(map.get("remark"));
            issue.setState(map.get("state"));
            issues.add(issue);
        }
        return issues;
    }

    /**
     * 查询缺陷详情
     * @param id
     * @return
     */
    public   Issue findIssueOne(String id){
        String  sql= " select * from issue_list where id="+id;
        Map<String, String> map = Dao.queryForMap(sql);

        Issue issue =new Issue();
        issue.setId(map.get("id"));
        issue.setName(map.get("name"));
        issue.setType(map.get("type"));
        issue.setRemark(map.get("remark"));
        issue.setState(map.get("state"));

        return issue;
    }

    /**
     * 查询缺陷列表
     * @param
     * @return
     */
    public    List<Issue> findByName(String name){
        List<Issue> issues =new ArrayList<>();
        String  sql= " select * from  issue_list " +
                "where name like '%" +name+"%'"+ " order by id";
        for (Map<String, String> map:Dao.queryForList(sql)){
            Issue issue =new Issue();
            issue.setId(map.get("id"));
            issue.setName(map.get("name"));
            issue.setType(map.get("type"));
            issue.setRemark(map.get("remark"));
            issue.setState(map.get("state"));
            issues.add(issue);
        }
        return issues;
    }

}
