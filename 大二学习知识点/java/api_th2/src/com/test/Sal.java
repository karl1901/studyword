package com.test;

// 消费者

public class Sal implements Runnable {

	private Far far = null;

	public Sal(Far far) {
		this.far = far;
	}

	@Override
	public void run() {
		while (true) {
			far.SalPro();
			System.out.println(Thread.currentThread().getName() + "消费了第" + far.getVt().size() + "个商品");
			try {
				Thread.sleep(100); // 休息一会儿
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}

}
