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

		// car类：
		// car ca=new car();
		// ca.setName("小明");
		// ca.setPid(12);
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个姓名：");
		// String name=mys.next();
		// System.out.println("请输入车牌号：");
		// int pid=mys.nextInt();
		// boolean f=ca.jcName(name);
		// boolean p=ca.jcPid(pid);
		// if (f==true && p==true) {
		// System.out.println("登录成功!");
		// }else {
		// System.out.println("登录失败!");
		// }

		// math类
		// // 两个数比较最大值
		// math sx = new math();
		// int max = sx.max(9, 13);
		// System.out.println(max);
		// // 三个数比较最小值
		// double min = sx.min(34, 12, 23);
		// System.out.println(min);
		// // 显示个位数
		// int gw = sx.zs(1238);
		// System.out.println(gw);
		// // 返回加立方
		// int jf = sx.jf(3);
		// System.out.println(jf);
		// // 返回幂加法结果
		// int mjf = sx.one(5);
		// System.out.println(mjf);
		// // 数组所有数据和
		// int[] y = { 1, 4, 9, 3 };
		// int he = sx.one(y);
		// System.out.println(he);
		// // 数组判断最大值
		// int szmax = sx.szmax(y);
		// System.out.println(szmax);

		// stu类
		// 写一个测试类，生成一个学生的一维数组，长度为5，要求循环输入5个学生的所有信息。最后再循环输出所有学生的信息。
		// Stu[] stuc = new Stu[5]; // 学生一维数组(里面只能放学生对象)
		// Scanner mys = new Scanner(System.in);
		// for (int i = 0; i < stuc.length; i++) {
		// System.out.println("请输入学生的姓名：");
		// String name = mys.next();
		// System.out.println("请输入学生的性别：");
		// String sex = mys.next();
		// System.out.println("请输入学生的年龄：");
		// int age = mys.nextInt();
		// // 赋值给学生对象
		// // 1.
		// Stu st = new Stu(name, sex, age);
		// // 2.
		// // Stu st=new Stu();
		// // st.setName(name);
		// // st.setSex(sex);
		// // st.setAge(age);
		// stuc[i] = st; // 把学生属性给数组
		// }
		// for (int i = 0; i < stuc.length; i++) {
		// System.out.println(stuc[i].toSting());
		// }

		// entity类
		entity en = new entity();
		int[] x = { 1, 3, 2, 4, 6, 5, 12 };
		en.objcet(x);
		String[] y = { "啊", "从", "的", "从" };
		en.str(y);
		int[] z = { 1, 3, 5, 6, 8, 7, 11 };
		en.js(z);

		// class类
		// * 8、编写测试类， 实例化一个班级，添加25个学生到班级的学生数组当中
		// Classz cl=new Classz();
		// for (int i = 0; i < 25; i++) {
		// Random ran=new Random();
		// int age=ran.nextInt(20);
		// Stu stu=new Stu("老王", "男", age);
		// cl.addStu(stu);
		// }
		// cl.printStu();

	}

}
