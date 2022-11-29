package com.example.springbootmybatisvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisvue.mapper")
@EnableCaching
@EnableOpenApi
public class SpringbootMybatisVueApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisVueApplication.class, args);
    }

}
