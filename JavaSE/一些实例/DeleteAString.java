package Java实例;

 /*substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。*/

/*substring() 方法返回字符串的子字符串。*/
/*语法:
public String substring(int beginIndex)

        或

public String substring(int beginIndex, int endIndex)*/
/*参数
        beginIndex -- 起始索引（包括）, 索引从 0 开始。

        endIndex -- 结束索引（不包括）。*/



public class DeleteAString {

    public static String removeCharAt(String s, int pos){
        return s.substring(0,pos) + s.substring((pos + 1));
    }

    public static void main(String[] args) {
        String str = "This is Java";
        System.out.println(removeCharAt(str,3));
    }
}
