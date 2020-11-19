package Java实例;

import java.text.SimpleDateFormat;
import java.util.Date;

//以下实例演示了如何使用 SimpleDateFormat 类的 format(date) 方法来格式化时间

public class SimpleDateFormat1 {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
