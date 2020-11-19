package Studying;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int Number = r.nextInt(10) +1;

        Scanner s = new Scanner(System.in);

        int count = 0;//记录猜测次数

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your GuessNumber");
            int guessNumber = s.nextInt();
            count++;
            if (guessNumber > Number){
                System.out.println("Big than target");
            }else if(guessNumber < Number){
                System.out.println("Less than target");
            }else if(guessNumber == Number){
                System.out.println("Right!");
                break;
            }
            
        }

    }
}
