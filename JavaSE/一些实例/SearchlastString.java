package Java实例;

public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world , Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("wor");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串"+strOrig.lastIndexOf("wor"));
        }else {
            System.out.println("wor 字符串最后出现的位置： "+ lastIndex);
        }

        String Str1 = "www.Jaolvv.top";
        String Str2 = "Blob";
        String Str3 = "net";

    }
}
