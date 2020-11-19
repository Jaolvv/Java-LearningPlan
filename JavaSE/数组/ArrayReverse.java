package 数组.Demo;

/*数组元素翻转*/
//本来的样子:[ 1, 2, 3, 4, 5 ]
//翻转后的样子：[ 5, 4, 3, 2, 1 ]

//要求不能使用新数组，就用唯一的数组
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = { 10, 23, 56, 33, 12, 45 };

        //遍历数组打印原来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-------------------");

        /*初始化语句：int min = 0, max =array.length - 1
        * 条件判断语句：min < max
        * 步进表达式：min++, max--
        * 循环体: 用第三个变量倒手*/

        for (int min = 0, max =array.length - 1; min < max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
