import com.zcloud.issue.dao.Dao;

/**
 * @ClassName: Test
 * @Description: TODO(测试类)
 * @date 2021-1-04 上午11:14:56
 *
 */

public class DaoTest {
    public static void main(String[] args) {

        System.out.println(Dao.queryForMap("select * from issue_list where id='2020122411251900'"));
        System.out.println(Dao.queryForList("select * from issue_list"));

    }
}
