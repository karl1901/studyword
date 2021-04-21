package com.karl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	/**
	 * @param args
	 * @throws Exception
	 * File���ֽ������ַ�������������������
	 * net�����������ֽ������ַ���
	 * net���ֽ��ס��ֽ������ַ���
	 */
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(6655);
		System.out.println("��������");
		Socket sk = ss.accept();
		System.out.println("����" + sk.getInetAddress());

		// ���ܿͻ��˷��͹������ļ�����
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		System.out.println(name);
		// ͨ���ļ������ҵ��ļ�����λ��(��������)
		File file = new File("C:\\Users\\23712\\Desktop\\ss\\" + name);
		// �߶���д(���������ض�ȡ��д���ͻ���)
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);

		OutputStream os = sk.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);

		byte[] bs = new byte[10];
		int n = 0;
		while ((bis.read(bs)) != -1) { // ��ȡ����
			bos.write(bs); // д
			n += 10;
			System.out.println(n);
		}
		bos.flush();
		bos.close();
		os.close();
		bis.close();
		fis.close();
		br.close();
		isr.close();
		is.close();

	}

}
