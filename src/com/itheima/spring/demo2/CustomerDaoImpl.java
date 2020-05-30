package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("进行保存操作");

	}

	@Override
	public void init() {
		System.out.println("CustomerDaoImpl进行初始化参数");

	}

	@Override
	public void destory() {
		System.out.println("CustomerDaoImpl对象开始销毁参数");

	}

}
