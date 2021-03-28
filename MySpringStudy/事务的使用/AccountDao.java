package com.jaolvv.JDBCdatabase;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/25/2021 6:43 PM
 * @ClassName AccountDao
 * @Author Liu
 * 注释/说明：
 *          对数据库进行增删改查的接口
 **/

public interface AccountDao {

    //add Account
    public void addAccount(Account account);//指定Account类，将值封装到了Account类里面去  == (int id, String name, double balance)

    //delete Account
    public void deleteAccount(int account);

    //update Account
    public void updateAccount(Account account);

    //根据id查询账户
    public Account findAccountById(int id);


    //查询所有账户信息
    public List<Account> findAccount();

    //模拟转账方法
    public void transfer(String outAccount,String inAccount,Double money);

}
