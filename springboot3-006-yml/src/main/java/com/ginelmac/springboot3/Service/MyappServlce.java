package com.ginelmac.springboot3.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyappServlce {
    @Value("${myapp.username}")
    private String username;
    @Value("${myapp.email}")
    private String email;

    public void printInfo(){
        System.out.println(username);
        System.out.println(email);
    }
}
