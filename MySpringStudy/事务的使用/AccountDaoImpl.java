package com.jaolvv.JDBCdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/25/2021 6:52 PM
 * @ClassName AccountDaoImpl
 * @Author Liu
 * 注释/说明：
 *      重写AccountDao类的方法
 **/

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //通过JdbcTemplate实现对数据库的更新 删除 添加
    //jdbcTemplate.update();增删改查都用的update()
    @Override
    public void addAccount(Account account) {
        String sql = "insert into account(username,balance) values(?,?)";
        int result =  jdbcTemplate.update(sql,account.getName(),account.getBalance());
        if (result > 0){
            System.out.println("插入了 "+result+" 行数据");
        }else {
            System.out.println("插入失败！");
        }
    }

    //删除
    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        int result =  jdbcTemplate.update(sql, id);
        if (result > 0){
            System.out.println("删除了 "+result+" 行数据");
        }else {
            System.out.println("删除失败！");
        }
    }

    //更新
    @Override
    public void updateAccount(Account account) {
        String sql = "update account set username = ?,balance = ? where id = ?";
        int result =  jdbcTemplate.update(sql,account.getName(),account.getBalance(),account.getId());
        if (result > 0){
            System.out.println("修改了  "+result+" 行数据");
        }else {
            System.out.println("更新失败！");
        }
    }

    //根据id查询账户
    @Override
    public Account findAccountById(int id) {
        String sql="select * from account where id=?";
        //RowMapper 行的 映射:指两个元素的集之间元素相互“对应”的关系
        RowMapper<Account> rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
        Account account=jdbcTemplate.queryForObject(sql, rowMapper,id);
        return account;
    }


    //查询所有账户信息
    @Override
    public List<Account> findAccount() {
        String sql="select * from account";
        RowMapper<Account> rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
        List<Account> list=jdbcTemplate.query(sql, rowMapper);
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void transfer(String outAccount, String inAccount, Double money) {
        //收款，收款账号的金额=收款账号的金额+money
        String sql1 = "update account set balance=balance+? where username=?";
        jdbcTemplate.update(sql1, money, inAccount);

        //汇款，汇款账号的金额=汇款账号的金额-money
        String sql2 = "update account set balance=balance-? where username=?";
        jdbcTemplate.update(sql2,money,outAccount);
    }


}
