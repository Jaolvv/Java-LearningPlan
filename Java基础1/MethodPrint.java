public class MethodPrint{

	public static void printCount(int num){
		for(int i = 0;i < num;i++){
			System.out.println("HelloWorld"+"--"+(i+1));
		}
	}



	public static void main(String[] args) {
		printCount(13);
	}
}