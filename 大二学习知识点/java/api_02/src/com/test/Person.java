package com.test;

// ����

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

	// Object����������ֱ�ӻ��Ӽ̳��ˣ����������ܱ�ʾ������
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) { // �ж�������
			Person per = (Person) obj; // obj���per(person��)
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
