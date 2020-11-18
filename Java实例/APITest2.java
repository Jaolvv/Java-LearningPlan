package Java实例;



public class APITest2 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();//获取开始的时间
        //计算循环1000000000的时间
        for(int i=0;i<1000000000;i++) {}
        long endTime=System.currentTimeMillis();//获取结束的时间
        long time=endTime-startTime;//用结束的时间减去开始的时间就为循环1000000000的时间
        System.out.println("time:"+time+"ms");
        }
    }