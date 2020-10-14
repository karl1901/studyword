/**
 * 
 */
package com.katl;

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

		// 比较运算符(>、<、>=、<=、!=、==),返回结果:boolean（布尔类型）--true false
		// int x=10,y=11; //声明多个变量用‘,'隔开
		// boolean f=x>y;
		// System.out.println(f);
		// x>y>z:JAVA没有这样的用法
		// 逻辑运算符(多条件情况)
		// 或者--||:多个条件中只要有一个为true(真)，所有条件就为true(真)，所有条件都
		// false(假)，它才为false(假)。
		// int a=1,b=3,c=8;
		// boolean f;
		// f=a>c||a<b||b>c;
		// System.out.println(f);

		// 并且--&:多个条件中只要有一个为false(假)，所有条件都为false(假)，所有条件都为
		// true(真),它才为true(真)。不会造成代码短路，运行所有判断条件
//		 int x=1,y=3,z=8;
//		 boolean f,fa;
//		 f=x<y&(fa=y>z)&z>x;
//		 System.out.println(f);
//		 System.out.println(fa+"------");

		// &&:多个条件中只要有一个为false(假)，所有条件都为false(假)，所有条件都为
		// true(真),它才为true(真)。会造成代码短路，只要出现false，就会停止
		// int x=1,y=3,z=8;
		// boolean f,fa;
		// f=x<y&&(fa=y>z)&&z>x;
		// System.out.println(f);
		// System.out.println(fa+"------");

		// 数据转换(自动--取值范围小给大，才能自动转换)
		// int a=100;
		// double b=a;
		// double a=100.2;
		// int b=(int)a; //强制转换(慎用)
		// System.out.println(a);
		// System.out.println(b);

		// if  else
//		Scanner mys = new Scanner(System.in);
//		System.out.println("请输入一个整数：");
//		int x = mys.nextInt();
//		if (x > 10) { // ():放判断条件true/false
//			System.out.println("你输入的数大于10");
//		}else {  //else否则
//			System.out.println("你输入的数小于10");
//		}
		
		//if else if   else(可出现\也可以不出现)
		//
//		double money=500;  //初始金额
//		Scanner mys=new Scanner(System.in);
//		System.out.println("请输入你要选择的装备：1、鞋子(350)  2、铁剑(300)"+"3、打野刀(320)  4、盾牌(400)");
//        int x=mys.nextInt();
//        if (x==1) {  //购买鞋子
//			if (money>=350) {  //有能力购买鞋子
//				money=money-350;
//				System.out.println("购买鞋子成功!");
//				System.out.println("剩余金额："+money);
//			}else {
//				System.out.println("金额不足，无法购买!");
//			}
//		}
//		if (x==2) {  //购买铁剑
//			if (money>=300) {  //有能力购买铁剑
//				money=money-300;
//				System.out.println("购买铁剑成功!");
//				System.out.println("剩余金额："+money);
//			}else {
//				System.out.println("金额不足，无法购买!");
//			}
//		}
//		if (x==3) {  //购买打野刀
//			if (money>=320) {  //有能力购买打野刀
//				money=money-320;
//				System.out.println("购买打野刀成功!");
//				System.out.println("剩余金额："+money);
//			}else {
//				System.out.println("金额不足，无法购买!");
//			}
//		}
//		if (x==4) {  //购买盾牌
//			if (money>=400) {  //有能力购买盾牌
//				money=money-400;
//				System.out.println("购买盾牌成功!");
//				System.out.println("剩余金额："+money);
//			}else {
//				System.out.println("金额不足，无法购买!");
//			}
//		}
		
		
		

	}

}
