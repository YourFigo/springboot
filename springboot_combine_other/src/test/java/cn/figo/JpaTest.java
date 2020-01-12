package cn.figo;

import cn.figo.domain.User;
import cn.figo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 19:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootCombineOtherApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}