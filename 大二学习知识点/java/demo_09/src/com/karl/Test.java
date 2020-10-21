/**
 * 
 */
package com.karl;

import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.swing.text.html.MinimalHTMLWriter;

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

		// int[] x = new int[7];
		// x.length:拿到数组的长度
		// System.out.println(x.length);
		// x[0]=11; //[0],[1]...[5]:下标
		// x[1]=13;
		// x[3]=16;
		// x[4]=83;
		// x[5]=9379;

		// 数组创建后，每个元素会有默认值 int 声明后，若没有赋值，就会有默认值。
		// int的默认值为0 string默认值：null（空） char默认值：口
		// double默认值：0.0 boolean默认值：false

		// for (int i = 0; i < x.length; i++) {
		// System.err.println(i); //x数组所以下标
		// System.out.println(x[i]); //拿到数组所有元素
		// }

		// double[] d = new double[8]; // 装一个组的成绩
		// Scanner mys = new Scanner(System.in);
		//
		// for (int i = 0; i < d.length; i++) {
		// System.out.println("请输入你的成绩：");
		// d[i]= mys.nextDouble();
		// // d[i]=fen; //把用户输入每一次成绩给了数组对应的位置
		// }
		// //打印数组里面所有的成绩
		// for (int i = 0; i < d.length; i++) {
		// System.out.print(d[i]+"\t");
		// }

		// int[]
		// y={12,23,23,13,12,12,323,32321,13232,13232,1323,13131,13131,13213,13232343,34343,4242,343};
		// System.out.println(y.length);
		// System.out.println(y[y.length-1]); //y.length-1：拿到数组最后一个数
		// for (int i = 0; i < y.length; i++) {
		// System.out.println(y[i]); //打印数组所有元素
		// }

		// int[] z={32,23,434,54,23,234,243443};
		// //求数组里面的最大值
		// int max=z[0]; //先赋值数组第一个数为最大值
		// for (int i = 0; i < z.length; i++) { //循环数=数组长度数
		// if (max<z[i]) { //判断当前最大值是否
		// max=z[i];
		// }
		// }
		// System.out.println("最大值："+max);

		// int[] a=new int[5]; //给定数组的大小（长度）
		// // 求数组里面的最小值
		// Scanner mys=new Scanner(System.in); //用户输入构造器
		// for (int i = 0; i < a.length; i++) { //输入次数与数组长度相等
		// System.out.println("请输入录入的数："); //提示用户录入数
		// a[i]=mys.nextInt(); //把用户录入的数给相对应的位置
		// }
		// int min=a[0]; //赋值数组第一个数为最小值
		// for (int i = 0; i < a.length; i++) { //循环次数=数组长度
		// if (min>a[i]) { //判断数组里面的数是否比现有（数组第一个数）小---与现有最小值比较，若小，则赋值给最小值
		// min=a[i]; //赋值满足条件的数给最小值
		// }
		// }
		// System.out.println("录入的最小数为："+min); //打印录入的数组里面的最小数

		// int[] y={12,34,35,67,11,4};
		// //求数组的和，平均数
		// int sum=0;
		// int avg=0;
		// for (int i = 0; i < y.length; i++) {
		// sum+=y[i];
		// }
		// avg=sum/y.length;
		// System.out.println(sum);
		// System.out.println(avg);

		// //数组元素替换
		// String[] s={"张三","李四","王五","赵六"};
		// //把数组里面叫"李四"的替换为"杜牧"
		// //先找到 李四
		// boolean f=false; //表示人没有找到
		// int z=0; //找人方式2 装找到人的下标
		// for (int i = 0; i < s.length; i++) {
		// if ("李四".equals(s[i])) { //判断数组里面的元素是否为李四
		// .equals：类似于int类型中的"=="判断，这里是用于字符串的判断(字符串专有判断)
		// System.out.println("找到了："+i);
		// // s[i]="杜牧"; //人找到就改名 改名方式1
		// z=i; //方式2 把找到人的下标给z
		// break;
		// }
		// }
		//		
		// if (f==false) { //人没有找到
		// System.out.println("人没有找到");
		// }
		//		
		// if (f==true) { //判断找到了
		// s[z]="李白"; //方式2 改名为李白
		// }
		//		
		// //用来打印数组元素的for循环的子循环
		// for (String x : s) { //for(数据类型 循环变量-数组内所有元素 : 数组变量名-这里是s)
		// System.out.println(x);
		// }
		//		

		// //数组的扩容(给数组s里面加入一个杜甫，不能覆盖其他名字)
		// String[] s={"张三","李四","王五","赵六"}; //现在的数组长度为：四
		// //扩容是用新的数组来装旧数组
		// String[] str=new String[s.length+1];
		// for (int i = 0; i < s.length; i++) { //循环s数组长度，循环4次
		// str[i]=s[i]; //复制，把s数组里面所有元素给str数组
		// }
		//		
		// str[str.length-1]="杜甫"; //把数组str最后一个元素赋值为"杜甫"
		//		
		// for (String x : str) {
		// System.out.println(x);
		// }

		// 存放空间
		// int[] a = {1,2,34,5,23,21};
		// 栈:int a 堆:1,2,34....21
		// 栈:八大基本数据(当资源不被占用的时候，存放时间为30天)
		// 堆：数组的内容(对应下标的元素)

		// 作业一：
		// 1、循环输出学生姓名数组
		// String[] name={"胡辉煜","李萌","小罗"};
		// for (int i = 0; i < name.length; i++) {
		// System.out.println(name[i]);
		// }

		// 2、循环输出学生成绩数组
		// int[] x={45,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }

		// 3、求出学生成绩总和
		// int[] x={45,67,89,90};
		// int sum=0;
		// for (int i = 0; i < x.length; i++) {
		// sum+=x[i];
		// }
		// System.out.println("成绩总和为："+sum);

		// 4、求出平均分
		// int[] x={45,67,89,90};
		// double sum=0; //平均数结果可能为小数类，这里声明成绩和为小数类
		// for (int i = 0; i < x.length; i++) {
		// sum+=x[i];
		// }
		// System.out.println("平均分为："+(sum/x.length)); //和与数组长度相除就是平均数

		// 5、打印出成绩数组当中不及格的成绩:低于60分的
		// int[] x={45,34,12,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// if (x[i]<60) {
		// System.out.println(x[i]);
		// }
		// }

		// 6、将成绩数组当中低于60分的全部设为60分
		// int[] x={45,34,12,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// if (x[i]<60) {
		// x[i]=60; //若小于60分，元素修改为60
		// }
		// }
		//		
		// //打印修改后的数组，查看是否修改成功
		// for (int a : x) {
		// System.out.println(a);
		// }

		// 课后作业

		// 1、声明一个字符串的数组，空间为5个。将第一个空间的值设置为“张三”，第二个空间的值为“李四”，
		// 第三个空间的值为“王二”，第四个空间的值为“麻子”，第五个空间的值为“小红”。然后再输出所有空间中的值。
		// String[] name={"张三","李四","王二","麻子","小红"};
		// for (String x : name) {
		// System.out.println(x);
		// }

		// String[] str = new String[5];
		// str[0] = "张三";
		// str[1] = "李四";
		// str[2] = "王二";
		// str[3] = "麻子";
		// str[4] = "小红";
		// for (int i = 0; i < str.length; i++) {
		// System.out.print(str[i] + "\t");
		// }

		// 2、声明一个字符串的数组，空间为5个。使用循环接收五个学生的姓名。再使用循环输出这五个学生的姓名.
		// Scanner mys = new Scanner(System.in); //用户输入构造器
		// String[] name = new String[5]; //声明长度为5的name整型数组
		// for (int i = 0; i < name.length; i++) { //循环录入学生姓名
		// System.out.println("请输入录入学生的姓名：");
		// name[i] = mys.next(); //获取录入的学生姓名
		// if (i == (name.length - 1)) { //录入最后一个学生后
		// System.out.println("录入完毕!打印所有录入学生信息："); //提示录入完毕，开始打印学生姓名
		// for (String y : name) { //循环打印学生姓名
		// System.out.print(y + "\t");
		// }
		// }
		// }

		// 3、声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分。
		// Scanner mys = new Scanner(System.in); // 用户输入构造器
		// int[] a = new int[8]; // 声明int长度为8的数组接收成绩
		// double sum = 0; // 成绩总和为小数类型，初始值为0
		// for (int i = 0; i < a.length; i++) { //循环录入学生的成绩
		// System.out.println("请输入录入的学生的成绩：");
		// a[i] = mys.nextInt();
		// sum += a[i]; // 录入成绩后的成绩加到总和里
		// if (i == a.length - 1) { // 判断录入最后一次后就输出总分和平均分
		// System.out.println("录入学生的成绩总分为：" + sum);
		// System.out.println("平均分：" + (sum / a.length));
		// }
		// }

		// 4、声明一个char型的数组，在此数组的单元格中放入"我爱你"三个字符，然后使用循环将它反序输出。如"你爱我"。
		// char[] x = { '我', '爱', '你' }; //char字符类型的内容要用单引号('')包着
		// // 声明一个整型变量i为每次打印元素的下标 (x.length-1表示从最后一个下标开始); 判断是否大于等于第一个下标，
		// // 循环次数是数组长度 ; i-- 逆向循环输出，所以下标是递减的
		// for (int i = x.length - 1; i >= 0; i--) {
		// System.out.print(x[i]);
		// }

		// 5、循环输入5个学生的姓名及成绩放入到数组中，然后计算这5个学生的平均分，最后输出格式如下：
		// 张三 李四 麻子 王二 小燕子
		// 80 90 95 82 96
		// 平均分是：？？

		Scanner mys = new Scanner(System.in);
		int[] a = new int[5];
		String[] name = new String[5];
		double sum = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.println("请输入学生姓名：");
			name[i] = mys.next();
			System.out.println("请输入成绩：");
			a[i] = mys.nextInt();
			sum += a[i];
			if (i == (name.length - 1)) {
				for (int j = 0; j < name.length; j++) {
					System.out.print(name[j] + "\t");
				}
				System.out.println();
				for (int j = 0; j < name.length; j++) {
					System.out.print(a[j] + "\t");
				}
				System.out.println();
				System.out.println("平均分是：" + sum / name.length);
			}
		}

		// Scanner mys = new Scanner(System.in); // 输入构造器
		// String[] name = new String[5]; // 声明字符串数组长度为5，装学生名字
		// int[] a = new int[5]; // 声明整型数组长度为5，装学生成绩
		// double sum = 0; // 声明小数类型的sum装学生总成绩，初始值为0
		// for (int i = 0; i < name.length; i++) { // 按循环录入学生的姓名和成绩
		// System.out.println("请输入录入学生姓名：");
		// name[i] = mys.next();
		// System.out.println("请输入录入的学生的成绩：");
		// a[i] = mys.nextInt();
		// sum += a[i]; // 把录入的成绩加到成绩和里，后用于计算平均分
		// if (i == (name.length - 1)) { // 判断录入最后一个学生后
		// for (int j = 0; j < name.length; j++) {
		// System.out.print(name[j] + "\t"); // 循环打印录入学生的姓名
		// }
		// System.err.println(); // 空行
		// for (int j = 0; j < a.length; j++) {
		// System.out.print(a[j] + "\t"); // 循环打印录入学生的成绩
		// }
		// System.out.println(); // 空行
		// System.out.println("平均分是：" + (sum / a.length));
		// }
		// }

		// 6(挑战题)定义一个长度为10的整型数组，循环输入10个整数。然后再使用循环查找出此数组中的最大及最小值。
		// Scanner mys = new Scanner(System.in); //用户输入构造器
		// int[] x = new int[10]; //声明长度为10的整型数组
		// for (int i = 0; i < x.length; i++) { //循环录入数
		// System.out.println("请输入要录入的数：");
		// x[i] = mys.nextInt();
		// if (i == x.length - 1) { //判断录入最后一个数后
		// int max = x[0]; //声明max为最大值
		// int min = x[0]; //声明min为最小值
		// for (int i1 = 0; i1 < x.length; i1++) { //循环判断最大最小值
		// if (max < x[i1]) {
		// max = x[i1];
		// }
		// if (min > x[i1]) {
		// min = x[i1];
		// }
		// }
		// //输出最大、最小值
		// System.out.println("最大值为：" + max);
		// System.out.println("最小值为：" + min);
		// }
		// }

		// 7、定义一个长度为5的整型数组，循环输入赋值，然后将该数组中的元素复制到另外一个数组中
		// Scanner mys=new Scanner(System.in);
		// int[] a=new int[5]; //声明数组a
		// for (int i = 0; i < a.length; i++) {
		// System.out.println("请输入数：");
		// a[i]=mys.nextInt();
		// }
		//		
		// for (int y : a) {
		// System.out.print("整型数组a："+y+"\t");
		// }
		//		
		// System.out.println(); //空行
		//		
		// //声明新数组b
		// int[] b=new int[5];
		//		
		// //复制a数组元素到数组b
		// for (int i = 0; i < a.length; i++) {
		// b[i]=a[i];
		// }
		//		
		// for (int x : b) {
		// System.out.print("整型数组b："+x+"\t");
		// }

	}

}
