/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author 23712
 * 
 * 正则表达式：字符串比较(规则)
 * 
 * []：属于[]里面的元素，才会是true
 * [^]：不属于[^]里面的元素，才会是true
 * |：或者
 * ()：把()里面的内容作为整体，是()里面的才为true
 * a-z：从a-z所有字母
 * {3}：长度必须为3，才为true
 * {3,}：长度必须是大于等于3，才为true
 * {3,7}：长度必须是3-7，才为true
 * 符号*：前面的元素出现0次或者是N次
 * +：元素最少出现一次
 * ?：最多只出现一次
 * ^：以什么开头
 * $：以什么结尾
 * .：除了"\n"以外的所有内容
 * \d：[0-9]
 * \D：[^0-9]
 * \w：[0-9a-zA-Z]
 * \W：[^0-9a-zA-Z]
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "2";
//		String rex = "[^ab]"; // 创建的字符串规则
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "aq";
//		String rex = "[a-z]?+"; // 创建的字符串规则
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "2q";
//		String rex = "^[0-9][a-z]*[A-Z]$"; // 创建的字符串规则
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "2";
//		String rex = "."; // 创建的字符串规则
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
//		String str = "&";
//		String rex = "\\w"; // 创建的字符串规则
//		boolean f = str.matches(rex);
//		System.out.println(f);
		
		
		// 验证用户名（必须是英文或者数字，长度6-15）
		// 密码（首字母必须大写，长度6-15）
		// 手机号码（纯数字，长度11，以1开头）
//		String str="11211111111";
//		String rex="\\w{6,15}";       // 写用户名的规则,true
//		String rex1="^[A-Z].{5,14}";  // 写密码规则,true
//		String rex2="^[1]\\d{10}";  // 写手机号码规则,true
//		System.out.println(str.matches(rex2));
//		// 使用规则进行验证
//		Scanner mys=new Scanner(System.in);
//		System.out.println("请输入用户名：");
//		String sname=mys.next();
//		System.out.println("请输入密码：");
//		String spwd=mys.next();
//		System.out.println("请输入手机号码：");
//		String plo=mys.next();
//		if (sname.matches(rex)&&spwd.matches(rex1)&&plo.matches(rex2)) {
//			System.out.println("恭喜！注册成功");
//		}else {
//			if (!sname.matches(rex)) {
//				System.out.println("用户名输入有误!");
//			}
//			if (!spwd.matches(rex1)) {
//				System.out.println("密码输入有误!");
//			}
//			if (!plo.matches(rex2)) {
//				System.out.println("手机号码输入有误!");
//			}
//		}
		
		// 验证邮箱格式(数字或字母(4-16)@163/126/qq/sina.com/cn/net)
//		String str="li231@qq";
//		String rex="\\w{4,16}[@]((163)|(126)|(qq)|(sina))[\\.]((com)|(cn)|(net))";
//		System.out.println(str.matches(rex));
		
		
		
		

	}

}
