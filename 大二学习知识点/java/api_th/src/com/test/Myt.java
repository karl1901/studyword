package com.test;

// �̵߳ĵ�һ��ʵ�ַ�ʽ(extends)

public class Myt extends Thread {

	public void run() {  // �����̵߳ķ���
		// TODO Auto-generated method stub
		// ��ȡ��ǰ�߳�����
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
	}

}
