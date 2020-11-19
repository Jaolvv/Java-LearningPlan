package 面向对象;


//注意事项：
/*1.成员变量是直接定义在类当中的，在方法外面
2.成员方法不要写static关键字*/

public class Student {
    //成员变量
    String name;
    int age;
    double height;
    String school;

    //成员方法
    public void eat(){
        System.out.println("调用了eat()方法");
    }

    public void sleep(){
        System.out.println("调用了sleep()方法");
    }

    public void run(){
        System.out.println("调用了run()方法");
    }



}
