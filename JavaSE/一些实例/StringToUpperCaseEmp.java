package Java实例;

/*使用 String toUpperCase() 方法将字符串从小写转为大写*/

public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        //小转大
        String str = "www.jaolvv.top";
        String strUpper = str.toUpperCase();
        System.out.println("Before:"+str);
        System.out.println("After:"+strUpper);

        System.out.println("-------------------------");

        //大转小
        String str2 = "WWW.JAOLVV.TOP";
        String strLower = str2.toLowerCase();
        System.out.println("Before:"+str2);
        System.out.println("After:"+strLower);
    }
}
