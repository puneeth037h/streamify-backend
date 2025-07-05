package com.example.streamify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class
})
public class StreamifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamifyApplication.class, args);
    }
}
