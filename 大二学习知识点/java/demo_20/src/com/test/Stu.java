package com.test;

import java.io.Serializable;
// Serializable--允许被实例化

public class Stu implements Serializable{

	private int sid;
	private String sname;
	private int age;
	private String sex;

	public Stu() {

	}

	public Stu(int sid, String sname, int age, String sex) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
		return "Stu [age=" + age + ", sex=" + sex + ", sid=" + sid + ", sname="
				+ sname + "]";
	}

}
