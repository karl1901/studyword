package com.test;

import java.util.Random;
import java.util.Scanner;

import com.entity.Classz;
import com.entity.Stu;
import com.entity.car;
import com.entity.entity;
import com.entity.math;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// car�ࣺ
		// car ca=new car();
		// ca.setName("С��");
		// ca.setPid(12);
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ��������");
		// String name=mys.next();
		// System.out.println("�����복�ƺţ�");
		// int pid=mys.nextInt();
		// boolean f=ca.jcName(name);
		// boolean p=ca.jcPid(pid);
		// if (f==true && p==true) {
		// System.out.println("��¼�ɹ�!");
		// }else {
		// System.out.println("��¼ʧ��!");
		// }

		// math��
		// // �������Ƚ����ֵ
		// math sx = new math();
		// int max = sx.max(9, 13);
		// System.out.println(max);
		// // �������Ƚ���Сֵ
		// double min = sx.min(34, 12, 23);
		// System.out.println(min);
		// // ��ʾ��λ��
		// int gw = sx.zs(1238);
		// System.out.println(gw);
		// // ���ؼ�����
		// int jf = sx.jf(3);
		// System.out.println(jf);
		// // �����ݼӷ����
		// int mjf = sx.one(5);
		// System.out.println(mjf);
		// // �����������ݺ�
		// int[] y = { 1, 4, 9, 3 };
		// int he = sx.one(y);
		// System.out.println(he);
		// // �����ж����ֵ
		// int szmax = sx.szmax(y);
		// System.out.println(szmax);

		// stu��
		// дһ�������࣬����һ��ѧ����һά���飬����Ϊ5��Ҫ��ѭ������5��ѧ����������Ϣ�������ѭ���������ѧ������Ϣ��
		// Stu[] stuc = new Stu[5]; // ѧ��һά����(����ֻ�ܷ�ѧ������)
		// Scanner mys = new Scanner(System.in);
		// for (int i = 0; i < stuc.length; i++) {
		// System.out.println("������ѧ����������");
		// String name = mys.next();
		// System.out.println("������ѧ�����Ա�");
		// String sex = mys.next();
		// System.out.println("������ѧ�������䣺");
		// int age = mys.nextInt();
		// // ��ֵ��ѧ������
		// // 1.
		// Stu st = new Stu(name, sex, age);
		// // 2.
		// // Stu st=new Stu();
		// // st.setName(name);
		// // st.setSex(sex);
		// // st.setAge(age);
		// stuc[i] = st; // ��ѧ�����Ը�����
		// }
		// for (int i = 0; i < stuc.length; i++) {
		// System.out.println(stuc[i].toSting());
		// }

		// entity��
		entity en = new entity();
		int[] x = { 1, 3, 2, 4, 6, 5, 12 };
		en.objcet(x);
		String[] y = { "��", "��", "��", "��" };
		en.str(y);
		int[] z = { 1, 3, 5, 6, 8, 7, 11 };
		en.js(z);

		// class��
		// * 8����д�����࣬ ʵ����һ���༶�����25��ѧ�����༶��ѧ�����鵱��
		// Classz cl=new Classz();
		// for (int i = 0; i < 25; i++) {
		// Random ran=new Random();
		// int age=ran.nextInt(20);
		// Stu stu=new Stu("����", "��", age);
		// cl.addStu(stu);
		// }
		// cl.printStu();

	}

}
