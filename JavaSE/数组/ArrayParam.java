package 数组.Demo;

public class ArrayParam {
    public static void main(String[] args) {
        int[] array = { 2,3,5,32,57,31 };

        printArray(array);
    }

    /*三要素：
    * 返回值类型：只是打印而已，不需要进行j计算，也没有结果，用void
    * 方法名称：printArray
    * 参数列表：必须给我数组，我才能打印其中的元素int[] array
    * */

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
