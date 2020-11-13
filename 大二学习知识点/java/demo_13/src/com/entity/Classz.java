package com.entity;

import java.util.Arrays;

//班级实体类
public class Classz {

	private int cid;
	private String cname;
	private Stu[] stus = new Stu[2]; // 学生数组--默认:null
	
	public Classz(){
		
	}

	public Classz(int cid, String cname, Stu[] stus) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stus = stus;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Stu[] getStus() {
		return stus;
	}

	public void setStus(Stu[] stus) {
		this.stus = stus;
	}

	@Override
	public String toString() {
		return "Classz [cid=" + cid + ", cname=" + cname + ", stus="
				+ Arrays.toString(stus) + "]";
	}
	
	//增加改查(学生)
	//增加学生的方法
	public void addStu(Stu stu){
		int n=-1;  //用来判断数组是否满人的情况
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]==null) {  //表示位置上没有人
				stus[i]=stu;  //把学生放入数组中
				n=i;
				System.out.println("所加学生位置:"+n);
				break;
			}
		}
		if (n==-1) {
			System.out.println("人满了！");
		}
	}
	
	
	
	
	
	

}
