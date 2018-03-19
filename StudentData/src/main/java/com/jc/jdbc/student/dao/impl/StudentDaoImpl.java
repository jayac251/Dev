package com.jc.jdbc.student.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jc.jdbc.student.dao.StudentDao;
import com.jc.jdbc.student.model.student.Student;

@Repository
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Student> getAllStudents() {
		String sql = "SELECT id,name,m1,m2,result,is_sport,is_academic FROM student";

		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Student> studentlist = new ArrayList<Student>();
		for (Map<String, Object> row : rows) {
			Student student = new Student();
			student.setStudentId((String) row.get("id"));
			;
			student.setStudentName((String) row.get("name"));
			student.setMark1((int) row.get("m1"));
			student.setMark2((int) row.get("m2"));
			student.setResult((String) row.get("result"));
			student.setIssport((String) row.get("is_sport"));
			student.setIsacademic((String) row.get("is_academic"));
			studentlist.add(student);
		}
		return studentlist;

	}
	
	
	@Override
	public Student getStudentById(String studentId) {
		String sql = "SELECT * FROM student where id = ?";

		Student student = (Student) getJdbcTemplate().queryForObject(sql, new Object[] { studentId },
				new BeanPropertyRowMapper<Student>(Student.class));

		return student;
	}

}
