public class ThreeMonks{
	public static void main(String[] args) {
		//1.定义三个变量用于保存身高
		int height1 = 150;
		int height2 = 210;
		int height3 = 165;

		//2.用三元运算符获取两个和尚的较高身高值，并用临时身高变量保存
		int tempHeight = height1 > height2 ? height1 : height2;  //先比较任意两个数的值,
																//找出这两个数中的最大值

		//3.用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存
		//用前两个数的最大值与第三个数比较,获取最大值
		int maxHeight = tempHeight > height3 ? tempHeight : height3;

		System.out.println("MaxHeight:"+maxHeight);
	}
}