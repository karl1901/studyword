/**
 * 
 */
package com.test;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.entity.Cat;
import com.entity.Dog;
import com.entity.Person;
import com.entity.Pet;
import com.serlet.StuDao;
import com.serlet.TerDao;

/**
 * @author 23712
 *
 */
public class Test {

	/**
	 * @param args
	 * 
	 * �˴������������
	 * int  double  long   short  char  byte  boolean  float
	 * ����   С������   ������   ������    �ַ�     �ֽ�      ��������    ������
	 * 
	 * �ж�
	 * if  swith
	 * 
	 * ѭ��
	 * while  do while  for(for,for each) 
	 * 
	 * ����
	 * ����ð��������ֵ(����̨)���±�
	 * 
	 * OOP��(�������ı��)
	 * �������ԭ�򣺷�װ���̳С���̬
	 * �̳У�����̳��ڸ��࣬�̳и����˽�л����Ի򷽷���(�Ż����룬�����ظ�����)
	 * 
	 * �ӿ���̳е�����
	 * ����̳и����ǵ��̳С�����ȥʵ�ֽӿڣ���ʵ��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * ����ϵͳ 
		 * ����(è�͹�)
		 * ��ʦ��è    ѧ������
		 * ���ӡ�ɾ�����޸���������ѯ��������ѯ����
		 * ��ʦ��ѧ���̳�������(���������䡢�Ա�)
		 * è�͹��̳��ڳ�����(�������Ա�Ʒ��)
		 * 
		 */
		
		StuDao sd = new StuDao();
		TerDao td = new TerDao();
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("��ӭ��ĵ�������ѡ����Ĳ�����1��ѧ��(����)  2����ʦ(��è) 3���˳�ϵͳ");
			int x = mys.nextInt();
			if (x == 1) {
				while (true) { // ѧ��ѡ������
					System.out.println("�������ѡ��1�����ӳ��ﹷ  2�����߳��ﹷ  3���޸ĳ��ﹷ����   4���鿴�����������Ϣ  5���鿴���г������Ϣ  6��������һ��");
					int y = mys.nextInt();
					if (y == 1) { // ���ӳ���
						Pet dog = new Dog(); // ��ʷ�滻ԭ��-���͵Ķ�̬
						System.out.println("�����빷���ǳƣ�");
						String name = mys.next();
						dog.setName(name); // �������޴��ι��캯�����̳в��˳�������вι��캯����ֻ���ø�ֵ����
						System.out.println("�����빷���Ա�");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("�����빷��Ʒ�֣�");
						String type = mys.next();
						dog.setType(type);
						int n = sd.addPet(dog);
						if (n == -1) {
							System.out.println("����ʧ��!");
						} else {
							System.out.println("���ӳɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 2) { // ���߳���
						Pet dog = new Dog();
						System.out.println("�����빷���ǳƣ�");
						String name = mys.next();
						dog.setName(name);
						System.out.println("�����빷���Ա�");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("�����빷��Ʒ�֣�");
						String type = mys.next();
						dog.setType(type);
						int n = sd.delPer(dog);
						if (n == -1) {
							System.out.println("ɾ��ʧ��!");
						} else {
							System.out.println("ɾ���ɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 3) { // �޸ĳ��ﹷ����
						Pet dog = new Dog();
						System.out.println("�����빷���ǳƣ�");
						String name = mys.next();
						dog.setName(name);
						System.out.println("�����빷���Ա�");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("�����빷��Ʒ�֣�");
						String type = mys.next();
						dog.setType(type);
						System.out.println("�������µ��ǳƣ�");
						String newname = mys.next();
						int n = sd.updatePet(dog, newname);
						if (n == -1) {
							System.out.println("�޸�ʧ��!");
						} else {
							System.out.println("�޸ĳɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 4) { // �鿴�������ﹷ��Ϣ
						System.out.println("��������Ҫ�鿴�����ǳƣ�");
						String name = mys.next();
						Pet dog = sd.getPet(name);
						if (dog != null) {
							System.out.println(dog.toString());
						} else {
							System.out.println("�˹�������!");
						}
					}
					if (y == 5) { // �鿴���г��ﹷ��Ϣ
						sd.getAll();
					}
					if (y == 6) {
						break;
					}

				}
			}
			if (x == 2) {
				while (true) { // ��ʦѡ����è
					System.out
							.println("�������ѡ��1�����ӳ���è  2�����߳���è  3���޸ĳ���è����   4���鿴�����������Ϣ  5���鿴���г������Ϣ  6��������һ��");
					int y = mys.nextInt();
					if (y == 1) { // ���ӳ���
						Pet car = new Cat();
						System.out.println("������è���ǳƣ�");
						String name = mys.next();
						car.setName(name);
						System.out.println("������è���Ա�");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("������è��Ʒ�֣�");
						String type = mys.next();
						car.setType(type);
						int n = td.addPet(car);
						if (n == -1) {
							System.out.println("����ʧ��!");
						} else {
							System.out.println("���ӳɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 2) { // ���߳���
						Pet car = new Cat();
						System.out.println("������è���ǳƣ�");
						String name = mys.next();
						car.setName(name);
						System.out.println("������è���Ա�");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("������è��Ʒ�֣�");
						String type = mys.next();
						car.setType(type);
						int n = td.delPer(car);
						if (n == -1) {
							System.out.println("ɾ��ʧ��!");
						} else {
							System.out.println("ɾ���ɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 3) { // �޸ĳ�è������
						Pet car = new Cat();
						System.out.println("������è���ǳƣ�");
						String name = mys.next();
						car.setName(name);
						System.out.println("������è���Ա�");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("������è��Ʒ�֣�");
						String type = mys.next();
						car.setType(type);
						System.out.println("�������µ��ǳƣ�");
						String newname = mys.next();
						int n = td.updatePet(car, newname);
						if (n == -1) {
							System.out.println("�޸�ʧ��!");
						} else {
							System.out.println("�޸ĳɹ�!" + "\nλ�ã�" + n);
						}
					}
					if (y == 4) { // �鿴��������è��Ϣ
						System.out.println("��������Ҫ�鿴è���ǳƣ�");
						String name = mys.next();
						Pet car = td.getPet(name);
						if (car != null) {
							System.out.println(car.toString());
						} else {
							System.out.println("��è������!");
						}
					}
					if (y == 5) { // �鿴���г��ﹷ��Ϣ
						sd.getAll();
					}
					if (y == 6) {
						break;
					}

				}
			}
			if (x == 3) { // �˳�ϵͳ
				System.out.println("�˳��ɹ�!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
