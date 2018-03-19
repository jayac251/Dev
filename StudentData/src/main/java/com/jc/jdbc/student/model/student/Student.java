/**
 * 
 */
package com.jc.jdbc.student.model.student;

/**
 * @author Spring User
 *
 */
public class Student {

	private String id;
	private String name;
	private int m1;
	private int m2;
	private String result;
	private String issport;
	private String isacademic;
	
	/**
	 * @param id
	 * @param name
	 * @param m1
	 * @param m2
	 * @param result
	 */
	public Student(String id, String name, int m1, int m2, String result) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.result = result;
	}
	public Student()
	{}
	
	public String getStudentId() {
		return id;
	}
	public void setStudentId(String studentId) {
		id = studentId;
	}
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String studentName) {
		this.name = studentName;
	}
	public int getMark1() {
		return m1;
	}
	public void setMark1(int mark1) {
		this.m1 = mark1;
	}
	public int getMark2() {
		return m2;
	}
	public void setMark2(int mark2) {
		this.m2 = mark2;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + id 
				+ ", Name=" + name 
				+" , m1="+ m1
				+" , m2="+ m2
				+" , result="+ result
				+" , is_sport="+issport
				+" , is_academic="+isacademic+ "]";
	}
	public String getIssport() {
		return issport;
	}
	public void setIssport(String issport) {
		this.issport = issport;
	}
	public String getIsacademic() {
		return isacademic;
	}
	public void setIsacademic(String isacademic) {
		this.isacademic = isacademic;
	}
}
