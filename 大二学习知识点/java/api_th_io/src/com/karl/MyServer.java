package com.karl;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MyServer {

	/**
	 * @param args
	 * 
	 * Ⱥ��
	 * һ����������Ӧ����ͻ���
	 * ���߳�
	 * io��(�ַ���)
	 * �ֽ���
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ����һ��������
		ServerSocket ss = new ServerSocket(5566);
		System.out.println("����������");
		// ����һ���ͻ��˵ļ�Ⱥ
		Vector<Socket> vt = new Vector<Socket>();
		// �÷��������ڵȴ����ӵ�״̬
		while (true) {
			Socket sk = ss.accept();
			// �������ϵĿͻ��˷��뼯Ⱥ
			vt.add(sk);
			Thread t = new ServerTh(vt, sk);
			t.start();
		}

	}

}
