package 模拟电脑;

public class Laucher {
    public static void main(String[] args) {
        //实例化电脑对象
        Computer c = new Computer();
        c.add(new Mouser());
        c.add(new KeyBoard());
        c.add(new Mic());

        c.powerOn();

        System.out.println();

        c.powerOff();
    }
}
