package com.GinElmaC.springboot3.Controller;

import com.GinElmaC.springboot3.Service.ActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActController {
    @Autowired
    private ActService actService;
    @PostMapping("/trans")
    public String trans(String fromactno,String toactno,double money){
        actService.transmoney(fromactno,toactno,money);
        return "success";
    }
}
