package com.test;

// ������

public class Sal implements Runnable {

	private Far far = null;

	public Sal(Far far) {
		this.far = far;
	}

	@Override
	public void run() {
		while (true) {
			far.SalPro();
			System.out.println(Thread.currentThread().getName() + "�����˵�" + far.getVt().size() + "����Ʒ");
			try {
				Thread.sleep(100); // ��Ϣһ���
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}

}
