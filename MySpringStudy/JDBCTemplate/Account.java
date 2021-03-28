package com.jaolvv.JDBCdatabase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/25/2021 6:44 PM
 * @ClassName Account
 * @Author Liu
 * 注释/说明：
 *          Account类，加上相应的属性
 **/

public class Account {

    private int id; //UserID
    private String username;    //UserName
    private double balance; //UserBalance

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
