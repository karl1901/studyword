package com.entity;

public class Pet {
	// ���ԣ��ǳơ����ܶȡ�����ֵ��
	String name;
	double love;
	double lv;

	public Pet() {

	}

	public Pet(String name, double love, double lv) {
		this.name = name;
		this.love = love;
		this.lv = lv;
	}

	// ��Ϊ:����(�ܡ���)
	public void run() {
		System.out.println("��");
	}

	public void jiao() {
		System.out.println("��");
	}

}