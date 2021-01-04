package com.zcloud.issue.dao;

import java.sql.*;

public class SQLConnectionTest {
    public static void main(String[] args) throws Exception {
        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/WebStore?&useSSL=false&serverTimezone=UTC";
        String sql = "SELECT * FROM products";
        try {
            Connection conn = DriverManager.getConnection(jdbcUrl,"root","112800");
            Statement statement = conn.createStatement();
            ResultSet rst = statement.executeQuery(sql);
            while (rst.next()){
                System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+
                        rst.getString(3)+ "\t"+rst.getFloat(4) + "\t"
                        + rst.getInt(5));
            }
        } catch (SQLException se) {
           se.printStackTrace();
        }

    }
}
