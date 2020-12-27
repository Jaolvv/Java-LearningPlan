package 面向对象.练习1;

public class Lamp {
    private Buble buble;

    public Buble getBuble(){
        return buble;
    }

    public void setBuble(Buble buble){
        this.buble = buble;
    }

    /**
     * 通过父类Buble调用子类重写父类的方法
     * @param buble
     */

    public void on(Buble buble){
        if (buble instanceof RedBuble){
            String r = buble.bright();
            System.out.println("打开台灯"+r);
        }else if (buble instanceof GreenBuble){
            String g = buble.bright();
            System.out.println("打开台灯"+g);
        }
    }

}
