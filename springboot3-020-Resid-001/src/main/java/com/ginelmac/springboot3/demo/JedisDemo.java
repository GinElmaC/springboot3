package com.ginelmac.springboot3.demo;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisDemo {
    public static void main(String[] args) {
        //connection获取，通过指定ip和端口号
        Jedis jedis = new Jedis("192.168.88.169", 6379);
        //指定访问服务器的密码
        jedis.auth("111");
        //获得了jedis客户端，可以向jdbc一样
//        System.out.println(jedis.ping());
        //keys
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        //string
        jedis.set("k3","v3");
        System.out.println(jedis.get("k3"));
    }
}
