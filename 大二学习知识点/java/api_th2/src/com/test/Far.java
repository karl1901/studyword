package com.test;

import java.util.Vector;

// ������������������������
// ����Ʒ

public class Far {

	// ��Ʒ�ļ���
	private Vector<Pro> vt = new Vector<Pro>();

	// �ñ����ܹ���ȡ�ֿ�
	public Vector<Pro> getVt() {
		return vt;
	}

	public void setVt(Vector<Pro> vt) {
		this.vt = vt;
	}

	// ������Ʒ�ķ���
	public synchronized void getPro(Pro p) {
		if (vt.size() > 99) { // ����Ʒֹͣ�������ж�
			System.out.println("�ֿ���������ֹͣ����");
			try {
				this.wait(); // ���߳����ߵķ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			vt.add(p);
		}
	}

	// ���ѵķ���
	public synchronized void SalPro() {
		if (vt.size() < 1) { // �ֿ�û����Ʒ��
			System.out.println("��Ʒ���ۿ�");
			try {
				this.wait();
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			vt.remove(0); // ����Ʒ
			this.notifyAll(); // ���������߳�
		}
	}

}
