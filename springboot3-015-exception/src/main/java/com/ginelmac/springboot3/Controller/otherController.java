package com.ginelmac.springboot3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class otherController {
    @GetMapping("/other/{id}")
    public String testException(@PathVariable("id") Long id){
        if(id == 1){
            throw new IllegalArgumentException("无效id"+id);
        }
        return "ID="+id;
    }
}
