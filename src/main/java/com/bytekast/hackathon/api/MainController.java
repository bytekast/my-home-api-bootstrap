package com.bytekast.hackathon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tendril.myhome")
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }
}
