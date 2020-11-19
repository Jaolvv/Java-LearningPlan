package 方法;

public class Car {
    public Car(String name){
        //这个构造器只有一个参数:name.
        System.out.println("This car's name is "+name);
    }

    public static void main(String[] args) {
        Car car1 = new Car("LanboKini");
    }
}
