package com.GinElmaC.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//这个HelloController要想被spring容器管理，这个类必须在启动器的子目录或同级目录下
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello,SpringBoot3!";
    }
}
