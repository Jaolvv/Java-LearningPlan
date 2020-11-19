package Studying;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number");
        int a = sc.nextInt();
        System.out.println("Please Enter an other Number");
        int b = sc.nextInt();

        int result =a + b;
        System.out.println(a+"+"+b+"的结果是："+result);
    }
}
