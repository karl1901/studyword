package com.entity;

import java.util.Arrays;

//�༶ʵ����
public class Classz {

	private int cid;
	private String cname;
	private Stu[] stus = new Stu[2]; // ѧ������--Ĭ��:null
	
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
	
	//���ӸĲ�(ѧ��)
	//����ѧ���ķ���
	public void addStu(Stu stu){
		int n=-1;  //�����ж������Ƿ����˵����
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]==null) {  //��ʾλ����û����
				stus[i]=stu;  //��ѧ������������
				n=i;
				System.out.println("����ѧ��λ��:"+n);
				break;
			}
		}
		if (n==-1) {
			System.out.println("�����ˣ�");
		}
	}
	
	
	
	
	
	

}
