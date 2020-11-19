package Java标准类;

public class Student {

    private String name;
    private int age;

    //无参的构造方法
    public Student(){

    }

    //有参的构造方法
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter/Setter
    public String getName(){//获取private String name;
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<100&&age>0){//设置岁数在0-100之间
            this.age = age;
        }
    }

}
