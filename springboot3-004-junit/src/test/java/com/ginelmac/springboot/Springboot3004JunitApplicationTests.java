package com.ginelmac.springboot;

import com.ginelmac.springboot.bean.User;
import com.ginelmac.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//springboot中使用单元测试junit，必须用这个注解标注
@SpringBootTest
class Springboot3004JunitApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User finduser = userService.finduser();
        System.out.println(finduser);
    }

}
