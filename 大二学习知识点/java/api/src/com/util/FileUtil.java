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

	// �ļ�����ȡ�ķ���(�ֽ���)
	public static File FileRead(String pathname) throws Exception {
		// ��ȡҪ�����ļ���·��
		File file = new File(pathname);
		// ������ȫ�ֱ�����finally���ܵ��ùرյķ���s
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			// ��ȡ�ļ��ֽ���
			fis = new FileInputStream(file);
			// ������
			bis = new BufferedInputStream(fis);
			int n = 1;
			while (n != -1) {
				n = bis.read();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// �ر�������
			fis.close();
			bis.close();
		}
		return file;
	}

	// ����(�߶���д)
	public static boolean FileReadWrite(String rpath, String wpath) throws Exception {
		boolean f = false;
		// ������ȫ�ֱ�����finally���ܵ��ùرյķ���
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			File file = new File(rpath); // ��ȡҪ�����ļ���·��
			// ��
			fis = new FileInputStream(file); // ��ȡ�ļ�����
			bis = new BufferedInputStream(fis); // ���Ļ�����
			// д
			File file1 = new File(wpath); // ��ȡ�ļ����ص�·��
			fos = new FileOutputStream(file1); // ��ȡ�ļ�д��
			bos = new BufferedOutputStream(fos); // д�Ļ�����
			// ����
			// �ֽ����飬����ÿ�ζ�ȡ10�ֽڵĴ�С
			byte[] bs = new byte[10];
			while (bis.read(bs) != -1) { // ��ȡ�����ݾͽ���ѭ��
				bos.write(bs);
			}
			// ѭ�������󣬾ͷ���true(�������)
			f = true;
			// �������
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// �ر����������Ӻ���ǰ
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		}
		return f;
	}

	// �ļ��ַ�����ȡ
	public static StringBuffer FileStrRead(String pathname) throws Exception {
		StringBuffer sb = new StringBuffer();
		// ������ȫ�ֱ�����finally���ܵ��ùرյķ���
		FileReader fr = null;
		BufferedReader br = null;
		try {
			File file = new File(pathname); // ��ȡ�ļ���·��
			fr = new FileReader(file); // ��ȡ�ַ�����
			br = new BufferedReader(fr); // �ַ�������
			// ��ʼ��ȡ����
			String str = "";
			while (str != null) {
				str = br.readLine();
				if (str != null) { // �����˶���
					sb.append(str + "\n"); // ƴ��(һ�ж���ͻ���)
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			// �ر�������
			br.close();
			fr.close();
		}
		return sb;
	}

	// �ļ��ַ�����д��
	public static boolean FileStrWrite(String pathname, String str) throws Exception {
		boolean f = false;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			File file = new File(pathname);
			// ���ö�ȡ�ķ���(Ҫ�ȶ���д��˳����˾Ͷ�ȡ��������)
			StringBuffer sb = FileStrRead(pathname);
			if (file.length() > 0) { // д����ļ�������
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				sb.append(str);
				bw.write(sb + "");
				bw.newLine();
				bw.flush();
				f = true;
			} else { // д����ļ�����Ϊ��
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

	// ������(���л�)
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

	// ������(�����л�)
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

	// ������(���ϵ����л�)
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

	// ������(���Ϸ����л�)
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

	// ������(��ҳ���������--�ַ���)
	public static StringBuffer NetReadWrite(String httpspath, String pathname) throws Exception {
		StringBuffer sb = new StringBuffer(); // �����ǿ�������
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(httpspath);
			// ͨ����������ȡ��ȡ��(�ֽ���)
			is = url.openStream();
			// ���ֽ���ת��Ϊ�ַ���
			isr = new InputStreamReader(is, "UTF-8");
			// ������
			br = new BufferedReader(isr);

			// д(�ļ���д--file)
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// �߶���д
			String str = ""; // ��������ȡ�ж����ݵ�
			while ((str = br.readLine()) != null) { // ��ȡ
				bw.write(str); // д
				if (str != null) { // д��������
					sb.append(str);
				}
				bw.newLine(); // ��һ��
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

	// ��ȡ��վ����
	public static StringBuffer NetReadWrite(String httpspath) throws Exception {
		StringBuffer sb = new StringBuffer(); // �����ǿ�������
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = new URL(httpspath);
			// ͨ����������ȡ��ȡ��(�ֽ���)
			is = url.openStream();
			// ���ֽ���ת��Ϊ�ַ���
			isr = new InputStreamReader(is, "UTF-8");
			// ������
			br = new BufferedReader(isr);

			// �߶���д
			String str = ""; // ��������ȡ�ж����ݵ�
			while ((str = br.readLine()) != null) { // ��ȡ
				if (str != null) { // д��������
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

	// ͨ��������ȡ����ָ������
	public static boolean GetNet(String httpspath, String pathname, String filename) throws Exception {
		boolean f = false;
		// 1����ȡ��վ�����д���
		StringBuffer sb = FileUtil.NetReadWrite(httpspath);
		// System.out.println(sb);
		// 2��ȥ���û����������ض��������ƥ��
		Pattern p = Pattern.compile(filename);
		Matcher m = p.matcher(sb);
		// ��ȡ��Ŀ����·��
		int end = httpspath.lastIndexOf("/");
		String httpname = httpspath.substring(0, end + 1);
		while (m.find()) {
			// System.out.println(m.group(1)); // ��ӡƥ�䵽���ַ���
			String pathimage = httpname + m.group(1);
			// System.out.println(pathimage); // ��ӡͼƬ��������·��
			// ��ȡ����ͼƬ������������
			URL url = new URL(pathimage);
			InputStream is = url.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);

			// ��ȡ����ͼƬ���Ƽ���׺��
			int x = m.group(1).lastIndexOf("/");
			String name = m.group(1).substring(x + 1);
			File file = new File(pathname + "\\" + name);
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// �߶���д
			int n = 0;
			while ((n = bis.read()) != -1) { // ��
				bos.write(n); // д
			}
			bos.close();
			fos.close();
			bis.close();
			is.close();
			f = true;
		}
		return f;
	}

	// �ֽ�����(�ֽ�--�ַ�)��д
	public static void SocketWrite(Socket sk, String str) throws Exception {
		OutputStream os = sk.getOutputStream();
		// ���ֽ���ת��Ϊ�ַ���
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// ������
		BufferedWriter bw = new BufferedWriter(osw);
		// ��ʼд����
		if (str != null) { // ������
			bw.write(str); // д
			bw.newLine(); // ����
			bw.flush();
		}
	}

	// �ֽ�����(�ֽ�--�ַ�)����
	public static String SocketRead(Socket sk) throws Exception {
		String str = null;
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		str = br.readLine();
		return str;
	}

	// �ر��ֽ����������нӿ�
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
