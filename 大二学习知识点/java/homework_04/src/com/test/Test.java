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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1、控制台接收输入（类似“aa@bb”字符串），判断以“@”分割的前后两个字符串是否相等。如果相等在控制台以占位符的方式输出“{0}和{1}相等”，否则输出“不相等”
		// Scanner mys = new Scanner(System.in);
		// System.out.println("请输入类似“aa@bb”的字符串：");
		// String str = mys.next();
		// String[] st=str.split("@"); //分割
		// if (st[0].equals(st[1])) {
		// System.out.println(st[0]+"和"+st[1]+"相等");
		// }else {
		// System.out.println("不相等");
		// }

		// 2、 定义“好好学习，天天向上”这个字符串，将字符串中“天天”两个字替换为“时时”，要求结果字符串为“好好学习，时时向上”；
		// String str2="好好学习，天天向上";
		// System.out.println(str2.replace("天", "时"));

		// 3、 定义“好好学习，天天向上”这个字符串，利用字符串截取技术，要求结果字符串为“好好学习”；
		// String str3="好好学习，天天向上";
		// // 找到","所在的位置
		// int dou=str3.indexOf("，");
		// System.out.println(str3.substring(0,dou));
		//		 
		// // 第二种写法
		// String[] a=str3.split("，");
		// System.out.println(a[0]);

		// 4、 定义个string字符串“8,2,1,65,99,7,4”，取出该字符串中最小的数字
		// String str4 = "8,2,1,65,99,7,4";
		// // 以"，"为分割
		// String[] strs = str4.split(",");
		// // 声明一个和上面字符串一样大的整型数组
		// int[] ints = new int[strs.length];
		// // 把字符串里面的数组转换为整型
		// for (int i = 0; i < ints.length; i++) {
		// ints[i] = Integer.parseInt(strs[i]);
		// }
		// int min = ints[0];
		// for (int i = 0; i < ints.length; i++) {
		// if (min > ints[i]) {
		// min = ints[i];
		// }
		// }
		// System.out.println("最小值为：" + min);

		// 5、要求输出九九乘法表，要求结果中所有的5被英文字母”F”代替，2被“T”代替；
		// for (int i = 1; i <= 9; i++) {
		// for (int j = 1; j <= i; j++) {
		// int t = j * i;
		// System.out.print((j + "*" + i + "=" + t + "  ").replace("5",
		// "F").replace("2", "T"));
		// }
		// System.out.println();
		// }

		// 6、取出该文件名“abcd.aspx”的后缀名
		// String wj="abcd.aspx";
		// int dian=wj.lastIndexOf(".");
		// System.out.println(wj.substring(dian+1));

		// 7、让用户随即输入一段字符串，凡是碰到“B”“b”“c”三个字符，全部自动换行输出
		// Scanner mys = new Scanner(System.in);
		// System.out.println("请输入一段字符串：");
		// String str = mys.next();
		// String[] strs = new String[str.length()];
		// System.out.println(str.replace("B", "B\n").replace("b",
		// "b\n").replace("c", "c\n"));;

		// 8、完成用户的注册以及登陆，要求用类实现
		// User user=new User();
		// int n=user.login("admin", "123456");
		// if (n>0) {
		// System.out.println("登录成功!");
		// }else {
		// System.out.println("登录失败!");
		// }

		// 9、判断.java文件名是否正确，判断邮箱格式是否正确

		// 判断Java文件名
		// String str = "flslf.java";
		// int dian = str.lastIndexOf(".");
		// String wei = str.substring(dian + 1);
		// boolean f = false;
		// if (dian != -1) {
		// if (wei.equals("java")) {
		// f = true;
		// }
		// }
		// if (f == true) {
		// System.out.println("java文件名正确");
		// } else {
		// System.out.println("java文件名不正确");
		// }

		// 判断邮箱格式
		// String str1 = "10208434@gmail.net";
		// int ait = str1.indexOf("@");
		// int dian1 = str1.lastIndexOf(".");
		// String wei1 = str1.substring(dian1 + 1);
		// boolean f1 = false;
		// if (ait != -1 && dian1 != -1) {
		// if (dian1 - ait > 1) {
		// if (wei1.equals("com") || wei1.equals("cn")
		// || wei1.equals("net")) {
		// f1 = true;
		// }
		// }
		// }
		// if (f1 == true) {
		// System.out.println("邮箱格式正确");
		// } else {
		// System.err.println("邮箱格式不正确");
		// }

		// 10、根据身份证号码提取生日
		// String sfz="431701199005240059";
		// System.out.println(sfz.substring(6,14));

	}

}
