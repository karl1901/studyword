package com.test;

// …Ã∆∑¿‡

public class Pro {

	private int pid;
	private String pname;

	public Pro() {

	}

	public Pro(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String toString() {
		return "Pro [pid=" + pid + ", pname=" + pname + "]";
	}

}
