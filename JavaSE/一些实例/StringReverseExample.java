package Java实例;

//反转函数 reverse() 将字符串反转

public class StringReverseExample {
    public static void main(String[] args) {
        String string = "www.Jaolvv.top";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("Before:"+string);
        System.out.println("After:"+reverse);
    }
}
