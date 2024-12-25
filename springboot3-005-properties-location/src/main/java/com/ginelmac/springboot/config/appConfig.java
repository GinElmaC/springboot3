package com.ginelmac.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("appconfig")
public class appConfig {
    //当使用value注解时，当key不存在并且没有指定默认值，则报错
    @Value("${myapp.username}")
    private String appname;
    @Value("${myapp.email}")
    private String email;
    @Value("${myapp.age:50}")
    private Integer age;

    public void printInfo(){
        System.out.println(appname);
        System.out.println(email);
        System.out.println(age);
    }

}
