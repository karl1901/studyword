package com.test;

public class Stu<E> {

	private int sid;
	private E number;
	private String sname;

	public Stu() {

	}

	public Stu(int sid, E number, String sname) {
		this.sid = sid;
		this.number = number;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public E getNumber() {
		return number;
	}

	public void setNumber(E number) {
		this.number = number;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stu [sid=");
		builder.append(sid);
		builder.append(", sname=");
		builder.append(sname);
		builder.append("]");
		return builder.toString();
	}

}
