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
	public abstract int addStu(Stu stu);
	
	public abstract int delStu(int sid);
	
	public abstract int updateStu(int sid,Stu stu);
	
	public abstract Stu selStu(int sid);
	
	public abstract void getAll();

}
