package com.test;

public class Persion {

	// 属性
	String pname;
	private int age;

	public Persion() {
		System.out.println("无参的构造函数");
	}

	public Persion(String pname, int age) {
		System.out.println("有参的构造函数");
		this.pname = pname;
		this.age = age;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persion [pname=" + pname + ", age=" + age + "]";
	}

}
