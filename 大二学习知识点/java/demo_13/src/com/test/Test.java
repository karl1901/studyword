package com.test;

import java.util.Scanner;

import com.entity.Classz;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OOP:�������(��װ���̳С���̬)
		// OOP��һԭ��:��װ
		// ���캯��
		// ��������(����ͬ���͵ķ������������Ƕ��ڷ������ļ���)
		// Stu stu=new Stu(1,"С��",16);
		// int sid=stu.getSid();
		// System.out.println(sid);
		// String sname=stu.getSname();
		// System.out.println(sname);
		// int age=stu.getAge();
		// System.out.println(age);

		// Stu stu1=new Stu();
		// stu1.addSuan(3, 12,13);
		
		Classz cl=new Classz();
		Stu stu=new Stu(1,"����",17);
		cl.addStu(stu);
		Stu stu1=new Stu(2,"����",16);
		cl.addStu(stu1);
		Stu stu3=new Stu(3,"����",23);
		cl.addStu(stu3);
	}

}
