package 数据结构.线性表学生信息管理;

public class ArrStudent implements StudOPeration {

    StudScore studScore[] = new StudScore[5];//顺序表，存放学生记录
    int count = 0;//记录计数器，记当前顺序表中的记录个数

    @Override
    public void add(StudScore node) {//在顺序表末尾添加一个学生信息
        int i = count;
        studScore[i] = node;
        count++;

        if (count == studScore.length)
            System.out.println("存储空间已满");
    }

    @Override
    public void listAll() {//遍历顺序列表（输出数组）
        for (int i = 0; i < count; i++) {
            System.out.println(studScore[i].name+"\t");
            System.out.println(studScore[i].studentNO+"\t");
            System.out.println(studScore[i].score);
        }
    }

    @Override
    public void search(int index) {//查找顺序表（数组）某个位置上的数据并输出
        if (index <= count && index > 0)
            System.out.println("您查找的信息是："+studScore[index-1]);
        else
            System.out.println("输入的序号无效");
    }

}
