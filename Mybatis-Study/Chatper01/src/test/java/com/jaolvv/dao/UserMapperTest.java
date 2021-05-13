package com.jaolvv.dao;

import com.jaolvv.pojo.User;
import com.jaolvv.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 4/1/2021 6:39 PM
 * @ClassName UserDaoTest
 * @Author Liu
 * 注释/说明：
 **/

public class UserMapperTest {

    @Test//获取UserList
    public void test(){
        //第一步：h获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();

    }

    @Test//通过id获取用户
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userById = userMapper.getUserById(1001);
        System.out.println(userById);

    }

    @Test//添加用户:注意事务提交和关闭事务
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(1009,"JianHong","1457345452");
        userMapper.addUser(user);
        System.out.println("添加成功: " + user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test//通过ID删除用户
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUserById(1008);
        System.out.println("删除用户成功");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test//修改用户
    public void modify(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(1007,"Laina","45234233");
        userMapper.modify(user);
        System.out.println("修改用户成功："+user);
        sqlSession.commit();
        sqlSession.close();
    }

}
