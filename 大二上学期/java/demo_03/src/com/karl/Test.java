package com.karl;

import java.util.Random;
import java.util.Scanner;

import javax.annotation.Generated;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ToDo Auto-Generated method stub
		// if(boolean��������)
		// �����ж�(switch)(��ֵ����(int/double),����ֵ����(char\String--JDK1.8)
		// seitch�������ж���������ֵ,case�൱��==/equals
		// Scanner mys = new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x = mys.nextInt();
		// switch (x) {
		// case 0:
		// System.out.println("��0�Ҿͳ�����");
		// break;
		// case 1:
		// System.out.println("��1�Ҿͳ�����");
		// break;
		// case 2:
		// System.out.println("��2�Ҿͳ�����");
		// break;
		// default:
		// System.out.println("������������");
		// break;
		// };

		// ������Ƕ��
		// ����һ���û����빹����
		Scanner mys = new Scanner(System.in);
		// �����������һ��������
		Random r = new Random();
		int x = r.nextInt(3); // �����0,1,2
		System.out.println("���������ѡ��(0��ȭͷ   1������  2����):");
		int y = mys.nextInt(); // �û�������ѡ��
		// System.out.println(x);
		// ����0:ȭͷ 1:���� 2:��
		// if (x==0) { //���Գ���ȭͷ
		// //3�ֽ��(Ӯ �� ƽ)
		// if (y==0) { //��ʾ�û�ѡ��ȭͷ
		// System.out.println("ƽ��");
		// }
		// if (y==1) { //����
		// System.out.println("������!");
		// }
		// if (y==2) { //��
		// System.out.println("��Ӯ��!");
		// }
		// }
		// if (x==1) { //���Գ��˼���
		// //3�ֽ��(Ӯ �� ƽ)
		// if (y==0) { //��ʾ�û�ѡ��ȭͷ
		// System.out.println("��Ӯ��!");
		// }
		// if (y==1) { //����
		// System.out.println("ƽ��");
		// }
		// if (y==2) { //��
		// System.out.println("������!");
		// }
		// }
		// if (x==2) { //���Գ��˲�
		// //3�ֽ��(Ӯ �� ƽ)
		// if (y==0) { //��ʾ�û�ѡ��ȭͷ
		// System.out.println("������!");
		// }
		// if (y==1) { //����
		// System.out.println("��Ӯ��!");
		// }
		// if (y==2) { //��
		// System.out.println("ƽ��");
		// }
		// }

		// swicthǶ��ģʽ
		switch (x) {
		case 0: // ȭͷ
			switch (y) {
			case 0: // ȭͷ
				System.out.println("ƽ��");
				break;
			case 1: // ����
				System.out.println("������!");
			case 2: // ��
				System.out.println("��Ӯ��!");
				break;
			default: // �����������
				System.out.println("������������!����������");
				break;
			}
			break;
		case 1: // ����
			switch (y) {
			case 0: // ȭͷ
				System.out.println("��Ӯ��!");
				break;
			case 1: // ����
				System.out.println("ƽ��");
			case 2: // ��
				System.out.println("������!");
				break;
			default: // �����������
				System.out.println("������������!����������");
				break;
			}
			break;
		case 2: // ��
			switch (y) {
			case 0: // ȭͷ
				System.out.println("������!");
				break;
			case 1: // ����
				System.out.println("��Ӯ��!");
			case 2: // ��
				System.out.println("ƽ��");
				break;
			default: // �����������
				System.out.println("������������!����������");
				break;
			}
			break;
		}

	}
}