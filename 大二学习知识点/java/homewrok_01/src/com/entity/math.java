package com.entity;

public class math {
	
	
	// 2��дһ����ѧ�ҵ��࣬�����з�����
	
	// (һ)�����������������бȽϣ������������е����ֵ�ķ�����
	public int max(int x,int y) {
		// ��Ԫ�����  �Ƚ������? a:b
		int a=x>y?x:y;
		return a;
	}
	
	// (��)��������double�͵����ݣ����бȽϣ������������е���Сֵ�ķ�����
	public double min(double a,double b,double c){
		double x=a<b?(a<c?a:c):(b<c?b:c);
		return x;
	}
	
	// (��)����һ��������������������ĸ�λ���Ǽ��ķ�����
	public int  zs(int x){
		int a=x%10;
		return a;
		
	}
	
	// (��)����һ��������������������������ķ�����
	public int jf(int x){
		int a=x*x*x;
		return a;
	}
	
	// (��)����һ���������������1�ӵ��������ĺ��Ƕ��ٵķ�������������һ��5��ô�ͼ���1+2+3+4+5=15����󷵻�15��
	public int one(int x) {
		int sum = 0;
		if (x>0) {
			for (int i = 1; i <= x; i++) {
				sum += i;
			}
		}else {
			System.out.println("������һ��������!!!");
		}
		return sum;
	}
	
	// (��)����һ�����ε����飬����������������е���������֮�͵ķ�����(����)
	// ���أ���ͬһ�����У����ַ����������η�����������һ�£����������������Ͳ�һ�µķ�����Ϊ����
	// �ô����������з������ĸ���
	public int one(int[] x){
		int a=0;
		for (int i = 0; i < x.length; i++) {
			a+=x[i];
		}
		return a;
	}
	
	// (��)����һ�����ε����飬����������������е����ֵ�ķ�����
	public int szmax(int[] x) {
		int a=x[0];
		for (int i = 0; i < x.length; i++) {
			if (a<x[i]) {
				a=x[i];
			}
		}
		return a;
	}

}
