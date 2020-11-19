package 数组.Demo;

public class MyArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("==========");

        arrayA[1] = 10;
        arrayA[2] = 55;

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("==========");

        int[] arrayB = new int[3];
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

        System.out.println("==========");

        arrayB[1] = 100;
        arrayB[2] = 200;

        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
