package 方法;

public class OuterClass {
    int x =10;

    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
