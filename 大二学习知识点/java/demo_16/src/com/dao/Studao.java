package com.dao;

// ʵ�ַ�������

import java.util.Arrays;

import com.entity.Stu;

// implements��ʵ��

public class Studao implements IStu, Iperson {

	// ѧ������    Ĭ��ֵ��null
	private Stu[] stus = new Stu[5];

	// ����ѧ��
	@Override
	public int addStu(Stu stu) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]==null){  // ��ʾû����
				stus[i]=stu;
				n=i;  // �Ѽ��˵��±��n
				break;
			}
		}
		return n;
	}

	// ɾ��ѧ��
	@Override
	public int delStu(int sid) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {  // ��ʾ����
				if (stus[i].getSid()==sid) {
					stus[i]=null;
					n=i;
					break;
				}
			}
		}
		return n;
	}
	
	// ���ҵ���ѧ��
	@Override
	public Stu selStu(int sid) {
		// TODO Auto-generated method stub
		Stu stu=null;  // ������һ��ѧ������û��ֵ
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				if (stus[i].getSid()==sid) {
					stu=stus[i];  // ���ҵ���ѧ����ֵ��stu����󷵻�stu
					break;
				}
			}
		}
		return stu;
	}

	// �޸�ѧ��
	@Override
	public int updateStu(int sid, Stu stu) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				if (stus[i].getSid()==sid) {
					stus[i]=stu;  // �Ѵ����ѧ��stu��Ϣ�����������ѧ��stus[i]
					n=i;
					break;
				}
			}
		}
		return n;
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				String str=stus[i].toString();
				System.out.println(str);
			}
		}
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
