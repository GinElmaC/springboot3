package com.ginelmac.springboot;

import com.ginelmac.springboot.bean.User;
import com.ginelmac.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot3004JunitApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Springboot3004JunitApplication.class, args);

        UserService userservice = run.getBean("userservice", UserService.class);
        User finduser = userservice.finduser();
        System.out.println(finduser);

        run.close();
    }

}
