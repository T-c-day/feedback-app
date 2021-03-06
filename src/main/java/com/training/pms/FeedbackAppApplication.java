package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeedbackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackAppApplication.class, args);
	}

	@GetMapping("/sayHello")
	public String sayHello() {
		return "ello govna";
	}
	
	@GetMapping("/sayBye")
	public String sayBye() {
		return "bye felicia";
	}
}
