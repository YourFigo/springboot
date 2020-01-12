package cn.figo.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author Figo
 * @Date 2020/1/13 0:05
 */
@Configuration  //声明式一个配置类
//@PropertySource("classpath:jdbc.properties")
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String userName;
//    @Value("${jdbc.password}")
//    private String password;

    @Autowired
    private JdbcProperties jdbcProperties;

    @Bean //把方法的返回值注入到spring容器
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUserName());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
}
