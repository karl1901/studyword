package com.test;

import java.io.File;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// File���ļ�����
		// io���ļ����ݲ���

		// ָ��һ���ļ�����λ��
		// String pathname = "C:\\Users\\23712\\Desktop\\�����ļ���";
		// // ����һ��File�Ķ���
		// File file = new File(pathname);
		// // ��ȡ�ļ������ƣ�
		// System.out.println(file.getName());
		// // ��ȡ�ļ���·����(���������ļ�����)
		// System.out.println(file.getPath());
		// // ��ȡ�ļ���·�����������������ļ����ƣ�
		// System.out.println(file.getParentFile());
		// // �ж��Ƿ����ļ���
		// System.out.println(file.isFile());
		// // �ж��Ƿ����ļ��У�
		// System.out.println(file.isDirectory());
		// // �ж��Ƿ���ڣ�
		// System.out.println(file.exists());

		// // ʹ��java���봴���ļ�
		// boolean f = false;
		// if (!file.exists()) { // �ж��ļ��Ƿ����
		// try {
		// // createNewFile()�������ļ�
		// f = file.createNewFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// if (f == true) {
		// System.out.println("�ļ������ɹ�!");
		// } else {
		// System.out.println("�ļ�����ʧ��!");
		// }
		// } else {
		// System.out.println("�ļ��Ѵ���!");
		// }

		// ʹ��java���봴���ļ���
		// boolean f = false;
		// f = file.mkdirs();
		// if (f == true) {
		// System.out.println("�����ɹ�!");
		// } else {
		// System.out.println("����ʧ��!");
		// }

		// // ɾ���ļ���(���ã����ᶪ������վ������ɾ���ǳ��ɾ�)
		// System.out.println(file.delete());

		// // ɨ��
		// String path = "D:\\karl word\\karl java";
		// File file = new File(path);
		// getFile(file);

		// // ������·����ָ�������ļ�.txt\.java
		// String st = "����.txt";
		// // // �ҵ���������ֵĵط�(�±�)
		// // int n = st.lastIndexOf(".");
		// // System.out.println(n);
		// // System.out.println(st.substring(n));
		// String path = "D:\\karl word\\karl java";
		// File file = new File(path);
		// getFile(file, ".class");

		// // �ļ�����
		// String path = "C:\\Users\\23712\\Desktop\\����.txt";
		// File file = new File(path);
		// // ��ȡ�ļ�����
		// String name = file.getName();
		//
		// String path2 = "C:\\Users\\23712\\Desktop\\�½��ļ��� (2)\\";
		// File file2 = new File(path2 + name);
		// boolean f = false;
		// if (!file2.exists()) {
		// try {
		// f = file2.createNewFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		// System.out.println(f);
		// // ��ȡ�ļ���С����λ/byte
		// System.out.println(file.length());

	}

	// ����ɨ���ļ��ķ���(�ݹ鷽���������Լ������Լ�)
	public static void getFile(File file) {
		// �õ�ָ��·�������е�����(�ļ����ļ���)
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.exists()) { // �ж��Ƿ����
				if (file2.isFile()) { // ������ļ�
					System.out.println(file2.getName());
				}
				if (file2.isDirectory()) { // ������ļ���
					if (file2.listFiles() != null) {
						getFile(file2);
					}
				}
			}
		}
	}

	// ��ָ���ļ����͵ķ���
	public static void getFile(File file, String str) {
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.exists()) {
				if (file2.isFile()) {
					// ���õ��ļ��ĺ�׺��
					int n = file2.getName().lastIndexOf(".");
					if (n == -1) {
						n = 0;
					}
					String s = file2.getName().substring(n);
					if (s.equals(str)) { // ��׺���ʹ�������һ��
						System.out.println(file2.getName());
					}
				}
			}
			if (file2.isDirectory()) {
				if (file2.listFiles() != null) {
					getFile(file2, str);
				}
			}
		}
	}
}
