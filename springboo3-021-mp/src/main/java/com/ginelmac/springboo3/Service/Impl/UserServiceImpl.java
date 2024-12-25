package com.ginelmac.springboo3.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ginelmac.springboo3.Bean.User;
import com.ginelmac.springboo3.Mapper.UserMapper;
import com.ginelmac.springboo3.Service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
