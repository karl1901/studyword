/**
 * 
 */
package com.karl;

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
		// ���������
		// ()-->!-->���������-->�Ƚ������-->&/&&-->||->=
		// int x = -2; // ��һ��������ʹ�ã�������г�ʼ����ֵ
		// switch (x) { // switch(����:��ֵ����/char/string--JDK�汾1.8)
		// case 0: // case:x==value
		// System.out.println("��0�һ��ӡ");
		// break;
		// case 1:
		// System.out.println("��1�һ��ӡ");
		// break;
		// case 2:
		// System.out.println("��2�һ��ӡ");
		// break;
		//
		// default: //��������case��������,�Ͷ�����default
		// System.out.println("�����������һ��ӡ");
		// break;
		// }
		//		

		// ѭ��(while do while for)
		// int i = 0;
		// while (i < 100) { // ():�Ƚ������
		// // System.out.println("����(true)�ͻ����");
		// System.out.println(i);
		// i++; // i=i+1;������ѭ��������һ��
		// }

		// ��1-100�ĺ�
		// int i=1;
		// int sum=0; //װ1-100�ĺ�
		// while (i<=100) {
		// sum=sum+i;
		// i++;
		// }
		// System.out.println("��Ϊ��"+sum);

		// ��1-100��ż����,������
		// int i = 1;
		// int sum = 0;
		// int jsum = 0;
		// while (i <= 100) {
		// if (i % 2 == 0) { // ��1-100�е�ż��
		// System.out.println(i);
		// sum += i;// �������ٸ�ֵ //sum=sum+i;--�ȸ�ֵ������
		// } else { // 1-100������
		// jsum += i;
		// }
		// i++;
		// }
		// System.out.println("ż����:" + sum);
		// System.out.println("������:" + sum);

		double money = 5000; // ��ʼ���
		Scanner mys = new Scanner(System.in);
		while (true) { // -----ѭ����ʼ
			System.out.println("��������Ҫѡ���װ����1��Ь��(350)  2������(300)"
					+ "3����Ұ��(320)  4������(400)");
			int x = mys.nextInt();
			if (x == 1) { // ����Ь��
				if (money >= 350) { // �жϽ���Ƿ��ܹ���Ь��
					money -= 350; // money=money-350;
					System.out.println("Ь�ӹ���ɹ�!");
					System.out.println("��" + money);
				} else {
					System.out.println("����!");
				}
			}
			if (x == 2) { // ��������
				if (money >= 300) { // �жϽ���Ƿ��ܹ�������
					money -= 300; // money=money-300;
					System.out.println("��������ɹ�!");
					System.out.println("��" + money);
				} else {
					System.out.println("����!");
				}
			}
			if (x == 3) { // �����Ұ��
				if (money >= 320) { // �жϽ���Ƿ��ܹ����Ұ��
					money -= 320; // money=money-320;
					System.out.println("��Ұ������ɹ�!");
					System.out.println("��" + money);
				} else {
					System.out.println("����!");
				}
			}
			if (x == 4) { // �������
				if (money >= 400) { // �жϽ���Ƿ��ܹ������
					money -= 400; // money=money-400;
					System.out.println("���ƹ���ɹ�!");
					System.out.println("��" + money);
				} else {
					System.out.println("����!");
				}
			}

		} // -----ѭ������
		
		
		
		
		
		

	}

}
