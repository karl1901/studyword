package com.hui;

public class Comeputer {

	// 2、写一个电脑的类，类中无属性。

	// 类中有方法：
	// （一）无返回，有参数的方法：
	// （1）、判断是否为偶数的方法，要求传入一个整数，如果这个数是偶数就输出“是偶数”，否则输出“不是偶数”。
	public void one(int x) {
		if (x % 2 == 0) {
			System.out.println("是偶数");
		} else {
			System.out.println("不是偶数");
		}
	}

	// （2）、判断一年是否是润年的方法，要求传入一个整数，判断这个整数是否能被4整除并且不能被100整除，或者能被400整除，如果满足条件输出“是润年”，否则输出“是平年”。
	public void year(int y) {
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("是平年");
		}
	}

	// （3）、加法，要求传入两个整数，输出这两个整数的和。
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	// （4）、乘法，要求传入两个整数，输出这两个整数的积。
	public void product(int c, int d) {
		System.out.println(c * d);
	}

	// （5）、求幂的方法，要求传入一个整数计算这个数的幂。如：输入一个100,那么就计算：1+2+3+……+99+100的结果，并输出。
	public void two(int e) {
		int x = 0;
		for (int i = 1; i <= e; i++) {
			x += i;
		}
		System.out.println(x);
	}

	// （6）、输出偶数的方法，要求传入一个正整数，输出0到这个正整数之间的所有偶数。如：输入一个5，那么就输出2,4。
	public void three(int f) {
		if (f > 0) {
			for (int i = 0; i < f; i++) {
				if (i % 2 == 0 && i != 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		} else {
			System.out.println("请输入一个正整数!!");
		}
	}

	// （7）、找最大值的方法，要求传入一个有值的整形数组，输出这个数组中的最大值。
	public void four(int[] g) {
		int max = g[0];
			for (int i = 0; i < g.length; i++) {
				if (max < g[i]) {
					max = g[i];
				}
			}
			System.out.println(max);
		}

}
