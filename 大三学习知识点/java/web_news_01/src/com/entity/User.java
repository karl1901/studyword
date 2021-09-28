package com.entity;

public class User {

	private int uid; // 编号
	private String uname; // 用户名
	private String upwd; // 密码
	private int age; // 年龄
	private String sex; // 性别

	public User() {

	}

	public User(int uid, String uname, String upwd, int age, String sex) {
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.age = age;
		this.sex = sex;
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

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
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
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", age=" + age + ", sex=" + sex + "]";
	}

}
