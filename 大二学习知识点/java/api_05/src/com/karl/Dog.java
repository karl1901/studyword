package com.karl;

public class Dog {

	private String dname;
	private String sex;
	private String type;

	public Dog() {

	}

	public Dog(String dname, String sex, String type) {
		super();
		this.dname = dname;
		this.sex = sex;
		this.type = type;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [dname=");
		builder.append(dname);
		builder.append(", sex=");
		builder.append(sex);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

}
