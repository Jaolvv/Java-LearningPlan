package 模拟租车系统;

/*货车类*/

public class Truck extends Car implements ICargoCapacity {
    public Truck(){
        carName = "解放";
        carPrice = 1350;
    }

    @Override
    public double cargoCapacity() {
        int cargoCapacity = 25;
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " 载货量:" + cargoCapacity() + "吨。";
    }
}
