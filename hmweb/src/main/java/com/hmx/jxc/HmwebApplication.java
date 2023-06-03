package com.hmx.jxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hmx.jxc.mapper")
public class HmwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmwebApplication.class, args);
    }

}
