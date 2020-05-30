package com.itheima.spring.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	@SuppressWarnings("resource")
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car2");
		System.out.println(car);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo3() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo4() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		User user = (User) applicationContext.getBean("user2");
		System.out.println(user);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo5() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car3 = (Car) applicationContext.getBean("car3");
		System.out.println(car3);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo6() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		User user = (User) applicationContext.getBean("user3");
		System.out.println(user);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo7() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user5 = (User) applicationContext.getBean("user5");
		System.out.println(user5);
	}

	@SuppressWarnings("resource")
	@Test
	public void demo8() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car6=(Car)applicationContext.getBean("car6");
		System.out.println(car6);
	}
	
}
