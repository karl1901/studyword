/**
 * 
 */
package com.karl;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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

		// 2、机试：

		// 1、键盘输入一个数字n，求出1-n之间能被4或者7整除的数字
		// Scanner mys = new Scanner(System.in);
		// System.out.println("请输入一个整数n:");
		// int n = mys.nextInt();
		// for (int i = 1; i < n; i++) {
		// if (i % 4 == 0 || i % 7 == 0) {
		// System.out.println(i);
		// }
		// }

		// 2、用户输入年、月、日，求出那一天是本年度的第多少天
		// Scanner mys = new Scanner(System.in); // 输入构造器
		// while (true) { // 无限循环输入-判断-输出结果
		// System.out.println("请输入：年 月 日"); // 提示用户输入
		// int year = mys.nextInt(), month = mys.nextInt(), date = mys
		// .nextInt(); // 输入年月日
		// int sum = 0; // 总天数
		// int leap = 0; // 闰年闰月天数
		// switch (month) { // 计算某一月之前的天数
		// case 1:
		// sum = 0;
		// break;
		// case 2:
		// sum = 31;
		// break;
		// case 3:
		// sum = 59;
		// break;
		// case 4:
		// sum = 90;
		// break;
		// case 5:
		// sum = 120;
		// break;
		// case 6:
		// sum = 151;
		// break;
		// case 7:
		// sum = 181;
		// break;
		// case 8:
		// sum = 212;
		// break;
		// case 9:
		// sum = 243;
		// break;
		// case 10:
		// sum = 273;
		// break;
		// case 11:
		// sum = 303;
		// break;
		// case 12:
		// sum = 334;
		// break;
		//		
		// default:
		// System.out.println("输入有误!请重新输入"); // 用户输入有误的提示
		// break;
		// }
		// sum += date; // 加上当月的天数
		// if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { // 判断闰年闰月
		// leap = 1;
		// } else {
		// leap = 0;
		// }
		// if (leap == 1 && month > 2) { // 判断是闰年，输入月份大于2月总天数+1
		// sum++;
		// }
		// System.out.println("你输入的这天是本年度的第" + sum + "天"); // 输出结果
		// System.out.println(); // 空格
		// }

		// 3、开发一个猜拳游戏（石头剪刀布），每次用户可以玩10次，游戏结束之后，要告诉用户得分情况（赢了加3分平了得1分输了减1分）
		// int i = 1; // 赋值：局数，初始为零
		// int sum = 4; // 赋值用户初始分数为：4
		// while (i < 11) { // 局数限制：10局(次)
		// Scanner mys = new Scanner(System.in); // 用户输入构造器
		// Random myr=new Random(); // 随机数构造器
		// int x = myr.nextInt(3); // 随机数生成：(0,1,2)分别为(石头、剪刀、布)
		// System.out.println("电脑随机数：" + x); // 显示电脑随机数
		// System.out.println("当前分数：" + sum); // 显示用户当前分数
		// System.out.println("请输入你的选择：(0:石头,1:剪刀,2:布)");
		// System.out.println("第" + i + "局"); // 显示当前局数
		// int y = mys.nextInt(); // 用户输入的选择
		// switch (x) { // 判断随机数
		// case 0: // 电脑出石头
		// switch (y) { // 判断用户输入的选择
		// case 0: // 用户出石头
		// System.out.println("平局！");
		// sum += 1; // 平局：总分+1分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// case 2: // 用户出布
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// case 1: // 电脑出剪刀
		// switch (y) { // 判断用户的选择
		// case 0: // 用户出石头
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("平局！");
		// sum += 1; // 平局：+1分
		// break;
		// case 2:
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// case 2: // 电脑出布
		// switch (y) { // 判断用户输入的选择
		// case 0: // 用户出石头
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// case 2: // 用户出布
		// System.out.println("平局！");
		// sum += 1; // 平局：+1分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// }
		// i++; // 循环一次游戏后局数+1局
		// System.out.println(); // 空格一行(美化格式)
		// }
		// System.out.println("结束"); // 游戏结束
		// System.out.println(); // 空行
		// System.out.println("你的游戏总分是：" + sum); // 告诉用户最终得分
		// System.out.println("游戏局数：" + (i - 1)); // 查看游戏局数
		// // 个性化提示
		// if (sum <= 3) { // 总分小于3
		// System.out.println("继续努力吧！");
		// } else if (3 < sum & sum <= 10) { // 总分为3-9之间
		// System.out.println("还不错！加把劲儿吧");
		// } else if (sum > 10) { // 总分大于9
		// System.out.println("你真厉害！膜拜大佬");
		// }

		
		// 1900年1月1日 星期一(电脑时间起始点)
		// 2020年8月1日 //求出8月1日是星期几？
		
		//老师讲解版
//		Scanner mys = new Scanner(System.in);
//		System.out.println("请输入年份：");
//		int year = mys.nextInt();
//		System.out.println("请输入月：");
//		int month = mys.nextInt();
//		// 第一步：求1900-用户输入的年份之间的所有天数
//		int ysum = 0; // 1900-2020之间所有天数
//		for (int i = 1900; i < year; i++) {
//			ysum += 365;
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) { // 判斷i是否是闰年
//				ysum++;
//			}
//		}
//		System.out.println(ysum);
//
//		// 用户输入10月
//		// 第二步：求本年度月份的天数(1月-10月:不包括10月的天数)
//		int msum = 0; // 装月的总天数
//		for (int i = 1; i < month; i++) {
//			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10
//					|| i == 12) { // 大月
//				msum += 31;
//			}
//			if (i == 4 || i == 6 || i == 9 || i == 11) { // 小月
//				msum += 30;
//			}
//			if (i == 2) { // 平月
//				msum += 28;
//				if (year % 4 == 0 && year % 100 != 0 || i % 400 == 0) { // 判断本年是否为闰年
//					msum++;
//				}
//			}
//		}
//		System.out.println("月份总天数：" + msum);
//
//		int sum = ysum + msum + 1; // 输入年份之前总天数+输入月份之前总天数+1号当天天数（得到了所有天数）
//		System.out.println(sum%7);  //求得本月第一天是星期几
//		int x=sum%7;
//		
//		//第三步；求本月有多少天
//		int dsum=0;  //装本月总天数
//		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
//				|| month == 12) { // 大月
//			dsum = 31;
//		}
//		if (month == 4 || month == 6 || month == 9 || month == 11) { // 小月
//			dsum = 30;
//		}
//		if (month == 2) { // 平月
//			dsum = 28;
//			if (year % 4 == 0 && year % 100 != 0 || month % 400 == 0) { // 判断本年是否为闰年
//				dsum++;
//			}
//		}
//		System.out.println("本月天数："+dsum);
//		//第四步：打印每月天数样式
//		int count=1;  //装日期
//		System.out.println("日\t一\t二\t三\t四\t五\t六");
//		for (int i = 1; i <= x+dsum; i++) {
//			if(i<=x){  //打印空格
//				System.out.print("\t");
//			}else {  //打印日期
//				System.out.print(count+"\t");
//				count++;
//			}
//			if (i%7==0) {
//				System.out.println();  //每行七个就换行
//			}
//		}
		
		//课后跟人巩固手打分析更改版本
//		Scanner mys=new Scanner(System.in);  //用户输入构造器
//		System.out.println("请输入年份：");  //提示用户输入年份
//		int year=mys.nextInt();  //获取用户输入的年份
//		System.out.println("输入月份：");  //提示用户输入月份
//		int month=mys.nextInt();  //获取用户输入的月份
//		//输入年份之前的所有天数
//		int asum=0;  //所求的天数
//		for (int i = 1900; i < year; i++) {  //电脑默认时间是1900-1-1，年份从1900到所输入年份之间的年数(次数)
//			asum+=365;  //平年每年+365天
//			if (i%4==0 && i%100 != 0 || i%400==0) {  //判断闰年
//				asum++;  //闰年天数+1天
//			}
//		}
//		//输入年份月份的天数
//		int bsum=0;  //所求的天数
//		for (int i = 1; i < month; i++) {  //当年一月到输入月数的循环次数 
//			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {  //大月
//				bsum+=31;  //大月每月31天
//			}
//			if (i==4 || i==6 || i==9 || i==11) {  //小月
//				bsum+=30;  //小月每月30天
//			}
//			if (i==2) {  //平月
//				bsum+=28;  //平月每月28天
//				if (year%4==0 && year%100 !=0 || year%400==0) {  //判断闰月
//					bsum++;  //闰月每月多一天
//				}
//			}
//		}
//		//判断本月有多少天 
//		int csum=0;  //所求天数
//		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {  //大月
//			csum=31;  //大月每月31天
//		}
//		if (month==4 || month==6 || month==9 || month==11) {  //小月
//			csum=30;  //小月每月30天
//		}
//		if (month==2) {  //平月
//			csum=28;  //平月每月28天
//		    if (year%4==0 && year%100 != 0 || year%400==0) {  //判断闰月
//				csum++;  //闰月多一天，所以+1天，或者输出csum=28+1=29
//			}
//		}
//		int sum=asum+bsum+1;  //所输入年份之前所有天数+所输入月份之前所有天数+1  就是得到了所有天数，加上了输入月份的一号，用于后面使用
//		int x=sum%7;  //上述sum和7取余就是输入月份的一号是星期几(输入月份的第一天之前的空格数)  第一天是星期几，第一天前面就有多少空格
//		//输出样式 
//		System.out.println("日\t"+"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t");  //样式排版
//		for (int i = 1; i <= 35; i++) {  //样式一共有：7天*5行=x空格数+csum月天数=35
//			if (i<=x) {  //判断本月一号之前的空格打印次数
//				System.out.print("\t");
//			}else {  //打印空格后就打印号数
//				System.out.print((i-x)+"\t"); //输出号数+\t空格  i-x=输出号数的起始数从1号开始,若不-x空格数，就会从x+1开始打印
//				
//			}
//			if (i%7==0) {  //每行打印七个号数
//				System.out.println();  //换行
//			}
//		}
		
		//三分钟手打版
//		Scanner mys=new Scanner(System.in);
//		System.out.println("请输入年份：");
//		int year=mys.nextInt();
//		System.out.println("月：");
//		int month=mys.nextInt();
//		
//		int asum=0;
//		for (int i = 1900; i < year; i++) {
//			asum+=365;
//			if (i%4==0 && i%100 !=0 || i%400==0) {
//				asum++;
//			}
//		}
//		
//		int bsum=0;
//		for (int i = 1; i < month; i++) {
//			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
//				bsum+=31;
//			}
//			if (i==4 || i==6 || i==9 || i==11) {
//				bsum+=30;
//			}
//			if (i==2) {
//				bsum+=28;
//				if (year%4 ==0 && year%100 != 00 || year%400 ==0) {
//					bsum++;
//				}
//			}
//		}
//		
//		int csum=0;
//		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
//			csum=31;
//		}
//		if (month==4 || month==6 || month==9 || month==11) {
//			csum=30;
//		}
//		if (month==2) {
//			csum=28;
//			if (year%4==0 && year%100 != 0 || year%400==0) {
//				csum=29;
//			}
//		}
//		
//		int sum=asum+bsum+1;
//		int x=sum%7;
//		
//		System.out.println("日\t"+"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t");
//		for (int i = 1; i <= x+csum; i++) {
//			if (i<=x) {
//				System.out.print("\t");
//			}else {
//				System.out.print((i-x)+"\t");
//			}
//			if (i%7==0) {
//				System.out.println();
//			}
//		}
		
		

	}

}
