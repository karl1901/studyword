/**
 * 
 */
package com.test;

import com.dao.StuDao;
import com.entity.Stu;

/**
 * @author 23712
 *
 */
public class Test {
	
//	// 全局变量(创建在类中)
//	int x = 29;

	/**
	 * @param args
	 * 
	 * 数据类型：八大基本数据类型(int short long double float char boolean byte)  -- 栈
	 *       数组： String--类(对象)   -- 堆
	 * 数据存放位置：栈(空间少，运行速度快)    堆(空间大，运行速度慢)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// 同一个方法里面，变量名不能重复(这里是main方法)
//		
//		// 整形(局部变量: 创建在方法中)
//		int x = 12;  // 声明并赋值
//		int y;
//		y = 11;
//		
//		// 被调用时-就近原则(会打印里调用地方最近的变量x)
//		System.out.println(x);
//		// this-Test类自己
//		System.out.println(this.x);
		
		
//		// 条件判断
//		// if   switch
//		int a=10,b=20,c=30;
//		// 多条件判断
//		// 并且：& &&    或者：||
//		// 特点：
//		// &&:当它去连接多个条件，全真为真，会造成代码短路，只要一个条件为false,就会结束整行代码
//		// &:当它去连接多个条件，全真为真，不会造成代码短路，会执行整行代码
//		// ||：当它去连接多个条件时，一真全真
//		
//		// if:
//		// 情况一
//		if (a>b&&b>c) {
//			
//		}
//		// 情况二
//		if (a<c) {
//			
//		}else {
//			
//		}
//		// 情况三
//		if (a<c) {
//			
//		}else if (a>c) {
//			
//		}else {
//			
//		}
//		
//		// switch:
//		int a1 = 13;
//		switch (a1) {  // 括号放-变量名称
//		case 5:    // case后的内容：必须与上面a1(括号内的内容)类型一致! 其内容会与上面a1比较，相等就会进入 
//			System.out.println("是5就会打印");
//			break;    // 终止，跳出
//		case 8:
//			System.out.println("是8就会打印");
//			break;
//		default:    // 相当于else
//			System.out.println("不满足上面所有判断机会打印");
//			break;
//		}
		
		
//		// 循环
//		// while    for    do while    for each
//		
//		// while:
//		int i = 0;
//		while (i < 100) {
//			System.out.println(i);
//			i++;
//		}
//
//		// for:
//		for (int j = 0; j < args.length; j++) {
//
//		}
//
//		// do while:
//		int f = 0;
//		do {
//			System.out.println(f);
//			f++;
//		} while (f < 100);
//
//		// for each:
//		for (String i : y) {  // 括号内：需要打印的数组类型(string类型)    数组中的内容(相当于y[i])    打印的数组名称(y数组)  
//
//		}
		
		
//		// 嵌套: 循环嵌套-循环套循环    条件嵌套-条件套条件    循环条件嵌套-循环套条件/条件套循环    -- 打印万年历
//		
//		// 循环嵌套：
//		// 一个循环一般只做一个事情
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("跑" + i + "圈");
//			for (int j = 1; j <= i; j++) {
//				System.out.println("休息" + j + "分钟");
//			}
//		}
		
		
//		// 数组
//		
//		// 整型数组:
//		int[] x = { 1, 32, 23, 55, 34, 2, 7 }; // 声明并赋值
//		
//		// 求x数组的和
//		int sum = 0;
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//		}
//		System.out.println("所求和为：" + sum);
//		
//		// 求x数组的最小值(打擂台)
//		int min = x[0];
//		for (int i = 0; i < x.length; i++) {
//			if (x[i] < min) {
//				min = x[i];
//			}
//		}
//		System.out.println("所求最小值为：" + min);
//		
//		// 排序(降序)--冒泡排序
//		for (int i = 0; i < x.length - 1; i++) {
//			for (int j = 0; j < x.length - 1 - i; j++) {
//				if (x[j] < x[j + 1]) {
//					int t = x[j]; // t=11
//					x[j] = x[j + 1]; // x[j]=22
//					x[j + 1] = t; // x[j+1]=11
//				}
//			}
//		}
//
//		for (int i : x) {
//			System.out.println(i);
//		}
//		
//		int[] y = new int[4];    // 声明数组，并赋予长度	
		
		
//		// 二维数组
//		int[][] x = new int[5][6];
//		for (int i = 0; i < x.length; i++) { // x.length--行数
//			for (int j = 0; j < x[i].length; j++) { // x[i].length--列数
//				System.out.print(x[i][j] + "\t");
//			}
//			System.out.println(); // 换行
//		}
//		
//		int[] x = { 1, 32, 23, 55, 34, 2, 7 };
//		// 把x数组中的内容放入新的数组中
//		// 1、创建一个和x数组长度一样的新数组
//		int[] y = new int[x.length];
//		// 2、把x数组中的内容依次给y数组
//		for (int i = 0; i < y.length; i++) {
//			y[i] = x[i];
//		}
//		// 3、打印新数组y
//		for (int i : y) {
//			System.out.println(i);
//		}
		
		// OOP：面向对象
		/*
		 * 类与对象 
		 * java三大原则：1、封装：私有化属性，公开get/set方法。  作用：保护类的属性
		 * 方法：1、重载：同一个类，方法名一致，参数个数和参数类型不一致。  作用：减少方法名的个数，便于记忆
		 *      2、重写：子类重写父类，方法名、返回类型、参数个数、参数类型都一致，方法体里面的内容不一致
		 * 
		 * 
		 */
		// 创建一个学生对象
		StuDao sd = new StuDao();
		Stu stu = new Stu(1, "小明", "男", 23, "2018-1-1", "2020-1-1-");

		// 调用增加的方法
		int n = sd.addStu(stu);
		if (n > 0) {
			System.out.println("增加成功!");
		} else {
			System.out.println("增加失败!");
		}

		// 增加同一个学生
		Stu stu1 = new Stu(1, "小明", "男", 23, "2018-1-1", "2020-1-1-");
		int m = sd.addStu(stu1);
		if (m > 0) {
			System.out.println("增加成功!");
		} else {
			System.out.println("增加失败!");
		}

		// 调用打印所有学生的方法
		sd.getAll();

		// 删除学生
		Stu stu2 = new Stu(1, "小华", "男", 23, "2018-1-1", "2020-1-1-");
		int s = sd.addStu(stu1);
		if (s > 0) {
			System.out.println("删除成功!");
		} else {
			System.out.println("删除失败!");
		}

		// 调用打印所有学生的方法
		sd.getAll();
		
		
		
		

	}

}
