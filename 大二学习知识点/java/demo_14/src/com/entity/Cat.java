package com.entity;

//猫类

public class Cat extends Pet {

	String sex;

	public Cat() {
		System.out.println("猫被实例化");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("猫在跑");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫在吃");
	}

}
