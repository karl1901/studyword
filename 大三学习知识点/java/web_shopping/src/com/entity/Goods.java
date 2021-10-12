package com.entity;

//	商品实体类

public class Goods {

//	商品编号
	private int bid;
//	商品名称
	private String bname;
//	商品价格
	private double bprice;
//	商品描述
	private String binfo;
//	商品图片
	private String bimage;

	public Goods() {

	}

	public Goods(int bid, String bname, double bprice, String binfo, String bimage) {
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.binfo = binfo;
		this.bimage = bimage;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public String getBinfo() {
		return binfo;
	}

	public void setBinfo(String binfo) {
		this.binfo = binfo;
	}

	public String getBimage() {
		return bimage;
	}

	public void setBimage(String bimage) {
		this.bimage = bimage;
	}

	@Override
	public String toString() {
		return "Goods [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + ", binfo=" + binfo + ", bimage=" + bimage + "]";
	}

}
