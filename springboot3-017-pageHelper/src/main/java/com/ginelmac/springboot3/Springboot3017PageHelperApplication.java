package com.ginelmac.springboot3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.ginelmac.springboot3.repository")
@SpringBootApplication
public class Springboot3017PageHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3017PageHelperApplication.class, args);
    }

}
