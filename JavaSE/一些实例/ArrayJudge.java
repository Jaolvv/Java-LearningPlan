package Java实例;
import java.util.Arrays;
/*以下实例演示了如何使用 equals ()方法来判断数组是否相等：*/

public class ArrayJudge {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6};
        int[] array3 = {1,2,3,4};
        System.out.println("数组array是否与数组array2相等？："+Arrays.equals(array,array2));
        System.out.println("数组array是否与数组array2相等？："+Arrays.equals(array2,array3));
    }
}
