package com.entity;

// ѧ����(ѧ������)--�Զ�������
// ʵ���ࣺ���Ը��ݱ�����ݴ�����
// ��װ

public class Stu {

	// ˽�л�����
	private int sid;
	private String sname;
	private String sex;
	private int age;
	private int cid;
	private int son;

	// ���캯�������ⷽ��-û�з������ͣ����ã��������󱻵��ã�
	public Stu() {

	}

	public Stu(int sid, String sname, String sex, int age, int cid, int son) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.cid = cid;
		this.son = son;
	}

	// ������������ֵ��ȡֵ��
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSon() {
		return son;
	}

	public void setSon(int son) {
		this.son = son;
	}

	@Override
	public String toString() {
		return "Stu [age=" + age + ", cid=" + cid + ", sex=" + sex + ", sid="
				+ sid + ", sname=" + sname + ", son=" + son + "]";
	}

}
