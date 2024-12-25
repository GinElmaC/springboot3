package com.ginelmac.springboot3.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//用来定义全局异常处理器，对于所有的控制器都有效
@ControllerAdvice
public class GlobalException {
    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    public String handlerException(IllegalArgumentException e){
        return "错误信息："+e.getMessage();
    }
}
