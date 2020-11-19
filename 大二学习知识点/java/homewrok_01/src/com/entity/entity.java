package com.entity;

public class entity {

	// 4、编写方法，传入一个整形无序数组，将数组变为有序数组
	public void objcet(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					int t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	// 5、编写方法，传入一个字符串数组，将其排序输出；
	public void str(String[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[j].hashCode() > x[j + 1].hashCode()) {
					String t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		for (String a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	// 6、编写方法，传入一个整形数组，将其奇数位的所有数字放在一个新的数组当中并返回
	public int[] js(int[] x) {
		// 1、通过用户传入的数组的奇数位个数去判定新数组的长度
		int count = 0; // 奇数位个数
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				count++;
			}
		}
		// 2、创建一个新数组，长度由count决定
		int[] y = new int[count];
		// 3、把传过来的奇数位的元素依次给新数组y
		int t = 0; // 模拟新数组y的下标
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				y[t] = x[i];
				t++;
			}
		}
		return y;
	}

}