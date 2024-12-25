package com.ginelmac.springboot3.demo;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

import java.util.List;

public class lettuceDome {
    public static void main(String[] args) {
        //使用构建器链式编程来builder我们的RedisURL
        RedisURI url = RedisURI.builder()
                                        .redis("192.168.88.169")
                                        .withPort(6379)
                                        .withAuthentication("default","111")
                                        .build();
        //创建连接客户端
        RedisClient redisClient = RedisClient.create(url);
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        //创建操作的command，通过connection创建
        RedisCommands commands = connection.sync();

        //-----------------------
        List keys = commands.keys("*");
        System.out.println(keys);

        commands.set("k4","v4");
        String str = (String)commands.get("k4");
        System.out.println(str);;
        //-----------------------

        //关闭释放资源
        connection.close();
        redisClient.shutdown();
    }
}
