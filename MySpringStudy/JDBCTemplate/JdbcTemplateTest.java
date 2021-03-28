package com.jaolvv.JDBCdatabase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 8:09 PM
 * @ClassName JdbcTemplateTest
 * @Author Liu
 * 注释/说明：
 **/

public class JdbcTemplateTest {
    @Test   //创建Mysql数据库;“Spring”下的account表
    public  void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        JdbcTemplate jdbcTemplate =(JdbcTemplate)context.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table account("+
                "id int primary key auto_increment,"+
                "username varchar(100),"+
                "balance double)");
        System.out.println("账户表创建成功");
    }

    @Test   //添加功能
    public void addAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
        Account account = new Account();
        account.setName("wangda");
        account.setBalance(9000.00);
        accountDao.addAccount(account);
    }

    @Test   //删除功能
    public void deleteAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
        accountDao.deleteAccount(4);
    }

    @Test   //更新功能
    public void updateAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
        Account account = new Account();
        account.setName("zhangsan3");
        account.setId(3);
        account.setBalance(7000.00);
        accountDao.updateAccount(account);
    }

    @Test   //查找功能ById
    public void findAccountById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
        Account account = accountDao.findAccountById(5);
        System.out.println(account);
    }

    @Test   //查询所有账户信息
    public void findAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/JDBCdatabase/applicationContext.xml");
        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
        List<Account> list = accountDao.findAccount();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}