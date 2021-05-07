package com.test;

// 线程的第一种实现方式(extends)

public class Myt extends Thread {

	public void run() {  // 启动线程的方法
		// TODO Auto-generated method stub
		// 获取当前线程名称
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}

}
