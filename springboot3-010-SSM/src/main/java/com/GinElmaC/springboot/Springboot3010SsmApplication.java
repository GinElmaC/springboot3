package com.GinElmaC.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = {"com.GinElmaC.springboot.springboot3.repository"})
@SpringBootApplication
public class Springboot3010SsmApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3010SsmApplication.class, args);
    }

}
