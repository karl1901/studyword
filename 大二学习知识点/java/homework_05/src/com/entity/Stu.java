package com.entity;

public class Stu {

	private int sid;
	private String sname;
	private int age;
	private String sex;
	private int score;
	private int cid;

	public Stu() {

	}

	public Stu(int sid, String sname, int age, String sex, int score, int cid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.cid = cid;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Stu [age=" + age + ", cid=" + cid + ", score=" + score
				+ ", sex=" + sex + ", sid=" + sid + ", sname=" + sname + "]";
	}

}
