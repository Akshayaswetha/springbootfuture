package com.akshaya.springbootkafkademo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
public class StreamKafkaApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}