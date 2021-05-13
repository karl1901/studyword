package com.karl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Vector;

// ������

public class ServerTh extends Thread {

	// �ô����˹�����Ӧ�ļ�Ⱥ����ȡ������Ϣ�Ŀͻ���
	private Vector<Socket> vt;
	private Socket sk;

	public ServerTh(Vector<Socket> vt, Socket sk) {
		this.vt = vt;
		this.sk = sk;
	}

	@Override
	public void run() {
		try {
			// ��ȡ�ֽ���
			InputStream is = sk.getInputStream();
			// �ֽ���ת��Ϊ�ַ���
			InputStreamReader isr = new InputStreamReader(is);
			// ������
			BufferedReader br = new BufferedReader(isr);
			// ��ȡ�ͻ��˷���������Ϣ
			String str = br.readLine();
			// �ѽ��յ�����Ϣ��������Ⱥ�����ͻ���
			for (Socket s : vt) { // ������Ⱥ
				if (s != sk) { // �������Լ�
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
