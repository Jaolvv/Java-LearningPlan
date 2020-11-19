package Studying;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();
        System.out.println("Please enter the third number");
        int c = sc.nextInt();

        int temp = a > b ? a:b;
        int max = temp > c ? temp : c;
        System.out.println("你输入的 "+a+" "+b+" "+c+" 中，最大值是"+max);
    }
}
