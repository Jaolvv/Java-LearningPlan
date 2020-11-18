public class ForTest03{
	public static void main(String[] args) {
		//求和的最终结果必须保存起来，需要定义一个变量 用于保存求和变量
		int sum = 0;//初始值为0

		//对1-100的数据求和与1-5一样，结束条件不同
		for (int i=1;i<=100;i++){
			// 对1-100的数据求和，需要对求和操作添加添加限制条件，判断是否是偶数
			if(i%2 == 0){
				sum +=i;
			}
		}
		System.out.println("1-10偶数之和是： "+sum);
	}
}