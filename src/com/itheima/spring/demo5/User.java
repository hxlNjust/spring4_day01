package com.itheima.spring.demo5;

public class User {
	private String name;
	private Car car;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", car=" + car + "]";
	}
}
