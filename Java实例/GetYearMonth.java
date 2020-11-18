package Java实例;
import java.util.Calendar;

//以下实例演示了如何使用 Calendar 类来输出年份、月份等：
public class GetYearMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一周的第几天: " + dow);
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);
    }
}
