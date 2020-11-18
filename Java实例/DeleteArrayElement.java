package Java实例;
import java.util.Arrays;

/*Java 的数组是固定长度的，无法直接删除，我们可以通过创建一个新数组，
把原始数组中要保留的元素放到新数组中即可：*/

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] oldarray = new int[] { 3, 4, 5, 6, 7 };//原始数组
        int num = 2; //删除索引为2的元素，即删除第三个元素5
        int[] newArray = new int[oldarray.length-1]; //新数组，长度为原始数组-1

        for(int i = 0; i < newArray.length; i++){
            //判断元素是否越界
            if(num < 0 || num >= oldarray.length){
                throw new RuntimeException("元素越界");
            }
            //
            if (i < num){
                newArray[i] = oldarray[i];
            }
            else{
                newArray[i] = oldarray[i+1];
            }
        }
        // 打印输出数组内容
        System.out.println(Arrays.toString(oldarray));
        oldarray = newArray;
        System.out.println(Arrays.toString(oldarray));

    }
}
