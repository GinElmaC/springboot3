package com.ginelmac.springboot3.Config;

import com.ginelmac.springboot3.Bean.OuterBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OuterBeanConfig {
    @Bean
    @ConfigurationProperties(prefix = "outer")
    public OuterBean getOuterBean(){
        return new OuterBean();
    }
}
