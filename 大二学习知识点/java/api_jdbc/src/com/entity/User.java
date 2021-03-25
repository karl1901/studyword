package com.entity;

public class User {

	private int uid; // 编号
	private String uname; // 姓名
	private String sex; // 性别
	private int age; // 年龄
	private String utime; // 注册时间

	public User() {

	}

	public User(int uid, String uname, String sex, int age, String utime) {
		this.uid = uid;
		this.uname = uname;
		this.sex = sex;
		this.age = age;
		this.utime = utime;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

	public String getUtime() {
		return utime;
	}

	public void setUtime(String utime) {
		this.utime = utime;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", sex=" + sex + ", uid=" + uid
				+ ", uname=" + uname + ", utime=" + utime + "]";
	}

	

}
