/**
 * 
 */
package com.test;

/**
 * @author 23712
 * 
 */
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ֵ���ͣ��˴������������ �����ջ�ռ��� �����ٶȿ�
		// Ӧ�����ͣ��ࡢ�ӿڡ�String������ ����ڶѿռ��� �����ٶ���
		// ==����������ֵ���ͱȽ�(�����ǱȽ����ݴ�ŵĵ�ַ)
		// equals���Ƚ��������ݵ�
		// int x = 11;
		// int y = 11;
		// String s1 = "aa";
		// String s2 = new String("aa");
		// System.out.println(s1.equals(s2));

		Stu stu1 = new Stu(1, "����");
		Stu stu2 = new Stu(1, "����");
		// String str="����";
		// System.out.println(stu1.equals(str));
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		System.out.println(Util.x);
		System.out.println(stu1.hashCode()==Util.y);
		
		// Integer��int�İ�����(��װ��)
		// Ĭ��ֵ��һ����int--0 Integer--null
		// int[] x=new int[5];
		// Integer[] y=new Integer[5];
		// System.out.println(x[0]+"-----"+y[0]);

		// int x=0;
		// Integer y=0;
		// String str="111";
		// int z=Integer.parseInt(str);
		// System.out.println(z);

		// hashCode--��ϣֵ
		// String a = "b";
		// System.out.println(a.hashCode());

	}

}
