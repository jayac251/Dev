package io.jc.spring.boot.learning.jstl.mvc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.jc.spring.boot.learning.jstl.mvc.data.services.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	public ProjectService projectService;
	
	@RequestMapping(value="/find")
	public String find(Model model) {
		model.addAttribute("projects", this.projectService.findAll());
		return "projects";
	}

	@RequestMapping(value="/{projectId}")
	public String findProject(Model model, @PathVariable Long projectId) {
		model.addAttribute("project", this.projectService.find(projectId));
		return "project";
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(HttpSession session) {
		session.setAttribute("token", "12345");
		System.out.println("invoking add project");
		return "project_add";
	}

	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveProject(@RequestParam("name") Long name, HttpSession session) {
		System.out.println(name);
		System.out.println(session.getAttribute("token"));
		System.out.println("invoking save project");
		return "project_add";
	}

	
	@RequestMapping(value="/add",method=RequestMethod.POST,params= {"type=multi"})
	public String multiYearProject() {
		System.out.println("invoking multiYear project");
		return "project_add";
	}

	@RequestMapping(value="/add",method=RequestMethod.POST,params= {"type=multi","special"})
	public String specialProject() {
		System.out.println("invoking special project");
		return "project_add";
	}


}
