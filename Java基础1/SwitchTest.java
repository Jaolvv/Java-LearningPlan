import java.util.Scanner;

public class SwitchTest {
     public static void main (String[] args){
	//����¼���·����ݣ�ʹ��������
	Scanner sc = new Scanner(System.in);
	
	System.out.println("������һ���·�");
	int month = sc.nextInt();	//��ȡ���̵�����

        switch(month){
	case 1:
	case 2:
	case 12:
	    System.out.println("����");
	    break;
	case 3:
	case 4:
	case 5:
	    System.out.println("����");
	    break;
	case 6:
	case 7:
	case 8:
	    System.out.println("�ļ�");
	    break;
	case 9:
	case 10:
	case 11:
	    System.out.println("�＾");
	    break;
	default :
		System.out.println("��������·��д���");
             }	
       }
}