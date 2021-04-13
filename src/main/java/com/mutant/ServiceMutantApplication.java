package com.mutant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ServiceMutantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMutantApplication.class, args);
    }

}
