package com.entity;

public class Teachers extends People {

	int tid;
	// ��ʦ�൱�ж���è�Ķ�������
	Cat[] cats = new Cat[5];

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ˵");
	}

	public void look() {
		System.out.println("����");
	}

	// ���ӳ���(è�����鵱��)
	public void addPet(Cat p) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] == null) {
				cats[i] = p;
				n = i;
				break; // ��ֹѭ��
			}
		}
		if (n == -1) {
			System.out.println("����ʧ�ܣ�");
		} else {
			System.out.println("���ӳɹ���");
		}
	}

	// ɾ������(ͨ������ɾ��)
	public void delPet(String str) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					cats[i] = null;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("ɾ��ʧ�ܣ�");
		} else {
			System.out.println("ɾ���ɹ���");
		}
	}

	// �޸ĳ�������(ͨ��������ȥ��,�ҵ��Ժ����������)
	public void updatePet(String oldname, String newname) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(oldname)) {
					cats[i].name = newname;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("�޸�ʧ�ܣ�");
		} else {
			System.out.println("�޸ĳɹ���");
		}
	}

	// �޸ĳ��｡��ֵ����(ͨ������)
	public void updatePet(String str, double a) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					cats[i].lv = a;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("�޸�ʧ�ܣ�");
		} else {
			System.out.println("�޸ĳɹ���");
		}
	}

	// ���ҳ���Ĺ���(ͨ������)
	public void selPet(String str) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("���޴�è��");
		} else {
			System.out.println(cats[n].toString());
		}
	}

	public void selAll() {
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				System.out.println(cats[i].toString());
			}
		}
	}

}