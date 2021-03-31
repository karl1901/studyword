package com.entity;

public class Teacher {

	private int tid;
	private String tname;
	private int age;
	private String sex;
	private String tername;
	private String terpwd;
	private int cid;

	public Teacher() {

	}

	public Teacher(int tid, String tname, int age, String sex, String tername,
			String terpwd, int cid) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.age = age;
		this.sex = sex;
		this.tername = tername;
		this.terpwd = terpwd;
		this.cid = cid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
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

	public String getTername() {
		return tername;
	}

	public void setTername(String tername) {
		this.tername = tername;
	}

	public String getTerpwd() {
		return terpwd;
	}

	public void setTerpwd(String terpwd) {
		this.terpwd = terpwd;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "老师id：" + tid + "\t姓名：" + tname + "\t年龄：" + age + "\t用户名："
				+ tername + "\t用户密码：" + terpwd + "\t班级id：" + cid;
	}

}
