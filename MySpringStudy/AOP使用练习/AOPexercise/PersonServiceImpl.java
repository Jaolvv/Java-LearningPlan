package com.jaolvv.AOPexercise;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 6:09 PM
 * @ClassName PersonServiceImpl
 * @Author Liu
 * 注释/说明：
 **/

public class PersonServiceImpl implements PersonService {
    @Override
    public void save(String name) {
        throw new RuntimeException("异常");
    }

    @Override
    public void update(String name, int id) {
        System.out.println("我是update方法");
    }

    @Override
    public String getPersonName(int id) {
        System.out.println("我是getPersonName方法");
        return "jaolvv";
    }
}
