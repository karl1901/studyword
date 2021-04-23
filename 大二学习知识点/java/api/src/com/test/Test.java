package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.entity.Stu;
import com.util.FileUtil;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 测试文件字节流的方法
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// File file = FileUtil.FileRead(pathname);
		// System.out.println(file.length());

		// 测试下载
		// String rpath = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// String wpath = rpath + "\\"
		// + rpath.substring(rpath.lastIndexOf("\\") + 1);
		// boolean f = FileUtil.FileReadWrite(rpath, wpath);
		// System.out.println(f);

		// 测试文件字符读流
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// StringBuffer sb = FileUtil.FileStrRead(pathname);
		// System.out.println(sb);

		// 测试文件字符流写入
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\下载\\2.txt";
		// String str = "111slslsl111";
		// boolean f = FileUtil.FileStrWrite(pathname, str);
		// System.out.println(f);

		// 测试对象流
		// Stu stu = new Stu(1, "piter");
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\下载\\stu";
		// boolean f = FileUtil.ObjWrite(stu, pathname);
		// System.out.println(f);

		// 测试反序列化
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\下载\\stu";
		// Stu stu = (Stu) FileUtil.ObjRead(pathname);
		// System.out.println(stu);

		// 测试集合序列化
		// List<Stu> myl = new ArrayList<Stu>();
		// for (int i = 0; i < 8; i++) {
		// Stu stu = new Stu(i, "dsfl"+i);
		// myl.add(stu);
		// }
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\下载\\stulist";
		// boolean f = FileUtil.ObjWrite(myl, pathname);
		// System.out.println(f);

		// 测试集合反序列化
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\下载\\stulist";
		// List<Object> myl = FileUtil.ObjReadList(pathname);
		// for (Object object : myl) {
		// System.out.println(object);
		// }

	}

}
