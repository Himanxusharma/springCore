package com.springCore.stereotype;

import java.util.List;

import javax.security.auth.Subject;

public class Teacher {
	
	private String name;
	private int Phone;
	private List<String> add;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public List<String> getadd() {
		return add;
	}
	public void setadd(List<String> add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", Phone=" + Phone + ", address =" + add + "]";
	}
	
	
	
	
}
