package com.karl;

public class Dog {

	// 1��дһ�������࣬���������ԣ��������Ա�Ʒ�֡�
	String dname;
	String sex;
	String type;

	// �����з�����
	// ��һ���޷��أ��޲����ķ�����
	// ���ܲ��ķ�����Ҫ�������ĳĳƷ�ֵĹ��ܵúÿ족��
	public void run() {
		System.out.println("ĳĳƷ�ֵĹ��ܵĺÿ�");
	}

	// ������ķ�����Ҫ�������ĳĳ�����Ĺ������ˡ���
	public void growup() {
		System.out.println("ĳĳ�����Ĺ�������");
	}

	// �������з��أ��޲����ķ�����
	// �õ���������������Ҫ�󷵻ص�ǰ����������
	public String getDname() {
		return dname;
	}

	// �õ������Ա�ķ�����Ҫ�󷵻ص�ǰ�����Ա�
	public String getSex() {
		return sex;
	}

	// �õ�����Ʒ�ֵķ�����Ҫ�󷵻ص�ǰ����Ʒ�֡�
	public String getType() {
		return type;
	}

	// ���ص�ǰ������Ϣ�ķ�������toString()������
	@Override
	public String toString() {
		return super.toString();
	}

	// �������޷��أ��в����ķ�����
	// ���õ�ǰ���������ķ�����Ҫ���빷�����������޸ĵ�ǰ������
	public void newname(String dname) {
		System.out.println(dname);
	}

	// ���õ�ǰ�����Ա�ķ�����Ҫ���빷�����Ա��޸ĵ�ǰ�Ա�
	public void newsex(String sex) {
		System.out.println(sex);
	}

	// ���õ�ǰ����Ʒ�ֵķ�����Ҫ���빷����Ʒ�֣��޸ĵ�ǰƷ�֡�
	public void newtype(String type) {
		System.out.println(type);
	}

}
