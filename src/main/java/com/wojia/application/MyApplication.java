package com.wojia.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 慕琪
 * @Date 2021/2/3 14:48
 * @Version 1.0
 **/
@MapperScan(value = "com.wojia.application.mapper")
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
