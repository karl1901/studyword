package com.test;

// ������

import com.entity.Caise;
import com.entity.Dayinji;
import com.entity.Dog;
import com.entity.Heibai;
import com.entity.Person;
import com.entity.Pet;
import com.entity.Qq;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��̬֪ʶ��

		// Person per=new Person();
		// // ��������
		 Pet dog=new Dog(); // ��ʽ�滻
		 if (dog instanceof Dog) {  // �ж϶���(�ж�dog�ǲ��ǹ�)
			Dog d=(Dog)dog;
			d.eat();
		}
		 Pet qq=new Qq();
		 if (qq instanceof Qq) {
			Qq q=(Qq)qq;
			q.eat();
		}
		// // ���ø����￴���ķ���
		// per.getPet(qq);

		// ���Դ�ӡ��
		// Dayinji hb = new Heibai();
		// Dayinji cs = new Caise();
		// hb.dayin();
		// cs.dayin();
		
		

	}

}
