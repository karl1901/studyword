/**
 * 
 */
package com.karl;

import java.util.Random;
import java.util.Scanner;

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

		// java二维是从左上角开始x,y轴;数学是从左下角开始的。

		// 二维数组
		// 第一种声明方式
		// int[][] x=new int[5][6];
		// x[0][0]=8;
		// x[2][5]=7;
		// //打印二维数组（方式：循环嵌套）
		// for (int i = 0; i < x.length; i++) { //打印行数
		// for (int j = 0; j < x[i].length; j++) { //打印每行个数
		// System.out.print(x[i][j]+"\t"); //不换行打印行数
		// }
		// System.out.println(); //空行
		// }

		// 第二种声明方式
		// int[][] x={{2,34,345,3},
		// {3,23,45,23,45,6},
		// {3,56,67,5,45,57,3}};
		// int sum=0; //装数组所有数的总和
		// int avg=0; //平均数，初始值为0
		// int count=0; //装所有数的个数，初始值为0
		// //求最大最小值
		// int max=x[0][0]; //声明最大值
		// int min=x[0][0]; //声明最小值
		// for (int i = 0; i < x.length; i++) { //打印行数
		// for (int j = 0; j < x[i].length; j++) { //打印每行个数
		// System.out.print(x[i][j]+"\t");
		// sum+=x[i][j]; //把每个数加到总和
		// if (max<x[i][j]) { //判断最大值
		// max=x[i][j];
		// }
		// if (min>x[i][j]) { //判断最小值
		// min=x[i][j];
		// }
		// count++; //打印一个数，数的个数+1
		// }
		// System.out.println(); //空行
		// }
		// avg=sum/count; //总数/总个数=平均数
		// System.out.println("avg:"+avg);
		// System.out.println("max: "+max+"min: "+min);

		// 排序(一维数组):升序
		// 9,13,56,88,120
		// int[] x = { 88, 56, 8, 13, 120 };
		// for (int i = 0; i < x.length - 1; i++) { // 打印行数
		// for (int j = 0; j < x.length - 1 - i; j++) { // 打印每行的数
		// if (x[j] > x[j + 1]) { // 判断前者是否比后者大，反之就是降序
		// int t = x[j]; // 先把前者给到新变量：t
		// x[j] = x[j + 1]; // 把后者换位到前者
		// x[j + 1] = t; // 把前者换位到后者
		// }
		// }
		// }
		//
		// for (int a : x) {
		// System.out.print(a + "\t");
		// }

		// 二位数组排序（升序）：
		// 计算二位数组元素个数--声明一维数组（能装下二维数组）--把二维数组的元素都复制到一维数组--给一维数组排序--排好了把一维数组再给二维数组
		// int[][] x = { { 2, 34, 55, 3 }, { 12, 23, 45, 23, 45, 6 },
		// { 3, 56, 67, 5, 45, 57, 3 } };
		//
		// // 1、计算二位数组里面有多少个元素（用打印二维数组所有元素的方法获取所有个数）
		// int count = 0; //装数组里面数的个数
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// count++;
		// }
		// }
		// // System.out.println(count);
		//
		// // 2、声明一个能装下二维数组所有元素的一维数组（数组长度为二维数组的一维数组）
		// int[] newx = new int[count]; //长度count=二维数组里面所有元素的个数
		//
		// // 3、把二维数组的内容复制给一维数组（同样用打印所有二维数组元素的方法把所有元素复制到一维数组里面）
		// int w = 0; // 声明新下标w，模拟下标
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// newx[w] = x[i][j]; //把二位数组里的元素赋值到一维数组的元素
		// w++; //下标w=w+1
		// }
		// }
		// // for (int i = 0; i < newx.length; i++) {
		// // System.out.print(newx[i]+"\t");
		// // }
		//
		// // 4、给一维数组排序(升序)
		// for (int i = 0; i < newx.length - 1; i++) {
		// for (int j = 0; j < newx.length - 1 - i; j++) {
		// if (newx[j] > newx[j + 1]) {
		// int t = newx[j];
		// newx[j] = newx[j + 1];
		// newx[j + 1] = t;
		// }
		// }
		// }
		//
		// // for (int a : newx) {
		// // System.out.print(a+"\t");
		// // }
		//		
		// //5、把排序完成了的一维数组复制给二维数组
		// int a=0; //模拟下标
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// x[i][j]=newx[a];
		// a++;
		// }
		// }
		//		
		// //打印二维数组
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j]+"\t");
		// }
		// System.out.println();
		// }

		// 1、声明一个二维数组保存6*8个数字，将其中的偶数放入到一个一维数组中
		// Random ran = new Random(); // 随机数生成
		// int[][] x = new int[6][8]; // 声明6*8的二维数组
		// int count = 0; // 装二维数组x所有元素个数
		//
		// // 赋值到二维数组，获取二维数组的元素个数
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// int r = ran.nextInt(17); // 获取随机数
		// x[i][j] = r; // 把随机数遍历赋值给二维数组的元素
		// count++; // 赋值一个元素，元素个数+1
		// }
		// }
		//
		// // 打印二维数组（每次随机数不一样，所以二维数组的元素都不同）
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// }
		// System.out.println(); // 空行
		// }
		// int[] y = new int[count]; // 声明长度为count的一维数组y
		// int a = 0; // 声明模拟下标a，初始为0
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// if (x[i][j] % 2 == 0 & x[i][j] != 0) { // 判断是否为偶数，排除0(非奇非偶)
		// y[a] = x[i][j]; // 把符合条件的元素赋值到y数组中
		// a++;
		// }
		// }
		// }
		//
		// System.out.println(); // 空行打印一维数组y
		// // 打印一维数组y
		// for (int i = 0; i < y.length; i++) { // 打印偶数的个数--a:数组y中偶数的个数，其他的空值不打印
		// if (i % 7 == 0) { // 逢7换行
		// System.out.println();
		// }
		// System.out.print(y[i] + "\t");
		// }
		//
		// //到此可以打止，因为题目要求已经达到了。
		// // 声明新的一维数组z,长度为数组y中不为0的元素的个数
		// int[] z = new int[a];
		// for (int i = 0; i < y.length; i++) {
		// if (y[i] != 0) { // 判断数组y中元素是否不为0
		// z[i] = y[i];
		// }
		// }
		// System.out.println(); // 换行
		// System.out.println(); // 换行
		//
		// // 打印最终的一维数组z
		// for (int i = 0; i < z.length; i++) {
		// if (i % 6 == 0) {
		// System.out.println();
		// }
		// System.out.print(z[i] + "\t");
		// }

		// //声明6*8的二维数组
		// int[][] x={{2,14,12,23,34,5,6,78},
		// {12,14,12,23,34,5,6,78},
		// {4,14,12,24,34,5,6,78},
		// {34,14,32,23,34,5,6,78},
		// {44,14,12,63,34,5,6,78},
		// {21,54,12,23,34,5,6,78},
		// };
		// //1、先找出二维数组里面有多少个偶数
		// int a=0; //记录偶数个数
		// for(int i=0;i<x.length;i++){
		// for(int j=0;j<x[i].length;j++){
		// if(x[i][j]%2==0){
		// a++;
		// }
		// }
		// System.out.println();
		// }
		// //2、声明一个一维数组（长度与偶数个数一致）
		// int[] y=new int[a];
		// //把二维数组中偶数依次放入一维数组
		// int t=0; //模拟一维数组的下标
		// for(int i=0;i<x.length;i++){
		// for(int j=0;j<x[i].length;j++){
		// if(x[i][j]%2==0){ //判断是否为偶数
		// y[t]=x[i][j]; //开始赋值
		// t++;
		// }
		// }
		// }
		// System.out.println();
		// //4、打印一维数组
		// for(int b : y){
		// System.out.print(b+"\t");
		// }

		// 2、二维数组的数据初始化 以及如何遍历二维数组并打印，求数组当中的最大值与最小值，以及和
		// 二维数组初始化
		// int[][] x = { { 1, 23, 34, 3, 21, 5 }, { 3, 45, 565, 5, 4, 3 },
		// { 3, 4, 65, 75, 5, 56, 56 } };
		// int max = x[0][0], min = x[0][0]; //声明最大、小值
		// int sum = 0; //声明和，初始值为0
		// // 遍历打印二维数组
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// sum += x[i][j]; //赋值每个元素到和中
		// }
		// System.out.println(); //换行
		// }
		//
		// //求最大、小值与和
		// for (int i = 0; i < x.length - 1; i++) {
		// for (int j = 0; j < x[i].length - 1 - i; j++) {
		// if (max < x[i][j]) {
		// max=x[i][j];
		// }
		// if (min>x[i][j]) {
		// min=x[i][j];
		// }
		// }
		// }
		//		
		// System.out.println("最大值："+max);
		// System.out.println("最小值："+min);
		// System.out.println("和："+sum);

		// 3、二维数组的使用：定义8*8的二维数组，求对角线的和（坐标相同）
		//声明8*8二维数组（坐标相同）
		// int[][] x={{2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54}
		// };
		// int sum=0; //装对角线和
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// if(i==j || i+j==7){ //if(左上-右下对角线的元素 || 右上-坐下对角线的元素)
		// sum+=x[i][j];
		// }
		// }
		// }
		// System.out.println("对角线和："+sum);

		// 4、(挑战题)使用二维数组完成：要求使用循环。
		// 示例十:杨辉三角
		// 1 0 0 0 0
		// 1 1 0 0 0
		// 1 2 1 0 0
		// 1 3 3 1 0
		// 1 4 6 4 1

		// while (true) {
		// Scanner mys = new Scanner(System.in); // 输入构造器
		// System.out.println("构造杨辉三角"); // 构造内容标题
		// System.out.println("请输入要构造的大小(x*x),x:"); //此题大小为5*5,故此处输入5
		// int a = mys.nextInt(); // 获取输入的大小:x
		// int[][] x = new int[a][a]; // 声明二维数组，把大小赋值给数组
		// // 构造杨辉三角
		// for (int i = 0; i < x.length; i++) {
		// x[i][0] = 1;
		// x[i][i] = 1;
		// if (i >= 2) {
		// for (int j = 1; j <= i - 1; j++) {
		// x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
		// }
		// }
		// }
		// // 打印杨辉三角
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// }
		// System.out.println();
		// }
		// System.out.println(); //换行
		// }

	}
}
