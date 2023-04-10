package com.springCore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Fee Fees;

	public Student(Fee Fees) {
		super();
		this.Fees = Fees;
	}


	public Fee getFees() {
		return Fees;
	}

	public void setFees(Fee Fees) {
		this.Fees = Fees;
	}


	public void study() {
		
		this.Fees.paid();
		System.out.println("Student is writing.");
	}


	
}
