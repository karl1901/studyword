package com.dao;

import com.entity.Stu;

// �̳�ֻ�ܵ��̳У��ӿ��ܶ�ʵ��
// interface���ӿ�---��һ������ĳ�����:����ߡ����ã��Է������ݵı���

public interface IStu {
	
	// ��������Ҫ�г�ʼ����ֵ
	final static String str="�Ǻ�";  // �ӿ��������еı�����ǿ�Ʊ�ɳ���
	// �ӿ���������з�������Ĭ��Ϊ���󷽷���ֻ���ǳ��󷽷�
	public void get();
	
	// ѧ������ɾ�Ĳ�
	public abstract void addStu(Stu stu);
	
	public abstract void delStu(int sid);
	
	public abstract void updateStu(int sid,Stu stu);
	
	public abstract void selStu(int sid);

}
