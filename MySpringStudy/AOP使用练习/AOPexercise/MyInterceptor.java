package com.jaolvv.AOPexercise;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// 声明当前类为切面类
@Aspect
public class MyInterceptor {

    // 声明一个切入点，anyMethod为切入点名称
    @Pointcut("execution (* com.jaolvv.AOPexercise.PersonServiceImpl.*(..))")
    private void anyMethod(){
    }

    // 声明该方法是一个前置通知，在目标方法开始之前执行
    @Before("anyMethod() && args(name)")
    public void doAccessCheck(String name){
        System.out.println("前置通知" + name);
    }

    // 声明一个后置通知
    @AfterReturning(pointcut = "anyMethod()", returning = "result")
    public void doAfterReturning(String result){
        System.out.println("后置通知" + result);
    }

    //声明一个最终通知
    @After("anyMethod()")
    public void doAfter(){
        System.out.println("最终通知");
    }

    //声明一个异常通知
    @AfterThrowing(pointcut = "anyMethod()", throwing = "exception")
    public void doAfterThrowing(Exception exception){
        System.out.println("异常通知" + exception);
    }

    /**
     *
     * @param pjp
     * @return
     * @throws Throwable
     * 环绕通知内部一定要确保执行proceed()该方法
     * 如果不执行该方法，业务bean中被拦截的方法就不会被执行
     * 当执行该方法，如果后面还有切面的话
     * 它的执行顺序应该是这样的：
     *      先执行后面的切面，如果后面没有切面了，再执行最终的目标对象的业务方法。
     * 若不执行该方法，则后面的切面，业务bean的方法都不会被执行
     *
     */

    // 环绕通知，环绕通知方法的写法固定
    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("进入方法");
        Object result = pjp.proceed();
        System.out.println("退出方法");
        return result;
    }

}
