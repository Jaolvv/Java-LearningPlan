package Studying;
import java.util.Scanner;

//用法：
//对象名.成员方法
//获取键盘输入的一个int数字：int num = sc.nextInt();
//获取键盘输入的一个字符串: String str = sc.next();

public class ScannerStudyDemo {
    public static void main(String[] args) {
        //创建
        //备注：System.in 代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number or string");

        //获取键盘输入的int数字或者字符串
        String str = sc.next();
        System.out.println("输入的字符串是："+str);
        int num = sc.nextInt();
        System.out.println("输入的数字："+num);
    }
}
