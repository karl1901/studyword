package com.dto;

// dto类：组合类，里面的所有属性是由多个表而来的

public class Stu_class {

	// 属性由学生表和班级表决定
	private int sid;
	private String sname;
	private int age;
	private String sex;
	private String cname;

	public Stu_class() {

	}

	public Stu_class(int sid, String sname, int age, String sex, String cname) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.cname = cname;
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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "[sid=" + sid + ", sname=" + sname + ", age=" + age
				+ ", sex=" + sex + ", cname=" + cname + "]";
	}

}
