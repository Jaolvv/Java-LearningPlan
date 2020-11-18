package 方法;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Runoob");
        StringBuffer b = new StringBuffer("Google");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }

}
