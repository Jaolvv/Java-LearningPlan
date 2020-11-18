package Java实例;

import java.util.ArrayList;
import java.util.Collections;

/*以下实例中我们使用 Collections.reverse(ArrayList) 将数组进行反转：*/

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();//创建一个新的字符串数组数组
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println("ReverseBefore:"+arrayList);

        Collections.reverse(arrayList);
        System.out.println("ReverseAfter:"+arrayList);
    }
}
