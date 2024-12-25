package com.ginelmac.springboot3.Service.Impl;

import com.ginelmac.springboot3.Bean.User;
import com.ginelmac.springboot3.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        User user1 = new User("张三",18,true,"11","Usa");
        User user2 = new User("李四",20,false,"222","beijing");
        User user3 = new User("王五",30,true,"333","nanchang");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
