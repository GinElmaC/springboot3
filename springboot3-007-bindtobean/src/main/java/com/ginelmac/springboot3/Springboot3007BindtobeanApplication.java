package com.ginelmac.springboot3;

import com.ginelmac.springboot3.Bean.AppBean;
import com.ginelmac.springboot3.Bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//将配置信息绑定到bean的第三种方式：在主入口使用注解@EnableConfigurationProperties(要绑定的类.class)
//作用是：启用将配置信息绑定到bean
//@EnableConfigurationProperties(User.class)
//将配置信息绑定到bean的第四种方式：在主入口程序上添加以下注解进行扫描包
@ConfigurationPropertiesScan(basePackages = "com.ginelmac.springboot3.Bean")
@EnableConfigurationProperties(AppBean.class)
@SpringBootApplication
public class Springboot3007BindtobeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3007BindtobeanApplication.class, args);
    }

}
