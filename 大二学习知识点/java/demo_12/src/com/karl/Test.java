package com.karl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʲô���ࣿ  ��java��Ŀ�У�ȥ����һ��class�������ڴ���һ���ࣨ�����������ݾ�����
		//ʲô�Ƕ���  �������������������������ͣ��ͽ��������������ɴ�����������ģ�
		//����  int[] x=new int[5];
		//����  Pig pig=new Pig();
		Pig pig=new Pig();
		pig.pid=12;
		pig.pname="Ԭ����";  //�õ������������
		pig.type="�л���";
		pig.age=3;
		pig.sex="ĸ";
		pig.run();  //ͨ�������������������ܵķ���
		pig.jiao("Ԭ����");
		
//		String type = pig.getType();
//		System.out.println(type);
		
//		int n=pig.getAge(2);
//		System.out.println("n"+n);
		
//		int[] x={12,343,23,12,23,43};
//		int[] x1={12,543,233,122,23,43};
//		int max=pig.getMax(x1);
//		System.out.println(max);

	}

}
