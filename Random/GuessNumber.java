package Bili.Random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10) + 1;//[1,10]

        Scanner sc = new Scanner(System.in);

        int count = 0;//记录猜测次数

        while (true){
            System.out.println("Enter your GuessNumber");
            int guessNumber = sc.nextInt();
            count++;
            if (guessNumber > number){
                System.out.println("Big than target");
            }else if(guessNumber < number){
                System.out.println("Less than target");
            }else if(guessNumber == number){
                System.out.println("Right!");
                break;
            }else {
                System.out.println("Please Enter Number 1~10");
            }
        }
        System.out.println("Guessed "+count+" times");
    }
}
