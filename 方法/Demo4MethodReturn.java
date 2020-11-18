package 方法;

//
//
public class Demo4MethodReturn {
    public static void main(String[] args) {
        int num = getSum(40,88);//赋值调用
        System.out.println(getSum(40,88));//打印调用
        getSum(40,88);//单独调用，但是没有使用返回值
        System.out.println("返回值是："+ num);
        System.out.println("-------------");
        printSum(50,55);
    }

    //我有返回值int，谁调用我，我就把结果告诉谁
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }

    //我没有返回值，不会把结果告诉任何人，我自己打印出来就行
    public static  void printSum(int a,int b){
        int result = a+b;
        System.out.println("结果是："+result);
    }

}
