package cn.figo.controller;

import cn.figo.domain.User;
import cn.figo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 18:21
 */
@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}