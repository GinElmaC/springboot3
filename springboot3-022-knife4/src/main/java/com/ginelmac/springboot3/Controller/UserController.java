package com.ginelmac.springboot3.Controller;

import com.ginelmac.springboot3.Bean.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "测试信息管理")
public class UserController {
    @GetMapping("getUser")
    @Operation(summary = "直接传出一个User对象")
    public User getUser(@Parameter(description = "传入用户id") @RequestParam("id") Integer id){
        User user=  new User("张三",18,"beihai");
        return user;
    }
}
