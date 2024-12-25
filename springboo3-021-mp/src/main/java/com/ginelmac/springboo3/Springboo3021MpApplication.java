package com.ginelmac.springboo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ginelmac.springboo3.Mapper")
@SpringBootApplication
public class Springboo3021MpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboo3021MpApplication.class, args);
    }

}
