package com.test;

public class Stu {

	private int sid;
	private String sname;

	public Stu() {

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

	public Stu(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	// 重写equals方法
	// Object：可以代表所有类
	// instanceof：比较类
	@Override
	// 这个注释表示方法的重写
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Stu) { // 表示判断传的参数是学生类
			Stu stu = (Stu) obj; // 强制转换
			if (this.sid == stu.getSid() && this.sname.equals(stu.getSname())) { // 自己的学号和姓名与传入的学号和姓名比较
				return true;
			}
		}
		return false;
	}

	// 重写hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1028;
	}

}
