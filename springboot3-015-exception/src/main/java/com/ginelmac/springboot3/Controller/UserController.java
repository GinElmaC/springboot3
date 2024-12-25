package com.ginelmac.springboot3.Controller;

import org.springframework.web.bind.annotation.*;

//响应json
@RestController
public class UserController {
    @GetMapping("/testException/{id}")
    public String testException(@PathVariable("id") Long id){
        if(id == 1){
            throw new IllegalArgumentException("无效id"+id);
        }
        return "ID="+id;
    }
//    @ExceptionHandler(IllegalArgumentException.class)
//    public String handlerException(IllegalArgumentException e){
//        return "错误信息："+e.getMessage();
//    }
}
