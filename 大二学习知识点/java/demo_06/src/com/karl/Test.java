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
		// 多条件情况
		// ()-->!-->计算运算符-->比较运算符-->&/&&-->||->=
		// int x = -2; // 当一个变量被使用，必须具有初始化的值
		// switch (x) { // switch(变量:数值类型/char/string--JDK版本1.8)
		// case 0: // case:x==value
		// System.out.println("是0我会打印");
		// break;
		// case 1:
		// System.out.println("是1我会打印");
		// break;
		// case 2:
		// System.out.println("是2我会打印");
		// break;
		//
		// default: //不满上面case所有条件,就都进入default
		// System.out.println("是其他所有我会打印");
		// break;
		// }
		//		

		// 循环(while do while for)
		// int i = 0;
		// while (i < 100) { // ():比较运算符
		// // System.out.println("是真(true)就会进入");
		// System.out.println(i);
		// i++; // i=i+1;出现在循环体的最后一行
		// }

		// 求1-100的和
		// int i=1;
		// int sum=0; //装1-100的和
		// while (i<=100) {
		// sum=sum+i;
		// i++;
		// }
		// System.out.println("和为："+sum);

		// 求1-100的偶数和,奇数和
		// int i = 1;
		// int sum = 0;
		// int jsum = 0;
		// while (i <= 100) {
		// if (i % 2 == 0) { // 找1-100中的偶数
		// System.out.println(i);
		// sum += i;// 先运算再赋值 //sum=sum+i;--先赋值再运算
		// } else { // 1-100的奇数
		// jsum += i;
		// }
		// i++;
		// }
		// System.out.println("偶数和:" + sum);
		// System.out.println("奇数和:" + sum);

		double money = 5000; // 初始金额
		Scanner mys = new Scanner(System.in);
		while (true) { // -----循环开始
			System.out.println("请输入你要选择的装备：1、鞋子(350)  2、铁剑(300)"
					+ "3、打野刀(320)  4、盾牌(400)");
			int x = mys.nextInt();
			if (x == 1) { // 购买鞋子
				if (money >= 350) { // 判断金额是否能购买鞋子
					money -= 350; // money=money-350;
					System.out.println("鞋子购买成功!");
					System.out.println("余额：" + money);
				} else {
					System.out.println("金额不够!");
				}
			}
			if (x == 2) { // 购买铁剑
				if (money >= 300) { // 判断金额是否能购买铁剑
					money -= 300; // money=money-300;
					System.out.println("铁剑购买成功!");
					System.out.println("余额：" + money);
				} else {
					System.out.println("金额不够!");
				}
			}
			if (x == 3) { // 购买打野刀
				if (money >= 320) { // 判断金额是否能购买打野刀
					money -= 320; // money=money-320;
					System.out.println("打野刀购买成功!");
					System.out.println("余额：" + money);
				} else {
					System.out.println("金额不够!");
				}
			}
			if (x == 4) { // 购买盾牌
				if (money >= 400) { // 判断金额是否能购买盾牌
					money -= 400; // money=money-400;
					System.out.println("盾牌购买成功!");
					System.out.println("余额：" + money);
				} else {
					System.out.println("金额不够!");
				}
			}

		} // -----循环结束
		
		
		
		
		
		

	}

}
