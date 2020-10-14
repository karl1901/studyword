package com.karl;

import java.util.Random;
import java.util.Scanner;

import javax.annotation.Generated;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ToDo Auto-Generated method stub
		// if(boolean布尔类型)
		// 条件判断(switch)(数值类型(int/double),非数值类型(char\String--JDK1.8)
		// seitch运用在判断是用作定值,case相当于==/equals
		// Scanner mys = new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x = mys.nextInt();
		// switch (x) {
		// case 0:
		// System.out.println("是0我就出来了");
		// break;
		// case 1:
		// System.out.println("是1我就出来了");
		// break;
		// case 2:
		// System.out.println("是2我就出来了");
		// break;
		// default:
		// System.out.println("我是其他数字");
		// break;
		// };

		// 条件的嵌套
		// 生成一个用户输入构造器
		Scanner mys = new Scanner(System.in);
		// 生成随机数的一个构造器
		Random r = new Random();
		int x = r.nextInt(3); // 随机数0,1,2
		System.out.println("请输入你的选择(0、拳头   1、剪刀  2、布):");
		int y = mys.nextInt(); // 用户做出的选择
		// System.out.println(x);
		// 假设0:拳头 1:剪刀 2:布
		// if (x==0) { //电脑出了拳头
		// //3种结果(赢 输 平)
		// if (y==0) { //表示用户选择拳头
		// System.out.println("平局");
		// }
		// if (y==1) { //剪刀
		// System.out.println("您输了!");
		// }
		// if (y==2) { //布
		// System.out.println("您赢了!");
		// }
		// }
		// if (x==1) { //电脑出了剪刀
		// //3种结果(赢 输 平)
		// if (y==0) { //表示用户选择拳头
		// System.out.println("您赢了!");
		// }
		// if (y==1) { //剪刀
		// System.out.println("平局");
		// }
		// if (y==2) { //布
		// System.out.println("您输了!");
		// }
		// }
		// if (x==2) { //电脑出了布
		// //3种结果(赢 输 平)
		// if (y==0) { //表示用户选择拳头
		// System.out.println("您输了!");
		// }
		// if (y==1) { //剪刀
		// System.out.println("您赢了!");
		// }
		// if (y==2) { //布
		// System.out.println("平局");
		// }
		// }

		// swicth嵌套模式
		switch (x) {
		case 0: // 拳头
			switch (y) {
			case 0: // 拳头
				System.out.println("平局");
				break;
			case 1: // 剪刀
				System.out.println("您输了!");
			case 2: // 布
				System.out.println("您赢了!");
				break;
			default: // 输入的其他数
				System.out.println("您的输入有误!请重新输入");
				break;
			}
			break;
		case 1: // 剪刀
			switch (y) {
			case 0: // 拳头
				System.out.println("您赢了!");
				break;
			case 1: // 剪刀
				System.out.println("平局");
			case 2: // 布
				System.out.println("您输了!");
				break;
			default: // 输入的其他数
				System.out.println("您的输入有误!请重新输入");
				break;
			}
			break;
		case 2: // 布
			switch (y) {
			case 0: // 拳头
				System.out.println("您输了!");
				break;
			case 1: // 剪刀
				System.out.println("您赢了!");
			case 2: // 布
				System.out.println("平局");
				break;
			default: // 输入的其他数
				System.out.println("您的输入有误!请重新输入");
				break;
			}
			break;
		}

	}
}