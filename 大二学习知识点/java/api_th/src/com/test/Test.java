package com.test;

public class Test {

	/**
	 * @param args
	 * ���߳�:˭�Ȼ�ȡ��CPU��Դ��������߳̾ͻᱻ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ȡ���̵߳�����(main)
		// String tname = Thread.currentThread().getName();
		// System.out.println(tname);
		//
		// // �������߳�(�����滻--��̬)
		// Thread ma = new Myt();
		// ma.start(); // ���߳̾߱���ȡCPU���ʸ�
		//
		// Thread mb = new Myt();
		// mb.start(); // ���߳̾߱���ȡCPU���ʸ�
		//
		// Myr r = new Myr();
		// Thread mc = new Thread(r);
		// mc.start();
		//
		// Thread md = new Thread(r);
		// md.start();

		// ��Ʊ(4������)
		Piao p = new Piao(); // �߳�Ҫһ����������
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
