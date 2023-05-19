package com.softusing.xuzhining;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.softusing.xuzhining.domain")
public class XuzhiningApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(XuzhiningApplication.class, args);





    }

}
