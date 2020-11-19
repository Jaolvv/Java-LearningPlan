package 方法;

/*
方法就是若干语句的功能集合

参数：进入方法的数据
返回值:从方法中出来的数据

定义方法的格式：
修饰符 返回值类型 方法名称(参数类型 参数名称,....){
           方法体.....
           return 返回值;
}
修饰符现阶段的固定写法：public static
返回值类型：也就是方法最终产生的数据结果是什么类型
参数类型：进入方法d的数据是什么类型
参数名称：进入方法的数据对应的变量名称
* */

public class Demo2MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,30);
        System.out.println("=====我是分割=====");

        //打印调用
        System.out.println(sum(10,40));
        System.out.println("=====我是分割=====");

        //赋值调用
        int number = sum(15,58);
        number +=100;
        System.out.println("变量的值:"+number);

    }

    public static int sum(int a ,int b){
        System.out.println("方法调用了");
        int result = a + b;
        return result;
    }
}
