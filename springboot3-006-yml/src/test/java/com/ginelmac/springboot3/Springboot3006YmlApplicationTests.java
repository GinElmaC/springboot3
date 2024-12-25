package com.ginelmac.springboot3;

import com.ginelmac.springboot3.Service.MyappServlce;
import com.ginelmac.springboot3.Service.ProfilesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3006YmlApplicationTests {
    @Autowired
    private MyappServlce myappServlce;

    @Test
    void contextLoads() {
        myappServlce.printInfo();
    }

    @Autowired
    private ProfilesService profilesService;

    @Test
    void test2(){
        profilesService.printInfo();
    }

}
