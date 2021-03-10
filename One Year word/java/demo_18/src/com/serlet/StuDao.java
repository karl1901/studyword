package com.serlet;

import com.entity.Dog;
import com.entity.Pet;

public class StuDao implements IPerson {

	Pet[] dogs = new Dog[5];

	@Override
	public int addPet(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1; // �ֲ�����(ֻ���Լ������������)
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) { // ���λ��������
				if (dogs[i].equals(pet)) {
					System.out.println("�����Ѵ���!!!");
					break;
				}
			}
			// ��ʼ���ӳ���(��������)
			if (dogs[i] == null) {
				dogs[i] = pet;
				n = i; // ���������ڵ�λ���±��n
				break;
			}
		}
		return n;
	}

	@Override
	public int delPer(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			// �����������ҵ���Ӧ�Ķ���
			if (dogs[i] != null) {
				if (dogs[i].equals(pet)) {
					// ɾ��
					dogs[i] = null;
					n = i;
					break;
				}
			}
		}
		return n;
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				System.out.println(dogs[i].toString());
			}
		}
	}

	@Override
	public Pet getPet(String name) {
		// TODO Auto-generated method stub
		Pet pet = null;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].getName().equals(name)) {
					pet = dogs[i];
					break;
				}
			}
		}
		return pet;
	}

	@Override
	public int updatePet(Pet pet, String newname) {
		// TODO Auto-generated method stub
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].equals(pet)) {
					dogs[i].setName(newname);
					n = i;
					break;
				}
			}
		}
		return n;
	}

}
