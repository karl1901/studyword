package com.karl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// �ͻ���

public class MyClinet {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {

		Socket sk = new Socket(InetAddress.getLocalHost().getHostAddress(),
				5566);

		// �ÿͻ������������������(������-�ֽ���)
		OutputStream os = sk.getOutputStream();
		// ���ֽ���ת��Ϊ�ַ���
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// ������
		BufferedWriter bw = new BufferedWriter(osw);

		// �ÿͻ��˾߱����շ��������ݵ�����
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("����������(�ͻ���):");
			String str = mys.next();
			// ������д��������
			bw.write(str);
			bw.newLine();
			bw.flush();
			// ���ܷ���������������
			String s = br.readLine();
			System.out.println("������˵��" + s);
			if (s.equals("������ά��")) {
				break;
			}
		}
		br.close();
		isr.close();
		is.close();
		bw.close();
		osw.close();
		os.close();

	}

}
