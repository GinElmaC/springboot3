package com.ginelmac.springboo3.RedisTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Redistemplates {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void redisSet(){
        redisTemplate.opsForValue().set("k1","v1");
    }
    public void redisGet(){
        Object object = redisTemplate.opsForValue().get("k1");
        System.out.println((String)object);
    }

}
