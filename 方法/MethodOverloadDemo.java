package 方法;

public class MethodOverloadDemo {
    int height;
    MethodOverloadDemo(){
        System.out.println("无参数构造函数");
        height = 4;
    }

    MethodOverloadDemo(int i){
        System.out.println("房子高度为:"+i+"米");
        height = i;
    }

    void info(){
        System.out.println("房子高度为 " + height + " 米");
    }
    void info(String s){
        System.out.println(s + ": 房子高度为 " + height + " 米");
    }

    public static void main(String[] args) {
        MethodOverloadDemo My1 = new MethodOverloadDemo(3);
        My1.info();
        My1.info("重载方法");
        //重载构造函数
        new MethodOverloadDemo();
    }
}
