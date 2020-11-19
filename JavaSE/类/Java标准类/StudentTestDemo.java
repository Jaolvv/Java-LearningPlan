package Java标准类;

public class StudentTestDemo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("刘星宇");
        stu1.setAge(21);
        System.out.println("Name: "+ stu1.getName()+" Age:"+stu1.getAge());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Student stu2 = new Student("曹雅杰",19);
        System.out.println("Name:"+stu2.getName()+" Age:"+stu2.getAge());

        stu2.setAge(20);
        stu2.setName("刘星宇");
        System.out.println("Name:"+stu2.getName()+" Age:"+stu2.getAge());
    }
}
