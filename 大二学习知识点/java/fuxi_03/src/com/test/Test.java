/**
 * 
 */
package com.test;

/**
 * @author 23712
 *
 */
public class Test {
	
//	// ȫ�ֱ���(����������)
//	int x = 29;

	/**
	 * @param args
	 * 
	 * �������ͣ��˴������������(int short long double float char boolean byte)  -- ջ
	 *       ���飺 String--��(����)   -- ��
	 * ���ݴ��λ�ã�ջ(�ռ��٣������ٶȿ�)    ��(�ռ�������ٶ���)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// ͬһ���������棬�����������ظ�(������main����)
//		
//		// ����(�ֲ�����: �����ڷ�����)
//		int x = 12;  // ��������ֵ
//		int y;
//		y = 11;
//		
//		// ������ʱ-�ͽ�ԭ��(���ӡ����õط�����ı���x)
//		System.out.println(x);
//		// this-Test���Լ�
//		System.out.println(this.x);
		
		
//		// �����ж�
//		// if   switch
//		int a=10,b=20,c=30;
//		// �������ж�
//		// ���ң�& &&    ���ߣ�||
//		// �ص㣺
//		// &&:����ȥ���Ӷ��������ȫ��Ϊ�棬����ɴ����·��ֻҪһ������Ϊfalse,�ͻ�������д���
//		// &:����ȥ���Ӷ��������ȫ��Ϊ�棬������ɴ����·����ִ�����д���
//		// ||������ȥ���Ӷ������ʱ��һ��ȫ��
//		
//		// if:
//		// ���һ
//		if (a>b&&b>c) {
//			
//		}
//		// �����
//		if (a<c) {
//			
//		}else {
//			
//		}
//		// �����
//		if (a<c) {
//			
//		}else if (a>c) {
//			
//		}else {
//			
//		}
//		
//		// switch:
//		int a1 = 13;
//		switch (a1) {  // ���ŷ�-��������
//		case 5:    // case������ݣ�����������a1(�����ڵ�����)����һ��! �����ݻ�������a1�Ƚϣ���Ⱦͻ���� 
//			System.out.println("��5�ͻ��ӡ");
//			break;    // ��ֹ������
//		case 8:
//			System.out.println("��8�ͻ��ӡ");
//			break;
//		default:    // �൱��else
//			System.out.println("���������������жϻ����ӡ");
//			break;
//		}
		
		
//		// ѭ��
//		// while    for    do while    for each
//		
//		// while:
//		int i = 0;
//		while (i < 100) {
//			System.out.println(i);
//			i++;
//		}
//
//		// for:
//		for (int j = 0; j < args.length; j++) {
//
//		}
//
//		// do while:
//		int f = 0;
//		do {
//			System.out.println(f);
//			f++;
//		} while (f < 100);
//
//		// for each:
//		for (String i : y) {  // �����ڣ���Ҫ��ӡ����������(string����)    �����е�����(�൱��y[i])    ��ӡ����������(y����)  
//
//		}
		
		
//		// Ƕ��: ѭ��Ƕ��-ѭ����ѭ��    ����Ƕ��-����������    ѭ������Ƕ��-ѭ��������/������ѭ��    -- ��ӡ������
//		
//		// ѭ��Ƕ�ף�
//		// һ��ѭ��һ��ֻ��һ������
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("��" + i + "Ȧ");
//			for (int j = 1; j <= i; j++) {
//				System.out.println("��Ϣ" + j + "����");
//			}
//		}
		
		
//		// ����
//		
//		// ��������:
//		int[] x = { 1, 32, 23, 55, 34, 2, 7 }; // ��������ֵ
//		
//		// ��x����ĺ�
//		int sum = 0;
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//		}
//		System.out.println("�����Ϊ��" + sum);
//		
//		// ��x�������Сֵ(����̨)
//		int min = x[0];
//		for (int i = 0; i < x.length; i++) {
//			if (x[i] < min) {
//				min = x[i];
//			}
//		}
//		System.out.println("������СֵΪ��" + min);
//		
//		// ����(����)--ð������
//		for (int i = 0; i < x.length - 1; i++) {
//			for (int j = 0; j < x.length - 1 - i; j++) {
//				if (x[j] < x[j + 1]) {
//					int t = x[j]; // t=11
//					x[j] = x[j + 1]; // x[j]=22
//					x[j + 1] = t; // x[j+1]=11
//				}
//			}
//		}
//
//		for (int i : x) {
//			System.out.println(i);
//		}
//		
//		int[] y = new int[4];    // �������飬�����賤��	
		
		
//		// ��ά����
//		int[][] x = new int[5][6];
//		for (int i = 0; i < x.length; i++) { // x.length--����
//			for (int j = 0; j < x[i].length; j++) { // x[i].length--����
//				System.out.print(x[i][j] + "\t");
//			}
//			System.out.println(); // ����
//		}
//		
//		int[] x = { 1, 32, 23, 55, 34, 2, 7 };
//		// ��x�����е����ݷ����µ�������
//		// 1������һ����x���鳤��һ����������
//		int[] y = new int[x.length];
//		// 2����x�����е��������θ�y����
//		for (int i = 0; i < y.length; i++) {
//			y[i] = x[i];
//		}
//		// 3����ӡ������y
//		for (int i : y) {
//			System.out.println(i);
//		}
		
		
		
		
		

	}

}
