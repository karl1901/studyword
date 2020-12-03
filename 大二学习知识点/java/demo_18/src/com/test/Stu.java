package com.test;

public class Stu {

	private int sid;
	private String sname;

	public Stu() {

	}

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

	public Stu(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	// ��дequals����
	// Object�����Դ���������
	// instanceof���Ƚ���
	@Override
	// ���ע�ͱ�ʾ��������д
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Stu) { // ��ʾ�жϴ��Ĳ�����ѧ����
			Stu stu = (Stu) obj; // ǿ��ת��
			if (this.sid == stu.getSid() && this.sname.equals(stu.getSname())) { // �Լ���ѧ�ź������봫���ѧ�ź������Ƚ�
				return true;
			}
		}
		return false;
	}

	// ��дhashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1028;
	}

}
