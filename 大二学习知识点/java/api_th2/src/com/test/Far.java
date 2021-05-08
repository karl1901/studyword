package com.test;

import java.util.Vector;

// 工厂：生产能力、销售能力
// 做商品

public class Far {

	// 商品的集合
	private Vector<Pro> vt = new Vector<Pro>();

	// 让别人能够获取仓库
	public Vector<Pro> getVt() {
		return vt;
	}

	public void setVt(Vector<Pro> vt) {
		this.vt = vt;
	}

	// 生产商品的方法
	public synchronized void getPro(Pro p) {
		if (vt.size() > 99) { // 让商品停止生产的判断
			System.out.println("仓库有已满，停止生产");
			try {
				this.wait(); // 让线程休眠的方法
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			vt.add(p);
		}
	}

	// 消费的方法
	public synchronized void SalPro() {
		if (vt.size() < 1) { // 仓库没有商品了
			System.out.println("商品已售空");
			try {
				this.wait();
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			vt.remove(0); // 卖商品
			this.notifyAll(); // 唤醒所有线程
		}
	}

}
