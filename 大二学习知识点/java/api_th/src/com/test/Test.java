package com.test;

public class Test {

	/**
	 * @param args
	 * 多线程:谁先获取到CPU资源，那这个线程就会被运行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 获取主线程的名称(main)
		// String tname = Thread.currentThread().getName();
		// System.out.println(tname);
		//
		// // 创建子线程(里氏替换--多态)
		// Thread ma = new Myt();
		// ma.start(); // 让线程具备获取CPU的资格
		//
		// Thread mb = new Myt();
		// mb.start(); // 让线程具备获取CPU的资格
		//
		// Myr r = new Myr();
		// Thread mc = new Thread(r);
		// mc.start();
		//
		// Thread md = new Thread(r);
		// md.start();

		// 卖票(4个人卖)
		Piao p = new Piao(); // 线程要一个做的事情
		Thread a = new Thread(p);
		a.start();
		Thread b = new Thread(p);
		b.start();
		Thread c = new Thread(p);
		c.start();
		Thread d = new Thread(p);
		d.start();

	}

}
