package com.entity;

// ����

// extends--�̳�  (����˽�л������Ժͷ��������ܱ��̳У����ã��Ż�����)
// this--����(�Լ�)  
// super--����
public class Dog extends Pet {

	String type;

	public Dog() {
		System.out.println("����ʵ����");
	}

	public void wanDog() {
		System.out.println("��ɵ�");
		super.run();
	}

	// ��������д�������������У����η����������͡��������������������������Ͷ�Ҫһ��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ڳ�");
	}

}
