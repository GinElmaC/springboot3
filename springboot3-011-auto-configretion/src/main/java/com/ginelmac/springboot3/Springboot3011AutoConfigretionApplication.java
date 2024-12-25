package com.ginelmac.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot3011AutoConfigretionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3011AutoConfigretionApplication.class, args);
        String[] str = applicationContext.getBeanDefinitionNames();
        for(String s:str){
            if("a".equals(s)){
                System.out.println(s);
            }
            if("b".equals(s)){
                System.out.println(s);
            }
        }
        applicationContext.close();
    }

}
