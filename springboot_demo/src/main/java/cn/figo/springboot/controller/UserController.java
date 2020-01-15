package cn.figo.springboot.controller;

import cn.figo.springboot.pojo.User;
import cn.figo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 23:47
 */
@Controller
@RequestMapping("user")
public class UserController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        return this.userService.queryUserById(id);
    }

    @GetMapping("query")
    public String queryAll(Model model){
        List<User> users = this.userService.queryAll();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }
}
