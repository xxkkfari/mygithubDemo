package com.springboot.demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
@SpringBootApplication
@MapperScan("com.springboot.demo.mapper")
public class AppBoot {


    public static void main(String[] args) {
        SpringApplication.run(AppBoot.class, args);
    }
}
