package 方法;

/*
定义一个方法，用来判断两个数是否相同
* */

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(50,50));
        System.out.println(isSame(43,50));
    }

    /*三要素
    返回值类型: boolean
    方法名称:isSame
    参数列表:int a, int b
    * */

    public static boolean isSame(int a, int b){
        /*boolean same;
        if (a==b){
            same = true;
        }else {
            same = false;
        }
        return same;*/

        /*boolean same = a == b ? true : false;
        return same;*/

        return a==b;

    }

}
