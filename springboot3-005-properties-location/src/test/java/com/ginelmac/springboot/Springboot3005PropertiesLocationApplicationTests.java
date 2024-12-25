package com.ginelmac.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ginelmac.springboot.config.appConfig;

@SpringBootTest
class Springboot3005PropertiesLocationApplicationTests {
    @Autowired
    private appConfig appConfig;

    @Test
    void contextLoads() {
        appConfig.printInfo();
    }

}
