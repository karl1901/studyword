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
	 * 异常(错误)
	 * 1、编译错误（违反了语言的语法）
	 * 2、运行错误
	 * Exception：所有错误类型的父类，能捕获所有的报错
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s=new int[3];
		Scanner mys=new Scanner(System.in);
		System.out.println("请输入分子：");
		try {  // 放可能出现运行错误的代码
			int x=mys.nextInt();
			System.out.println("请输入分母：");
			int y=mys.nextInt();
			System.out.println("请输入一个整数：");
			int z=mys.nextInt();
			System.out.println(x/y);
			System.out.println(s[z]);
		} catch (Exception e) {  // 捕捉错误
			// TODO: handle exception
			e.printStackTrace();
		}finally {  // 放不管代码是否运行正常，只要在这里面的代码都会被运行 
			
		}

	}

}
