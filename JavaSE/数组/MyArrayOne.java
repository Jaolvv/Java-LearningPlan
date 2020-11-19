package 数组.Demo;

public class MyArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化
        System.out.println(array);//地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("==========");

        array[1] = 10;
        array[2] = 55;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
