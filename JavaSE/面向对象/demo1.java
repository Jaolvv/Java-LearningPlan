package 面向对象;

/*面向过程：当需要实现一个功能的时候，每一个具体步骤都要亲历亲为，详细处理每一个细节
* 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个j具有该功能的人，来帮我完成*/

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] MyArray = { 10, 20, 30, 49, 50, 60 };

        //要求打印格式为：[10, 20, 30, 49, 50, 60]

        //使用面向过程，每一个步骤细节都亲历亲为
//        System.out.println("[");
//        for (int i = 0; i < MyArray.length; i++) {
//            if(i == args.length - 1){//如果是最后一个元素
//                System.out.println(MyArray[i] + "]");
//            }else {}
//            System.out.println(MyArray[i]+",");
//        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //使用面向对象
        //找一个JDK给我们提供好的Arrays类
        //其中有一个toString()方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(MyArray));

    }
}
