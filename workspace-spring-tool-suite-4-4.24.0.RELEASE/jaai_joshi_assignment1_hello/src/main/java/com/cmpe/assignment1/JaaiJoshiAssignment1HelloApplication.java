package com.cmpe.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JaaiJoshiAssignment1HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaaiJoshiAssignment1HelloApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name="Hello", defaultValue="Hello") String name) {
        return name;
    }
}
