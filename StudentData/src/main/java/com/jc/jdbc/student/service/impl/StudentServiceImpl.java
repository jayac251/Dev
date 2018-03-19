package com.jc.jdbc.student.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jc.jdbc.student.dao.StudentDao;
import com.jc.jdbc.student.model.student.Student;
import com.jc.jdbc.student.service.StudentService;
import com.jc.jdbc.student.xml.XmlConverter;

@Service
public class StudentServiceImpl implements StudentService {
	
	
@Autowired
	StudentDao studentdao;
	@Override
	public void getAllStudents() throws IOException, JAXBException {
		// TODO Auto-generated method stub
		
		List<Student> studentlist=studentdao.getAllStudents();
		Map<String,String> map = new HashMap<String,String>();
		XmlConverter xmlconverter = new XmlConverter();
		xmlconverter.convertFromObjectToXML(studentlist);
		for(Student student:studentlist)
		{
			
			System.out.println("Get All :"+student.toString());
		}
		
		
	}

	@Override
	public void getStudentById(String studentId) {
		
		Student student=studentdao.getStudentById(studentId);
		System.out.println("By Id :"+student.toString());
		// TODO Auto-generated method stub
		
	}

}
