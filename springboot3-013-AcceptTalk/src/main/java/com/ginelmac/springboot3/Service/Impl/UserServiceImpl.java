package com.ginelmac.springboot3.Service.Impl;

import com.ginelmac.springboot3.Bean.User;
import com.ginelmac.springboot3.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUser() {
        User user = new User("jackson",30);
        return user;
    }
}
