package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {
	
	@Value("#{5+10+5}")
	private int x;
	
	@Value("#{15+10+15}")
	private int y;
	
	
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
	
	
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
