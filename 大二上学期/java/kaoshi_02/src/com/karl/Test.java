/**
 * 
 */
package com.karl;

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

		Scanner mys = new Scanner(System.in);  //用户输入构造器
		System.out.println("请输入年份：");  //提示用户输入年份
		int year = mys.nextInt();  //获取用户输入的年份
		System.out.println("输入月：");  //提示用户输入
		int month = mys.nextInt();  //获取用户输入的月份

		//获取输入年份之前的总天数
		int ysum = 0;  //装总天数，初始值为零
		for (int i = 1900; i < year; i++) {  //初始年到输入年份总共有今年就循环几次
			ysum += 365;  //每年+365天
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {  //判断闰年
				ysum++;  //是闰年多加一天
			}
		}

		//输入那一年月份之前的总天数
		int msum = 0;  //装总天数，初始值为0
		for (int i = 1; i < month; i++) {  //判断输入的月份到一月有几个月就循环几次
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10
					|| i == 12) {  //输入月份为大月
				msum += 31;  //大月每月+31天
			}
			if (i == 4 || i == 6 || i == 9 || i == 11) {  //小月
				msum += 30;  //小月每月+30天
			}
			if (i == 2) {  //输入二月时
				msum += 28;  //平年二月+28天
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //判断闰年
					msum++;  //闰年每月多一天
				}
			}
		}

		//输入月份当月的总天数
		int dsum = 0;  //装总天数，初始值为0
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {  //输入大月
			dsum = 31;  //每月31天
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {  //输入小月
			dsum = 30;  //每月30天
		}
		if (month == 2) {  //输入二月
			dsum = 28;  //平年二月28天
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //判断闰年
				dsum++;  //闰年二月多一天
			}
		}
		
		int sum=ysum+msum+1;  //初始1900年1月1日到输入年和月份当月的第一天的总和，为
		int x=sum%7;  //求输入月份第一天为星期几（星期几=打印几个空格数）公式
		
		System.out.println("日\t"+"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t");  //日期表顶层输入样式
		for (int i = 1; i <= x+dsum; i++) {  //样式格式7*5=x+dsum=35
			if (i<=x) {  //号数前打印空格数判断
				System.out.print("\t");  //打印空格
			}else {  //打印空格完后再打印号数
				System.out.print((i-x)+"\t");  //i-x为每月号数起始数=1
			}
			if (i%7==0) {  //判断每行打印七个就换行
				System.out.println();  //换行
			}
		}
		
		
		
		
		

	}

}
