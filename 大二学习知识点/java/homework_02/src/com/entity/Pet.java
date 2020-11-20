package com.entity;

public class Pet {
	// 属性（昵称、亲密度、健康值）
	String name;
	double love;
	double lv;

	public Pet() {

	}

	public Pet(String name, double love, double lv) {
		this.name = name;
		this.love = love;
		this.lv = lv;
	}

	// 行为:方法(跑、叫)
	public void run() {
		System.out.println("跑");
	}

	public void jiao() {
		System.out.println("叫");
	}

}