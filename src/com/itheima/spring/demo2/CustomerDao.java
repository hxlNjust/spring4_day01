package com.itheima.spring.demo2;

public interface CustomerDao {
	void save();
	
	/**
	 * 生命周期初始的方法
	 */
	void init();
	
	/**
	 * 生命周期销毁的方法
	 */
	void destory();
}
