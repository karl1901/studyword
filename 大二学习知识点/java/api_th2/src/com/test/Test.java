package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ���߳�--����ģʽ(��������--�����ߡ��������� --������ ��Ʒ)
		// ����һ������
		Far f = new Far();

		// ��������--��һ��������
		Mar m = new Mar(f); // ��һ������
		Thread t = new Thread(m); // �ѹ��˷ŵ�������
		t.start(); // ��ʼ����

		// �ڶ�������
		Mar m1 = new Mar(f);
		Thread t1 = new Thread(m1);
		t1.start();

		// ����������--��һ��������
		Sal sa = new Sal(f);
		Thread h = new Thread(sa);
		h.start();

		// �ڶ���������
		Sal sb = new Sal(f);
		Thread h1 = new Thread(sb);
		h1.start();

	}

}
