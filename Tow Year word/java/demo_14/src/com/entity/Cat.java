package com.entity;

//è��

public class Cat extends Pet {

	String sex;

	public Cat() {
		System.out.println("è��ʵ����");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è�ڳ�");
	}

}
