package com.test;

// 工人

public class Mar implements Runnable {

	// 让工人类与工厂相关联
	private Far far = null;

	public Mar(Far far) {
		this.far = far;
	}

	@Override
	public void run() {
		while (true) {
			// 调用工厂生产商品的方法
			Pro p = new Pro(); // 商品对象
			far.getPro(p);
			System.out.println(Thread.currentThread().getName() + "生产第" + far.getVt().size() + "个商品");
			try {
				Thread.sleep(100); // 休息一会儿
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
