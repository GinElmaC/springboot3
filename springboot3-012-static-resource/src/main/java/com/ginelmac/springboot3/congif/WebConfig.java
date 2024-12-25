package com.ginelmac.springboot3.congif;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//在springboot默认的自动配置之上进行扩展配置，也就是说springboot之前的配置仍然生效
@Configuration
public class WebConfig implements WebMvcConfigurer {
    //静态资源处理，需要重写addResourceHandlers方法
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //使用注册器registry绑定path pattern以及真实的静态资源文件存储路径
        //addResourceHandler绑定的是静态资源文件的真实路径，这里是添加了这种方法，以前的也可以使用，并没有覆盖，但是以前的/**的默认方式只能访问那四个默认地址的静态资源
        //addResourceLocations绑定的是静态资源文件的存储地址，底层寻找静态资源的时候是对String[]数组进行遍历查找的，这里其实就是添加了几个地址
        //这里两个绑定的是一个组合，访问static1/2中的数据只能用abc形式的
        registry.addResourceHandler("/abc/**")
                .addResourceLocations("classpath:/static1/","classpath:/static2/");
    }
}
