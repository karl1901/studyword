package com.entity;

// 学生类(学生类型)--自定义类型
// 实体类：属性根据表的内容创建的
// 封装

public class Stu {

	// 私有化属性
	private int sid;
	private String sname;
	private String sex;
	private int age;
	private int cid;
	private int son;

	// 构造函数（特殊方法-没有返回类型，作用：创建对象被调用）
	public Stu() {

	}

	public Stu(int sid, String sname, String sex, int age, int cid, int son) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.cid = cid;
		this.son = son;
	}

	// 两个方法（赋值，取值）
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

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSon() {
		return son;
	}

	public void setSon(int son) {
		this.son = son;
	}

	@Override
	public String toString() {
		return "Stu [age=" + age + ", cid=" + cid + ", sex=" + sex + ", sid="
				+ sid + ", sname=" + sname + ", son=" + son + "]";
	}

}
