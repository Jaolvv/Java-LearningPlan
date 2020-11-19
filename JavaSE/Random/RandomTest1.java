package Bili.Random;

import java.util.Random;

//限定范围的Random
public class RandomTest1 {
    public static void main(String[] args) {
        Random r = new Random();

        //随机输出0~50之间的随机数
        for (int i = 0; i < 15; i++) {
            int num = r.nextInt(10);//实际范围0~9
            System.out.println(num);
        }
    }
}
