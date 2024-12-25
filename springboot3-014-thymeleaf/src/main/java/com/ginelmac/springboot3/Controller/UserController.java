package com.ginelmac.springboot3.Controller;

import com.ginelmac.springboot3.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/detail")
    public String detail(Model model){
        model.addAttribute("list",userService.getAll());
        return "detail";
    }
}
