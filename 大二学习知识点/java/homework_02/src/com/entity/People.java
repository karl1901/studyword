package com.entity;

public abstract class People {
	// �������Ա����䡢��ϵ�绰����ַ
	String pname;
	String sex;
	int age;
	String tel;
	String address;

	// �߱�����˵�������󷽷�--û�з����壩���Է�
	public abstract void say();

	public void eat() {
		System.out.println("�Է�");
	}

}