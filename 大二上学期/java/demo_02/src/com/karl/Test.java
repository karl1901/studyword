package com.karl;

import java.util.Scanner;

public class Test {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
//  声明一个数据类型byte，取名:rainbow
//  byte rainbow;
////  赋值
//  rainbow=33;
//  System.out.println(rainbow); // 使用
//  
//  int x;// 声明了一个整型
//  x=1314520;
//  System.out.println(x);
//  
  
//  // 声明一个数据类型（boolean）并赋值
//  boolean f=true;
//  System.out.println(f);
//  
//        // 同时声明多个变量（数据类型），必须是用类型的
  // 取余 %
//  int a=11,b=20;
//     int c=b%a;
//     System.out.println(c); 
//  // 当我们使用数值类型去用运算符（+-*%）,%就是数学的计算 /:分子包含多少分母的意思(取整)
//  // 非数值类型(char String boolean)
//  //字符（只能装一个东西）
//  char j='妙';
//  //字符串(+：相当于拼接)
//  String str="声明的字符串";
//  String st="用于运算符";
//  String s=str+st;
//  System.out.println(s);
//  
//  比较运算符(< > == != <= >=)
//   int a=11,b=20;
//   // 布尔类型boolean用来判断对与错
//   boolean f=a<b;
//   System.out.println(f);
  
  // 时间判断
//  if(判断条件：true false){
//   
//  }
//  
//     int a=21,b=20;
//     boolean f=a>b;
//  if(a>b){
//   // 只有当判断为真的时候才会进入条件体
//   System.out.println("我会出来吗？");
//  }
//  System.out.println("布尔接收："+f);
  
//  数值类型： int：整型  short：短整型
//          long：长整型  double：小数类型
//          float：浮点型  byte：字节类型
//  非数值类型：char：字符    boolean：布尔类型
//  string：字符串
  
//  变量声明方式
//  整型
//  int x;
//  x=10;
//  int y=20;
//  条件判断
//  if(x<y){
//   当条件判断成立(true)
//   System.out.println("对了就出来");
//  }
//  
//  判断密码是否正确
//  用户名：String--字符串 密码：int--整型
//  String str="admin";
//  int pwd=123456;
//  让电脑接收用户信息（构造器）
//  Scanner mys=new Scanner(System.in);
//     System.out.println("请输入用户名：");
//     String ss=mys.next();// 开始接收用户信息
//  System.out.println("请输入密码：");
//  int x=mys.nextInt();
//  进行判断
//  equals用来比较字符串String
//  逻辑运算符：||：或者 &：但并 &&：双并
//  ||: 当多个判断条件，只要有一个为true，就表示整个判断条件都为true
//  &: 当多个判断条件，只要有一个false，就是判断条件都为false，反之为true
//      不会造成代码的短路，会执行到底
//  &&：当多个判断条件，只要有一个false，就是判断条件都为false，反之为true
//       会造成代码的短路
//  if(str.equals(ss)&&pwd==x){
//   判断体
//	  System.out.println("密码和用户名正确");
//	  System.out.println(ss);
//	  System.out.println(x);
//  }
//    //条件判断（二选一）
//	  Scanner mys=new Scanner(System.in);
//	  System.out.println("请输入你的成绩：");
//	  double b=mys.nextDouble();
//	  if(b>=0&&b<60){ //这个人的成绩不够格
//		  System.out.println("你没有及格！");
//	  }else {
//		  System.out.println("恭喜你！及格了");
//	}
	  
	  //条件判断（多选一）
	  Scanner mys=new Scanner(System.in);
	  System.out.println("请输入你的成绩：");
	  double b=mys.nextDouble();
	  if(b>=0&&b<60){
		  System.out.println("不及格");
	  }else if (b>=60&&b<70) {
		System.out.println("及格");
	}else if (b>=70&&b<90) {
		System.out.println("良好");
	}else if (b>=90&&b<100) {
		System.out.println("优秀");
	}else {
		System.out.println("输入不合法!");
	}
  
	  
  
  
 }
}

 