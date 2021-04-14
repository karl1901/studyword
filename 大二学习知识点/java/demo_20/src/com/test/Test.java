package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.ImageIcon;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 * Exception： 所有错误的父类 
	 * throws Exception：能捕获main方法里面所有的错误
	 */
	public static void main(String[] args) throws Exception {

		// io：读写流（字节流，字符流，对象流）
		// String path = "C:\\Users\\23712\\Desktop\\ss\\sd.txt";
		// File file = new File(path);
		// // 判断这个文件是否是文件夹
		// file.isDirectory();
		// i：读取 input
		// o：写 output
		// 把指定的记事本里面的内容读取到java
		// 拿到读取文件的流(对象)
		// FileInputStream：字节流
		// FileInputStream fis = new FileInputStream(file);
		// 读取文件
		// i为-1就是没有东西
		// int i = fis.read();
		// System.out.println((char) i);

		// for (int i = 0; i < file.length() + 10; i++) {
		// int x = fis.read();
		// System.out.println((char) x);
		// }

		// int n = 0;
		// while ((n = fis.read()) != -1) {
		// }
		// 创建一个和文件大小一致的字节数组
		// byte[] b = new byte[(int) file.length()];
		// 读取字节数组
		// fis.read(b);
		// 把字节转换为字符串
		// String str = new String(b);
		// 打印内容
		// System.out.println(str);

		// 把java代码写入文件中
		// 获取文件的写流
		// FileOutputStream fos = new FileOutputStream(file);
		// String ss = "我要写入记事本";
		// 把写入的内容加到原有内容后面
		// String s = str+ss;
		// ss.getBytes()：把字符串转化为字节数组
		// fos.write(s.getBytes());
		// System.out.println("写入完成!");

		// 获取图片
		// String path = "C:\\Users\\23712\\Desktop\\ss\\jt.jpg";
		// File file = new File(path);
		// 字节流
		// FileInputStream fis = new FileInputStream(file);
		// 缓存流
		// BufferedInputStream bis = new BufferedInputStream(fis);
		// byte[] b = new byte[(int) file.length()];
		// int n = bis.read(b);
		// System.out.println(n);
		// String str = new String(b);
		// System.out.println(str);

		// ImageIcon ic = new ImageIcon(b);
		// System.out.println(ic.getIconHeight());
		// System.out.println(ic.getIconWidth());

		// 写入
		// String path1 = "C:\\Users\\23712\\Desktop\\ss\\karls\\test02.jpg";
		// File file2 = new File(path1);
		// 写入流
		// FileOutputStream fos = new FileOutputStream(file2);
		// BufferedOutputStream bis1 = new BufferedOutputStream(fos);
		// bis1.write(b);
		// 关闭所有的接口
		// bis.close();
		// fis.close();
		// bis1.close();
		// fos.close();
		// System.out.println("写入图片完成!");
		
	}

}
