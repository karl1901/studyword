/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author 23712
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1������̨�������루���ơ�aa@bb���ַ��������ж��ԡ�@���ָ��ǰ�������ַ����Ƿ���ȡ��������ڿ���̨��ռλ���ķ�ʽ�����{0}��{1}��ȡ����������������ȡ�
		// Scanner mys = new Scanner(System.in);
		// System.out.println("���������ơ�aa@bb�����ַ�����");
		// String str = mys.next();
		// String[] st=str.split("@"); //�ָ�
		// if (st[0].equals(st[1])) {
		// System.out.println(st[0]+"��"+st[1]+"���");
		// }else {
		// System.out.println("�����");
		// }

		// 2�� ���塰�ú�ѧϰ���������ϡ�����ַ��������ַ����С����족�������滻Ϊ��ʱʱ����Ҫ�����ַ���Ϊ���ú�ѧϰ��ʱʱ���ϡ���
		// String str2="�ú�ѧϰ����������";
		// System.out.println(str2.replace("��", "ʱ"));

		// 3�� ���塰�ú�ѧϰ���������ϡ�����ַ����������ַ�����ȡ������Ҫ�����ַ���Ϊ���ú�ѧϰ����
		// String str3="�ú�ѧϰ����������";
		// // �ҵ�","���ڵ�λ��
		// int dou=str3.indexOf("��");
		// System.out.println(str3.substring(0,dou));
		//		 
		// // �ڶ���д��
		// String[] a=str3.split("��");
		// System.out.println(a[0]);

		// 4�� �����string�ַ�����8,2,1,65,99,7,4����ȡ�����ַ�������С������
		// String str4 = "8,2,1,65,99,7,4";
		// // ��"��"Ϊ�ָ�
		// String[] strs = str4.split(",");
		// // ����һ���������ַ���һ�������������
		// int[] ints = new int[strs.length];
		// // ���ַ������������ת��Ϊ����
		// for (int i = 0; i < ints.length; i++) {
		// ints[i] = Integer.parseInt(strs[i]);
		// }
		// int min = ints[0];
		// for (int i = 0; i < ints.length; i++) {
		// if (min > ints[i]) {
		// min = ints[i];
		// }
		// }
		// System.out.println("��СֵΪ��" + min);

		// 5��Ҫ������žų˷���Ҫ���������е�5��Ӣ����ĸ��F�����棬2����T�����棻
		// for (int i = 1; i <= 9; i++) {
		// for (int j = 1; j <= i; j++) {
		// int t = j * i;
		// System.out.print((j + "*" + i + "=" + t + "  ").replace("5",
		// "F").replace("2", "T"));
		// }
		// System.out.println();
		// }

		// 6��ȡ�����ļ�����abcd.aspx���ĺ�׺��
		// String wj="abcd.aspx";
		// int dian=wj.lastIndexOf(".");
		// System.out.println(wj.substring(dian+1));

		// 7�����û��漴����һ���ַ���������������B����b����c�������ַ���ȫ���Զ��������
		// Scanner mys = new Scanner(System.in);
		// System.out.println("������һ���ַ�����");
		// String str = mys.next();
		// String[] strs = new String[str.length()];
		// System.out.println(str.replace("B", "B\n").replace("b",
		// "b\n").replace("c", "c\n"));;

		// 8������û���ע���Լ���½��Ҫ������ʵ��
		// User user=new User();
		// int n=user.login("admin", "123456");
		// if (n>0) {
		// System.out.println("��¼�ɹ�!");
		// }else {
		// System.out.println("��¼ʧ��!");
		// }

		// 9���ж�.java�ļ����Ƿ���ȷ���ж������ʽ�Ƿ���ȷ

		// �ж�Java�ļ���
		// String str = "flslf.java";
		// int dian = str.lastIndexOf(".");
		// String wei = str.substring(dian + 1);
		// boolean f = false;
		// if (dian != -1) {
		// if (wei.equals("java")) {
		// f = true;
		// }
		// }
		// if (f == true) {
		// System.out.println("java�ļ�����ȷ");
		// } else {
		// System.out.println("java�ļ�������ȷ");
		// }

		// �ж������ʽ
		// String str1 = "10208434@gmail.net";
		// int ait = str1.indexOf("@");
		// int dian1 = str1.lastIndexOf(".");
		// String wei1 = str1.substring(dian1 + 1);
		// boolean f1 = false;
		// if (ait != -1 && dian1 != -1) {
		// if (dian1 - ait > 1) {
		// if (wei1.equals("com") || wei1.equals("cn")
		// || wei1.equals("net")) {
		// f1 = true;
		// }
		// }
		// }
		// if (f1 == true) {
		// System.out.println("�����ʽ��ȷ");
		// } else {
		// System.err.println("�����ʽ����ȷ");
		// }

		// 10���������֤������ȡ����
		// String sfz="431701199005240059";
		// System.out.println(sfz.substring(6,14));

	}

}
