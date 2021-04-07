package com.test;

import java.io.File;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// File：文件操作
		// io：文件内容操作

		// 指定一个文件所在位置
		// String pathname = "C:\\Users\\23712\\Desktop\\测试文件夹";
		// // 创建一个File的对象
		// File file = new File(pathname);
		// // 获取文件的名称：
		// System.out.println(file.getName());
		// // 获取文件的路径：(包含自身文件名称)
		// System.out.println(file.getPath());
		// // 获取文件父路径：（不包含自身文件名称）
		// System.out.println(file.getParentFile());
		// // 判断是否是文件：
		// System.out.println(file.isFile());
		// // 判断是否是文件夹：
		// System.out.println(file.isDirectory());
		// // 判断是否存在：
		// System.out.println(file.exists());

		// // 使用java代码创建文件
		// boolean f = false;
		// if (!file.exists()) { // 判断文件是否存在
		// try {
		// // createNewFile()：创建文件
		// f = file.createNewFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// if (f == true) {
		// System.out.println("文件创建成功!");
		// } else {
		// System.out.println("文件创建失败!");
		// }
		// } else {
		// System.out.println("文件已存在!");
		// }

		// 使用java代码创建文件夹
		// boolean f = false;
		// f = file.mkdirs();
		// if (f == true) {
		// System.out.println("创建成功!");
		// } else {
		// System.out.println("创建失败!");
		// }

		// // 删除文件：(慎用，不会丢到回收站，而是删除非常干净)
		// System.out.println(file.delete());

		// // 扫描
		// String path = "D:\\karl word\\karl java";
		// File file = new File(path);
		// getFile(file);

		// // 在所在路径找指定类型文件.txt\.java
		// String st = "测试.txt";
		// // // 找到这个最后出现的地方(下标)
		// // int n = st.lastIndexOf(".");
		// // System.out.println(n);
		// // System.out.println(st.substring(n));
		// String path = "D:\\karl word\\karl java";
		// File file = new File(path);
		// getFile(file, ".class");

		// // 文件复制
		// String path = "C:\\Users\\23712\\Desktop\\测试.txt";
		// File file = new File(path);
		// // 获取文件名称
		// String name = file.getName();
		//
		// String path2 = "C:\\Users\\23712\\Desktop\\新建文件夹 (2)\\";
		// File file2 = new File(path2 + name);
		// boolean f = false;
		// if (!file2.exists()) {
		// try {
		// f = file2.createNewFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		// System.out.println(f);
		// // 获取文件大小：单位/byte
		// System.out.println(file.length());

	}

	// 用来扫描文件的方法(递归方法：方法自己调用自己)
	public static void getFile(File file) {
		// 拿到指定路径下所有的内容(文件、文件夹)
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.exists()) { // 判断是否存在
				if (file2.isFile()) { // 如果是文件
					System.out.println(file2.getName());
				}
				if (file2.isDirectory()) { // 如果是文件夹
					if (file2.listFiles() != null) {
						getFile(file2);
					}
				}
			}
		}
	}

	// 找指定文件类型的方法
	public static void getFile(File file, String str) {
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.exists()) {
				if (file2.isFile()) {
					// 先拿到文件的后缀名
					int n = file2.getName().lastIndexOf(".");
					if (n == -1) {
						n = 0;
					}
					String s = file2.getName().substring(n);
					if (s.equals(str)) { // 后缀名和传过来的一致
						System.out.println(file2.getName());
					}
				}
			}
			if (file2.isDirectory()) {
				if (file2.listFiles() != null) {
					getFile(file2, str);
				}
			}
		}
	}
}
