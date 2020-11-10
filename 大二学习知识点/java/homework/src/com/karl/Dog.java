package com.karl;

public class Dog {

	// 1、写一个狗的类，类中有属性：姓名，性别，品种。
	String dname;
	String sex;
	String type;

	// 类中有方法：
	// （一）无返回，无参数的方法：
	// 狗跑步的方法，要求输出“某某品种的狗跑得好快”。
	public void run() {
		System.out.println("某某品种的狗跑的好快");
	}

	// 狗长大的方法，要求输出“某某姓名的狗长大了”。
	public void growup() {
		System.out.println("某某姓名的狗长大了");
	}

	// （二）有返回，无参数的方法：
	// 得到狗的姓名方法，要求返回当前狗的姓名。
	public String getDname() {
		return dname;
	}

	// 得到狗的性别的方法，要求返回当前狗的性别。
	public String getSex() {
		return sex;
	}

	// 得到狗的品种的方法，要求返回当前狗的品种。
	public String getType() {
		return type;
	}

	// 返回当前对象信息的方法，即toString()方法。
	@Override
	public String toString() {
		return super.toString();
	}

	// （三）无返回，有参数的方法：
	// 设置当前狗的姓名的方法，要求传入狗的新姓名，修改当前姓名。
	public void newname(String dname) {
		System.out.println(dname);
	}

	// 设置当前狗的性别的方法，要求传入狗的新性别，修改当前性别。
	public void newsex(String sex) {
		System.out.println(sex);
	}

	// 设置当前狗的品种的方法，要求传入狗的新品种，修改当前品种。
	public void newtype(String type) {
		System.out.println(type);
	}

}
