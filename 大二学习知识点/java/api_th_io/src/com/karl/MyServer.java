package com.karl;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MyServer {

	/**
	 * @param args
	 * 
	 * 群聊
	 * 一个服务器对应多个客户端
	 * 多线程
	 * io流(字符流)
	 * 字节套
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 创建一个服务器
		ServerSocket ss = new ServerSocket(5566);
		System.out.println("服务器启动");
		// 创建一个客户端的集群
		Vector<Socket> vt = new Vector<Socket>();
		// 让服务器处于等待连接的状态
		while (true) {
			Socket sk = ss.accept();
			// 把连接上的客户端放入集群
			vt.add(sk);
			Thread t = new ServerTh(vt, sk);
			t.start();
		}

	}

}
