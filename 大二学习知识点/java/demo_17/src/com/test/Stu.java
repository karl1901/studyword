package com.test;

public class Stu {

	private String sname;

	public String getSname() {
		return sname;
	}

	// �׳��쳣
	public void setSname(String sname) throws Exception {
		if (sname.equals("����")) {
			this.sname = sname;
		} else {
			System.out.println("����ֻ�ܽ�����");
		}
	}

}
