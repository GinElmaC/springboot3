package com.ginelmac.springboot3;

import com.ginelmac.springboot.Bean.Vip;
import com.ginelmac.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = {"com.ginelmac.springboot.repository"})
@SpringBootApplication
public class Springboot3009MybatisGennerateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3009MybatisGennerateApplication.class, args);
        VipMapper bean = applicationContext.getBean(VipMapper.class);
        Vip vip = new Vip("zhangsan","2020-11-1","111");
        bean.insert(vip);
        Vip vip1 = bean.selectByPrimaryKey(1l);
        System.out.println(vip1);
        applicationContext.close();
    }

}
