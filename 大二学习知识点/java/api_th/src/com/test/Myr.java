package com.test;

// 线程的第二种创建方式(implements)

public class Myr implements Runnable {

	public void run() { // 执行线程内容
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

}
