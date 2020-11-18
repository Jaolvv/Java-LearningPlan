public class Shxh{
	public static void main(String[] args) {
		//遍历所有的三位数，三位数从100开始，到999结束
		for(int i =100;i<1000;i++){
			//计算之前获取三位数中每个位上的值
			int g = i%10;
			int s = i/10%10;
			int b = i/10/10%10;

			//判断条件是三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
			if(g*g*g + s*s*s + b*b*b == i){
				//输出就是水仙花
				System.out.println(i);
			}
		}
	}
}