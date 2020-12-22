package com.serlet;

import com.entity.Stu;

public class StuDao implements IStu {

	// 创建学生数组(用来放学生)
	Stu[] stus = new Stu[5];

	@Override
	public double getAvg(int cid) {
		double avg = 0; // 放在最上面-返回给用户的
		Stu[] cstu = getCid(cid); // 调用帮助方法
		// 3、求平均分
		int sum = 0; // 放总分
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
		// 先计算班上及格的人数
		int count = 0; // 记录学生几个人数
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

	// 帮助方法-实现公共点方法
	// 通过学生编号去拿对应的学生
	public Stu[] getCid(int cid) {
		// 先通过班级传入参数的班级编号，去数组中拿对应的班级学生
		// 1、根据找到的学生个数去创建对应长度的学生数组
		int count = 0; // 记录学生个数
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] != null) {
				if (stus[i].getCid() == cid) { // 班级编号相同
					count++;
				}
			}
		}
		Stu[] cstu = new Stu[count];
		// 2、把通过cid拿的学生依次放入至新数组cstu中
		int t = 0; // 模拟新数组下标
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
