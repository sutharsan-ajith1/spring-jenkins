package com.mydockerproject.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Kubernetes deployment";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerDemoApplication.class, args);
    }

}
