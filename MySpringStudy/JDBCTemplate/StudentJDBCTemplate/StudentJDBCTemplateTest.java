package com.jaolvv.StudentJDBCTemplate;

import com.jaolvv.JDBCdatabase.Account;
import com.jaolvv.JDBCdatabase.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/26/2021 5:30 PM
 * @ClassName StudentJDBCTemplateTest
 * @Author Liu
 * 注释/说明：
 **/

public class StudentJDBCTemplateTest {

    @Test   //创建Mysql数据库;“Spring”下的Student表
    public void creatTable() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        JdbcTemplate jdbcTemplate =(JdbcTemplate)context.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table student("+
                "id int primary key auto_increment,"+
                "name varchar(200),"+
                "age int,"+
                "phone varchar(20))");
        System.out.println("学生表创建成功");
    }

    @Test   //新增学生
    public void addStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        Student student = new Student();
        student.setName("Peter");
        student.setAge(43);
        student.setPhone("1234456754");
        studentDao.addStudent(student);
        System.out.println(student);
    }

    @Test   //删除功能
    public void deleteAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        studentDao.deleteStudent(4);
    }

    @Test   //更新
    public void updateStudents(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        Student student = new Student();
        student.setName("ZhangXiaoLin");
        student.setId(5);
        student.setAge(34);
        student.setPhone("123143523");
        studentDao.updateStudent(student);
    }

    @Test   //通过ID查找学生
    public void findStudentById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        Student student = studentDao.findStudentById(3);
        System.out.println(student);
    }

    @Test   //查询所有账户信息
    public void findStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/StudentJDBCTemplate/applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        List<Student> list = studentDao.findStudent();
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
