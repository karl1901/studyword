package com.entity;

import java.io.Serializable;

public class Stu implements Serializable {

	private int sid;
	private String sname;

	public Stu() {

	}

	public Stu(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + "]";
	}

}
