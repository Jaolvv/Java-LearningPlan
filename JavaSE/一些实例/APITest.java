package Java实例;

import java.util.Scanner;

public class APITest {
    public static void main(String[] args) {
        while(true){
            //声明对象Scanner,System.in代表标准输入，就是键盘输入
            Scanner s = new Scanner(System.in);
            System.out.println("Please input:");//输入提示
            String line = s.nextLine();//读取输入的字符放入line中
            if(line.equals("exit")) break;//如果输入的内容是exit就会停止运行了
            //使用length计算输入的文本的个数
            System.out.println("Number of text input:"+line.length());
        }
    }
}
