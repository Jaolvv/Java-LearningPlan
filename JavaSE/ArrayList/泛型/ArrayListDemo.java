package Bili.ArrayList.Generic;
import java.util.ArrayList;


/*数组的长度不可以发生改变
* 但是ArrayList集合长度是可以随意改变的
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型：泛型，即“参数化类型”。一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。
* 泛型只能是引用类型，不能是基本类型*/
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名称是list，里面装的都是String字符串类型的数据
        //备注：从jdk1.7+开始,右侧的尖括号内部可以不写内容，但<>本身要保留
        ArrayList<String> list = new ArrayList<>();
        //对于ArrayList来说，直接打印d得到的不是地址值而是内容
        //如果内容是空的，那将得到[]
        System.out.println(list);//这条将打印一个[]空内容而不是地址值

        //向集合中添加一些数据，需要add方法
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(2,"555");//指定添加元素位置
        list.add("444");
        System.out.println(list);
    }
}
