package 方法;

public class demo1 {
    public static void main(String[] args) {
        printMethod();
    }

    public static  void printMethod(){
        for (int j = 0; j < 5; j++) {
            for(int i = 0;i < 20;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
