package com.dao;

import com.entity.Stu;

// �����ࣺһЩ���������ڰ���ѧ����������
// ��ɾ�Ĳ�

public class StuDao {

	// ��ѧ���ŵ�ѧ��������
	Stu[] x = new Stu[10];

	// ����ѧ��(�з��������в����ķ���)
	public int addStu(Stu stu) {
		boolean f = false; // �����ж��Ƿ�����ѧ��������
		int n = 0; // �����ж��Ƿ�����ѧ���ɹ�������
		// ����ѧ��ǰ��Ҫ�ж��������Ƿ��Ѿ����ڴ�ѧ��
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(stu)) { // �����ж�
					System.out.println("���ѧ���Ѵ���!");
					f = true;
					break;
				}
			}
		}

		if (f == false) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] == null) { // ���λ��û����
					x[i] = stu; // ��ѧ������������
					n = 1;
					break; // ��ֹѭ��
				}
			}
		}
		return n;
	}

	// ɾ��ѧ��
	public int delStu(Stu stu) {
		int n = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(stu)) {
					x[i] = null; // ��ѧ���Ƴ�
					n = 1;
					break;
				}
			}
		}
		return n;
	}

	// �޸�ѧ��
	public int updateStu(Stu oldstu, Stu newstu) {
		int n = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(oldstu)) {
					x[i] = newstu; // ��ѧ���Ƴ�
					n = 1;
					break;
				}
			}
		}
		return n;
	}

	// ��ѯ����ѧ����Ϣ
	public void getAll() {
		for (Stu i : x) {
			if (i != null) { // ���˲Ż��ӡ
				System.out.println(i.toString());
			}
		}
	}

}
