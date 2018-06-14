package com.jc.microservices.SampleApplication.WelcomeREST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Hello JC!";
	}
	
	@GetMapping("/welcomeBean")
	public WelcomeBean WelcomewithObj() {
		return new WelcomeBean("Hello from Bean");
	}
}
