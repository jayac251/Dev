package com.jc.jdbc.student;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jc.jdbc.student.service.StudentService;

@SpringBootApplication
public class StudentDataApplication {

	@Autowired
	StudentService studentservice;
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(StudentDataApplication.class, args);
		StudentService studentservice=context.getBean(StudentService.class);
		try {
			studentservice.getAllStudents();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
