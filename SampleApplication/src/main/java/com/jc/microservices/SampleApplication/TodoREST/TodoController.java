package com.jc.microservices.SampleApplication.TodoREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoservice;
	
	@GetMapping("/todo/{name}")
	public List<Todo> GetTodos(@PathVariable String name) {
		
		return todoservice.retrieveTodos(name);
		
	}

}
