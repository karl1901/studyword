package com.serlet;

import com.entity.Stu;

public class StuDao implements IStu {

	// ����ѧ������(������ѧ��)
	Stu[] stus = new Stu[5];

	@Override
	public double getAvg(int cid) {
		double avg = 0; // ����������-���ظ��û���
		Stu[] cstu = getCid(cid); // ���ð�������
		// 3����ƽ����
		int sum = 0; // ���ܷ�
		for (int i = 0; i < cstu.length; i++) {
			sum += cstu[i].getScore();
		}
		avg = sum / cstu.length;
		return avg;
	}

	@Override
	public String getClassz(int cid) {
		String str = null;
		Stu[] cstu = getCid(cid);
		// �ȼ�����ϼ��������
		int count = 0; // ��¼ѧ����������
		for (int i = 0; i < cstu.length; i++) {
			if (cstu[i].getScore() >= 60) {
				count++;
			}
		}
		str = count * 100 / cstu.length + "%";
		return str;
	}

	@Override
	public double getMax() {
		double max = 0;
		for (int i = 0; i < stus.length; i++) {
			if (max < stus[i].getScore()) {
				max = stus[i].getScore();
			}
		}
		return max;
	}

	@Override
	public double getMin() {
		double min = 0;
		for (int i = 0; i < stus.length; i++) {
			if (min > stus[i].getScore()) {
				min = stus[i].getScore();
			}
		}
		return min;
	}

	// ��������-ʵ�ֹ����㷽��
	// ͨ��ѧ�����ȥ�ö�Ӧ��ѧ��
	public Stu[] getCid(int cid) {
		// ��ͨ���༶��������İ༶��ţ�ȥ�������ö�Ӧ�İ༶ѧ��
		// 1�������ҵ���ѧ������ȥ������Ӧ���ȵ�ѧ������
		int count = 0; // ��¼ѧ������
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				if (stus[i].getCid() == cid) { // �༶�����ͬ
					count++;
				}
			}
		}
		Stu[] cstu = new Stu[count];
		// 2����ͨ��cid�õ�ѧ�����η�����������cstu��
		int t = 0; // ģ���������±�
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				if (stus[i].getCid() == cid) {
					stus[i] = cstu[t];
					t++;
				}
			}
		}
		return cstu;
	}

}
