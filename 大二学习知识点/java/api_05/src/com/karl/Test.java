package com.karl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1、完成上课的代码

		// 2、分别利用ArrayList、LinkedList完成部分元素的添加、删除等操作
		// 测试以下方法的使用：
		// ArrayList:add()追加数据（对象）
		// :get(索引)返回指定索引的对象
		// :size()返回集合的长度
		// :addAll()是表示将指定集合中的数据追加到原集合后面
		// :clear()清除集合中的元素
		// :contains()是否包含该元素equals比较
		// :containsAll()比较的是集合中的值,是否包含子集合中的内容
		// :remove(index)移除指定索引的对象

		// // 创建一个ArrayList集合sl,sls
		// List<Integer> sl = new ArrayList<Integer>();
		// List<Integer> sls = new ArrayList<Integer>();
		// // 添加元素到sl集合
		// sl.add(1);
		// sl.add(5);
		// sl.add(6);
		// sl.add(4);
		// // 添加元素到sls集合
		// sls.add(5);
		// sls.add(6);
		// sls.add(7);
		// // 打印sl,sls集合所有内容
		// System.out.println(sl.toString());
		// System.out.println(sls.toString());
		// // 查找 元素2
		// System.out.println(sl.get(1));
		// // sl集合的长度
		// System.out.println(sl.size());
		// // 将sl集合追加到sl集合后面
		// sl.addAll(sls);
		// System.out.println(sl.toString());
		// // 清除集合sl所有元素
		// sl.clear();
		// System.out.println(sl.toString());
		// // sl集合是否包含元素2
		// System.out.println(sl.contains(2));;
		// // sl集合是否包含sl集合中的内容(sl是否有sls的全部元素，是就为true,否则为false)
		// System.out.println(sl.containsAll(sls));
		// // 移除sl集合中的元素5
		// sl.remove(1);
		// System.out.println(sl.toString());

		// // 创建一个LinkedList集合sl,sls
		// List<Integer> sl = new LinkedList<Integer>();
		// List<Integer> sls = new LinkedList<Integer>();
		// // 添加元素到sl集合
		// sl.add(1);
		// sl.add(7);
		// sl.add(6);
		// sl.add(8);
		// // 添加元素到sls集合
		// sls.add(8);
		// sls.add(6);
		// sls.add(7);
		// // 打印sl,sls集合所有内容
		// System.out.println(sl.toString());
		// System.out.println(sls.toString());
		// // 查找 元素2
		// System.out.println(sl.get(1));
		// // sl集合的长度
		// System.out.println(sl.size());
		// // 将sl集合追加到sl集合后面
		// sl.addAll(sls);
		// System.out.println(sl.toString());
		// // 清除集合sl所有元素
		// sl.clear();
		// System.out.println(sl.toString());
		// // sl集合是否包含元素2
		// System.out.println(sl.contains(7));;
		// // sl集合是否包含sl集合中的内容(sl是否有sls的全部元素，是就为true,否则为false)
		// System.out.println(sl.containsAll(sls));
		// // 移除sl集合中的元素5
		// sl.remove(1);
		// System.out.println(sl.toString());

		// 3、利用ArrayList插入十个以上元素，要求元素数据类型不一样，其中必须插入Dog类实例对象，要求可以根据狗的姓名在数组里查询，如有则返回该对象，否则返回为空

		// // 创建11个狗的对象
		// Dog dog=new Dog("小黑", "公", "藏獒");
		// Dog dog1=new Dog("小花", "母", "田园犬");
		// Dog dog2=new Dog("啊giao", "公", "阿拉斯加");
		// Dog dog3=new Dog("小6", "母", "哈士奇");
		// Dog dog4=new Dog("奥斯卡", "公", "拉布拉多");
		// Dog dog5=new Dog("小7", "母", "金毛");
		// Dog dog6=new Dog("大圆子", "母", "田园犬");
		// Dog dog7=new Dog("小六", "公", "阿拉斯加");
		// Dog dog8=new Dog("小五", "公", "斗牛犬");
		// Dog dog9=new Dog("小袁", "母", "哈士奇");
		// Dog dog10=new Dog("啊涛", "母", "田园犬");
		// // 创建集合myli，数据类型为狗类
		// List<Dog> myli=new ArrayList<Dog>();
		// // 添加11个狗对象到myli集合
		// myli.add(dog);
		// myli.add(dog1);
		// myli.add(dog2);
		// myli.add(dog3);
		// myli.add(dog4);
		// myli.add(dog5);
		// myli.add(dog6);
		// myli.add(dog7);
		// myli.add(dog8);
		// myli.add(dog9);
		// myli.add(dog10);
		// // 打印myli里面所有元素
		// System.out.println(myli.toString());
		// // 集合myli的长度
		// System.out.println(myli.size());
		// // 与myli集合的里面的狗名比较，有就返回true,无就false
		// System.out.println(myli.get(0).getDname().equals("小黑"));
		// // 用户输入狗名，查询狗的所有信息
		// Scanner mys=new Scanner(System.in); // 用户输入构造器
		// System.out.println("请输入要查询的狗名：");
		// String str=mys.next(); // 获取要查询的狗名
		// for (int i = 0; i < myli.size(); i++) { // 循环myli数组长度次数查询狗名
		// if (myli.get(i).getDname().equals(str)) { // 判断输入的狗名是否存在myli集合中
		// System.out.println(myli.get(i)); // 查到了就打印此狗的信息
		// break; // 查到了就停止循环
		// }
		// }

		// 4、建立ArrayList集合，里面放置Dog对象集合，要求去除dog名字重复的元素

		// // 创建4个狗的对象
		// Dog dog = new Dog("小5", "公", "藏獒");
		// Dog dog1 = new Dog("小5", "母", "田园犬");
		// Dog dog2 = new Dog("小6", "公", "阿拉斯加");
		// Dog dog3 = new Dog("小花", "母", "哈士奇");
		// // 创建集合myli，数据类型为狗类
		// List<Dog> myli = new ArrayList<Dog>();
		// // 添加4个狗对象到myli集合
		// myli.add(dog);
		// myli.add(dog1);
		// myli.add(dog2);
		// myli.add(dog3);
		// // 打印myli里面所有元素
		// System.out.println(myli.toString());
		// // 循环嵌套来删除相同的元素
		// for (int i = 0; i < myli.size(); i++) {
		// for (int j = 0; j < myli.size(); j++) {
		// if (i != j) { // 不能和自己对比
		// if (myli.get(i).getDname().equals(myli.get(j).getDname())) { //
		// dog名字相同
		// myli.remove(j); // 删掉同名的元素
		// }
		// }
		// }
		// }
		// // 打印myli集合所有元素
		// System.out.println(myli.toString());
		
		
		

	}

}
