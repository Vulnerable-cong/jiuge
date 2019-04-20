package com.jiuge.songs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.jiuge.songs.mapper")
@SpringBootApplication
public class SongsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongsApplication.class, args);
    }

}
