package 模拟租车系统;

/*轿车类*/

public class PassageCar extends Car implements IPassengerCapacity {

    public PassageCar(){
        carName = "BMW-X1";
        carPrice = 1000;
    }

    public int passengerCapacity(){
        int passengerCapacity = 4;
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"     载客量："+passengerCapacity()+"人";
    }
}
