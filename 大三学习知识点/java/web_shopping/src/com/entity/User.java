package com.entity;

// 用户实体类

public class User {

//	用户编号
	private int uid;
//	用户名称
	private String uname;
//	用户账号
	private String uzh;
//	用户密码
	private String upwd;
//	用户年龄
	private int age;
//	用户性别
	private String sex;
//	电话号码
	private String tel;
//	用户地址
	private String addres;
//	预留字段
	private String umum;

	public User() {

	}

	public User(int uid, String uname, String uzh, String upwd, int age, String sex, String tel, String addres, String umum) {
		this.uid = uid;
		this.uname = uname;
		this.uzh = uzh;
		this.upwd = upwd;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
		this.addres = addres;
		this.umum = umum;
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

	public String getUzh() {
		return uzh;
	}

	public void setUzh(String uzh) {
		this.uzh = uzh;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getUmum() {
		return umum;
	}

	public void setUmum(String umum) {
		this.umum = umum;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uzh=" + uzh + ", upwd=" + upwd + ", age=" + age + ", sex=" + sex + ", tel=" + tel + ", addres=" + addres + ", umum=" + umum + "]";
	}

}
