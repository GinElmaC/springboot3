package com.ginelmac.springboot;

import com.ginelmac.springboot.config.appConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot3005PropertiesLocationApplication {

    //main中的args就是用来接收命令行参数的
    //这也就解释了为什么我们的run方法需要传入args，因为我们需要确定外部化部署的配置文件位置
    public static void main(String[] args) {
        for(String s:args){
            System.out.println(s);
        }

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3005PropertiesLocationApplication.class, args);
        appConfig appconfig = applicationContext.getBean("appconfig", appConfig.class);
        appconfig.printInfo();
        applicationContext.close();
    }

}
