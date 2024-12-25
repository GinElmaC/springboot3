package com.GinElmaC.springboot3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = {"com.GinElmaC.springboot3.Dao"})
public class Springboot3018TxApplication extends SpringBootServletInitializer {

    //这个是打包成war包才需要重写并继承的
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springboot3018TxApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Springboot3018TxApplication.class, args);
    }

}
