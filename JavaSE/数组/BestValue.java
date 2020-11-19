package 数组.Demo;

//求出数组中的最值

public class BestValue {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 8, 90,1000};

        int max = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
