package com.entity;

public class entity {
	
	// 4����д����������һ�������������飬�������Ϊ��������
	public void objcet(int[] x) {
		for (int i = 0; i < x.length; i++) {
		    if (i>0) {
				if (x[i-1]>x[i]) {
					int j=x[i-1];
					x[i-1]=x[i];
					x[i]=j;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	// 5����д����������һ���ַ������飬�������������
	public void str(String[] x){
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	// 6����д����������һ���������飬��������λ���������ַ���һ���µ����鵱�в�����
	public int[] js(int[] x){
		int[] y=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2!=0) {
				y[i]=x[i];
			}
		}
		for (int i = 0; i < y.length; i++) {
			if (y[i]!=0) {
				System.out.print(y[i]+" ");
			}
		}
		return y;
	}


}
