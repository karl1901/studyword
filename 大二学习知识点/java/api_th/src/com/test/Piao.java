package com.test;

public class Piao implements Runnable {

	private int t = 200; // һ��200��

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			getPiao(); // ������Ʊ�ķ���
			if (t == 0) {
				System.out.println("Ʊ������");
				break;
			}
		}
	}

	// ��Ʊ�ķ���(�����:synchronized)
	// ������ͬ��
	public synchronized void getPiao() {
		if (t > 0) { // ��Ʊ
			System.out.println("���˵�" + t + "��Ʊ");
			t--; // ��Ʊ
			try {
				Thread.sleep(100); // ���߳���ʱ��Ϣ100����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
