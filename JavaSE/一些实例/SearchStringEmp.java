package Java实例;

/* String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1*/

public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "WWW.Jaolvv.TOP";
        int intIndex = strOrig.indexOf("Jaolvv");
        if (intIndex == -1){
            System.out.println("Not found String \\Jaolvv ");
        }else {
            System.out.println("\"Jaolvv\" String's position is "+intIndex);
        }
    }
}
