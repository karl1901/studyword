package com.karl;

import java.util.Random;
import java.util.Scanner;

//类：测试类
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Stu stu1=new Stu(); //学生对象
//		Scanner mys=new Scanner(System.in);
//		Random r=new Random();
		//通过对象去拿类里面的属性
		stu1.sname="小明";
		stu1.age=14;
		stu1.sex='男';
		System.out.println(stu1.sname);
		System.out.println(stu1.age);
		System.out.println(stu1.sex);
		

	}

}
