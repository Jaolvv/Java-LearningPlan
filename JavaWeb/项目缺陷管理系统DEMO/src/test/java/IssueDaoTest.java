
import java.sql.*;

public class IssueDaoTest {
    public static void main(String[] args) throws Exception {
        //加载数据接驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }
        String jdbcURL = "jdbc:mysql://localhost:3306/schema_train?&useSSL=false&serverTimezone=UTC";
        String sql = "SELECT * from issue_list";
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/schema_train?&useSSL=false&serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(jdbcUrl,"root","112800");
            Statement statement = conn.createStatement();
            ResultSet rst = statement.executeQuery(sql);
            while (rst.next()){
                System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+
                        rst.getString(3)+ "\t"+rst.getFloat(4) + "\t"
                        + rst.getInt(5));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
