package com.entity;

// è��
// ÿ���඼��һ�������˵��޲ι��캯��
// Object�ࣺ�����������---�޲εĹ��캯����ÿ������ֱ�ӻ���ȥ�̳���
// abstract������

public abstract class Pet { // �����ࣺ���ܱ�ʵ����,���ã������������

	String name;
	int health;
	int love;
	private double money;

	public Pet() {
		System.out.println("���ﱻʵ����");
	}

	public void run() {
		System.out.println("��");
	}

	public void getPet(Pet p) {
		p.run();
	}

	// ���󷽷���û�з�����---����ߣ�ֻ�ܳ����ڳ���������
	public abstract void eat();

}
