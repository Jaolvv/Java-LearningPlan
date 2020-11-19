package Java实例;

/*字符串比较*/
public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object obj = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(obj.toString()));

        /*compareTo() 方法的实现思路：
        两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，
        后面的字符不再比较；如果两个字符数组的长度不一样，
        并且较短的数组和较长数组所有对应位置的字符都相同，
        则返回两个数组的长度之差。*/

        //Java compareTo() 方法
       /* compareTo() 方法用于将 Number 对象与方法的参数进行比较。可用于比较 Byte, Long, Integer等。
        该方法用于两个相同数据类型的比较，两个不同类型的数据不能用此方法来比较。*/

        //语法 public int compareTo( NumberSubClass referenceName )
        //referenceName -- 可以是一个 Byte, Double, Integer, Float, Long 或 Short 类型的参数。

        //返回值:
        /*如果指定的数与参数相等返回0。
        如果指定的数小于参数返回 -1。
        如果指定的数大于参数返回 1。*/



        //compareTo() 方法用于两种方式的比较：  字符串与对象进行比较 || 按字典顺序比较两个字符串
        //语法：
        /*int compareTo(Object o)  或  int compareTo(String anotherString)*/
        //参数： o -- 要比较的对象  ||  anotherString -- 要比较的字符串

        /*返回值
        返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，
        结束比较，返回他们之间的差值，如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，
        以此类推,直至比较的字符或被比较的字符有一方结束。

        如果参数字符串等于此字符串，则返回值 0；
        如果此字符串小于字符串参数，则返回一个小于 0 的值；
        如果此字符串大于字符串参数，则返回一个大于 0 的值。*/

    }
}
