package com.serlet;

import com.entity.Pet;

// �ӿ�
// ���з�����û�з������

public interface IPerson {

	// ��Ʒ���(����)
	// ���ӵķ���
	public abstract int addPet(Pet pet);

	// ɾ���ķ���
	public abstract int delPer(Pet pet);

	// �޸ĳ������������
	public abstract int updatePet(Pet pet, String newname);

	// ���ҵ�������ķ���
	public abstract Pet getPet(String name);
	
	// ��ѯ���г�����Ϣ�ķ���
	public abstract void getAll();

}
