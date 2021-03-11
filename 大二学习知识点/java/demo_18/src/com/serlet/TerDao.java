package com.serlet;

import com.entity.Cat;
import com.entity.Pet;

public class TerDao implements IPerson {

	Pet[] cats = new Cat[5];

	@Override
	public int addPet(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1; // �ֲ�����(ֻ���Լ������������)
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) { // ���λ��������
				if (cats[i].equals(pet)) {
					System.out.println("�����Ѵ���!!!");
					break;
				}
			}
			// ��ʼ���ӳ���(��������)
			if (cats[i] == null) {
				cats[i] = pet;
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
		for (int i = 0; i < cats.length; i++) {
			// �����������ҵ���Ӧ�Ķ���
			if (cats[i] != null) {
				if (cats[i].equals(pet)) {
					// ɾ��
					cats[i] = null;
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				System.out.println(cats[i].toString());
			}
		}
	}

	@Override
	public Pet getPet(String name) {
		// TODO Auto-generated method stub
		Pet pet = null;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].getName().equals(name)) {
					pet = cats[i];
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].equals(pet)) {
					cats[i].setName(newname);
					n = i;
					break;
				}
			}
		}
		return n;
	}

}
