package com.entity;

// 子订单实体类

public class OrderGoods {

	// 子订单编号
	private int zid;
	// 总订单编号
	private int oid;
	// 商品对象
	private Goods goods;
	// 商品数量
	private double goodscount;
	// 单个商品总价格
	private double goodssum;

	// 计算单个商品的总价格的方法
	public void sale() {
		this.setGoodssum(this.goods.getBprice() * this.getGoodscount());
	}

	public OrderGoods() {

	}

	public OrderGoods(int zid, int oid, Goods goods, double goodscount, double goodssum) {
		this.zid = zid;
		this.oid = oid;
		this.goods = goods;
		this.goodscount = goodscount;
		this.goodssum = goodssum;
	}

	public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public double getGoodscount() {
		return goodscount;
	}

	public void setGoodscount(double goodscount) {
		this.goodscount = goodscount;
	}

	public double getGoodssum() {
		return goodssum;
	}

	public void setGoodssum(double goodssum) {
		this.goodssum = goodssum;
	}

	@Override
	public String toString() {
		return "OrderGoods [zid=" + zid + ", oid=" + oid + ", goods=" + goods + ", goodscount=" + goodscount + ", goodssum=" + goodssum + "]";
	}

}
