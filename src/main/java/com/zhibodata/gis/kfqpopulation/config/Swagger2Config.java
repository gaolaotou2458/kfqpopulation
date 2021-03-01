package com.zhibodata.gis.kfqpopulation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class Swagger2Config {

    @Bean
    public Docket createUserRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("信息维护")
                .apiInfo(partUserInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhibodata.gis.kfqpopulation.controller"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.regex(".*/user/.*"))
                .build();
    }

    private ApiInfo partUserInfo() {
        return new ApiInfoBuilder()
                .title("信息维护")
                .version("1.0.0")
                .build();
    }
}