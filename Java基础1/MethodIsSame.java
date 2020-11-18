public class MethodIsSame {

	public static boolean isSame(int a, int b){
		/*boolean same = a == b ? true : false;*/
		return a == b;
	}



	public static void main(String[] args) {
		System.out.println(isSame(10,20));
		System.out.println(isSame(10,10));
	}
}