package com.entity;

// 实体类(属性，get\set方法,构造函数,打印对象信息)

public class Stu {

	private int sid; // 学号
	private String sname; // 姓名
	private String sex; // 性别
	private double score; // 成绩
	private int age; // 年龄

	// 无参构造函数
	public Stu() {

	}

	// 有参构造函数
	public Stu(int sid, String sname, String sex, double score, int age) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.score = score;
		this.age = age;
	}

	// get\set方法
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// tostring方法
	@Override
	public String toString() {
		return "Stu [age=" + age + ", score=" + score + ", sex=" + sex
				+ ", sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
