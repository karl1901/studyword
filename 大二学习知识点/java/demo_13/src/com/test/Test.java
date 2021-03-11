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
		// OOP:面向对象(封装、继承、多态)
		// OOP第一原则:封装
		// 构造函数
		// 方法重载(用于同类型的方法，减少我们对于方法名的记忆)
		// Stu stu=new Stu(1,"小明",16);
		// int sid=stu.getSid();
		// System.out.println(sid);
		// String sname=stu.getSname();
		// System.out.println(sname);
		// int age=stu.getAge();
		// System.out.println(age);

		// Stu stu1=new Stu();
		// stu1.addSuan(3, 12,13);
		
		Classz cl=new Classz();
		Stu stu=new Stu(1,"张三",17);
		cl.addStu(stu);
		Stu stu1=new Stu(2,"李四",16);
		cl.addStu(stu1);
		Stu stu3=new Stu(3,"张六",23);
		cl.addStu(stu3);
	}

}
