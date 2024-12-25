package com.ginelmac.springboot3.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProfilesService {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;

    public void printInfo(){
        System.out.println(username);
        System.out.println(password);
        System.out.println(url);
    }
}
