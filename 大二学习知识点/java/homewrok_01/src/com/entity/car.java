package com.entity;

public class car {

	//��װ��˽�л�������ԣ�������get-��ֵ/set-ȡֵ�ķ��������ã������������
	// 1��дһ������˾�����࣬���������ԣ��������Ա����䣬��ʻ֤�ţ������ƺš�
	// private--˽�л������η����������ε����Ժͷ�����ֻ�ܱ����Լ�����
	private String name;
	private String sex;
	private int age;
	private int jid;  //jnumber
	private int pid;  //carunmber

	// �����з�����
	// (һ)�������������������Ա𷽷����������䷽�������ü�ʻ֤�ŷ��������������ƺŵķ�����
	// (��)�õ������������õ��Ա𷽷����õ����䷽�����õ���ʻ֤�ŷ������õ������ƺŵķ������Լ���ʾ�������ݵķ�����toString����

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

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "car [age=" + age + ", jid=" + jid + ", name=" + name + ", pid="
				+ pid + ", sex=" + sex + "]";
	}

	// (��)˾�������ķ�������ʾ��ĳĳ˾�����ڿ�ĳĳ�ƺŵĳ�����˾��ͣ���ķ�������ʾ��ĳĳ˾����ĳĳ�ƺŵĳ�ͣ����������
	// this--�౾��
	public void dary(){
		System.out.println(this.name+"˾�����ڿ�"+this.pid+"���ƺŵĳ�");
	}
	public void stop(){
		System.out.println(this.name+"˾����"+this.pid+"�ƺŵĳ�ͣ������");
	}

	// (��)����˾���Ƿ���ĳĳ�����ķ�����Ҫ����һ��˾���������������������Ƿ��Ǵ�˾����������Ҫ�󷵻�һ��true��false��
	public boolean jcName(String name){
		boolean f=false;
		if(name.equals(this.name)){
			f=true;
		}
			return f;
	}

	// ����˾���Ƿ���ĳĳ�����ƺŵķ�����Ҫ����һ�����ƺţ��������ƺ��Ƿ��Ǵ�˾���������ƺţ�Ҫ�󷵻�һ��true��false��
	public boolean jcPid(int pid){
		boolean f=false;
		if(pid==this.pid){
			f=true;
		}
			return f;
	}
		
	


}
