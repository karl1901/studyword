package com.karl;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClinet {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Socket sk = new Socket("127.0.0.1", 5566);

		Thread tw = new ClinetW(sk);
		tw.start();
		Thread tr = new ClinetR(sk);
		tr.start();

	}

}
