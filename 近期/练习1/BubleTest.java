package 面向对象.练习1;


/*设计一个台灯类(Lamp)其中台灯有灯泡类(Buble)这个属性，还有开灯(on)这个方法
        设计一个灯泡类(Buble)，灯泡类有发亮的方法.
         其中有红灯泡类(RedBuble)和绿灯泡类(GreenBuble)他们都继承灯泡类(Buble)一个发亮的方法
         请设计出一段代码可以使台灯开启灯泡发亮，并且保证替换不同种类的灯泡，台灯类代码不被修改*/

public class BubleTest {
    public static void main(String[] args) {
        Lamp lamp=new Lamp();

        //父类引用指向子类对象

        Buble red=new RedBuble();

        Buble green=new GreenBuble();

        lamp.on(red);
    }
}
