package com.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// File io-字节流 读：input 写：output

		// 对象流，字符流，缓存流
		// 对象流：(序列化-写，反序列化-读)

		// String path = "C:\\Users\\23712\\Desktop\\ss\\学生";
		// File file = new File(path);
		// FileOutputStream fos = new FileOutputStream(file);

		// 创建对象流
		// ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 创建一个要写入的对象
		// Stu stu = new Stu(1, "karl", 12, "男");
		// oos.writeObject(stu); // 序列化过程
		// oos.flush();
		// oos.close();
		// fos.close();
		// System.out.println("写入完成!");

		// 反序列对象
		// FileInputStream fis = new FileInputStream(file);
		// ObjectInputStream ois = new ObjectInputStream(fis);
		// Object obj = ois.readObject(); // 反序列化过程
		// ois.close();
		// fis.close();
		// if (obj instanceof Stu) {
		// Stu stu2 = (Stu) obj;
		// System.out.println(stu2.toString());
		// }

		// 从数据库(user)获取所有用户getAll()，然后用户集合写入电脑(文件)
		// List<Stu> myl = new ArrayList<Stu>();
		// for (int i = 0; i < 10; i++) {
		// Stu stu1 = new Stu(i, "karls", i + 1, "men");
		// myl.add(stu1);
		// }
		// String path1 = "C:\\Users\\23712\\Desktop\\ss\\学生集合";
		// File file1 = new File(path1);
		// FileOutputStream fos1 = new FileOutputStream(file1);
		// ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		// oos1.writeObject(myl);
		// oos1.flush();
		// oos1.close();
		// fos1.close();
		// System.out.println("集合写入完成!");

		// 读取学生集合
		// FileInputStream fis = new FileInputStream(file1);
		// ObjectInputStream ois = new ObjectInputStream(fis);
		// List<Stu> myl = (List<Stu>) ois.readObject();
		// for (Stu stu : myl) {
		// System.out.println(stu.toString());
		// }

		// 字符流(写/读文本文件)
		// String path = "C:\\Users\\23712\\Desktop\\ss\\字符流测试.txt";
		// File file = new File(path);
		// 创建一个字符流
		// FileReader fr = new FileReader(file);
		// 缓存流
		// BufferedReader br = new BufferedReader(fr);
		// 从文件读取内容
		// String str;
		// StringBuffer sb = new StringBuffer();
		// while ((str = br.readLine()) != null) { // 读一行
		// System.out.println(str);
		// sb.append(str+"\n");
		// }
		// System.out.println(sb);

		// 写入内容(不影响本身内容的前提)
		// FileWriter fw = new FileWriter(file);
		// BufferedWriter bw = new BufferedWriter(fw);
		// String s = "字符流的写入测试";
		// sb.append(s);
		// System.out.println(sb);
		// String s1 = new String(sb);
		// bw.write(s1);
		// bw.newLine(); // 新起一行
		// bw.flush();
		// bw.close();
		// fw.close();
		// br.close();
		// fr.close();
		// System.out.println("写入完成!");
		
		/*
		 * 
		 * File-文件
		 * io
		 * 字节流：input-读，output-写
		 * 缓存流
		 * 对象流：序列化-写，反序列化-读
		 * 字符流：read-读，write-写
		 * 
		 * net包--网络流
		 * 
		 */
		
		
		
		
		
		
		
		
		

	}

}
