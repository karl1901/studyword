package com.test;

// ����

public class Mar implements Runnable {

	// �ù������빤�������
	private Far far = null;

	public Mar(Far far) {
		this.far = far;
	}

	@Override
	public void run() {
		while (true) {
			// ���ù���������Ʒ�ķ���
			Pro p = new Pro(); // ��Ʒ����
			far.getPro(p);
			System.out.println(Thread.currentThread().getName() + "������" + far.getVt().size() + "����Ʒ");
			try {
				Thread.sleep(100); // ��Ϣһ���
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
