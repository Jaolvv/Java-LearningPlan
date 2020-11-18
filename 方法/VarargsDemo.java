package 方法;

public class VarargsDemo {

    public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The Max value is:"+result);
    }



    public static void main(String[] args) {
        printMax(34,12,4,56,3,1.2);
        printMax(new double[]{1,4,6});
    }
}
