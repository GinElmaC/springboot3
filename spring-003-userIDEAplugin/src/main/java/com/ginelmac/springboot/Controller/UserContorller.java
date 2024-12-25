package com.ginelmac.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContorller {
    @GetMapping("/user")
    @ResponseBody
    public String hello(){
        return "running";
    }
}
