/**
 * 
 */
package com.test;

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

		// ��������
		// int x=12;
		// ����(��Ŷ�����ͼ���,�����Ƕ��,����Ҫ���������������ͱ���һ��)
		// �±꣺         0   1   2  (��0��ʼ�����ε���,�±겻������'����')
		// int[] x = { 12, 34, 56 };
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }
		// String[] strings = new String[5];
		// strings[0] = "����";
		// for (int i = 0; i < strings.length; i++) {
		// if (strings[i] == null) {
		// strings[i] = "����";
		// }
		// System.out.println(strings[i]);
		// }
		String[] string = { null, "���", null, "�Ÿ�" };
		// ���������ҵ����ֽ���������
		for (int i = 0; i < string.length; i++) {
			if (string[i] != null) {  // ���λ������
				if (string[i].equals("����")) {  // �ж��Ƿ����ҵ�����һ��
					string[i] = "�ܲ�";
				}
			}
			System.out.println(string[i]);
		}
		
		

	}

}
