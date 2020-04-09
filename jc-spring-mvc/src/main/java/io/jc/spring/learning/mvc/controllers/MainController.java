package io.jc.spring.learning.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.jc.spring.learning.mvc.services.GreetingService;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	GreetingService greetingService;
	
	@ResponseBody
	@RequestMapping("/")
	public String message() {
		return this.greetingService.greet();
	}
	

}
