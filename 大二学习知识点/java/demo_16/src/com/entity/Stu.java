package com.entity;

// ʵ����(���ԣ�get\set����,���캯��,��ӡ������Ϣ)

public class Stu {

	private int sid; // ѧ��
	private String sname; // ����
	private String sex; // �Ա�
	private double score; // �ɼ�
	private int age; // ����

	// �޲ι��캯��
	public Stu() {

	}

	// �вι��캯��
	public Stu(int sid, String sname, String sex, double score, int age) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.score = score;
		this.age = age;
	}

	// get\set����
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// tostring����
	@Override
	public String toString() {
		return "Stu [age=" + age + ", score=" + score + ", sex=" + sex
				+ ", sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
