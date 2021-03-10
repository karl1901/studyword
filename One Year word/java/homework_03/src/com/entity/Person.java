package com.entity;

// 人类

public class Person {
	
	String str;  // 全局变量(只要是这个类里面的都能调用)
	
	public void move(String str){ // 局部变量(只有自己的方法能用)
		// 如果全局变量和局部变量出现同名，不用this.，则全局变量str会采用就近原则，全局变量str就会调用局部变量str
		this.str=str;  
		System.out.println(str);
	}

}
