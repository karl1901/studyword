package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {

	/**
	 * @param args
	 * @throws tException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// InetAddress iad = InetAddress.getLocalHost();
		// System.out.println(iad);
		// System.out.println(iad.getHostAddress());
		// System.out.println(iad.getHostName());

		// URL url = new URL("https://www.baidu.com");
		// InputStream is = url.openStream();
		// BufferedInputStream bis = new BufferedInputStream(is);
		//
		// File file = new
		// File("C:\\Users\\23712\\Desktop\\ss\\karls\\baidu.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// int n = -1;
		// while ((n = bis.read()) != -1) {
		// bos.write(n);
		// bos.flush();
		// }
		// bos.close();
		// fos.close();
		// bis.close();
		// is.close();
		// System.out.println("OK!");

		// URL url = new URL("https://huhuiyu.top");
		// InputStream is = url.openStream();
		// InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		// BufferedReader br = new BufferedReader(isr);
		//
		// File file = new File(
		// "C:\\Users\\23712\\Desktop\\ss\\karls\\huhuiyu.txt");
		// FileWriter fw = new FileWriter(file);
		// BufferedWriter bw = new BufferedWriter(fw);
		// String str = null;
		// while ((str = br.readLine()) != null) {
		// bw.write(str);
		// bw.newLine();
		// bw.flush();
		// }
		// bw.close();
		// fw.close();
		// br.close();
		// isr.close();
		// is.close();
		// System.out.println("OK!");

		URL url = new URL("https://kangxianghui.top/album/index.html");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		StringBuffer sb = new StringBuffer();
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		br.close();
		isr.close();
		is.close();
		// System.out.println(sb);

		Pattern p = Pattern.compile("<img\\ssrc=\"([^\">]+)\"\\s/?");
		Matcher m = p.matcher(sb);
		int count = 0;
		while (m.find()) {
			String ss = m.group(1);
			URL url1 = new URL("https://kangxianghui.top/album/" + ss);
			InputStream is1 = url1.openStream();
			BufferedInputStream bis = new BufferedInputStream(is1);

			int n = ss.lastIndexOf("/");
			String name = ss.substring(n + 1);
			File file = new File(
					"C:\\Users\\23712\\Desktop\\ss\\karls\\images\\" + name);
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int a = -1;
			while ((a = bis.read()) != -1) {
				bos.write(a);
				bos.flush();
			}
			count++;
			bos.close();
			fos.close();
			bis.close();
			is1.close();
			System.out.println("下载" + name + "完成，" + "大小：" + file.length()
					+ "字节，第" + count + "个");
		}
		System.out.println("已完成，共下载：" + count + "个");

	}

}
