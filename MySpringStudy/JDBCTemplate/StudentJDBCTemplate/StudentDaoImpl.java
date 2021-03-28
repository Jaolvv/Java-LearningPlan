package com.jaolvv.StudentJDBCTemplate;

import com.jaolvv.JDBCdatabase.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/26/2021 5:17 PM
 * @ClassName StudentDaoImpl
 * @Author Liu
 * 注释/说明：
 *      //通过JdbcTemplate实现对数据库的更新 删除 添加
 *     //jdbcTemplate.update();增删改都用的update()
 **/

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override   //新增学生
    public void addStudent(Student student) {
        String sql = "insert into student(name,age,phone) values(?,?,?)";
        int result =  jdbcTemplate.update(sql,student.getName(), student.getAge(),student.getPhone());
        if (result > 0){
            System.out.println("插入了 "+result+" 行数据");
        }else {
            System.out.println("插入失败！");
        }
    }

    @Override   //删除学生
    public void deleteStudent(int id) {
        String sql = "delete from student where id=?";
        int result =  jdbcTemplate.update(sql,id);
        if (result > 0){
            System.out.println("删除了 "+result+" 行数据");
        }else {
            System.out.println("删除失败！");
        }
    }

    @Override   //更新学生信息
    public void updateStudent(Student student) {
        String sql = "update student set name = ?,age = ? where id = ?";
        int result =  jdbcTemplate.update(sql,student.getName(),student.getAge(),student.getId());
        if (result > 0){
            System.out.println("修改了  "+result+" 行数据");
        }else {
            System.out.println("更新失败！");
        }
    }

    @Override   //通过id查找某学生
    public Student findStudentById(int id) {
        String sql="select * from student where id=?";
        //RowMapper 行的 映射:指两个元素的集之间元素相互“对应”的关系
        RowMapper<Student> rowMapper=new BeanPropertyRowMapper<Student>(Student.class);
        Student student=jdbcTemplate.queryForObject(sql, rowMapper,id);
        return student;
    }

    @Override   //查询所有学生信息
    public List<Student> findStudent() {
        String sql="select * from student";
        RowMapper<Student> rowMapper=new BeanPropertyRowMapper<Student>(Student.class);
        List<Student> list=jdbcTemplate.query(sql, rowMapper);
        return list;
    }
}
