package com.karl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.dname="С��";
		dog.sex="��";
		dog.type="��������";
        //дһ�������࣬Ҫ����������һֻ����ʹ�����÷�����������������ֵ,�ٵ��ù��ܲ��ķ��������ù�����ķ�����
		dog.run();
		dog.growup();
		//�ٵ��õõ��������ķ��������շ��أ���������ص����������ʹ�����������ֻ����������Ϣ�����
		String dname=dog.getDname();
		System.out.println(dname);
		String sex=dog.getSex();
		System.out.println(sex);
		String type=dog.getType();
		System.out.println(type);
		String str=dog.toString();
		System.out.println(str);
		
		dog.newname("С��");
		dog.newsex("ĸ");
		dog.newtype("��԰Ȯ");

	}

}
