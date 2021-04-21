package com.karl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 服务器

public class MyServer {

	/**
	 * @param args
	 * 所有的软件都基于服务器上
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// 创建一个服务器
		ServerSocket ss = new ServerSocket(5566);
		System.out.println(ss + "服务器被启动");
		// 让服务器保持等待连接的状态
		// Socket：字节套
		Socket sk = ss.accept();
		// 谁连接上了服务器
		System.out.println(sk.getInetAddress());

		// 读取
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// 写出
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		

		Scanner mys = new Scanner(System.in);
		while (true) {
			// 先读
			String str = br.readLine();
			System.out.println("客户端说：" + str);
			if (str.equals("断开连接")) {
				break;
			}
			System.out.println("请输入内容(服务器)：");
			String s = mys.next();
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		osw.close();
		os.close();
		br.close();
		isr.close();
		is.close();

	}

}
