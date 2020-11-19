package Bili.ArrayList;

import java.util.ArrayList;
import java.util.List;

//在指定位置插入元素，后面的元素都往后移一个元素。
public class ArrayListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println("插入元素前list集合中所有的元素"+list);
        list.add(2,"Four");
        System.out.println("插入元素后list集合中所有的元素"+list);
    }
}
