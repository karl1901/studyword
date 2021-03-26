package com.entity;

public class Stu {

	private int sid;
	private String sname;
	private int age;
	private String sex;
	private String username;
	private String password;
	private String rtime;
	private String btime;

	public Stu() {

	}

	public Stu(int sid, String sname, int age, String sex, String username,
			String password, String rtime, String btime) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.username = username;
		this.password = password;
		this.rtime = rtime;
		this.btime = btime;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", age=" + age
				+ ", sex=" + sex + ", username=" + username + ", password="
				+ password + ", rtime=" + rtime + ", btime=" + btime + "]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Stu) {
			Stu stu = (Stu) obj;
			if (this.sid == stu.getSid() && this.sname.equals(stu.getSname())
					&& this.age == stu.getAge()
					&& this.sex.equals(stu.getSex())) {
				return true;
			}
		}
		return false;
	}

}
