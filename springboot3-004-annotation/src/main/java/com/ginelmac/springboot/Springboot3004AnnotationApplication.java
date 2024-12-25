package com.ginelmac.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 1.当前类被@SpringBootApplication标注，被该注解标注的类是springboot项目的主入口。
 * 2.该类的main方法就是整个springboot项目的入口
 * 3.关于这个注解：
 *      从源码角度分析，这个注解被这三个额外注解标注：
 *      @SpringBootConfiguration
 *      @EnableAutoConfiguration
 *      @ComponentScan
 *      也就是说这是一个复合注解，同时拥有上方三个注解的功能
 *      3.1关于@SpringBootConfiguration：
 *          该注解被@Configuration标注，所以springboot项目的主入口同时又是一个配置类
 *      3.2关于@EnableAutoConfiguration注解
 *          启动自动配置
 *          也就是说默认情况下，springboot应用都会默认启用自动配置
 *          自动配置有什么用？
 *              所谓的自动配置只要启动，springboot应用会去类路径当中查找class，根据类路径当中有某个类，或某些类，来自动管理bean，不需要我们程序员手动配置
 *              比如：springboot检测到类路径当中有SqlSessionFactory，或者在application.properties文件中配置了数据源，那么springboot容器会认为项目
 *              中有mybatis框架，因此会将mybatis中相关的bean自动初始化，然后放入Ioc容器，自动将这些bean管理起来。
 *      3.3关于ComponenetScan
 *          带有这个注解就会限定扫描范围，范围是第一行package com.ginelmac.springboot的所有类型以及所有子包的所有类型
 */
@SpringBootApplication
public class Springboot3004AnnotationApplication {

    @Bean("date")
    public Date getDate(){
        return new Date();
    }

    public static void main(String[] args) {
        //run方法第一个参数就是配置类，对应的就是以前的配置文件，因为@SpringBootApplication注解将这个类变成了配置类
        //springboot应用程序就是从这个配置类开始，加载所有bean的
        //springboot3004AnnotationApplication又被称为源【起源】
//        SpringApplication.run(Springboot3004AnnotationApplication.class, args);

        //通过run方法的返回值可以获得spring上下文的
        //ConfigurableApplicationContext继承了ApplicationContext，所以run方法的返回值就是spring容器
        ConfigurableApplicationContext run = SpringApplication.run(Springboot3004AnnotationApplication.class, args);
        Object sqlSessionFactory = run.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        Object transactionManager = run.getBean("transactionManager");
        System.out.println(transactionManager);
        //关闭容器
        run.close();
    }

}
