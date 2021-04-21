package com.karl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class FIleClinet {

	/**
	 * @param args
	 * @throws IOException
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// 下载过程：
		// 选择文件--确定--点击下载
		// 1、服务器通过选择的文件去本地服务器找到这个文件
		// 2、本地读取到服务器上
		// 3、服务器读取的内容发送给客户端
		// 4、读取服务器发送的内容
		// 5、写入字节的电脑

		Socket sk = new Socket("127.0.0.1", 6655);
		// 客户端要向服务器发送下载的文件是谁(文件名)
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner mys = new Scanner(System.in);
		System.out.println("请输入你要下载的文件名称：");
		String name = mys.next();
		bw.write(name);
		bw.newLine();
		bw.flush();

		// 边读边写
		InputStream is = sk.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);

		// 下载内容的存放位置
		File file = new File("C:\\Users\\23712\\Desktop\\ss\\下载\\" + name);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		byte[] bs = new byte[10];
		while ((bis.read(bs)) != -1) { // 读
			bos.write(bs); // 写
		}
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		is.close();
		bw.close();
		osw.close();
		os.close();
		System.out.println("下载完成!");

	}

}
