package com.itheima.spring.demo5;

public class CarInfo {
	private String name;

	public String getName() {
		name="摩托车";
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double calculatePrice() {
		return Math.random()*3000;
	}
	
}
