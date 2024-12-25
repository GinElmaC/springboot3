package com.ginelmac.springboot3;

import com.ginelmac.springboot3.Bean.Vip;
import com.ginelmac.springboot3.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//通过这个指定去哪里找mapper接口，配置mapper的扫描,也可以在相应的Mapper接口类加上@Mapper注解
//@MapperScan(basePackages = {"com.ginelmac.springboot3.repository"})
@SpringBootApplication
public class Springboot3008SpringBootAndMyBatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3008SpringBootAndMyBatisApplication.class, args);

        //获取service对象
        VipService vipService = applicationContext.getBean("VipService", VipService.class);
        Vip vip1 = new Vip(1,"张三","111","2020-11-10");
        Vip vip2 = new Vip(2,"李四","222","1111-20-11");
        vipService.save(vip1);
        vipService.save(vip2);
        List<Vip> vips = vipService.selectAll();
        System.out.println(vips.toString());
        applicationContext.close();
    }

}
