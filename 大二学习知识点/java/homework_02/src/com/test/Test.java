package com.test;

import com.entity.Dog;
import com.entity.Pet;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5����д�����࣬�ֱ�ʵ����һ����ʦ��ѧ�������Խ������Ķ����������
		// ��ϣ��ٵ���ɾ������ ɾ�������±�Ϊ����λ�ĳ���
		Stu stu = new Stu();
		for (int i = 0; i < 5; i++) { // ѭ����������(��)
			Pet dog = new Dog("С��" + i, 11, 12);
			stu.addPet((Dog) dog); // ���ӹ���������
		}
		stu.selAll(); // ��ӡ���й��ķ���
		stu.delPet(); // ����ɾ����������λ�ĳ��﷽��
		stu.selAll();

	}

}
