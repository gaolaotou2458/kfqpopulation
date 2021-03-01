package com.zhibodata.gis.kfqpopulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.zhibodata.gis.kfqpopulation.mapper")
@EnableSwagger2
@EnableCaching
@SpringBootApplication
@PropertySource("classpath:jdbc.properties")
@PropertySource("classpath:xxl.properties")
public class KfqpopulationApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfqpopulationApplication.class, args);
    }

}
