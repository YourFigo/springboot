package cn.figo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Figo
 * @Date 2020/1/12 17:47
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class QuickConfigurationPropertiesController {

    private String name;
    private Integer age;
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String Quick() {
        System.out.println(name);
        System.out.println(addr);
        return "name:" + name + " age:" + age + " addr:" + addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
