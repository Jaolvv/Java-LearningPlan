import java.util.Scanner;

public class SwitchTest {
     public static void main (String[] args){
	//键盘录入月份数据，使变量接收
	Scanner sc = new Scanner(System.in);
	
	System.out.println("请输入一个月份");
	int month = sc.nextInt();	//获取键盘的输入

        switch(month){
	case 1:
	case 2:
	case 12:
	    System.out.println("冬季");
	    break;
	case 3:
	case 4:
	case 5:
	    System.out.println("春季");
	    break;
	case 6:
	case 7:
	case 8:
	    System.out.println("夏季");
	    break;
	case 9:
	case 10:
	case 11:
	    System.out.println("秋季");
	    break;
	default :
		System.out.println("你输入的月份有错误！");
             }	
       }
}