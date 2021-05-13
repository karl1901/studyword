package com.karl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Vector;

// 代理人

public class ServerTh extends Thread {

	// 让代理人关联对应的集群，获取发送信息的客户端
	private Vector<Socket> vt;
	private Socket sk;

	public ServerTh(Vector<Socket> vt, Socket sk) {
		this.vt = vt;
		this.sk = sk;
	}

	@Override
	public void run() {
		try {
			// 获取字节流
			InputStream is = sk.getInputStream();
			// 字节流转化为字符流
			InputStreamReader isr = new InputStreamReader(is);
			// 缓存流
			BufferedReader br = new BufferedReader(isr);
			// 读取客户端发送来的信息
			String str = br.readLine();
			// 把接收到的信息发送至集群其他客户端
			for (Socket s : vt) { // 遍历集群
				if (s != sk) { // 不是我自己
					FileNet.NetWrite(s, str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
