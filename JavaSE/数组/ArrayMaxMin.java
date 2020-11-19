package 数组.Demo;

//求数组最大最小值，通过 Collections 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Integer [] numbers = {8,3,18,4,2,7,56,45};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}
