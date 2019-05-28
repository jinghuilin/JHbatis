import bean.User;
import mapper.UserMapper;
import sqlSession.MySqlSession;

/**
 * @Author: linjinghui
 * @Date: 2019/5/28 15:20
 * @Version 2.8.6
 */
public class TestMyBatis {
    public static void main(String[] args) {
        MySqlSession mySqlSession = new MySqlSession();
        UserMapper mapper = mySqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
