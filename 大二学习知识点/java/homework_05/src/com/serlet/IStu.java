package com.serlet;

public interface IStu {

	// 查看班级平均分
	public double getAvg(int cid);

	// 查看班级及格率
	public abstract String getClassz(int cid);

	// 查看最高分
	public abstract double getMax();

	// 查看最低分
	public abstract double getMin();

}
