package 数据结构.线性表学生信息管理;

interface StudOPeration {
    void add(StudScore node);   //在顺序表的尾部添加一个学生记录
    void listAll();     //遍历顺序表中所有学生记录
    void search(int index);     //查询某个位置上学生的信息并输出
}
