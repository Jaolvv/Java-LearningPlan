package 方法;

public class Demo3MethodParam {
    public static void main(String[] args) {

        method1(45,24);

        System.out.println("--------------");

        method2();
    }

    //两个数字相乘，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("相乘结果为:"+result);
    }

    //打印输出固定10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World" +" "+ i);
        }
    }
}
