package com.karl;

import java.net.Socket;
import java.util.Scanner;

public class ClinetW extends Thread {

	private Socket sk;

	public ClinetW(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("��������Ҫ˵�����ݣ�");
			String str = mys.next();
			try {
				FileNet.NetWrite(sk, str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
