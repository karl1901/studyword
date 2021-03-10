/**
 * 
 */
package com.test;

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

		// 值类型：八大基本数据类型 存放在栈空间上 运行速度快
		// 应用类型：类、接口、String、数组 存放在堆空间上 运行速度慢
		// ==：用来做数值类型比较(真正是比较数据存放的地址)
		// equals：比较数据内容的
		// int x = 11;
		// int y = 11;
		// String s1 = "aa";
		// String s2 = new String("aa");
		// System.out.println(s1.equals(s2));

		Stu stu1 = new Stu(1, "赵云");
		Stu stu2 = new Stu(1, "赵云");
		// String str="赵云";
		// System.out.println(stu1.equals(str));
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		System.out.println(Util.x);
		System.out.println(stu1.hashCode()==Util.y);
		
		// Integer是int的帮助类(封装类)
		// 默认值不一样，int--0 Integer--null
		// int[] x=new int[5];
		// Integer[] y=new Integer[5];
		// System.out.println(x[0]+"-----"+y[0]);

		// int x=0;
		// Integer y=0;
		// String str="111";
		// int z=Integer.parseInt(str);
		// System.out.println(z);

		// hashCode--哈希值
		// String a = "b";
		// System.out.println(a.hashCode());

	}

}
