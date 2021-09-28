package com.entity;

// 新闻类

public class News {

	private int nid; // 编号
	private int ntype; // 新闻类别编号
	private String ntitle; // 新闻标题
	private String nabuut; // 新闻内容
	private String nimage; // 图片文件名
	private String nauthor; // 作者
	private String ntime; // 时间

	public News() {

	}

	public News(int nid, int ntype, String ntitle, String nabuut, String nimage, String nauthor, String ntime) {
		this.nid = nid;
		this.ntype = ntype;
		this.ntitle = ntitle;
		this.nabuut = nabuut;
		this.nimage = nimage;
		this.nauthor = nauthor;
		this.ntime = ntime;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public int getNtype() {
		return ntype;
	}

	public void setNtype(int ntype) {
		this.ntype = ntype;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNabuut() {
		return nabuut;
	}

	public void setNabuut(String nabuut) {
		this.nabuut = nabuut;
	}

	public String getNimage() {
		return nimage;
	}

	public void setNimage(String nimage) {
		this.nimage = nimage;
	}

	public String getNauthor() {
		return nauthor;
	}

	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	public String getNtime() {
		return ntime;
	}

	public void setNtime(String ntime) {
		this.ntime = ntime;
	}

	@Override
	public String toString() {
		return "News [nid=" + nid + ", ntype=" + ntype + ", ntitle=" + ntitle + ", nabuut=" + nabuut + ", nimage=" + nimage + ", nauthor=" + nauthor + ", ntime=" + ntime + "]";
	}

}
