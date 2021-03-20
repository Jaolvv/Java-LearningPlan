package com.jaolvv.AOPexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/20/2021 6:31 PMw
 * @ClassName AopTest
 * @Author Liu
 * 注释/说明：
 *         测试类
 **/

public class AopTest {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jaolvv/AOPexercise/applicationContxt.xml");
        // 创建对象
        PersonService service = (PersonService) context.getBean("personService");
        service.save(":Liu");
        service.getPersonName(2);
    }
}
