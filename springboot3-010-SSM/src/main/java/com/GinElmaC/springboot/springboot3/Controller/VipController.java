package com.GinElmaC.springboot.springboot3.Controller;

import com.GinElmaC.springboot.springboot3.Bean.Vip;
import com.GinElmaC.springboot.springboot3.Service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {
    @Autowired
    private VipService vipService;

    @GetMapping("/detail")
    public Vip detail(@RequestParam("id") Long id){
        System.out.println("11111");
        Vip vip = vipService.findById(id);
        System.out.println(vip);
        return vip;
    }
}
