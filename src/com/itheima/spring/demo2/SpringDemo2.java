package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");				
		customerDao.save();
		System.out.println(customerDao);
		
		CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("customerDao");
		System.out.println(customerDao2);
		System.out.println(customerDao==customerDao2);
		
		applicationContext.close();
	}
}
