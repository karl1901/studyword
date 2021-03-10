package com.entity;

public class Stu extends People {

	int sid;
	// ѧ���൱�ж��幷�Ķ�������
	Dog[] dogs = new Dog[5];

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("ѧ��˵");
	}

	public void run() {
		System.out.println("ѧ����");
	}

	// ���ӳ��ɾ������޸ĳ������֡��޸ĳ��｡��ֵ����
	// ���������������ڶ��ٵĽ���ֵ���Ӷ��ٽ���ֵ�������ҳ���Ĺ��ܣ�
	// �����巽�������г��ﶼ��ʾ����ӡ

	// ���ӳ���(�������鵱��)
	public void addPet(Dog p) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				dogs[i] = p;
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
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					dogs[i] = null;
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
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(oldname)) {
					dogs[i].name = newname;
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
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					dogs[i].lv = a;
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
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("���޴˹���");
		} else {
			System.out.println(dogs[n].toString());
		}
	}

	// ���г��ﶼ��ʾ����ӡ
	public void selAll() {
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				System.out.println(dogs[i].toString());
			}
		}
	}

	// ɾ����������λ�ĳ��﷽��
	public void delPet() {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (i % 2 != 0) {
					dogs[i] = null;
					n = i;
				}
			}
		}
		if (n == -1) {
			System.out.println("ɾ��ʧ�ܣ�");
		} else {
			System.out.println("ɾ���ɹ���");
		}
	}

}