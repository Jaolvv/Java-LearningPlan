package 面向对象;

public class Phone {
    String Name;
    int price;
    String color;

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }

    //
    public static void main(String[] args) {
        Phone newPhone = new Phone();

        newPhone.Name="IPhone18";
        System.out.println(newPhone.Name);

        newPhone.color="black";
        System.out.println(newPhone.color);

        newPhone.price=5688;
        System.out.println(newPhone.price);

        newPhone.call("乔布斯");
        newPhone.sendMessage();
    }

}

