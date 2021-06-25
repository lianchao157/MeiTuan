package com.meituan.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@ServletComponentScan
@MapperScan(value = "com.meituan.demo.mapper")
@ComponentScan("com.meituan.demo.swagger")
@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
public class MeituanApplication {
	public static void main(String[] args) {
		SpringApplication.run(MeituanApplication.class, args);
	}

}
