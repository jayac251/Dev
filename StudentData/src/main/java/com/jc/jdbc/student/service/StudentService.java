package com.jc.jdbc.student.service;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public interface StudentService {
	
		
		void getAllStudents() throws IOException, JAXBException;
		void getStudentById(String studentId);
		
}
