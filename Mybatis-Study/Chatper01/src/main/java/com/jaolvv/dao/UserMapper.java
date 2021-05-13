package com.jaolvv.dao;

import com.jaolvv.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 4/1/2021 5:56 PM
 * @ClassName UserDao
 * @Author Liu
 * 注释/说明：
 **/

public interface UserMapper {
    List<User> getUserList();

    //通过Idh获取用户
    User getUserById(int id);

    //添加一个用户
    int addUser(User user);

    //通过id删除一个用户
    int deleteUserById(int id);

    //修改用户
    int modify(User user);
}
