package com.entity;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Stu {

	// 3����ս�⣩дһ��ѧ�����࣬���������ԣ��������Ա� �����䡣�з�����toString��
	private String name;
	private String sex;
	private int age;

	public Stu(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}


	public Stu() {
		
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String toSting() {
		return "������" + name + "  �Ա�" + sex + "  ���䣺" + age;
	}

	// дһ�������࣬����һ��ѧ����һά���飬����Ϊ5��Ҫ��ѭ������5��ѧ����������Ϣ�������ѭ���������ѧ������Ϣ��
	
	
}
