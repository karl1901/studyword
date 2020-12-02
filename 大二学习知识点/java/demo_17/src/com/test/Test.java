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
	 * 
	 * �쳣(����)
	 * 1���������Υ�������Ե��﷨��
	 * 2�����д���
	 * Exception�����д������͵ĸ��࣬�ܲ������еı���
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s=new int[3];
		Scanner mys=new Scanner(System.in);
		System.out.println("��������ӣ�");
		try {  // �ſ��ܳ������д���Ĵ���
			int x=mys.nextInt();
			System.out.println("�������ĸ��");
			int y=mys.nextInt();
			System.out.println("������һ��������");
			int z=mys.nextInt();
			System.out.println(x/y);
			System.out.println(s[z]);
		} catch (Exception e) {  // ��׽����
			// TODO: handle exception
			e.printStackTrace();
		}finally {  // �Ų��ܴ����Ƿ�����������ֻҪ��������Ĵ��붼�ᱻ���� 
			
		}


	}

}
