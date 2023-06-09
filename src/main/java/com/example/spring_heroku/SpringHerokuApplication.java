package com.example.spring_heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuApplication.class, args);
	}

	@GetMapping("/")
	public String get(){
		return "Hello Jenkins";
	}
}
