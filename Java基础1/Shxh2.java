
public class Shxh2{
	public static void main(String[] args) {
		//定义变量的Count，用于保存“水仙花数”的数量，初始0
		int count = 0;

		//遍历所有三位数，三位数从100开始，到999结束
		for(int i = 100;i<1000;i++){
		//在计算之前获取三位数中每个位上的值
		int g = i%10;
		int s = i/10%10;
		int b = i/10/10%10;

		//判定水仙花数过程中，满足条件不再输出，更改为count的值，使Count+1
		if(g*g*g + s*s*s + b*b*b == i){
			count++;
			}
		}

		System.out.println("水仙花有："+ count +"个");
	}
}