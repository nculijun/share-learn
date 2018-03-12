import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lijun on 2018/3/8.
 */
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;




    //@Test
    public void testSelectByPrimaryKey() throws Exception {
        int id = 0;
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user.getUserName());

    }
}
