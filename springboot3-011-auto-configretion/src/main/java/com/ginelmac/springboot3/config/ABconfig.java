package com.ginelmac.springboot3.config;

import com.ginelmac.springboot3.Bean.A;
import com.ginelmac.springboot3.Bean.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(name="org.springframework.web.servlet.DispatcherServlet")
@Configuration
public class ABconfig {

    @Bean
    public A a(){
        return new A();
    }

    @Bean
    public B b(){
        return new B();
    }
}
