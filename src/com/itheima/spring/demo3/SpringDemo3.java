package com.itheima.spring.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
	@SuppressWarnings("resource")
	@Test
	/**
	 *进行创建参数
	 */
	public void demo1() {
		//获取无惨的构造方法
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
	}
	
	@SuppressWarnings("resource")
	@Test
	/**
	 * 通过工厂的静态方法获取到参数
	 */
	public void demo2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
	}
	
	@SuppressWarnings("resource")
	@Test
	public void demo3() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 bean3=(Bean3)applicationContext.getBean("bean3");
		System.out.println(bean3);
	}
}
