package com.test;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.util.FileUtil;

public class Myser {

	/**
	 * @param args
	 * ������
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ������һ��������
		ServerSocket ss = new ServerSocket(5566);
		System.out.println("������������");
		// �÷��������ڵȴ����ӵ�״̬
		Socket sk = ss.accept();
		System.out.println("���ӵ�ip��" + sk.getLocalPort());

		Scanner mys = new Scanner(System.in);
		while (true) {
			// ���տͻ��˷��͹���������
			String str = FileUtil.SocketRead(sk);
			System.out.println("�ͻ���˵��" + str);
			if (str != null) {
				if (str.equals("�Ͽ�����")) {
					FileUtil.Myclose(sk);
					break;
				}
			}

			System.out.println("������Ի����ݣ�(������)");
			String s = mys.next();
			FileUtil.SocketWrite(sk, s);

		}

	}

}
