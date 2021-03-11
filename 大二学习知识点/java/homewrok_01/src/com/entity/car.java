package com.entity;

public class car {

	//封装：私有化类的属性，公开其get-赋值/set-取值的方法，作用：保护类的属性
	// 1、写一个汽车司机的类，类中有属性：姓名，性别，年龄，驾驶证号，汽车牌号。
	// private--私有化的修饰符，被他修饰的属性和方法，只能被他自己调用
	private String name;
	private String sex;
	private int age;
	private int jid;  //jnumber
	private int pid;  //carunmber

	// 类中有方法：
	// (一)设置姓名方法，设置性别方法，设置年龄方法，设置驾驶证号方法，设置汽车牌号的方法。
	// (二)得到姓名方法，得到性别方法，得到年龄方法，得到驾驶证号方法，得到汽车牌号的方法。以及显示所有数据的方法（toString）。

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "car [age=" + age + ", jid=" + jid + ", name=" + name + ", pid="
				+ pid + ", sex=" + sex + "]";
	}

	// (三)司机开车的方法，显示“某某司机正在开某某牌号的车”。司机停车的方法，显示“某某司机把某某牌号的车停了下来”。
	// this--类本身
	public void dary(){
		System.out.println(this.name+"司机正在开"+this.pid+"车牌号的车");
	}
	public void stop(){
		System.out.println(this.name+"司机把"+this.pid+"牌号的车停了下来");
	}

	// (四)检查此司机是否是某某姓名的方法，要求传入一个司机的姓名，检查这个姓名是否是此司机的姓名，要求返回一个true或false。
	public boolean jcName(String name){
		boolean f=false;
		if(name.equals(this.name)){
			f=true;
		}
			return f;
	}

	// 检查此司机是否是某某汽车牌号的方法，要求传入一个车牌号，检查这个牌号是否是此司机的汽车牌号，要求返回一个true或false。
	public boolean jcPid(int pid){
		boolean f=false;
		if(pid==this.pid){
			f=true;
		}
			return f;
	}
		
	


}
