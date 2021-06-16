package com.zhibodata.gis.kfqpopulation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class Swagger2Config {

    @Bean
    public Docket createUserRestApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        ticketPar.name("token").description("user ticket")//Token 以及Authorization 为自定义的参数，session保存的名字是哪个就可以写成那个
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("信息维护")
                .apiInfo(partUserInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhibodata.gis.kfqpopulation.controller"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.regex(".*/user/.*"))
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo partUserInfo() {
        return new ApiInfoBuilder()
                .title("信息维护")
                .version("1.0.0")
                .build();
    }
}