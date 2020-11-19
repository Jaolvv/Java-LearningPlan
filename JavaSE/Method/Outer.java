package 方法;

public class Outer {
    int x = 10;

    class InnerClass{
        int y = 6;
    }

    public static void main(String[] args) {
        Outer myOuter = new Outer();
        Outer.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
