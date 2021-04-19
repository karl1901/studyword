package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.AbstractDocument.BranchElement;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 网络流
		// 获取一台电脑(LocalHost--本机)
		// InetAddress inet=InetAddress.getLocalHost();
		// 获取电脑名称
		// System.out.println(inet);
		// // 获取电脑IP
		// System.out.println(inet.getHostAddress());

		// 下载网络一个网站的源代码
		// www.baidu.com：对应一个网络IP
		// https：超文本协议
		// 国际端口：80
		// // 创建一个URL对象
		// URL url = new URL("https://www.baidu.com");
		// // 获取一个网络流--字节
		// InputStream is = url.openStream();
		// // 缓存流
		// BufferedInputStream bis = new BufferedInputStream(is);
		//
		// // 指定下载位置
		// String path = "C:\\Users\\23712\\Desktop\\ss\\baidu.html";
		// File file = new File(path);
		// // 获取文件字节流
		// FileOutputStream fos = new FileOutputStream(file);
		// // 缓存流
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// // 边读边写
		// int n = -1;
		// while ((n = bis.read()) != -1) {
		// System.out.println((char) n);
		// bos.write(n);
		// bos.flush(); // 清空缓存
		// }
		// bos.close();
		// fos.close();
		// bis.close();
		// is.close();
		// System.out.println("下载完成!");

		// // 用字符流去下载
		// URL url = new URL("https://huhuiyu.top");
		// InputStream is = url.openStream();
		// // 把字节转化为字符流
		// InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		// // 缓存流
		// BufferedReader br = new BufferedReader(isr);
		//
		// File file = new File("C:\\Users\\23712\\Desktop\\ss\\huhuiyu.html");
		// FileWriter fw = new FileWriter(file);
		// BufferedWriter bw = new BufferedWriter(fw);
		//
		// // StringBuffer str = new StringBuffer();
		// String s = null;
		// // 边读边写
		// while ((s = br.readLine()) != null) {
		// System.out.println(s);
		// bw.write(s);
		// bw.newLine();
		// bw.flush();
		// }
		// bw.close();
		// fw.close();
		// br.close();
		// isr.close();
		// is.close();
		// System.out.println("下载完成!");

		// // 获取网站源码
		// URL url = new URL("http://localhost:8080/demo/default.html");
		// InputStream is = url.openStream();
		// InputStreamReader isr = new InputStreamReader(is, "GBK");
		// BufferedReader br = new BufferedReader(isr);
		// // 只读
		// String str = null;
		// StringBuffer sb = new StringBuffer();
		// while ((str = br.readLine()) != null) {
		// sb.append(str); // 把读取到的网页代码拼接在一起
		// }
		// br.close();
		// isr.close();
		// is.close();
		// // System.out.println(sb);
		//
		// // <img src="images/logo.git" />
		// // 正则: /d /w [abc]{3} ? + * ^ $ \\s：空格
		// Pattern p = Pattern.compile("<img\\ssrc=\"([^\">]+)\"\\s/?>");
		// Matcher m = p.matcher(sb);
		// while (m.find()) { // 匹配成功
		// // System.out.println(m.group(1));
		// String s = m.group(1);
		// URL url1 = new URL("http://localhost:8080/demo/" + s);
		// InputStream is1 = url1.openStream();
		// BufferedInputStream bis = new BufferedInputStream(is1);
		//
		// int n = s.lastIndexOf("/");
		// String name = s.substring(n + 1);
		// File file = new File("C:\\Users\\23712\\Desktop\\ss\\新建文件夹\\"
		// + name);
		// FileOutputStream fos = new FileOutputStream(file);
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// // 边读边写
		// int x = -1;
		// while ((x = bis.read()) != -1) {
		// bos.write(x);
		// bos.flush();
		// }
		// bos.close();
		// fos.close();
		// bis.close();
		// is1.close();
		// System.out.println("下载图片完成!");
		//
		// }

	}

}
