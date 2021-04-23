package com.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.entity.Stu;

public class FileUtil {

	// 文件流读取的方法(字节流)
	public static File FileRead(String pathname) throws Exception {
		// 获取要读的文件的路径
		File file = new File(pathname);
		// 声明的全局变量，finally才能调用关闭的方法s
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			// 获取文件字节流
			fis = new FileInputStream(file);
			// 缓存流
			bis = new BufferedInputStream(fis);
			int n = 1;
			while (n != -1) {
				n = bis.read();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// 关闭所有流
			fis.close();
			bis.close();
		}
		return file;
	}

	// 下载(边读边写)
	public static boolean FileReadWrite(String rpath, String wpath)
			throws Exception {
		boolean f = false;
		// 声明的全局变量，finally才能调用关闭的方法
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			File file = new File(rpath); // 获取要下载文件的路径
			// 读
			fis = new FileInputStream(file); // 获取文件读流
			bis = new BufferedInputStream(fis); // 读的缓存流
			// 写
			File file1 = new File(wpath); // 获取文件下载的路径
			fos = new FileOutputStream(file1); // 获取文件写流
			bos = new BufferedOutputStream(fos); // 写的缓存流
			// 下载
			// 字节数组，限制每次读取速度为10字节
			byte[] bs = new byte[10];
			while (bis.read(bs) != -1) { // 读取有内容就进入循环
				bos.write(bs);
			}
			// 循环结束后，就返回true(下载完成)
			f = true;
			// 清除缓存
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// 关闭所有流，从后至前
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		}
		return f;
	}

	// 文件字符流读取
	public static StringBuffer FileStrRead(String pathname) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 声明的全局变量，finally才能调用关闭的方法
		FileReader fr = null;
		BufferedReader br = null;
		try {
			File file = new File(pathname); // 获取文件的路径
			fr = new FileReader(file); // 获取字符读流
			br = new BufferedReader(fr); // 字符缓存流
			// 开始读取内容
			String str = "";
			while (str != null) {
				str = br.readLine();
				if (str != null) { // 读到了东西
					sb.append(str + "\n"); // 拼接(一行读完就换行)
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// 关闭所有流
			br.close();
			fr.close();
		}
		return sb;
	}

	// 文件字符流的写入
	public static boolean FileStrWrite(String pathname, String str)
			throws Exception {
		boolean f = false;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			File file = new File(pathname);
			// 调用读取的方法(要先读后写，顺序错了就读取不到东西)
			StringBuffer sb = FileStrRead(pathname);
			if (file.length() > 0) { // 写入的文件有内容
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				sb.append(str);
				bw.write(sb + "");
				bw.newLine();
				bw.flush();
				f = true;
			} else { // 写入的文件内容为空
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				bw.write(str);
				bw.newLine();
				bw.flush();
				f = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			bw.close();
			fw.close();
		}
		return f;
	}

	// 对象流(序列化)
	public static boolean ObjWrite(Object obj, String pathname)
			throws Exception {
		boolean f = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File file = new File(pathname);
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
		return f;
	}

	// 对象流(反序列化)
	public static Object ObjRead(String pathname) throws Exception {
		Object obj = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			File file = new File(pathname);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			ois.close();
			fis.close();
		}
		return obj;
	}

	// 对象流(集合的序列化)
	public static boolean ObjWrite(List<Object> myl, String pathname)
			throws Exception {
		boolean f = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File file = new File(pathname);
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(myl);
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
		return f;
	}

	// 对象流(集合反序列化)
	public static List<Object> ObjReadList(String pathname) throws Exception {
		List<Object> myl = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			File file = new File(pathname);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			myl = (List<Object>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			ois.close();
			fis.close();
		}
		return myl;
	}

}
