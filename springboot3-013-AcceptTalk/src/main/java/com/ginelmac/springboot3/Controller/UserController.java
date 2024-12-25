package com.ginelmac.springboot3.Controller;

import com.ginelmac.springboot3.Bean.User;
import com.ginelmac.springboot3.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//这个注解相当于@Controller和@ResponseBody联合使用，默认是将数据转换成json字符串进行响应
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/detail")
    public User detail(){
        return userService.findUser();
    }
}
