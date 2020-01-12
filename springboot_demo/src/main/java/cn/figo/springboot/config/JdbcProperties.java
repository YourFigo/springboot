package cn.figo.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author Figo
 * @Date 2020/1/13 0:24
 */
@ConfigurationProperties(prefix = "jdbc")  //读取配置文件中的jdbc内容
public class JdbcProperties {

    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
