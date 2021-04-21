package com.karl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 客户端

public class MyClinet {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {

		Socket sk = new Socket(InetAddress.getLocalHost().getHostAddress(),
				5566);

		// 让客户端向服务器发送内容(网络流-字节流)
		OutputStream os = sk.getOutputStream();
		// 把字节流转化为字符流
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// 缓存流
		BufferedWriter bw = new BufferedWriter(osw);

		// 让客户端具备接收服务器内容的作用
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("请输入内容(客户端):");
			String str = mys.next();
			// 把内容写给服务器
			bw.write(str);
			bw.newLine();
			bw.flush();
			// 接受服务器发来的内容
			String s = br.readLine();
			System.out.println("服务器说：" + s);
			if (s.equals("服务器维护")) {
				break;
			}
		}
		br.close();
		isr.close();
		is.close();
		bw.close();
		osw.close();
		os.close();

	}

}
