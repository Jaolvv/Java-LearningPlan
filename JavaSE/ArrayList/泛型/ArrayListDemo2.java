package Bili.ArrayList.Generic;
import java.util.ArrayList;


/*ArrayList当中的常用方法有：
* public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致。返回值代表是否添加成功
* 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
* 但是对于其他集合来说不一定成功
*
* public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index):从集合当中删除元素，参数是索引编号，返回值是被删除的元素
* public int size():获取集合长度，返回值是集合中包含的元素个数 */

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean success = list.add("Element");
        System.out.println(list);//[Element]
        System.out.println("添加动作是否成功： "+success);

        System.out.println("====================");

        list.add("元素1");
        list.add("元素2");
        list.add("元素3");
        list.add("元素4");
        System.out.println(list);

        System.out.println("====================");

        //从集合中获取元素：get 索引从0开始
        String ElementNumber = list.get(1);
        System.out.println("第1号索引位置的元素为： "+ ElementNumber);
        System.out.println(list);

        System.out.println("====================");

        //从集合中删除元素: remove
        String rmNumber = list.remove(2);
        System.out.println("被删除的元素是： "+rmNumber);
        System.out.println(list);

        System.out.println("====================");

        //getArrayList's length
        int size = list.size();
        System.out.println("集合的长度是： " + list);

        System.out.println("====================");

        //集合的遍历
        System.out.println("遍历结果： ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
