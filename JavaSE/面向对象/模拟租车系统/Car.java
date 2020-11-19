package 模拟租车系统;

/*所有Car的父类*/

public class Car {
    protected String carName;//定义汽车的名字
    protected int carId;//定义汽车的序号
    protected double carPrice;//定义汽车的价格

    //getter
    public String getCarName() {
        return carName;
    }

    public int getCarId() {
        return carId;
    }

    public double getCarPrice() {
        return carPrice;
    }

    //setter
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String toString(){
        return carName+" "+" 日租金:"+carPrice+"￥";
    }

}
