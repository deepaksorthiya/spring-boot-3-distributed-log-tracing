package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot3DistributedLogTracingApplication {

    Logger logger = LoggerFactory.getLogger(SpringBoot3DistributedLogTracingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3DistributedLogTracingApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        logger.info("Log message from spring boot {} ", "hello");
        return "hello";
    }

}
