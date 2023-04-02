package com.springCore.autowire.annotation;

public class Address {
	
	private int number;
	private String state;
	private String country;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	public Address(int number, String state, String country) {
		super();
		this.number = number;
		this.state = state;
		this.country = country;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public String toString() {
		return "Address [number=" + number + ", state=" + state + ", country=" + country + "]";
	}
	
	
	

}
