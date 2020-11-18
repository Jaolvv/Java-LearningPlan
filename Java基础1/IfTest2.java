import java.util.Scanner;

public class IfTest2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a Number:");
		int score = sc.nextInt();

		if(score>100 || score<0){
			System.out.println("Wrong Number!");
		}else if(score>=95 && score<=100){
			System.out.println("One mountain bike");
		}else if(score>=90 && score<=94){
			System.out.println("Play once in the amusement park");
		}else if(score>=80 && score<=89){
			System.out.println("Transformers toys");
		}else{
			System.out.println("bE EDUCATED!!!!");
		}

	}
}