package com.jaolvv.AOPexercise.Second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 6:50 PM
 * @ClassName PersonTest
 * @Author Liu
 * 注释/说明：
 **/

public class PersonTest {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/AOPexercise/Second/applicationContext2.xml");
        // 创建对象
        Person person = (Person) context.getBean("person");
        person.save();
    }
}
