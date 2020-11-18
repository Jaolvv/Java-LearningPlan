/*世界最高山峰是珠穆朗玛峰（8844.43m = 8844430ms,）
假如我有一张足够大的纸，厚0.1ms，问折叠多少次可达珠峰高度？
*/
public class Everest{
	public static void main(String[] args) {
		//定义计算器，初始0
		int count = 0;
		//定义纸厚度
		double paper = 0.1;
		//定义珠峰高度
		int zf = 8844430;

		//使用循环，折叠过程中厚度大于珠峰就停止
		//在不知道要折叠多少次的情况下用while循环
		while(paper <= zf){
			//循环中每次折叠，纸张厚度要加倍
			paper =paper*2;
			//在循环中执行累加，对应折叠次数
			count++;
		}

		System.out.println("需要折叠："+count+"次");
	}
}
