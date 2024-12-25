package com.ginelmac.springboot3.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Configuration注解源码有代表Component别名的意思，同时这个类也表示是一个配置类，用这个注解也行
@Component
//将配置文件中的属性值一次性绑定到bean对象上
@ConfigurationProperties(prefix = "myapp")
public class AppConfig {
    //想要一次性绑定，这里bean对象的属性名必须和配置文件中myapp前缀后的属性值一样
    private String username;
    private String password;
    private Integer age;
    private Boolean gender;
    //底层在赋值的时候调用了setter方法，因此必须保证每个属性提供了setter方法

    public AppConfig() {
    }

    public AppConfig(String username, String password, Integer age, Boolean gender) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String toString() {
        return "AppConfig{username = " + username + ", password = " + password + ", age = " + age + ", gender = " + gender + "}";
    }
}
