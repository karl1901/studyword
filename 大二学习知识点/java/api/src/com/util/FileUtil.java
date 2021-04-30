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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public static boolean FileReadWrite(String rpath, String wpath) throws Exception {
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
			// 字节数组，限制每次读取10字节的大小
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
	public static boolean FileStrWrite(String pathname, String str) throws Exception {
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
	public static boolean ObjWrite(Object obj, String pathname) throws Exception {
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
	public static boolean ObjWrite(List<Object> myl, String pathname) throws Exception {
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

	// 网络流(网页代码的下载--字符流)
	public static StringBuffer NetReadWrite(String httpspath, String pathname) throws Exception {
		StringBuffer sb = new StringBuffer(); // 给我们看的内容
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(httpspath);
			// 通过网络对象获取读取流(字节流)
			is = url.openStream();
			// 把字节流转化为字符流
			isr = new InputStreamReader(is, "UTF-8");
			// 缓存流
			br = new BufferedReader(isr);

			// 写(文件的写--file)
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// 边读边写
			String str = ""; // 用来做读取判断依据的
			while ((str = br.readLine()) != null) { // 读取
				bw.write(str); // 写
				if (str != null) { // 写入了内容
					sb.append(str);
				}
				bw.newLine(); // 下一行
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			bw.close();
			fw.close();
			br.close();
			isr.close();
			is.close();
		}
		return sb;
	}

	// 获取网站代码
	public static StringBuffer NetReadWrite(String httpspath) throws Exception {
		StringBuffer sb = new StringBuffer(); // 给我们看的内容
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = new URL(httpspath);
			// 通过网络对象获取读取流(字节流)
			is = url.openStream();
			// 把字节流转化为字符流
			isr = new InputStreamReader(is, "UTF-8");
			// 缓存流
			br = new BufferedReader(isr);

			// 边读边写
			String str = ""; // 用来做读取判断依据的
			while ((str = br.readLine()) != null) { // 读取
				if (str != null) { // 写入了内容
					sb.append(str);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			br.close();
			isr.close();
			is.close();
		}
		return sb;
	}

	// 通过网络流取下载指定内容
	public static boolean GetNet(String httpspath, String pathname, String filename) throws Exception {
		boolean f = false;
		// 1、获取网站的所有代码
		StringBuffer sb = FileUtil.NetReadWrite(httpspath);
		// System.out.println(sb);
		// 2、去和用户传过来的特定规则进行匹配
		Pattern p = Pattern.compile(filename);
		Matcher m = p.matcher(sb);
		// 获取项目所在路径
		int end = httpspath.lastIndexOf("/");
		String httpname = httpspath.substring(0, end + 1);
		while (m.find()) {
			// System.out.println(m.group(1)); // 打印匹配到的字符串
			String pathimage = httpname + m.group(1);
			// System.out.println(pathimage); // 打印图片所在网络路径
			// 获取所有图片的网络流对象
			URL url = new URL(pathimage);
			InputStream is = url.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);

			// 获取网络图片名称及后缀名
			int x = m.group(1).lastIndexOf("/");
			String name = m.group(1).substring(x + 1);
			File file = new File(pathname + "\\" + name);
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// 边读边写
			int n = 0;
			while ((n = bis.read()) != -1) { // 读
				bos.write(n); // 写
			}
			bos.close();
			fos.close();
			bis.close();
			is.close();
			f = true;
		}
		return f;
	}

	// 字节套流(字节--字符)：写
	public static void SocketWrite(Socket sk, String str) throws Exception {
		OutputStream os = sk.getOutputStream();
		// 把字节流转化为字符流
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// 缓存流
		BufferedWriter bw = new BufferedWriter(osw);
		// 开始写内容
		if (str != null) { // 有内容
			bw.write(str); // 写
			bw.newLine(); // 换行
			bw.flush();
		}
	}

	// 字节套流(字节--字符)：读
	public static String SocketRead(Socket sk) throws Exception {
		String str = null;
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		str = br.readLine();
		return str;
	}

	// 关闭字节套流的所有接口
	public static void Myclose(Socket sk) throws Exception {
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		if (br != null) {
			br.close();
			isr.close();
			is.close();
		}
		if (bw != null) {
			bw.close();
			osw.close();
			os.close();
		}
	}

}
