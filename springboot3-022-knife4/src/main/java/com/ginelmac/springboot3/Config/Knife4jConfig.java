package com.ginelmac.springboot3.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        //接口文档的标题
                        .title("hello-knife4j项目API")
                        //接口文档的版本
                        .version("1.0")
                        //接口文档的基本信息
                        .description("hello-knife4j项目的接口文档"));
    }

    //对接口进行分组
    @Bean
    public GroupedOpenApi userAPI() {
                //如果请求路径符合/user/**模式，那么这个请求就属于“用户信息管理”这个组里面
                //一个项目中会有很多的组，为了方便我们查看，所以要对接口进行分组
        return GroupedOpenApi.builder().group("用户信息管理").
                pathsToMatch("/user/**").
                build();
    }
    @Bean
    public GroupedOpenApi systemAPI() {
        return GroupedOpenApi.builder().group("产品信息管理").
                pathsToMatch("/product/**").
                build();
    }
}
