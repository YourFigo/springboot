package cn.figo.springboot.config;

import cn.figo.springboot.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Figo
 * @Date 2020/1/14 22:17
 * 将拦截器配置进来
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有，多级 /**
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
