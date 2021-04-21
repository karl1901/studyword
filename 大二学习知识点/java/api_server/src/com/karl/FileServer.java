package com.karl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	/**
	 * @param args
	 * @throws Exception
	 * File：字节流、字符流、对象流、缓存流
	 * net：网络流、字节流、字符流
	 * net：字节套、字节流、字符流
	 */
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(6655);
		System.out.println("服务被启动");
		Socket sk = ss.accept();
		System.out.println("连接" + sk.getInetAddress());

		// 接受客户端发送过来的文件名称
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		System.out.println(name);
		// 通过文件名称找到文件所在位置(服务器上)
		File file = new File("C:\\Users\\23712\\Desktop\\ss\\" + name);
		// 边读边写(服务器本地读取，写给客户端)
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);

		OutputStream os = sk.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);

		byte[] bs = new byte[10];
		int n = 0;
		while ((bis.read(bs)) != -1) { // 读取内容
			bos.write(bs); // 写
			n += 10;
			System.out.println(n);
		}
		bos.flush();
		bos.close();
		os.close();
		bis.close();
		fis.close();
		br.close();
		isr.close();
		is.close();

	}

}
