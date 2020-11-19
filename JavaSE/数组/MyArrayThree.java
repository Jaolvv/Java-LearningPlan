package 数组.Demo;

//如何获取数组长度，如何获取二维数组长度


public class MyArrayThree {
    public static void main(String[] args) {
        //创建数组
        int[] array = {1,4,5,3,74,24,76,1,74,13,75,34};

        //定义二维数组
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);
        System.out.println("第二维数组长度: " + data[0].length);

        System.out.println("-----------");

        System.out.print("{");
        //int len = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            System.out.print(+array[i]);
        }
        System.out.print(" }");
    }
}
