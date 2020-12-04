package com.test;

// 人类

public class Person {

	private String pname;
	private String pnumber;
	private String sex;
	private String address;

	public Person() {

	}

	public Person(String pname, String pnumber, String sex, String address) {
		super();
		this.pname = pname;
		this.pnumber = pnumber;
		this.sex = sex;
		this.address = address;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// Object：被所有类直接或间接继承了，所以他就能表示所有类
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) { // 判断是人类
			Person per = (Person) obj; // obj变成per(person类)
			if (this.pname.equals(per.getPname())
					&& this.sex.equals(per.getSex())) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(Person per) {
		if (this.pnumber.hashCode() == per.getPnumber().hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.pname.hashCode() + this.pnumber.hashCode()
				+ this.sex.hashCode();
	}

}
