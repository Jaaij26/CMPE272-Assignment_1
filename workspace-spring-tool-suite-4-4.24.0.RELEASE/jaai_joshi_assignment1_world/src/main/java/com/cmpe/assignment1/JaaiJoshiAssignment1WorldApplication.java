package com.cmpe.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class JaaiJoshiAssignment1WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaaiJoshiAssignment1WorldApplication.class, args);
	}
	@GetMapping("/world")
	public String world(@RequestParam(name="World", defaultValue="World") String name) {
		return name;
	}
}
