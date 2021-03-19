package com.test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] x=new int[5];
//		
//		// <E>：泛型
//		Stu<String> stu=new Stu<String>();
//		stu.getNumber();
//		// 集合list(长度由list中内容决定)
//		List<Integer> myl=new ArrayList<Integer>();
//		// 给集合添加内容
//		myl.add(11);
//		myl.add(8);
//		myl.add(25);
//		// 插入
//		myl.add(1, 56);
//		// 删除(根据下标)
//		myl.remove(2);
//		// 删除(根据元素内容--不适用于整形集合，其他的都可以)
//		myl.remove("56");
//		// 删除所有
//		myl.removeAll(myl);
//		// 打印集合中的所有内容
//		System.out.println(myl.toString());
//		// 打印集合中某个元素
//		System.out.println(myl.get(1));
//		// 查找(找到这个元素对应的下标)
//		System.out.println(myl.indexOf(11));
//		// 修改
//		myl.set(0, 99);
//		System.out.println(myl.toString());
		
		// LinkedList
		List<String> myr = new LinkedList<String>();
		myr.add("b");
		myr.add("a");
		myr.add("d");
		myr.add("a");
		// 查找集合中最后这个元素所在的位置
		System.out.println(myr.lastIndexOf("a"));
		// 去空格
		System.out.println(myr.isEmpty());
		
		
		
		
		
		
		
		
		
		

	}

}
