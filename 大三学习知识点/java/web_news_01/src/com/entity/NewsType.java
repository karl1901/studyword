package com.entity;

// 新闻类别实体类

public class NewsType {

	private int typeid;
	private int ntype;
	private String typename;

	public NewsType() {

	}

	public NewsType(int typeid, int ntype, String typename) {
		this.typeid = typeid;
		this.ntype = ntype;
		this.typename = typename;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public int getNtype() {
		return ntype;
	}

	public void setNtype(int ntype) {
		this.ntype = ntype;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Override
	public String toString() {
		return "NewsType [typeid=" + typeid + ", ntype=" + ntype + ", typename=" + typename + "]";
	}

}
