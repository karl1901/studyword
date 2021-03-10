package com.entity;

// 学生的实体类

/*
 * 属性、构造函数、get/set方法、打印的方法
 * 属性：根据数据库的表结构而来(学号、姓名、性别、年龄、入学时间、毕业时间)
 * 构造函数：每个类都直接或间接的继承于Objct类，因为它类里面有一个无参的构造函数，所以其他的类会继承这个构造函数
 *        构造函数是用于创建对象的
 * this--自己(本类)     this()--调用自己的构造函数
 * super--父类(超类)    super()--调用父类的构造函数
 * 
 */

public class Stu {
	
	// 私有化属性(只能自己调用)
	private int sid;
	private String sname;
	private String sex;
	private int age;
	private String rtime;
	private String btime;
	
	// 无参构造函数
	public Stu() {

	}
	
	// 带参构造函数
	public Stu(int sid, String sname, String sex, int age, String rtime,
			String btime) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.rtime = rtime;
		this.btime = btime;
	}

	// get/set方法--取值/赋值
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	// toString方法
	@Override
	public String toString() {
		return "Stu [age=" + age + ", btime=" + btime + ", rtime=" + rtime
				+ ", sex=" + sex + ", sid=" + sid + ", sname=" + sname + "]";
	}

	// 重写equals方法
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean f = false; // 用来做判断依据
		// 判断传进去的参数是什么类型
		if (obj instanceof Stu) { // 判断是否是学生
			Stu stu = (Stu) obj;
			// 进行学生的属性比较
			if (this.sid == stu.getSid() && this.sname.equals(stu.getSname())
					&& this.rtime == stu.getRtime()) {
				f = true;
			}
		}

		return f;
	}
	
	
	

}
