/**
 * 
 */
package com.karl;

import java.util.Scanner;
import java.util.zip.ZipEntry;

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

		// ����

		// int a;
		// a = 10;
		// ��������(����):װ�������

		// ��������1��
		// int[] x; //����һ������
		// x=new int[5];

		// ��������2��
		// double[] b = new double[6]; // ���õ�������ʽ����������ͬʱ���涨���鳤��

		// ��������3��
		// ������ͬʱ����ֵ������ĳ����ɸ�ֵ���ݵĴ�Сȷ��
		// String[] strings = { "aaaa", "bbbb" }; //������ͬʱ����ֵ {}�ڿ������޸�ֵ

//		int[] x = new int[7];
		// x.length:�õ�����ĳ���
		// System.out.println(x.length);
		// x[0]=11; //[0],[1]...[5]:�±�
		// x[1]=13;
		// x[3]=16;
		// x[4]=83;
		// x[5]=9379;
		// ���鴴����ÿ��Ԫ�ػ���Ĭ��ֵ int ��������û�и�ֵ��int��Ĭ��ֵΪ0
		// for (int i = 0; i < x.length; i++) {
		// System.err.println(i); //x���������±�
		// System.out.println(x[i]); //�õ���������Ԫ��
		// }

//		double[] d = new double[8]; // װһ����ĳɼ�
//		Scanner mys = new Scanner(System.in);
//
//		for (int i = 0; i < d.length; i++) {
//			System.out.println("��������ĳɼ���");
//			d[i]= mys.nextDouble();
////			d[i]=fen;  //���û�����ÿһ�γɼ����������Ӧ��λ��
//		}
//		//��ӡ�����������еĳɼ�
//		for (int i = 0; i < d.length; i++) {
//			System.out.print(d[i]+"\t");
//		}
		
//		int[] y={12,23,23,13,12,12,323,32321,13232,13232,1323,13131,13131,13213,13232343,34343,4242,343};
//		System.out.println(y.length);
//		System.out.println(y[y.length-1]);	//y.length-1���õ��������һ����
//		for (int i = 0; i < y.length; i++) {
//			System.out.println(y[i]);  //��ӡ��������Ԫ��
//		}
		
//		int[] z={32,23,434,54,23,234,243443};
//		//��������������ֵ
//		int max=z[0]; //�ȸ�ֵ�����һ����Ϊ���ֵ
//		for (int i = 0; i < z.length; i++) {  //ѭ����=���鳤����
//		      if (max<z[i]) {  //�жϵ�ǰ���ֵ�Ƿ�
//				max=z[i]; 
//			}	
//		}
//		System.out.println("���ֵ��"+max);
		
		int[] a=new int[5];  //��������Ĵ�С�����ȣ�
		Scanner mys=new Scanner(System.in);  //�û����빹����
		for (int i = 0; i < a.length; i++) {  //������������鳤�����
			System.out.println("������¼�������");  //��ʾ�û�¼����
			a[i]=mys.nextInt();  //���û�¼����������Ӧ��λ��
		}
		int min=a[0];  //��ֵ�����һ����Ϊ��Сֵ
		for (int i = 0; i < a.length; i++) {  //ѭ������=���鳤��
			if (min>a[i]) {  //�ж�������������Ƿ�����У������һ������С---��������Сֵ�Ƚϣ���С����ֵ����Сֵ
				min=a[i];  //��ֵ����������������Сֵ
			}
		}
		System.out.println("¼�����С��Ϊ��"+min);  //��ӡ¼��������������С��
		
		
		
		
		

	}

}
