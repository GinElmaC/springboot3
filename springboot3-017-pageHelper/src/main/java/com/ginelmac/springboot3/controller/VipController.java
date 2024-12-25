package com.ginelmac.springboot3.controller;

import com.ginelmac.springboot3.Bean.Vip;
import com.ginelmac.springboot3.service.VipService;
import com.ginelmac.springboot3.util.Constant;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VipController {
    @Autowired
    private VipService vipService;
    @GetMapping("/page/{pageNo}")
    public PageInfo<Vip> getpage(@PathVariable int pageNo){
        PageHelper.startPage(pageNo, Constant.PAGE_SIZE);
        List<Vip> list = vipService.findAll();
        PageInfo<Vip> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
