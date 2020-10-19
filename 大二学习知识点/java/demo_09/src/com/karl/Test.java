/**
 * 
 */
package com.karl;

import java.util.Scanner;
import java.util.zip.ZipEntry;

/**
 * @author 23712
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 数组

		// int a;
		// a = 10;
		// 声明数组(整型):装多个数据

		// 声明方法1：
		// int[] x; //声明一个数组
		// x=new int[5];

		// 声明方法2：
		// double[] b = new double[6]; // 常用的声明方式：声明数组同时并规定数组长度

		// 声明方法3：
		// 创建的同时并赋值，数组的长度由赋值内容的大小确定
		// String[] strings = { "aaaa", "bbbb" }; //創建的同时并赋值 {}内可以无限赋值

//		int[] x = new int[7];
		// x.length:拿到数组的长度
		// System.out.println(x.length);
		// x[0]=11; //[0],[1]...[5]:下标
		// x[1]=13;
		// x[3]=16;
		// x[4]=83;
		// x[5]=9379;
		
		// 数组创建后，每个元素会有默认值 int 声明后，若没有赋值，就会有默认值。
		// int的默认值为0  string默认值：null（空）    char默认值：口     
		// double默认值：0.0   boolean默认值：false
		
		// for (int i = 0; i < x.length; i++) {
		// System.err.println(i); //x数组所以下标
		// System.out.println(x[i]); //拿到数组所有元素
		// }

//		double[] d = new double[8]; // 装一个组的成绩
//		Scanner mys = new Scanner(System.in);
//
//		for (int i = 0; i < d.length; i++) {
//			System.out.println("请输入你的成绩：");
//			d[i]= mys.nextDouble();
////			d[i]=fen;  //把用户输入每一次成绩给了数组对应的位置
//		}
//		//打印数组里面所有的成绩
//		for (int i = 0; i < d.length; i++) {
//			System.out.print(d[i]+"\t");
//		}
		
//		int[] y={12,23,23,13,12,12,323,32321,13232,13232,1323,13131,13131,13213,13232343,34343,4242,343};
//		System.out.println(y.length);
//		System.out.println(y[y.length-1]);	//y.length-1：拿到数组最后一个数
//		for (int i = 0; i < y.length; i++) {
//			System.out.println(y[i]);  //打印数组所有元素
//		}
		
//		int[] z={32,23,434,54,23,234,243443};
//		//求数组里面的最大值
//		int max=z[0]; //先赋值数组第一个数为最大值
//		for (int i = 0; i < z.length; i++) {  //循环数=数组长度数
//		      if (max<z[i]) {  //判断当前最大值是否
//				max=z[i]; 
//			}	
//		}
//		System.out.println("最大值："+max);
		
//		int[] a=new int[5];  //给定数组的大小（长度）
//		// 求数组里面的最小值
//		Scanner mys=new Scanner(System.in);  //用户输入构造器
//		for (int i = 0; i < a.length; i++) {  //输入次数与数组长度相等
//			System.out.println("请输入录入的数：");  //提示用户录入数
//			a[i]=mys.nextInt();  //把用户录入的数给相对应的位置
//		}
//		int min=a[0];  //赋值数组第一个数为最小值
//		for (int i = 0; i < a.length; i++) {  //循环次数=数组长度
//			if (min>a[i]) {  //判断数组里面的数是否比现有（数组第一个数）小---与现有最小值比较，若小，则赋值给最小值
//				min=a[i];  //赋值满足条件的数给最小值
//			}
//		}
//		System.out.println("录入的最小数为："+min);  //打印录入的数组里面的最小数
		
//		int[] y={12,34,35,67,11,4};
//		//求数组的和，平均数
//		int sum=0;
//		int avg=0;
//		for (int i = 0; i < y.length; i++) {
//			sum+=y[i];
//		}
//		avg=sum/y.length;
//		System.out.println(sum);
//		System.out.println(avg);
		
//		//数组元素替换
//		String[] s={"张三","李四","王五","赵六"};
//		//把数组里面叫"李四"的替换为"杜牧"
//		//先找到 李四
//		boolean f=false; //表示人没有找到
//		int z=0; //找人方式2  装找到人的下标
//		for (int i = 0; i < s.length; i++) {
//			if ("李四".equals(s[i])) {  //判断数组里面的元素是否为李四
//				System.out.println("找到了："+i);
////				s[i]="杜牧";  //人找到就改名   改名方式1
//				z=i; //方式2  把找到人的下标给z
//				break;
//			}
//		}
//		
//		if (f==false) {  //人没有找到
//			System.out.println("人没有找到");
//		}
//		
//		if (f==true) {  //判断找到了
//			s[z]="李白";  //方式2 改名为李白
//		}
//		
//		//用来打印数组元素的for循环的子循环
//		for (String x : s) {  //(数据类型 循环变量-数组内所有元素 : 数组变量名-这里是s)			
//		   System.out.println(x);
//		}
//		
		
//		//数组的扩容(给数组s里面加入一个杜甫，不能覆盖其他名字)
//		String[] s={"张三","李四","王五","赵六"};  //现在的数组长度为：四
//		//扩容是用新的数组来装旧数组
//		String[] str=new String[s.length+1];
//		for (int i = 0; i < s.length; i++) {  //循环s数组长度，循环4次
//			str[i]=s[i];  //复制，把s数组里面所有元素给str数组
//		}
//		
//		str[str.length-1]="杜甫";  //把数组str最后一个元素赋值为"杜甫"
//		
//		for (String x : str) {
//			System.out.println(x);
//		}
		
		
		
		
		
		
		
		

	}

}
