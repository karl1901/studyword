package com.hui;

public class Comeputer {

	// 2��дһ�����Ե��࣬���������ԡ�

	// �����з�����
	// ��һ���޷��أ��в����ķ�����
	// ��1�����ж��Ƿ�Ϊż���ķ�����Ҫ����һ������������������ż�����������ż�������������������ż������
	public void one(int x) {
		if (x % 2 == 0) {
			System.out.println("��ż��");
		} else {
			System.out.println("����ż��");
		}
	}

	// ��2�����ж�һ���Ƿ�������ķ�����Ҫ����һ���������ж���������Ƿ��ܱ�4�������Ҳ��ܱ�100�����������ܱ�400���������������������������ꡱ�������������ƽ�ꡱ��
	public void year(int y) {
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��ƽ��");
		}
	}

	// ��3�����ӷ���Ҫ����������������������������ĺ͡�
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	// ��4�����˷���Ҫ����������������������������Ļ���
	public void product(int c, int d) {
		System.out.println(c * d);
	}

	// ��5�������ݵķ�����Ҫ����һ������������������ݡ��磺����һ��100,��ô�ͼ��㣺1+2+3+����+99+100�Ľ�����������
	public void two(int e) {
		int x = 0;
		for (int i = 1; i <= e; i++) {
			x += i;
		}
		System.out.println(x);
	}

	// ��6�������ż���ķ�����Ҫ����һ�������������0�����������֮�������ż�����磺����һ��5����ô�����2,4��
	public void three(int f) {
		if (f > 0) {
			for (int i = 0; i < f; i++) {
				if (i % 2 == 0 && i != 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		} else {
			System.out.println("������һ��������!!");
		}
	}

	// ��7���������ֵ�ķ�����Ҫ����һ����ֵ���������飬�����������е����ֵ��
	public void four(int[] g) {
		int max = g[0];
			for (int i = 0; i < g.length; i++) {
				if (max < g[i]) {
					max = g[i];
				}
			}
			System.out.println(max);
		}

}
