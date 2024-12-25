package com.ginelmac.springboot3.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.format.DateTimeFormatter;
@EnableSwagger2
public class swaggerConfig {
    @Value("${spring.swagger2.enable}")
    private  Boolean enabled;
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enabled)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ginelmac.springboot3"))
                .paths(PathSelectors.any())
                .build();
    }
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("springboot利用swagger2构建api接口文档"+"\t"+ DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .description("springboot+redis整合")
                .version("1.0")
                .termsOfServiceUrl("https://localhost")
                .build();
    }
}
