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

		Scanner mys = new Scanner(System.in);  //�û����빹����
		System.out.println("��������ݣ�");  //��ʾ�û��������
		int year = mys.nextInt();  //��ȡ�û���������
		System.out.println("�����£�");  //��ʾ�û�����
		int month = mys.nextInt();  //��ȡ�û�������·�

		//��ȡ�������֮ǰ��������
		int ysum = 0;  //װ����������ʼֵΪ��
		for (int i = 1900; i < year; i++) {  //��ʼ�굽��������ܹ��н����ѭ������
			ysum += 365;  //ÿ��+365��
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {  //�ж�����
				ysum++;  //��������һ��
			}
		}

		//������һ���·�֮ǰ��������
		int msum = 0;  //װ����������ʼֵΪ0
		for (int i = 1; i < month; i++) {  //�ж�������·ݵ�һ���м����¾�ѭ������
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10
					|| i == 12) {  //�����·�Ϊ����
				msum += 31;  //����ÿ��+31��
			}
			if (i == 4 || i == 6 || i == 9 || i == 11) {  //С��
				msum += 30;  //С��ÿ��+30��
			}
			if (i == 2) {  //�������ʱ
				msum += 28;  //ƽ�����+28��
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //�ж�����
					msum++;  //����ÿ�¶�һ��
				}
			}
		}

		//�����·ݵ��µ�������
		int dsum = 0;  //װ����������ʼֵΪ0
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {  //�������
			dsum = 31;  //ÿ��31��
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {  //����С��
			dsum = 30;  //ÿ��30��
		}
		if (month == 2) {  //�������
			dsum = 28;  //ƽ�����28��
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //�ж�����
				dsum++;  //������¶�һ��
			}
		}
		
		int sum=ysum+msum+1;  //��ʼ1900��1��1�յ���������·ݵ��µĵ�һ����ܺͣ�Ϊ
		int x=sum%7;  //�������·ݵ�һ��Ϊ���ڼ������ڼ�=��ӡ�����ո�������ʽ
		
		System.out.println("��\t"+"һ\t"+"��\t"+"��\t"+"��\t"+"��\t"+"��\t");  //���ڱ���������ʽ
		for (int i = 1; i <= x+dsum; i++) {  //��ʽ��ʽ7*5=x+dsum=35
			if (i<=x) {  //����ǰ��ӡ�ո����ж�
				System.out.print("\t");  //��ӡ�ո�
			}else {  //��ӡ�ո�����ٴ�ӡ����
				System.out.print((i-x)+"\t");  //i-xΪÿ�º�����ʼ��=1
			}
			if (i%7==0) {  //�ж�ÿ�д�ӡ�߸��ͻ���
				System.out.println();  //����
			}
		}
		
		
		
		
		

	}

}
