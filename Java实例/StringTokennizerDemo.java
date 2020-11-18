package Java实例;

/*使用 StringTokennizer 设置不同分隔符来分隔字符串，默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。*/


import java.util.StringTokenizer;

public class StringTokennizerDemo {
    public static void main(String[] args) {
        String str = "This is String, split by StringToknnizer, cereat by Jaolvv";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("----- 通过空格分隔 ------");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str,",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
