/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author 23712
 * 
 * ������ʽ���ַ����Ƚ�(����)
 * 
 * []������[]�����Ԫ�أ��Ż���true
 * [^]��������[^]�����Ԫ�أ��Ż���true
 * |������
 * ()����()�����������Ϊ���壬��()����Ĳ�Ϊtrue
 * a-z����a-z������ĸ
 * {3}�����ȱ���Ϊ3����Ϊtrue
 * {3,}�����ȱ����Ǵ��ڵ���3����Ϊtrue
 * {3,7}�����ȱ�����3-7����Ϊtrue
 * ����*��ǰ���Ԫ�س���0�λ�����N��
 * +��Ԫ�����ٳ���һ��
 * ?�����ֻ����һ��
 * ^����ʲô��ͷ
 * $����ʲô��β
 * .������"\n"�������������
 * \d��[0-9]
 * \D��[^0-9]
 * \w��[0-9a-zA-Z]
 * \W��[^0-9a-zA-Z]
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "2";
//		String rex = "[^ab]"; // �������ַ�������
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "aq";
//		String rex = "[a-z]?+"; // �������ַ�������
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "2q";
//		String rex = "^[0-9][a-z]*[A-Z]$"; // �������ַ�������
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "2";
//		String rex = "."; // �������ַ�������
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "&";
//		String rex = "\\w"; // �������ַ�������
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
		
		// ��֤�û�����������Ӣ�Ļ������֣�����6-15��
		// ���루����ĸ�����д������6-15��
		// �ֻ����루�����֣�����11����1��ͷ��
//		String str="11211111111";
//		String rex="\\w{6,15}";       // д�û����Ĺ���,true
//		String rex1="^[A-Z].{5,14}";  // д�������,true
//		String rex2="^[1]\\d{10}";  // д�ֻ��������,true
//		System.out.println(str.matches(rex2));
//		// ʹ�ù��������֤
//		Scanner mys=new Scanner(System.in);
//		System.out.println("�������û�����");
//		String sname=mys.next();
//		System.out.println("���������룺");
//		String spwd=mys.next();
//		System.out.println("�������ֻ����룺");
//		String plo=mys.next();
//		if (sname.matches(rex)&&spwd.matches(rex1)&&plo.matches(rex2)) {
//			System.out.println("��ϲ��ע��ɹ�");
//		}else {
//			if (!sname.matches(rex)) {
//				System.out.println("�û�����������!");
//			}
//			if (!spwd.matches(rex1)) {
//				System.out.println("������������!");
//			}
//			if (!plo.matches(rex2)) {
//				System.out.println("�ֻ�������������!");
//			}
//		}
		
		// ��֤�����ʽ(���ֻ���ĸ(4-16)@163/126/qq/sina.com/cn/net)
//		String str="li231@qq";
//		String rex="\\w{4,16}[@]((163)|(126)|(qq)|(sina))[\\.]((com)|(cn)|(net))";
//		System.out.println(str.matches(rex));
		
		
		
		

	}

}
