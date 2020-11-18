import java.util.Scanner;
public class IfTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a Integer:");

		int number = sc.nextInt();

		if(number%2==0){
			System.out.println(number +" is even Number");
		}else{
			System.out.println(number +" is odd Number");
		}
	}
}