package com.entity;

// 狗类

// extends--继承  (除了私有化的属性和方法，都能被继承，作用：优化代码)
// this--本类(自己)  
// super--父类
public class Dog extends Pet {

	String type;

	public Dog() {
		System.out.println("狗被实例化");
	}

	public void wanDog() {
		System.out.println("玩飞碟");
		super.run();
	}

	// 方法的重写：出现在子类中，修饰符、返回类型、方法名、参数个数、参数类型都要一致
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("狗在跑");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗在吃");
	}

}
