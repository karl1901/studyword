package com.karl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class FIleClinet {

	/**
	 * @param args
	 * @throws IOException
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// ���ع��̣�
		// ѡ���ļ�--ȷ��--�������
		// 1��������ͨ��ѡ����ļ�ȥ���ط������ҵ�����ļ�
		// 2�����ض�ȡ����������
		// 3����������ȡ�����ݷ��͸��ͻ���
		// 4����ȡ���������͵�����
		// 5��д���ֽڵĵ���

		Socket sk = new Socket("127.0.0.1", 6655);
		// �ͻ���Ҫ��������������ص��ļ���˭(�ļ���)
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner mys = new Scanner(System.in);
		System.out.println("��������Ҫ���ص��ļ����ƣ�");
		String name = mys.next();
		bw.write(name);
		bw.newLine();
		bw.flush();

		// �߶���д
		InputStream is = sk.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);

		// �������ݵĴ��λ��
		File file = new File("C:\\Users\\23712\\Desktop\\ss\\����\\" + name);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		byte[] bs = new byte[10];
		while ((bis.read(bs)) != -1) { // ��
			bos.write(bs); // д
		}
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		is.close();
		bw.close();
		osw.close();
		os.close();
		System.out.println("�������!");

	}

}
