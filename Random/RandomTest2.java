package Bili.Random;

/*要求：根据int变量n的值，来获取随机数字，范围[1,n]，也可取到1也可取到n*/

/*1.定义一个int变量n，随意赋值
2.如果写10，那么就是0~9。必须整体+1*/

import java.util.Random;

public class RandomTest2 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            //本来范围[0,n),整体+1变成[1,n+1),也就是[1,n]
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }
    }
}
