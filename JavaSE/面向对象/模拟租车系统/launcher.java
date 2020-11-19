package 模拟租车系统;
import java.util.Scanner;

/*租车主类*/

public class launcher {
    public static void main(String[] args) {
        systemInitial();
    }

    //系统初始化
    private static void systemInitial() {
        System.out.println("欢迎使用自助租车系统！" + "\n" + "租车请输入数字 1，退出请按任意键。");

        //获取用户输入内容
        Scanner scanner = new Scanner(System.in);

        //对用户输入的值进行判断并执行相应逻辑
        int input = scanner.nextInt();
        if (input == 1) {
            int count = 1;
            System.out.println(" ******可选车型一览表******");
            Car [] cars = new Car[] {new PassageCar(), new Pickup(), new Truck()};
            for(Car carList : cars) {
                System.out.println(count + "." + carList.toString());
                count++;
            }
            selectCar(cars);//记录所选车辆
        }

        System.out.println("结束选车系统！");
        scanner.close();
        System.exit(0);

    }
    //记录所选车辆
    public static void selectCar(Car[] cars) {
        System.out.println("***请输入车辆序号确认租车，输入数字'0'表示结束选车，输入'111'表示退出系统！最多可租用 20 辆车***");
        Scanner scanner = new Scanner(System.in);
        int[] list=new int[20];
        int count=0;
        while(true){
            int carNum = scanner.nextInt();
            if (carNum != 0) {
                if (carNum <= cars.length) {
                    list[count]=carNum; //如果用输入的数字<=车辆列表的长度，就将用户输入的数字添加到 list 中
                    count++;
                    if(count>=20)
                        break;
                } else if (carNum == 111) {
                    System.out.println("取消租车，退出系统");
                    System.exit(0);
                }
            }
            else{
                break;
            }
        }
        int num = 0;
        int passengerCapacity = 0;//载客量
        double cargoCapacity = 0;//载货量
        int total = 0;//总价
        int id;
        System.out.println("选车完毕，你租用的车辆有以下几款:***共计 " + count + " 辆.***");

        while(num<count) {//类似游标
            num++;
            id=list[num-1];
            System.out.println(num + "." + cars[id-1].toString());
            passengerCapacity += getPassengerCapacity(cars[id-1]);
            cargoCapacity += getICargoCapacity(cars[id-1]);
            total += cars[id-1].getCarPrice();
        }

        System.out.println("所选车辆载客总量为:" + passengerCapacity +" 人。");
        System.out.println("所选车辆的载货总量为:" + cargoCapacity + " 吨。");
        System.out.println("所选车辆的租金为:" + total + " 元。");
        scanner.close();

    }

    //累计载货量
    public static double getICargoCapacity(Object object) {
        if (object instanceof ICargoCapacity) {
            double cargoCapacity = 0;
            cargoCapacity += ((ICargoCapacity) object).cargoCapacity();
            return cargoCapacity;
        } else {
            return 0;
        }
    }

    //累计载客量
    public static int getPassengerCapacity(Object object) {
        if (object instanceof IPassengerCapacity) {
            int passengerCapacity = 0;
            passengerCapacity += ((IPassengerCapacity) object).passengerCapacity();
            return passengerCapacity;
        } else {
            return 0;
        }
    }
}
