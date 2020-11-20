package com.entity;

public abstract class People {
	// 姓名、性别、年龄、联系电话、地址
	String pname;
	String sex;
	int age;
	String tel;
	String address;

	// 具备方法说话（抽象方法--没有方法体），吃饭
	public abstract void say();

	public void eat() {
		System.out.println("吃饭");
	}

}