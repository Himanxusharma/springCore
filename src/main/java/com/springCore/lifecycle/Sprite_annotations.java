package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//using annotation
public class Sprite_annotations {
	
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Sprite_annotations(String price) {
		super();
		this.price = price;
	}

	public Sprite_annotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "sprite [price = " + price + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method of annotations is running");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("destroy method of annotations is called");
	}
	
}
