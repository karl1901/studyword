package com.test;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.util.FileUtil;

public class Mycli {

	/**
	 * @param args
	 * 客户端
	 * @throws Exception
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 创建一个客户端
		Socket sk = new Socket("127.0.0.1", 5566);

		// 客户端写内容给服务器
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("请输入对话内容：(客户端)");
			String str = mys.next();
			// 调用写的方法
			FileUtil.SocketWrite(sk, str);

			// 读取服务器的内容
			String s = FileUtil.SocketRead(sk);
			System.out.println("服务器说：" + s);
			if (s != null) {
				if (s.equals("服务器繁忙")) {
					FileUtil.Myclose(sk);
					break;
				}
			}
		}

	}

}
