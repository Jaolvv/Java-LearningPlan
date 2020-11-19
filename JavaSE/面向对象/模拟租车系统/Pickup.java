package 模拟租车系统;

/*皮卡类*/

public class Pickup extends Car implements IPassengerCapacity, ICargoCapacity {
    public Pickup(){
        carName = "CyberTruck";
        carPrice = 2000;
    }

    @Override
    public double cargoCapacity() {
        int cargoCapacity = 5;
        return cargoCapacity;
    }

    @Override
    public int passengerCapacity() {
        int passengerCapacity = 2;
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " 载货量:" + cargoCapacity() + "吨。" + " 载客量:" + passengerCapacity() + "人。";
    }

}
