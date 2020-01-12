package cn.figo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Figo
 * @Date 2020/1/12 15:13
 */
@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String Quick() {
        return "你好 hello_springboot";
    }
}
