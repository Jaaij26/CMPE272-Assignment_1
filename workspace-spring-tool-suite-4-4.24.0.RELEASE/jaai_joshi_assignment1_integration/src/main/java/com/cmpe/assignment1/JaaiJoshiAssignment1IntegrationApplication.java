package com.cmpe.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class JaaiJoshiAssignment1IntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaaiJoshiAssignment1IntegrationApplication.class, args);
    }

    @GetMapping("/integrated")
    public String helloWorld() {
        RestTemplate restTemplate = new RestTemplate();
        
    	String hello=restTemplate.getForObject("http://hello-service:80/hello", String.class);
        String world=restTemplate.getForObject("http://world-service:80/world", String.class);
     
        return hello+" "+world;
        }
    }