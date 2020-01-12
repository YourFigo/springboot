package cn.figo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Figo
 * @Date 2020/1/12 17:46
 */
@Controller
public class QuickValueController {
    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String Quick() {
        System.out.println(name);
        System.out.println(addr);
        return "name:" + name + " addr:" + addr;
    }
}
