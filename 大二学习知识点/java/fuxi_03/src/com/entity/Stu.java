package com.entity;

// ѧ����ʵ����

/*
 * ���ԡ����캯����get/set��������ӡ�ķ���
 * ���ԣ��������ݿ�ı�ṹ����(ѧ�š��������Ա����䡢��ѧʱ�䡢��ҵʱ��)
 * ���캯����ÿ���඼ֱ�ӻ��ӵļ̳���Objct�࣬��Ϊ����������һ���޲εĹ��캯�����������������̳�������캯��
 *        ���캯�������ڴ��������
 * this--�Լ�(����)     this()--�����Լ��Ĺ��캯��
 * super--����(����)    super()--���ø���Ĺ��캯��
 * 
 */

public class Stu {
	
	// ˽�л�����(ֻ���Լ�����)
	private int sid;
	private String sname;
	private String sex;
	private int age;
	private String rtime;
	private String btime;
	
	// �޲ι��캯��
	public Stu() {

	}
	
	// ���ι��캯��
	public Stu(int sid, String sname, String sex, int age, String rtime,
			String btime) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.rtime = rtime;
		this.btime = btime;
	}

	// get/set����--ȡֵ/��ֵ
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

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	// toString����
	@Override
	public String toString() {
		return "Stu [age=" + age + ", btime=" + btime + ", rtime=" + rtime
				+ ", sex=" + sex + ", sid=" + sid + ", sname=" + sname + "]";
	}

	// ��дequals����
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean f = false; // �������ж�����
		// �жϴ���ȥ�Ĳ�����ʲô����
		if (obj instanceof Stu) { // �ж��Ƿ���ѧ��
			Stu stu = (Stu) obj;
			// ����ѧ�������ԱȽ�
			if (this.sid == stu.getSid() && this.sname.equals(stu.getSname())
					&& this.rtime == stu.getRtime()) {
				f = true;
			}
		}

		return f;
	}
	
	
	

}
