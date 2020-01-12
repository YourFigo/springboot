package cn.figo;

import cn.figo.domain.User;
import cn.figo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 19:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootCombineOtherApplication.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
