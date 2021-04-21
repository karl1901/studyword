package com.karl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// ������

public class MyServer {

	/**
	 * @param args
	 * ���е���������ڷ�������
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// ����һ��������
		ServerSocket ss = new ServerSocket(5566);
		System.out.println(ss + "������������");
		// �÷��������ֵȴ����ӵ�״̬
		// Socket���ֽ���
		Socket sk = ss.accept();
		// ˭�������˷�����
		System.out.println(sk.getInetAddress());

		// ��ȡ
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// д��
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		

		Scanner mys = new Scanner(System.in);
		while (true) {
			// �ȶ�
			String str = br.readLine();
			System.out.println("�ͻ���˵��" + str);
			if (str.equals("�Ͽ�����")) {
				break;
			}
			System.out.println("����������(������)��");
			String s = mys.next();
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		osw.close();
		os.close();
		br.close();
		isr.close();
		is.close();

	}

}
