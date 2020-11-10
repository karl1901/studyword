package com.hui;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comeputer cpt=new Comeputer();
		//判断偶数
		cpt.one(1);
		//判断闰年平年
		cpt.year(2021);
		//求和
		cpt.sum(2, 3);
		//求积
		cpt.product(3, 6);
		//求幂
		cpt.two(3);
		//输出偶数
		cpt.three(5);
		//求数组最大值
		int[] x={12,34,32,75,127,90,1080};
		cpt.four(x);

	}

}
