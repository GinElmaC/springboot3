package com.ginelmac.springboot.service.Impl;

import com.ginelmac.springboot.bean.User;
import com.ginelmac.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service("userservice")
public class UserServiceImpl implements UserService {
    @Override
    public User finduser() {
        User user = new User("张三","123456");
        return user;
    }
}
