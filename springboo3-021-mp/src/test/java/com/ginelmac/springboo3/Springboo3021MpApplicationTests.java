package com.ginelmac.springboo3;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ginelmac.springboo3.Bean.User;
import com.ginelmac.springboo3.Mapper.UserMapper;
import com.ginelmac.springboo3.RedisTemplate.Redistemplates;
import com.ginelmac.springboo3.Service.UserService;
import com.ginelmac.springboo3.testMinIo.minio1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboo3021MpApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User("kk",14,"kk@com");
        int a = userMapper.insert(user);
        System.out.println(a);
    }
    @Autowired
    private UserService userService;
    @Test
    void test1(){
        User user = new User("jj",90,"jj@com");
        boolean save = userService.save(user);
        if(save){
            System.out.println("保存成功");
        }
    }
    @Test
    void test02(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        QueryWrapper<User> eq = queryWrapper.eq("name", "tom");
        List<User> list = userService.list(eq);
        for(User user:list){
            System.out.println(user);
        }

        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<User> tom = lambdaQueryWrapper.eq(User::getName, "tom");

        System.out.println(eq);
        System.out.println(tom);

    }
    @Autowired
    private minio1 minio1;
    @Test
    void test03(){
        minio1.saveDD("D:\\java\\springboot3\\springboo3-021-mp\\src\\main\\resources\\static\\feixiao.jpg","feixiao");
    }

    @Autowired
    private Redistemplates redistemplates;
    @Test
    void test04(){
        redistemplates.redisSet();
        redistemplates.redisGet();
    }
}
