/**
 * 
 */
package com.springCore;

public class Student {

	private int studentId;
	private String studentName;
	private String StudentAddress;
	
	
	//Getters and Setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	
	
	
	// Parameterized Constructor
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.StudentAddress = studentAddress;
	}
	
	
	// Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
	
	
}
