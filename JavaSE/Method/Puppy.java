package 方法;

public class Puppy {
    int PuppyAge;
    public Puppy(String name){
        System.out.println("The puppy's name is "+name);
    }

    public void setPuppyAge( int age ){
        PuppyAge = age;
    }

    public int getPuppyAge(){
        System.out.println("The puppy's age is "+PuppyAge);
        return PuppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tt");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println("变量值："+myPuppy.PuppyAge);
    }
}
