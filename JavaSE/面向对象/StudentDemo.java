package 面向对象;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.name = "刘星宇";
        stu.age = 21;
        stu.height = 1.79;
        stu.school = "重庆工业职业技术学院";

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.school);
        stu.eat();
        stu.run();
        stu.sleep();
    }
}
