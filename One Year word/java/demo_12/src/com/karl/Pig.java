package com.karl;
//ʵ���ࣺ�������������Զ��Ǻ����ݿ����һ�µ�
//1���������    2�������Ϊ(����)--java�еķ���--html:function-����
public class Pig {
	
	//�������
	int pid;  //���
	String pname;
	String type;
	int age;
	String sex;
	
	//�����Ϊ(����)
	//���η�    ��������    ������    ������
	
	//������4�֣�
	
	//1��û�з������ͣ�Ҳû�в����ķ���
	public void run(){  //���ܵķ���
		System.out.println("����Ȧ����");
	}
	
	//2��û�з������ͣ������в����ķ���
	public void jiao(String name){  //name="Ԭ����"
		System.out.println(name+"������~~~~");
	}
	
	//3���з������ͣ�û�в����ķ���
	public String getType(){  //return�����Ƿ��������һ��,���ص���������Ҫһ��
		System.out.println("�з������͵ķ���");
		return "����";
	}
	
	//4���з������ͣ��в����ķ���
	public int getAge(int x){
		System.out.println("x"+x);
		int age=x;
		return age;
	}
	
	//5������߱����������ֵ�ķ���
	public int getMax(int[] x){
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if (max<x[i]) {
				max=x[i];
			}
		}
		return max;
	}
	

}
