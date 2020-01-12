package cn.figo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Figo
 * @Date 2020/1/12 15:46
 */
@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick(){
        return "Spring Boot";
    }
}
