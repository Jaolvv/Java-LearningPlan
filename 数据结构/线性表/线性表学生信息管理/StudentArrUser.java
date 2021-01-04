package 数据结构.线性表学生信息管理;
import java.io.*;

public class StudentArrUser {
    public static void main(String[] args) throws Exception {
        ArrStudent stud = new ArrStudent();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("---------学生信息管理系统---------");
            System.out.println("1 添加记录\n");
            System.out.println("2 显示所有记录\n");
            System.out.println("3 查询记录\n");
            System.out.println("0 退出\n\n");
            System.out.println("输入您的选择");
            int choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("姓名:");
                    String sName = br.readLine();
                    System.out.println("\n学号:");
                    int sNum = Integer.parseInt(br.readLine());
                    System.out.println("成绩：");
                    double sScore = Double.parseDouble(br.readLine());
                    StudScore snode = new StudScore(sName,sNum,sScore);
                    stud.add(snode);
                    break;
                case 2:
                    stud.listAll();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n请输入学生的位置序号：");
                    int index = Integer.parseInt(br.readLine());
                    stud.search(index);
                    System.out.println();
                    break;
            }
        }
    }
}
