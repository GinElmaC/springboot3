package com.ginelmac.springboot3;

import com.ginelmac.springboot3.Bean.AppBean;
import com.ginelmac.springboot3.Bean.Group;
import com.ginelmac.springboot3.Bean.User;
import com.ginelmac.springboot3.Config.AppConfig;
import com.ginelmac.springboot3.Config.OuterBeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3007BindtobeanApplicationTests {
    @Autowired
    private AppConfig appConfig;

    @Test
    void contextLoads() {
        System.out.println(appConfig);
    }

    @Autowired
    private User user;

    @Test
    void test2(){
        System.out.println(user);
    }

    @Autowired
    private AppBean appBean;
    @Test
    void test3(){
        System.out.println(appBean);
    }

    @Autowired
    private OuterBeanConfig outerBeanConfig;
    @Test
    void test4(){
        System.out.println(outerBeanConfig.getOuterBean());
    }

    @Autowired
    private Group group;
    @Test
    void test5(){
        System.out.println(group);
    }

}
