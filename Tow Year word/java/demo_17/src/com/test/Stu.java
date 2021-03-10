package com.test;

public class Stu {

	private String sname;

	public String getSname() {
		return sname;
	}

	// 抛出异常
	public void setSname(String sname) throws Exception {
		if (sname.equals("张三")) {
			this.sname = sname;
		} else {
			System.out.println("名字只能叫张三");
		}
	}

}
