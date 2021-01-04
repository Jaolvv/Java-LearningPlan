package 数据结构.线性表学生信息管理;

public class StudScore {
    //属性定义
    String name;
    int studentNO;
    double score;

    public StudScore(String name, int studentNO, double score) {
        this.name = name;
        this.studentNO = studentNO;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNO() {
        return studentNO;
    }

    public void setStudentNO(int studentNO) {
        this.studentNO = studentNO;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
