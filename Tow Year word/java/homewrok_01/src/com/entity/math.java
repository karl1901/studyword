package com.entity;

public class math {
	
	
	// 2、写一个数学家的类，类中有方法：
	
	// (一)传入两个整数，进行比较，返回两个数中的最大值的方法。
	public int max(int x,int y) {
		// 三元运算符  比较运算符? a:b
		int a=x>y?x:y;
		return a;
	}
	
	// (二)传入三个double型的数据，进行比较，返回三个数中的最小值的方法。
	public double min(double a,double b,double c){
		double x=a<b?(a<c?a:c):(b<c?b:c);
		return x;
	}
	
	// (三)传入一个整数，返回这个整数的个位数是几的方法。
	public int  zs(int x){
		int a=x%10;
		return a;
		
	}
	
	// (四)传入一个整数，返回这个整数的立方的方法。
	public int jf(int x){
		int a=x*x*x;
		return a;
	}
	
	// (五)传入一个正整数，计算从1加到此整数的和是多少的方法。比如输入一个5那么就计算1+2+3+4+5=15，最后返回15。
	public int one(int x) {
		int sum = 0;
		if (x>0) {
			for (int i = 1; i <= x; i++) {
				sum += i;
			}
		}else {
			System.out.println("请输入一个正整数!!!");
		}
		return sum;
	}
	
	// (六)传入一个整形的数组，返回这个整形数组中的所有数据之和的方法。(重载)
	// 重载：在同一个类中，出现方法名、修饰符、返回类型一致，参数个数或者类型不一致的方法称为重载
	// 好处：减少类中方法名的个数
	public int one(int[] x){
		int a=0;
		for (int i = 0; i < x.length; i++) {
			a+=x[i];
		}
		return a;
	}
	
	// (七)传入一个整形的数组，返回这个整形数组中的最大值的方法。
	public int szmax(int[] x) {
		int a=x[0];
		for (int i = 0; i < x.length; i++) {
			if (a<x[i]) {
				a=x[i];
			}
		}
		return a;
	}

}
