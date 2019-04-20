package com.jiuge.songs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.jiuge.songs.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class SongsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongsApplication.class, args);
    }

}
