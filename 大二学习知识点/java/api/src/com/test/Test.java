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

		// �����ļ��ֽ����ķ���
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// File file = FileUtil.FileRead(pathname);
		// System.out.println(file.length());

		// ��������
		// String rpath = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// String wpath = rpath + "\\"
		// + rpath.substring(rpath.lastIndexOf("\\") + 1);
		// boolean f = FileUtil.FileReadWrite(rpath, wpath);
		// System.out.println(f);

		// �����ļ��ַ�����
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\abc.txt";
		// StringBuffer sb = FileUtil.FileStrRead(pathname);
		// System.out.println(sb);

		// �����ļ��ַ���д��
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\����\\2.txt";
		// String str = "111slslsl111";
		// boolean f = FileUtil.FileStrWrite(pathname, str);
		// System.out.println(f);

		// ���Զ�����
		// Stu stu = new Stu(1, "piter");
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\����\\stu";
		// boolean f = FileUtil.ObjWrite(stu, pathname);
		// System.out.println(f);

		// ���Է����л�
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\����\\stu";
		// Stu stu = (Stu) FileUtil.ObjRead(pathname);
		// System.out.println(stu);

		// ���Լ������л�
		// List<Stu> myl = new ArrayList<Stu>();
		// for (int i = 0; i < 8; i++) {
		// Stu stu = new Stu(i, "dsfl"+i);
		// myl.add(stu);
		// }
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\����\\stulist";
		// boolean f = FileUtil.ObjWrite(myl, pathname);
		// System.out.println(f);

		// ���Լ��Ϸ����л�
		// String pathname = "C:\\Users\\23712\\Desktop\\ss\\����\\stulist";
		// List<Object> myl = FileUtil.ObjReadList(pathname);
		// for (Object object : myl) {
		// System.out.println(object);
		// }

	}

}
