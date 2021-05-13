package com.karl;

// 方法封装类

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FileNet {

	public static String NetReader(Socket sk) throws Exception {
		String str = null;
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		str = br.readLine();
		return str;
	}

	public static void NetWrite(Socket sk, String str) throws Exception {
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(str);
		bw.newLine();
		bw.flush();
	}

}
