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

		// Person[] pers = new Person[100];
		// Person per1 = new Person("小明", "430811", "男", "常德");
		// Person per2 = new Person("小明", "430812", "男", "常德");
		// pers[0] = per2; // 把per2加入数组第一个位置
		// for (int i = 0; i < pers.length; i++) {
		// if (pers[i] != null) {
		// if (pers[i].equals(per1)) {
		// System.out.println("人已存在");
		// break;
		// }
		// }
		// if (pers[i] == null) {
		// pers[i] = per1;
		// System.out.println("人已增加!");
		// break;
		// }
		// }

		// 字符串 String
		// String str="abc算了s"; // 字符串类型 字符串类
		// String s=new String("aaa");
		// // 求字符串长度的方法(根据实际内容算的长度)
		// System.out.println(str.length());
		// // 长度最少到6-8之间
		// if (str.length()>=6&&str.length()<=8) {
		// System.out.println("合格!");
		// }else {
		// System.out.println("失败!");
		// }

		// 字符串是由字符(char)数组组成的
		// 在字符串中查找相对应的元素
		// String str = "你好，我的中国!";
		// char[] cs= str.toCharArray(); // 将字符串转化为字符数组
		// for (char c : cs) {
		// System.out.println(c);
		// }
		// int n = str.indexOf("一");
		// System.out.println(n);

		// 截取
		// String eml = "49383@qq.cn";
		// System.out.println(eml.substring(2, 5)); // 截取2-5下标之间的东西(包前不包后)
		//
		// int sta = eml.indexOf("@"); // 找@符号
		// int end = eml.lastIndexOf("."); // 找最后一个点出现的位置
		// String s = eml.substring(end + 1);
		// System.out.println(s);
		// boolean f = false;
		// if (sta != -1 && end != -1) { // 表示字符串中有@和.
		// if (end - sta > 1) { // .必须在@后面
		// if (s.equals("com") || s.equals("cn") || s.equals("net")) { //
		// 判断.后面的符号是否符合标准
		// f = true;
		// }
		// }
		// }
		// if (f == true) {
		// System.out.println("邮箱合法!");
		// } else {
		// System.out.println("邮箱不合法!");
		// }

		// 替换
		// String str="好好学习，天天向上";
		// System.out.println(str.replace("好", "快"));

		// 切割(以某某做分割)
		// String dtime="2000-10-30";
		// String[] strs= dtime.split("-");
		// System.out.println(strs[0]);
		// int year= Integer.parseInt(strs[0]);
		// int month= Integer.parseInt(strs[1]);
		// int day= Integer.parseInt(strs[2]);
		// System.out.println(year+month+day);

	}

}
