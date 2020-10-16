package wrok001;

import java.awt.image.BandCombineOp;
import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 1.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("你是男人吗？");
		// boolean f=mys.nextBoolean();
		// if (f==true) {
		// System.out.println("原来你是男人呀，呵呵");
		// }
		// if (f==false) {
		// System.out.println("你的性别难道是女？");
		// }

		// 2.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mys.nextInt();
		// if (x>1000) {
		// System.out.println("输入的数>=1000");
		// }else {
		// System.out.println("输入的数<1000");
		// }

		// 3.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mys.nextInt();
		// if (x%2==0) {
		// System.out.println("这个数是偶数");
		// }else {
		// System.out.println("这个数是奇数");
		// }

		// 4.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mys.nextInt();
		// if (x%2==1) {
		// System.out.println("是奇数");
		// }

		// 5.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数a:");
		// int a=mys.nextInt();
		// System.out.println("请输入一个整数b:");
		// int b=mys.nextInt();
		// if (a>=b) { //a:3 b:2
		// int c;
		// c=b; //a:3 b:2 c:2
		// b=a; //a:3 b:3 c:2
		// a=c; //a:2 b:3 c:2
		// System.out.println("a:"+a+",b:"+b);
		// }else {
		// System.out.println("a:"+a+",b:"+b);
		// }

		// 6.
		// Scanner mysScanner=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mysScanner.nextInt();
		// if (x==0) {
		// System.out.println("它等于0");
		// }else if(x>0) {
		// System.out.println("它大于0");
		// }else {
		// System.out.println("它小于0");
		// }

		// 7.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mys.nextInt();
		// if (x==0) {
		// System.out.println("生成了一只白猪");
		// }else if (x==1) {
		// System.out.println("生成了一只黑猪");
		// }else if (x==2) {
		// System.out.println("生成了一只红猪");
		// }else {
		// System.out.println("生成了一只变形猪");
		// }

		// 8.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个整数:");
		// int x=mys.nextInt();
		// //逻辑运算符 ||或者： &单并： &&双并：
		// if (x>=0 && x<=100) {
		// System.out.println("整数>=0 and 整数<=100");
		// }else if (x>100) {
		// System.out.println("整数>100");
		// }else {
		// System.out.println("整数<0");
		// }

		// 9.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入电视机的价格:");
		// double x=mys.nextDouble();
		// System.out.println("请输入冰箱的价格:");
		// double y=mys.nextDouble();
		// double sum=x+y;
		// if (sum<100) {
		// System.out.println("总价格:"+sum);
		// }else if (sum>=100&&sum<1000) {
		// double sum1=sum*0.9;
		// System.out.println("总价格:"+sum1);
		// }else if (sum>=1000&&sum<=5000) {
		// double sum2=sum*0.8;
		// System.out.println("总价格:"+sum2);
		// }else if (sum>5000) {
		// double sum3=sum*0.7;
		// System.out.println("总价格:"+sum3);
		// }

		 //1.用户输入5个数，求出5个数的和
		// Scanner mys=new Scanner(System.in);
		// int sum=0;
		// for (int i = 0; i < 5; i++) { //i表示循环次数
		// System.out.println("请输入五个整数:");
		// int x=mys.nextInt(); //x每次用户输入的数字
		// sum+=x;
		// }
		// System.out.println("总和为："+sum);

		// 2.键盘输入一个数字n，求出1-n之间能被5或者3整除的数字
		// Scanner mys=new Scanner(System.in);
		// System.out.println("请输入一个数字(n):");
		// int n=mys.nextInt();
		// for (int i = 1; i < n; i++) {
		// if (i%5==0 || i%3==0) {
		// System.out.println(i);
		// }
		// }

		// 3.猜5次，以对错来记数，数字范围是（0-3）//必须猜对5次才退出

		// //老师讲解正确版:
		// Scanner mys = new Scanner(System.in);
		// Random myr = new Random();
		// int count = 0; // 用户猜对的次数
		// int count1 = 0; // 用户猜的次数
		// while (true) {
		// if (count == 5) { // 猜对了5次
		// System.out.println("你通过了！");
		//
		// break; // 停止-结束
		// }
		// for (int i = 0; i < 5; i++) {
		// int r = myr.nextInt(4); // 电脑随机的数字
		// System.out.println(r); // 电脑随机数
		// System.out.println("请输入你要猜的数：");
		// int x = mys.nextInt(); // 用户输入的数组
		// if (x == r) {
		// System.out.println("你猜对了");
		// count++; // count=count+1;
		// } else {
		// System.out.println("你猜错了!");
		// }
		// System.out.println("我猜对的次数：" + count);
		// count1++;
		// System.out.println("我猜了的次数：" + count1);
		// System.out.println(); // 空行
		// } // for循环结束
		// if (count == 5) { // 猜对了5次
		// count1--;
		// }
		// if (count1 == 5) { // 用户猜了5次
		// count = 0; // 重置猜对的次数
		// count1 = 0; // 重置猜的次数
		// System.out.println("我被重置了");
		// }
		// } // while循环结束

		// 3.温故，练习版
		// Scanner mys = new Scanner(System.in); // 用户输入构造器
		// Random myr = new Random(); // 随机数生成器
		// int a = 0; // 用户猜对的次数
		// int b = 0; // 用户猜了的次数
		// while (true) { //无限循环输入
		// if (a==5) { //猜对五次-提示‘通关’，break-结束
		// System.out.println("恭喜你，游戏已通关！");
		// break;
		// }
		// for (int i = 0; i < 5; i++) { //五次一回合
		// int y = myr.nextInt(6); // 随机生成的数
		// System.out.println("电脑随机数："+y); //输出电脑生成的随机数
		// System.out.println("请输入你要猜的数：(0-5)"); //提示用户输入
		// int x = mys.nextInt(); // 用户输入的数
		// if (x == y) { //判断用户是否猜对
		// System.out.println("恭喜！你猜对了");
		// a++; //猜对次数+1
		// } else {
		// System.out.println("你猜错了!");
		// }
		// System.out.println("你猜对的次数：" + a);
		// b++; //猜的次数+1
		// System.out.println("你猜了的次数：" + b);
		// System.out.println(); //空行
		// if (a==5) { //判断猜对五次 -
		// b=b-2; //（让for后面的if(b==5)判断不进行，直接进入if(a==5)判断，并输出通关，结束游戏）
		// }
		// } // for结束
		// if (b==5) { //猜5次一个回合
		// a=0; //清零猜对的次数
		// b=0; //清零猜了的次数
		// System.out.println("本回合结束，游戏已重置");
		// System.out.println(); //空行
		// }
		// } // while结束

		// 4、编写Java程序，计算100~999之间的全部“水仙花数”的平均值所谓“水仙花数”是指一个三位数，其各位数字的立方和等于该数本身。例如：153=1^3+5^3+3^3，故153是
		// double x=0; //水仙花数的个数
		// double sum=0; //水仙花数的和
		// for (int i = 100; i < 1000; i++) {
		// int a=i/100; //取百位数
		// int b=(i-100*a)/10; //取十位数 另外用法：(i%100/10)
		// int c=(i-b*10-a*100); //取个位数 另外用户：(i%10)
		// if (i==c*c*c+b*b*b+a*a*a) { //判断是否为水仙数
		// sum+=i; //sum=sum+1;
		// x++; //个数加一
		// }
		// }
		// System.out.println("所求平均值为："+sum/x); //sum/x 总和/总个数-平均值

		// 5、计算1+3+5+。。。。。。当加到他的和是500时
		// int sum = 0; // 赋值：和
		// for (int i = 0; sum <= 500; i++) { // 判断和是否小于500
		// if (i % 2 == 1) { // 判断是否为奇数
		// sum += i;
		// }
		// }
		// System.out.println("所求和为：" + sum);

		// 老师讲解版
		// int sum=0; //求和
		// for (int i = 1; ; i+=2) {
		// sum+=i;
		// if (sum>=500) { //退出条件
		// System.out.println("达到指定数："+i);
		// System.out.println("和为："+sum);
		// break;
		// }
		// }

		// 6、用户输入年、月、日，求出那一天是本年度的第多少天
		// Scanner mys = new Scanner(System.in); // 输入构造器
		// while (true) { // 无限循环输入-判断-输出结果
		// System.out.println("请输入：年 月 日"); // 提示用户输入
		// int year = mys.nextInt(), month = mys.nextInt(), date = mys
		// .nextInt(); // 输入年月日
		// int sum = 0; // 总天数
		// int leap = 0; // 闰年闰月天数
		// switch (month) { // 计算某一月之前的天数
		// case 1:
		// sum = 0;
		// break;
		// case 2:
		// sum = 31;
		// break;
		// case 3:
		// sum = 59;
		// break;
		// case 4:
		// sum = 90;
		// break;
		// case 5:
		// sum = 120;
		// break;
		// case 6:
		// sum = 151;
		// break;
		// case 7:
		// sum = 181;
		// break;
		// case 8:
		// sum = 212;
		// break;
		// case 9:
		// sum = 243;
		// break;
		// case 10:
		// sum = 273;
		// break;
		// case 11:
		// sum = 303;
		// break;
		// case 12:
		// sum = 334;
		// break;
		//
		// default:
		// System.out.println("输入有误!请重新输入"); // 用户输入有误的提示
		// break;
		// }
		// sum += date; // 加上当月的天数
		// if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { // 判断闰年闰月
		// leap = 1;
		// } else {
		// leap = 0;
		// }
		// if (leap == 1 && month > 2) { // 判断是闰年，输入月份大于2月总天数+1
		// sum++;
		// }
		// System.out.println("你输入的这天是本年度的：" + sum + "天"); // 输出结果
		// System.out.println(); // 空格
		// }

		// 老师讲解版
		// Scanner mys = new Scanner(System.in);
		// System.out.println("请输入年份：");
		// int y = mys.nextInt(); // 接收到年
		// System.out.println("请输入月份：");
		// int m = mys.nextInt(); // 接收到月
		// System.out.println("请输入日期：");
		// int d = mys.nextInt(); // 接收日期
		// // 以本年度的1月1日(2020-1-1)
		// int sum = 0; // 总天数
		// for (int i = 1; i < m; i++) { // 从本年的第一天到所在月份的天数
		// if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10
		// || i == 12) { // 大月(31)
		// sum += 31;
		// }
		// if (i == 4 || i == 6 || i == 9 || i == 11) { // 小月(30)
		// sum += 30;
		// }
		// if (i == 2) { // 平月
		// sum += 28;
		// if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { //闰年判断
		// sum++;
		// }
		// }
		// }
		// sum += d; // 把当月天数加入
		// System.out.println("所输入日期是今年的第"+sum + "天");

		// 7、开发一个猜拳游戏（石头剪刀布），每次用户可以玩10次，游戏结束之后，要告诉用户得分情况（赢了加3分 平了得1分 输了减1分）
		// int i = 1; // 赋值：局数，初始为零
		// int sum = 2; // 赋值用户初始分数为：2
		// while (i < 11) { // 局数限制：10局
		// Scanner mys = new Scanner(System.in); // 用户输入构造器
		// Random myr = new Random(); // 随机数构造器
		// int x = myr.nextInt(3); // 随机数生成：(0,1,2)分别为(石头、剪刀、布)
		// System.out.println("电脑随机数："+x); //显示电脑随机数
		// System.out.println("当前分数："+sum); //显示用户当前分数
		// System.out.println("请输入你的选择：(0:石头,1:剪刀,2:布)");
		// System.out.println("第" + i + "局"); // 显示当前局数
		// int y = mys.nextInt(); // 用户输入的选择
		// switch (x) { // 判断随机数
		// case 0: // 电脑出石头
		// switch (y) { // 判断用户输入的选择
		// case 0: // 用户出石头
		// System.out.println("平局！");
		// sum += 1; // 平局：总分+1分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// case 2: // 用户出布
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// case 1: // 电脑出剪刀
		// switch (y) { // 判断用户的选择
		// case 0: // 用户出石头
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("平局！");
		// sum += 1; // 平局：+1分
		// break;
		// case 2:
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// case 2: // 电脑出布
		// switch (y) { // 判断用户输入的选择
		// case 0: // 用户出石头
		// System.out.println("你输了！");
		// sum -= 1; // 输了：-1分
		// break;
		// case 1: // 用户出剪刀
		// System.out.println("你赢了！");
		// sum += 3; // 赢了：+3分
		// break;
		// case 2: // 用户出布
		// System.out.println("平局！");
		// sum += 1; // 平局：+1分
		// break;
		// default:
		// System.out.println("输入有误，请重新输入！"); // 输入其他数的提示
		// break;
		// }
		// break;
		// }
		// i++; // 循环一次游戏后局数+1局
		// System.out.println(); // 空格一行(美化格式)
		// }
		// System.out.println("结束"); // 游戏结束
		// System.out.println(); //空行
		// System.out.println("你的游戏总分是：" + sum); // 告诉用户最终得分
		// System.out.println("游戏局数：" + (i - 1)); // 查看游戏局数
		// // 个性化提示
		// if (sum <= 3) { // 总分小于3
		// System.out.println("继续努力吧！");
		// } else if (3 < sum & sum <= 9) { // 总分为3-9之间
		// System.out.println("还不错！加把劲儿吧");
		// } else if (sum > 9) { // 总分大于9
		// System.out.println("你真厉害！不愧为大佬");
		// }

		// 1、石头 2、剪刀 3、布
		// Scanner mys = new Scanner(System.in); // 输入构造器
		// Random myr = new Random(); // 随机数生成
		// int sum=2; //用户分数
		// for (int i = 0; i < 10; i++) {
		// int r = myr.nextInt(3)+1; // 接收随机数123
		// System.out.println("电脑随机数"+r);
		// System.out.println("请输入你的选择(1、石头  2、剪刀  3、布)："); // 提示用户输入选择
		// int x = mys.nextInt(); // 接收用户录入的
		// if (r == 1) { // 电脑随机到石头
		// System.out.println("电脑出了石头");
		// if (x == 1) { // 用户选择石头
		// System.out.println("平局");
		// sum += 1;
		// }
		// if (x == 2) { // 用户选择剪刀
		// System.out.println("输了");
		// sum -= 1;
		// }
		// if (x == 3) { // 用户选择布
		// System.out.println("赢了");
		// sum += 3;
		// }
		// }
		// if (r == 2) { // 电脑随机到剪刀
		// System.out.println("电脑出了剪刀");
		// if (x == 1) { // 用户选择石头
		// System.out.println("赢了");
		// sum += 3;
		// }
		// if (x == 2) { // 用户选择剪刀
		// System.out.println("平局");
		// sum += 1;
		// }
		// if (x == 3) { // 用户选择布
		// System.out.println("输了");
		// sum -= 1;
		// }
		// }
		// if (r == 3) { // 电脑随机到布
		// System.out.println("电脑出了布");
		// if (x == 1) { // 用户选择石头
		// System.out.println("输了");
		// sum -= 1;
		// }
		// if (x == 2) { // 用户选择剪刀
		// System.out.println("赢了");
		// sum += 3;
		// }
		// if (x == 3) { // 用户选择布
		// System.out.println("平局");
		// sum += 1;
		// }
		// }
		// }
		// System.out.println("用户得分："+sum);

		// 8、循环录入Java课的学生成绩，统计分数大于等于80分的学生比例 (当用户输入一个999退出)
		// Scanner mys = new Scanner(System.in); // 输入构造器
		// double sum = 0; // 分数大于80分的学生个数
		// double jsum = 0; // 已录入分数的学生个数
		// while (true) { // 无限循环录入(死循环)
		// System.out.println("请输入学生的成绩："); // 成绩录入字符提示
		// double x = mys.nextInt(); // 用户输入成绩
		// if (x == 999) { // 用户输入999时
		// System.out.println(); // 空行
		// System.out.println("退出"); // 显示退出
		// break; // 退出
		// }
		// if (x >= 80) { // 录入分数大于80
		// sum++; // 分数大于80的个数+1
		// jsum++; // 录入学生总数+1
		// } else { // 录入其他分数
		// jsum++; // 录入学生总数+1
		// }
		// System.out.println("分数大于80分的学生百分比：" + ((sum / jsum) * 100) + "%"); //
		// 输出统计百分比
		// System.out.println("分数大于80分的学生比列：" + (int) (sum) + ":"
		// + (int) (jsum));
		// // 输出统计比列
		// System.out.println(); // 空格-格式美化
		// }

		// 9、用户猜数字:先在0-5之间产生随机数，用户输入数字，对则跳出不玩了，错则继续再猜
		// Scanner mys = new Scanner(System.in); // 用户输入构造器
		// Random myr = new Random(); // 随机数生成器
		// int i = 0; // 赋值：猜对的次数
		// while (i < 1) { // 判断猜对次数
		// int r = myr.nextInt(6); // 随机数（0-5）
		// System.out.println("电脑随机数：" + r); // 电脑随机数
		// System.out.println("请输入你要猜的数：(0-5)");
		// int y = mys.nextInt();
		// if (0 <= y && y <= 5) {
		// if (y == r) {
		// i++; // 猜对次数+1
		// System.out.println("真棒，你猜对了!");
		// System.out.println(); // 空行
		// } else {
		// System.out.println("很遗憾，你猜错了!");
		// System.out.println(); // 空行
		// }
		// } else {
		// System.out.println("对不起，你的输入有误请重新输入！");
		// System.out.println(); // 空行
		// }
		// }

		// 数据类型(变量)
		// int 整型 long 长整型 short 短整型 byte 字节
		// double 小数 float 浮点型
		// char 字符 booleam 布尔类型
		// string 字符串

		// 计算运算符
		// 数值类型：做数学计算(/:取整 %:取余)
		// 非数值类型：+(拼接)

		// x<y<z:JAVA没有这样比较运算符写法

		// 逻辑运算符(|| & &&)

		// 三元运算符 布尔类型?a:b 当布尔类型为true，就取a。当布尔类型为：false，就取b

		// < + * || && 同一行出现这些，会按照下面顺序执行，不会从左到右执行
		//<   +  *   ||   &&
		//()-->!(反面意思)-->计算运算符-->比较运算符-->&&-->||-->=(赋值)

		// 提交判断
		// if (condition) {
		//			
		// }
		//		
		// switch (key) {
		// case value:
		//			
		// break;
		//
		// default:
		// break;
		// }

		// 循环(while do while for )
		
		int name[]={1,4,5,7};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		
		
		
		
		

	}
}