package com.test;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.util.FileUtil;

public class Mycli {

	/**
	 * @param args
	 * �ͻ���
	 * @throws Exception
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ����һ���ͻ���
		Socket sk = new Socket("127.0.0.1", 5566);

		// �ͻ���д���ݸ�������
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("������Ի����ݣ�(�ͻ���)");
			String str = mys.next();
			// ����д�ķ���
			FileUtil.SocketWrite(sk, str);

			// ��ȡ������������
			String s = FileUtil.SocketRead(sk);
			System.out.println("������˵��" + s);
			if (s != null) {
				if (s.equals("��������æ")) {
					FileUtil.Myclose(sk);
					break;
				}
			}
		}

	}

}
