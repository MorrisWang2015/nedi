import com.baoxian.dao.UserMapper;
import com.baoxian.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Date:2019/1/20
 * Author:Morris
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = mapper.selectUser(id);
        System.out.println(user.getName());
    }

}
