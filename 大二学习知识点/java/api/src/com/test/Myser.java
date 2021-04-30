package com.test;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.util.FileUtil;

public class Myser {

	/**
	 * @param args
	 * 服务器
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 创建了一个服务器
		ServerSocket ss = new ServerSocket(5566);
		System.out.println("服务器被启动");
		// 让服务器处于等待连接的状态
		Socket sk = ss.accept();
		System.out.println("连接的ip：" + sk.getLocalPort());

		Scanner mys = new Scanner(System.in);
		while (true) {
			// 接收客户端发送过来的内容
			String str = FileUtil.SocketRead(sk);
			System.out.println("客户端说：" + str);
			if (str != null) {
				if (str.equals("断开连接")) {
					FileUtil.Myclose(sk);
					break;
				}
			}

			System.out.println("请输入对话内容：(服务器)");
			String s = mys.next();
			FileUtil.SocketWrite(sk, s);

		}

	}

}
