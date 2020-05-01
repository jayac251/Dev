package io.jc.spring.boot.learning.jstl.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.jc.spring.boot.learning.jstl.mvc.data.entities.Project;

@Controller
@RequestMapping("/home")
public class MainController {

	@RequestMapping("/")
	public String homePage(Model  model) {
		System.out.println("Navigating to home page");
		
		Project project = new Project();
		project.setName("First Project");
		project.setSponsor("Nasa");
		project.setDescription("This is a simple project sponsored by Nasa");
		
		model.addAttribute("currentProject", project);

		return "home";
	}
	
}

