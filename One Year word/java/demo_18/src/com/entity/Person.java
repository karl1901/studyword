package com.entity;

// ����

public class Person {

	// ��ͬӵ�е�����
	private String pname;
	private int age;
	private String sex;

	public Person() {

	}

	public Person(String pname, int age, String sex) {
		this.pname = pname;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", pname=" + pname + ", sex=" + sex + "]";
	}

}
