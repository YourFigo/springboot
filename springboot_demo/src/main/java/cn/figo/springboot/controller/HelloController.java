package cn.figo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Figo
 * @Date 2020/1/12 23:47
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }
}
