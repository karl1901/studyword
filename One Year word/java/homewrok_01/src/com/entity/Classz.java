package com.entity;

import java.util.Arrays;

public class Classz {

	// 7����д�༶��

	// * 1���½�һ���༶�࣬�������ԣ��༶���ƣ�ѧ����������
	private String cname;
	private Stu[] student = new Stu[25];

	public Classz(String cname, Stu[] student) {
		this.cname = cname;
		this.student = student;
	}

	public Classz() {

	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Stu[] getStudent() {
		return student;
	}

	public void setStudent(Stu[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Classz [cname=" + cname + ", student="
				+ Arrays.toString(student) + "]";
	}

	// * 2����дһ���������������ѧ����Ϣ
	public void printStu() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				String str = student[i].toSting();
				System.out.println(str);
			}
		}
	}

	// * 3����дһ������add,��ѧ��������ӵ�����
	public void addStu(Stu stu) {
		int n = -1; // �����ж������Ƿ����˵����������ʾ��
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) { // ��ʾλ����û����
				student[i] = stu; // ��ѧ������������
				n = i;
				System.out.println("����ѧ��λ��:" + n);
				break;
			}
		}
		if (n == -1) {
			System.out.println("������~~");
		} else {
			System.out.println("��ӳɹ�!!");
		}
	}

	// * 4����д��ѯ�������������������鵱�в���ѧ��
	public void selStu(Stu stu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // ��ʾλ������ѧ�����Ż��������ƥ��
				if (stu.getName() == student[i].getName()
						&& stu.getSex() == (student[i].getSex())
						&& stu.getAge() == student[i].getAge()) { // �������������ţ����������е���Ϣ��ƥ��
					String s = student[i].toString();
					System.out.println(s);
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // û���ҵ���
			System.out.println("ѧ��������!!!");
		}
	}

	// * 5����дɾ���������������������鵱��ɾ��ѧ��
	public void delStu(Stu stu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // ��ʾλ������ѧ�����Ż��������ƥ��
				if (stu.getName() == student[i].getName()
						&& stu.getSex() == (student[i].getSex())
						&& stu.getAge() == student[i].getAge()) { // �������������ţ����������е���Ϣ��ƥ��
					String s = student[i].toString();
					student[i] = null;
					System.out.println("ɾ���ɹ�!");
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // û���ҵ���
			System.out.println("ѧ��������!!!");
		}
	}

	// * 6����д�޸ķ��������������޸��µ�����
	public void updateStu(Stu oldstu, Stu newStu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // ��ʾλ������ѧ�����Ż��������ƥ��
				if (oldstu.getName() == student[i].getName()
						&& oldstu.getSex() == (student[i].getSex())
						&& oldstu.getAge() == student[i].getAge()) { // �������������ţ����������е���Ϣ��ƥ��
					String s = student[i].toString();
					student[i].setName(newStu.getName());
					student[i].setSex(newStu.getSex());
					student[i].setAge(newStu.getAge());
					System.out.println("�޸ĳɹ�!");
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // û���ҵ���
			System.out.println("ѧ��������!!!");
		}
	}

	// * 7����д��ѯ��������ָ�������ڲ�ѯѧ������
	// 0-�������������ѧ��
	public void selqjStu(int age) {
		int n = -1;
		for (int i = 0; i < age; i++) {
			if (student[i] != null) { // ��ʾλ������ѧ�����Ż��������ƥ��
				String s = student[i].toString();
				System.out.println(s);
				n = i;
				break;
			}
		}
		if (n == -1) { // û���ҵ���
			System.out.println("ѧ��������!!!");
		}
	}

	// * 8����д�����࣬ ʵ����һ���༶�����25��ѧ�����༶��ѧ�����鵱��

}
