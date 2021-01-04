package com.zcloud.issue.service;

import com.zcloud.issue.dao.IssueDao;
import com.zcloud.issue.entity.Issue;
import com.zcloud.issue.util.Random;

import java.util.List;

public class IssueManager {

    private final IssueDao issueDao = new IssueDao();

    public Boolean saveIssue(Issue issue) throws Exception {
        try {
            //判断issue是新增还是修改
            if (issue.getId().equals("")) {
                //执行新增
                issue.setId(Random.next());
                issueDao.create(issue);
            } else {
                //执行更新
                issueDao.update(issue);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public List<Issue> find(String name) {
        if (name == null) return issueDao.findIssueList();
        return issueDao.findByName(name);
    }

}
