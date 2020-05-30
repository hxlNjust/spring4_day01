package com.itheima.spring.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
	@Test
	/**
	 * 传统的测试方法
	 */
	public void demo1() {
		UserService userService = new UserServiceImpl();
		userService.save();
		System.out.println("day01_right");
		System.out.println("day01_left");
		System.out.println("hotfix...by test");
		
	}

	@SuppressWarnings("resource")
	@Test
	/**
	 * 工厂模式+反射+配置文件，创建了
	 */
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}

}
