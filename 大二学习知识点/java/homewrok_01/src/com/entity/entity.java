package com.entity;

public class entity {

	// 4����д����������һ�������������飬�������Ϊ��������
	public void objcet(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					int t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	// 5����д����������һ���ַ������飬�������������
	public void str(String[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j].hashCode() > x[j + 1].hashCode()) {
					String t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		for (String a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	// 6����д����������һ���������飬��������λ���������ַ���һ���µ����鵱�в�����
	public int[] js(int[] x) {
		// 1��ͨ���û���������������λ����ȥ�ж�������ĳ���
		int count = 0; // ����λ����
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				count++;
			}
		}
		// 2������һ�������飬������count����
		int[] y = new int[count];
		// 3���Ѵ�����������λ��Ԫ�����θ�������y
		int t = 0; // ģ��������y���±�
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				y[t] = x[i];
				t++;
			}
		}
		return y;
	}

}