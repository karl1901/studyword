package com.entity;

//ѧ����(���Ժͷ���)
public class Stu {

	// ���η�private:˽��(�����ǵ�����ֻ�ܱ������)
	// public:����(�������εķ��������ԣ����ܱ�������Ŀ����)
	// ��װ��˽�л�������ԣ�������(����)��get��set�ķ��������������������������
	private int sid;
	private String sname;
	private int age;

	public Stu() {

	}

	// ������һ�����ʱ�򣬾ͻ����һ�����صķ���(���캯��--û�в�����)
	public Stu(int sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
//		System.out.println("�ұ�������");
	}

	// ��ݼ���alt+shift+s
	public int getSid() { // ȡֵ
		return sid;
	}

	public void setSid(int sid) { // ��ֵ
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//������ͬ�ķ������������ܳ�����ͬһ�����������ʽ��������������
	//���ص��ص㣺ͬһ�������淽�����Լ����η��ͷ�������һ�£����������������Ͳ�һ��
	public void show() {
		
	}

	public void show(int a) {

	}
	
	//���ӷ�����ķ���
	public void addSuan(int a,int b){
		System.out.println(a+b);
	}
	public void addSuan(int a,int b,int c){
		System.out.println(a+b+c);
	}

}
