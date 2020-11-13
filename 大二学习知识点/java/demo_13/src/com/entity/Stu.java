package com.entity;

//学生类(属性和方法)
public class Stu {

	// 修饰符private:私有(让我们的属性只能本类调用)
	// public:公开(由他修饰的方法或属性，就能被整个项目调用)
	// 封装：私有化类的属性，公开其(属性)的get和set的方法，作用是用来保护类的属性
	private int sid;
	private String sname;
	private int age;

	public Stu() {

	}

	// 当创建一个类的时候，就会出现一个隐藏的方法(构造函数--没有参数的)
	public Stu(int sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
//		System.out.println("我被调用了");
	}

	// 快捷键：alt+shift+s
	public int getSid() { // 取值
		return sid;
	}

	public void setSid(int sid) { // 赋值
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//名字相同的方法，但是又能出现在同一个类里面的形式叫做方法的重载
	//重载的特点：同一个类里面方法名以及修饰符和返回类型一致，但参数个数或类型不一致
	public void show() {
		
	}

	public void show(int a) {

	}
	
	//做加法运算的方法
	public void addSuan(int a,int b){
		System.out.println(a+b);
	}
	public void addSuan(int a,int b,int c){
		System.out.println(a+b+c);
	}

}
