package com.karl;

import java.net.Socket;

public class ClinetR extends Thread {

	// ������Ӧ�Ŀͻ�
	private Socket sk;

	public ClinetR(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String str = FileNet.NetReader(sk);
				System.out.println("���յ������ݣ�" + str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
