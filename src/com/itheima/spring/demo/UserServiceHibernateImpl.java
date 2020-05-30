package com.itheima.spring.demo;

public class UserServiceHibernateImpl implements UserService {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void save() {
		System.out.println("userServiceHibernate执行了事务--"+name);
	}

}
