package cn.figo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Figo
 * @Date 2020/1/12 23:48
 */
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication //相当于EnableAutoConfiguration、ComponentScan、SpringBootConfiguration三者的组合
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
