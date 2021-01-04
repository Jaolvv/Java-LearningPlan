package com.zcloud.issue.dao;

import javax.naming.*;
import javax.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;


public class Dao {
    public static String flag = "";
    public static ResourceBundle rb = ResourceBundle.getBundle("application");

    private static Connection getConnection() {
        Connection con = null;
        String type = rb.getString("TYPE");
        String jndiName = rb.getString("JNDI");
        if (type.equals("JNDI")) {
            con = getConnectionForJNDI(jndiName);
        }
        if (type.equals("JDBC")) {
            con = getConnectionForJDBC();
        }
        return con;
    }

    /**
     * 取得数据库连接（JNDI）
     */
    private static Connection getConnectionForJNDI(String jndiName) {

        DataSource ds = null;

        InitialContext ic;

        try {
            ic = new InitialContext();

            ds = (DataSource) ic.lookup(jndiName);

            return (Connection) ds.getConnection();

        } catch (SQLException e) {

            flag = "数据库连接失败!";

            return null;
        } catch (NamingException e) {

            flag = "数据库连接失败，数据库连接池参数配置错误！";

            return null;
        }
    }

    /**
     * 取得数据库连接（JDBC）
     */
    private static Connection getConnectionForJDBC() {
        Connection conn = null;
        String jdbcUrl = rb.getString("JDBC_URL");
        String jdbcDriver = rb.getString("JDBC_DRIVER");
        String user = rb.getString("USER");
        String pwd = rb.getString("PASSWORD");
        try {
            Class.forName(jdbcDriver);
            conn = (Connection) DriverManager.getConnection(jdbcUrl, user, pwd);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
            flag = "数据库连接失败,JDBC连接参数配置不正确!";
        } catch (SQLException e) {
            e.printStackTrace();
            flag = "数据库连接失败!";
        }
        return conn;
    }

    public static Map<String, String> queryForMap(String SQL) {
        Map<String, String> resultData = new HashMap<String, String>();
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = ps.getMetaData();
            int ColCount = rsm.getColumnCount();
            boolean state = true;
            while (rs.next()) {
                if (state) {
                    for (int i = 1; i <= ColCount; i++) {
                        String key = rsm.getColumnName(i).trim();
                        String val = rs.getString(i) == null ? "" : rs.getString(i).trim();
                        resultData.put(key, val);
                    }
                    state = false;
                } else break;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignored) {
                }
            }
            e.printStackTrace();
            resultData = null;
        }
        return resultData;
    }

    /**
     * 通过sql查询返回List<map>对象
     */
    public static List<Map<String, String>> queryForList(String SQL) {
        List<Map<String, String>> resultData = new ArrayList<Map<String, String>>();
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = ps.getMetaData();
            int ColCount = rsm.getColumnCount();  //列数.
            int k = 0;
            while (rs.next()) {
                Map<String, String> hm = new HashMap<String, String>();
                for (int i = 1; i <= ColCount; i++) {
                    String key = "";
                    String val = "";
                    key = rsm.getColumnName(i).trim();
                    val = rs.getString(i) == null ? "" : rs.getString(i).trim();
                    hm.put(key, val);
                }
                resultData.add(k, hm);
                k++;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignored) {
                }
            }
            e.printStackTrace();
            resultData = null;
        }
        return resultData;
    }

    /**
     * 批量执行，实现插入修改，成功返回TRUE,失败返回FALSE
     */
    public static Boolean updateBatch(String... SQL) {
        Connection con = null;
        try { con = getConnection();
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            for (String sql : SQL) { if (sql != null && !sql.equals("")) stmt.addBatch(sql); }
            stmt.executeBatch();
            stmt.close();
            con.commit();
            con.setAutoCommit(true);
            con.close();
        } catch (SQLException e) { e.printStackTrace();
            try { con.rollback();
                con.close();
                return false;
            } catch (Exception e2) { return false; }
        }
        return true;
    }

}