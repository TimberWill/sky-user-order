package com.sky.user;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sky")
@MapperScan("com.sky.*.mapper")
@Slf4j
public class SkyUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkyUserServerApplication.class, args);
    }

}
