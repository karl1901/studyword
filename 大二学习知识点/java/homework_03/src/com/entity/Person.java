package com.entity;

// ����

public class Person {
	
	String str;  // ȫ�ֱ���(ֻҪ�����������Ķ��ܵ���)
	
	public void move(String str){ // �ֲ�����(ֻ���Լ��ķ�������)
		// ���ȫ�ֱ����;ֲ���������ͬ��������this.����ȫ�ֱ���str����þͽ�ԭ��ȫ�ֱ���str�ͻ���þֲ�����str
		this.str=str;  
		System.out.println(str);
	}

}
