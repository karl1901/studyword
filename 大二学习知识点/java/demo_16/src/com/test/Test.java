package com.test;

import java.util.Scanner;

import com.dao.IStu;
import com.dao.Studao;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 *            com.dao:�Žӿں�ʵ���� com.entity:��ʵ����(�������ݿ�ı�) com.uitl:������
	 *            com.ui:����� com.test:���԰�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStu is = new Studao();

		// ѧ���Ĺ���ϵͳ
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out
					.println("���������ѡ��1���鿴����ѧ����Ϣ  2������ѧ��  3��ɾ��ѧ��   4�� �޸�ѧ��   5���鿴����ѧ��   6���˳�ϵͳ");
			int x = mys.nextInt();
			if (x == 1) { // �鿴����ѧ����Ϣ
				is.getAll();
			}
			if (x == 2) { // ����ѧ��
				System.out.println("������ѧ����ѧ�ţ�");
				int sid = mys.nextInt();
				System.out.println("������ѧ����������");
				String sname = mys.next();
				System.out.println("������ѧ�����Ա�");
				String sex = mys.next();
				System.out.println("������ѧ���ĳɼ���");
				double score = mys.nextDouble();
				System.out.println("������ѧ�������䣺");
				int age = mys.nextInt();
				Stu stu = new Stu(sid, sname, sex, score, age);
				int n = is.addStu(stu);
				if (n == -1) {
					System.out.println("����ʧ��!");
				} else {
					System.out.println("���ӳɹ�!");
				}
			}
			if (x == 3) { // ɾ��ѧ��
				System.out.println("������Ҫɾ��ѧ����ѧ�ţ�");
				int sid = mys.nextInt();
				int n = is.delStu(sid);
				if (n == -1) {
					System.out.println("ɾ��ʧ��!");
				} else {
					System.out.println("ɾ���ɹ�!");
				}
			}
			if (x == 4) { // �޸�ѧ��
				System.out.println("������Ҫ�޸�ѧ����ѧ�ţ�");
				int sid = mys.nextInt();
				System.out.println("��������ѧ����ѧ�ţ�");
				int newsid = mys.nextInt();
				System.out.println("��������ѧ����������");
				String sname = mys.next();
				System.out.println("��������ѧ�����Ա�");
				String sex = mys.next();
				System.out.println("��������ѧ���ĳɼ���");
				double score = mys.nextDouble();
				System.out.println("��������ѧ�������䣺");
				int age = mys.nextInt();
				Stu stu = new Stu(newsid, sname, sex, score, age);
				int n = is.updateStu(sid, stu);
				if (n == -1) {
					System.out.println("�޸�ʧ��!");
				} else {
					System.out.println("�޸ĳɹ�!");
				}
			}
			if (x == 5) { // �鿴����ѧ��
				System.out.println("��������Ҫ�鿴ѧ����ѧ�ţ�");
				int sid = mys.nextInt();
				Stu stu = is.selStu(sid);
				if (stu == null) {
					System.out.println("���޴���!");
				} else {
					System.out.println(stu.toString());
				}
			}
			if (x == 6) { // �˳�ϵͳ
				System.out.println("��лʹ��!");
				break;
			}
		}

	}

}
