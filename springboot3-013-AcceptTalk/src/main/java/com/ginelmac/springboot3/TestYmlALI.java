package com.ginelmac.springboot3;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.ginelmac.springboot3.Bean.User;

public class TestYmlALI {
    public static void main(String[] args) throws JsonProcessingException {
        //创建yml工厂
        YAMLFactory yamlFactory = new YAMLFactory();
        //创建对象映射器对象
        ObjectMapper objectMapper = new ObjectMapper(yamlFactory);
        //创建java对象
        User user = new User("jackson",30);
        //将java对象转换成字符串，转换成什么具体取决于objectMapper中的工厂是什么工厂
        String str = objectMapper.writeValueAsString(user);

        System.out.println(str);
    }
}
