package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Test {

	/**
	 * @param args
	 * 
	 * 正则表达式：
	 * [abc]：匹配的元素要属于[]里面的单个内容       [^a]：不属于[]里面的内容
	 * (ab)：把里面的元素作为整体      ab|ac：或者      a-z：从a至z
	 * 符号    *：对前面的元素生效，任意次数      +：1-n次(至少出现一次)  ?：最多出现一次
	 *     ^：以这个元素开头      $：以这个结尾      .：除了\n的所有元素
	 *     \\.：符号.，反编译
	 * \d：[0-9]  \D：[^0-9]
	 * \w：[0-9a-zA-Z]   \W：所有的符号
	 * {6}：长度必须为6  {6,}长度必须是6或6以上    {6,12}：长度必须是6-12
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// // 时间类(Date)
		// Date date = new Date(); // 创建一个时间类
		// // 获取年份
		// System.out.print(date.getYear() + 1900+"年");
		// // 获取月份
		// System.out.print(date.getMonth() + 1+"月");
		// // 获取日期
		// System.out.print(date.getDate()+"日  ");
		// // 获取星期
		// System.out.print("星期"+date.getDay());
		// System.out.println();
		// // 获取系统当前时间
		// System.out.println(date.toString());
		// System.out.println(date.toLocaleString());
		// // 获取毫秒
		// System.out.println(date.getTime());
		// // 给时间对象赋值
		// date.setYear(2019);

		// 时间类型(DateFormat)
		// DateFormat df = DateFormat.getDateInstance();
		// System.out.println(DateFormat.DAY_OF_YEAR_FIELD);
		// // 把字符串装化为时间类型Date
		// try { // try：里面放可能会出现错误的代码
		// Date date = df.parse("2012-02-12");
		// System.out.println(date.toLocaleString());
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace(); // catch：用来捕获错误
		// }finally{
		// System.out.println("不管是否报错，都会执行");
		// }

		// // 时间类型(Calendar)
		// Calendar cl=new GregorianCalendar();
		// // 获取年份
		// System.out.println(cl.get(Calendar.YEAR));
		// cl.set(Calendar.YEAR, 2019);
		// System.out.println(cl.get(1));
		
		
		

	}

}
