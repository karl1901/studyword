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

		// 数据类型
		// int x=12;
		// 数组(存放多个类型集合,内容是多个,内容要和声明的数据类型保持一致)
		// 下标：         0   1   2  (从0开始，依次递增,下标不存在有'负数')
		// int[] x = { 12, 34, 56 };
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }
		// String[] strings = new String[5];
		// strings[0] = "嘻嘻";
		// for (int i = 0; i < strings.length; i++) {
		// if (strings[i] == null) {
		// strings[i] = "阿飞";
		// }
		// System.out.println(strings[i]);
		// }
		String[] string = { null, "李白", null, "杜甫" };
		// 在数组中找到名字叫张三的人
		for (int i = 0; i < string.length; i++) {
			if (string[i] != null) {  // 这个位置有人
				if (string[i].equals("张三")) {  // 判断是否与找的人名一样
					string[i] = "曹操";
				}
			}
			System.out.println(string[i]);
		}
		
		

	}

}
