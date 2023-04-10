package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {
	
	@Value("#{5+10+5}")
	private int x;
	
	@Value("#{15+10+15}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")	// call static methods
	//@Value("#{ T(java.lang.Math).E }") //Call static variable
	private double z;
	
	@Value("#{ new java.lang.String('Himanshu sharma')}")	//Create new object
	private String name;
	
	@Value("#{8>5}")
	private Boolean isMen;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", men=" + isMen + "]";
	}


	


	

}
