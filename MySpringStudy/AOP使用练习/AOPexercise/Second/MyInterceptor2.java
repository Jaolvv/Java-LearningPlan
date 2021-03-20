package com.jaolvv.AOPexercise.Second;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 6:43 PM
 * @ClassName MyInterceptor2
 * @Author Liu
 * 注释/说明：
 **/

public class MyInterceptor2 {
    public void doAccessCheck() {
        System.out.println("前置通知");
    }

    public void doAfterReturning() {
        System.out.println("后置通知");
    }

    public void doAfter() {
        System.out.println("最终通知");
    }

    public void doAfterThrowing() {
        System.out.println("异常通知");
    }

    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法");
        Object result = pjp.proceed();
        System.out.println("退出方法");
        return result;
    }

}
