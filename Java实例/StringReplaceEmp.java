package Java实例;

/*replace 方法来替换字符串中的字符*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplaceEmp {
    public static void main(String[] args) {
       /* String str = "www.Jaolvv.top";
        System.out.println(str.replace('J','L'));
        System.out.println(str.replaceFirst("www", "WWW"));
        System.out.println(str.replaceAll("top","com"));*/


        String str2 = "Hello World";
        String regEx = "[abcdh]";
        String reStr = "";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str2);// 替换 a、b、c、d、H 为空，即删除这几个字母
        reStr = matcher.replaceAll("").trim();
        System.out.println(reStr);

    }
}
