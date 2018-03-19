package com.jc.jdbc.student.dao;

import java.util.List;

import com.jc.jdbc.student.model.student.Student;

public interface StudentDao {
	List<Student> getAllStudents();
	Student getStudentById(String studentId);
	
	

}
