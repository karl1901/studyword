package com.test;

public class Piao implements Runnable {

	private int t = 200; // 一共200张

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			getPiao(); // 调用卖票的方法
			if (t == 0) {
				System.out.println("票已售完");
				break;
			}
		}
	}

	// 卖票的方法(锁旗标:synchronized)
	// 方法的同步
	public synchronized void getPiao() {
		if (t > 0) { // 有票
			System.out.println("卖了第" + t + "张票");
			t--; // 卖票
			try {
				Thread.sleep(100); // 让线程暂时休息100毫秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
