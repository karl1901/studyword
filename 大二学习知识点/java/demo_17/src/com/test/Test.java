/**
 * 
 */
package com.test;

import java.util.Scanner;

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

		int[] s = new int[3];
		Scanner mys = new Scanner(System.in);
		System.out.println("sys01");
		try {
			int x = mys.nextInt();
			System.out.println("sys02");
			int y = mys.nextInt();
			System.out.println("sys03");
			int z = mys.nextInt();
			System.out.println(x / y);
			System.out.println(s[z]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

		}

	}

}
