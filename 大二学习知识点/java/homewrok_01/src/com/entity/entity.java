package com.entity;

public class entity {
	
	// 4、编写方法，传入一个整形无序数组，将数组变为有序数组
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
	
	// 5、编写方法，传入一个字符串数组，将其排序输出；
	public void str(String[] x){
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	// 6、编写方法，传入一个整形数组，将其奇数位的所有数字放在一个新的数组当中并返回
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
