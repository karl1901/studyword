package com.karl;

import java.net.Socket;

public class ClinetR extends Thread {

	// 关联对应的客户
	private Socket sk;

	public ClinetR(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String str = FileNet.NetReader(sk);
				System.out.println("接收到的内容：" + str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
