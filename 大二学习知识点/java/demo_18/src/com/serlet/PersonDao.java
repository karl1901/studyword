package com.serlet;

import com.entity.Pet;

// ʵ����
// ʵ�ֽӿڵķ���

public class PersonDao implements IPerson {

	Pet[] pets = new Pet[5]; // �����ȫ�ֱ���

	// ����ʱ�������ظ�����
	@Override
	public int addPet(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1; // �ֲ�����(ֻ���Լ������������)
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) { // ���λ��������
				if (pets[i].equals(pet)) {
					System.out.println("�����Ѵ���!!!");
					break;
				}
			}
			// ��ʼ���ӳ���(��������)
			if (pets[i] == null) {
				pets[i] = pet;
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
		for (int i = 0; i < pets.length; i++) {
			// �����������ҵ���Ӧ�Ķ���
			if (pets[i] != null) {
				if (pets[i].equals(pet)) {
					// ɾ��
					pets[i] = null;
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
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				System.out.println(pets[i].toString());
			}
		}
	}

	@Override
	public Pet getPet(String name) {
		// TODO Auto-generated method stub
		Pet pet = null;
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				if (pets[i].getName().equals(name)) {
					pet = pets[i];
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
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				if (pets[i].equals(pet)) {
					pets[i].setName(newname);
					n = i;
					break;
				}
			}
		}
		return n;
	}

}
