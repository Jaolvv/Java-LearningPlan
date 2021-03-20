package com.jaolvv.AOPexercise.Second;

import com.jaolvv.AOPexercise.Second.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 6:42 PM
 * @ClassName PersonImpl
 * @Author Liu
 * 注释/说明：
 **/

public class PersonImpl implements Person {
    @Override
    public void save() {
        System.out.println("我是save方法");
        throw new RuntimeException("jaolvv");
    }
}
