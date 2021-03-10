package com.entity;

// 猫类
// 每个类都有一个隐藏了的无参构造函数
// Object类：所有类的祖宗---无参的构造函数，每个都会直接或间接去继承它
// abstract：抽象

public abstract class Pet { // 抽象类：不能被实例化,作用：保护这个父类

	String name;
	int health;
	int love;
	private double money;

	public Pet() {
		System.out.println("宠物被实例化");
	}

	public void run() {
		System.out.println("跑");
	}

	public void getPet(Pet p) {
		p.run();
	}

	// 抽象方法：没有方法体---设计者，只能出现在抽象类里面
	public abstract void eat();

}
