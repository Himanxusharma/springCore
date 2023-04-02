package com.springCore.lifecycle;
//using xml
public class CocaCola_xml {
	private double price;


	public double getPrice() {
		System.out.println("initialized value");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	public CocaCola_xml() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CocaCola [price = " + price + " ]";
	}
	
	public void init()
	{
		System.out.println("init method of xml is running");
	}
	
	public void destroy() {
		
		System.out.println("destroy method of xml is called");
	}
	
	
}
