public class ForTest02{
	public static void main(String[] args) {
		int sum = 0;

		for(int i=1;i<=5;i++){
			sum +=i;
			/*
			sum += i;  sum = sum+1;
			1 sum = sum + i = 0 + 1 = 1;
			2 sum = sum + i = 1 + 2 = 3;
			3 sum = sum + i = 3 + 3 = 6;
			4 sum = sum + i = 6 + 4 = 10;
			5 sum = sum + i = 1= + 5 = 15;
			*/

		}
		System.out.println("1-5:"+sum);
	}
}
