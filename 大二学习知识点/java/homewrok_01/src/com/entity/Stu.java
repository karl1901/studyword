package com.entity;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Stu {

	// 3（挑战题）写一个学生的类，类中有属性：姓名，性别 ，年龄。有方法：toString。
	private String name;
	private String sex;
	private int age;

	public Stu(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}


	public Stu() {
		
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String toSting() {
		return "姓名：" + name + "  性别：" + sex + "  年龄：" + age;
	}

	// 写一个测试类，生成一个学生的一维数组，长度为5，要求循环输入5个学生的所有信息。最后再循环输出所有学生的信息。
	
	
}
