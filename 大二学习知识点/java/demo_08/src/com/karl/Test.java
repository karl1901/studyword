/**
 * 
 */
package com.karl;

import java.sql.Blob;
import java.sql.Date;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.Data;

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

		// 循环嵌套(while--不推荐使用循环嵌套)
		// int i=0; //变量i被2个while共用
		// int j=0;
		// while(i<10){
		// System.out.println("跑步");
		// i++;
		// while(j<5){
		// System.out.println("做俯卧撑");
		// j++;
		// }
		// }
		// System.out.println(i);
		

		 //跑圈(每跑一个圈做10个俯卧撑)
//		 for (int i = 1; i <= 10; i++) {
//		 System.out.println("你跑了"+i+"圈");
//		 for (int j = 1; j <= 5; j++) {
//		 System.out.println("你做了"+j+"个");
//		 }
//		 }
		

		// 数组
		// int[] i={1,3,7,4,8}; //一维数组
		// System.out.println(i[1]);
		// System.out.println(i.length);
		// for (int j = 0; j < i.length; j++) { //遍历打印所有数组类容
		// System.out.println(i[j]);
		// System.out.println("i["+j+"]="+i[j]); //打印效果 i[0]=1;
		// }
		

		// ********
		// ********
		// ********
		// ********
		// ********
		// for (int i = 0; i < 5; i++) { // 外循环
		// for (int j = 0; j < 8; j++) { // 内循环
		// System.out.print("*");
		// }
		// System.out.println(); // 换行
		// }
		// System.out.println("换行1");
		// System.out.println("换行2");
		// System.out.print("不换行1");
		// System.out.print("不换行2");
		

		// *
		// **
		// ***
		// ****
		// for (int i = 0; i < 4; i++) {
		// for (int j = 0; j <= i; j++) {
		// System.out.print("*");
		// }
		// System.out.println(); // 换行
		// }
		

		// ****
		// ***
		// **
		// *
		// for (int i = 1; i <= 4; i++) {
		// // 第一次：i=1 第二次:i=2
		// for (int j = i; j <= 4; j++) {
		// // 整体第一次j=i=1 第二次j=i=2
		// System.out.print("*");
		// }
		// System.out.println(); // 换行
		// }
		

		// ****
		//  ***
		//   **
		//    *
		// for (int i = 0; i < 4; i++) {
		// for (int j = 0; j < i; j++) { //打印空白 规律（0-1-2-3）递增
		// System.out.print(" ");
		// }
		// for (int j = i; j < 4; j++) { //打印星星 规律（4-3-2-1） 递减
		// System.out.print("*");
		// }
		// System.out.println(); //换行
		// }
		

		//     *
		//    ***
		//   *****
		//  *******
		// *********
		// for (int i = 0; i < 5; i++) {
		// for (int j = i; j < 4; j++) { //打印空白 规律（4-3-2-1-0） 递减 递减改前面
		// System.out.print(" ");
		// }
		// for (int j = 0; j < i*2+1; j++) { //打印星星 规律（1-3-5-7-9）呈奇数递增 递增改后面
		// 此处两种方法都可以（j<i*2+1）（j<=i*2）
		// System.out.print("*");
		// }
		// System.out.println(); //空行
		// }
		

		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
//		 for (int i = 0; i < 5; i++) {
//			for (int j = i; j < 4; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i*2; j++) {
//				System.out.print("*");
//			}
//		 System.out.println(); //換行
//		 }
//		 for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print(" ");
//			}
//			for (int j2 = i; j2 < 7-i; j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		//     *             
		//    * *              
		//   *   *             
		//  *     *          
		// *       *         
		//  *     *          
		//   *   *           
		//    * *            
		//     *             
//          System.out.println("    *");
//          for (int i = 0; i < 4; i++) {
//					for (int j = i; j < 3; j++) {
//						System.out.print(" ");
//					}
//					for (int j = 0; j < 1; j++) {
//						System.out.print("*");
//					}
//					for (int j = 0; j < i*2+1; j++) {
//						System.out.print(" ");
//					}
//					for (int j = 0; j < 1; j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//		}
//          for (int i = 0; i < 3; i++) {
//				for (int j = 0; j <= i; j++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < 1; j++) {
//					System.out.print("*");
//				}
//				for (int j = 0; j < 5-i*2; j++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < 1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//	}
//          System.out.println("    *");
         

//		int lay=5;
//        for (int i=1;i<=lay;i++) //i表示空心菱形上半部分行数；类似于金字塔行数
//        {
//            for (int j=1;j<=lay-i;j++) //j表示每行"*"号前面的空格数
//            {
//                System.out.print(" ");
//            }
//            for (int k=1;k<=2*i-1;k++) //k表示每行要打印的"*"号
//            {
//                 if (k==1||k==2*i-1) //如果要打印的"*"是第一个或最后一个则打印出来
//                {
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" "); //如果要打印的"*"不是第一个或最后一个则打印空格
//            }
//            System.out.println();
//        }        //以上打印出来的是空心菱形的上半部分
//        for (int i=1;i<=lay-1;i++)  //空心菱形下半部分的行数为lay-1行；比如上半部分4行，则下半部分为3行才能构成菱形
//        {
//            for (int j=1;j<=i;j++) //每行空格数
//            {
//                System.out.print(" ");
//            }
//            for (int k=1;k<=2*(lay-i)-1;k++) //下半部分每行总的"*"数
//            {
//                if (k==1||k==2*(lay-i)-1) //如果"*"处在第一和最后一位则打印出来
//                {
//                    System.out.print("*");
//                }else
//                    System.out.print(" "); //如果"*"不是处在第一和最后一位则打印出空格
//            }
//            System.out.println();
//        }
		
//		System.out.println("    *");
//		System.out.println("   * *");
//		System.out.println("  *   *");
//		System.out.println(" *     *");
//		System.out.println("*       *");
//		System.out.println(" *     *");
//		System.out.println("  *   *");
//		System.out.println("   * *");
//		System.out.println("    *");
		
		//九九乘法表
//		 for (int i = 0; i <= 9; i++) {
//		 for (int j = 1; j <= i; j++) {
//		 int t=j*i;
//		 System.out.print(j+"*"+i+"="+t+"  "); // \t：空格 \n：換行
//		 }
//		 System.out.println(); //換行
//		 }
		
//		 1、每跑一圈 做十个俯卧撑
//		 for (int i = 1; i <= 10; i++) {  //设置跑十圈
//			 System.out.println("你跑了"+i+"圈");
//			for (int j = 1; j <= 10; j++) {  //做10次俯卧撑
//				System.out.println("你做了"+j+"个俯卧撑");
//			}	
//		}
		
//		 2、跑100圈 ，第一圈 做一个俯卧撑 第二圈 做两个俯卧撑 。。。。。
//		for (int i = 1; i <= 100; i++) {  //设置跑100圈
//			System.out.println("你跑了"+i+"圈");
//			for (int j = 1; j <= i; j++) {  //跑几圈做几个俯卧撑（循环）
//				System.out.println("你做了"+j+"个俯卧撑");
//			}
//		}
		
//		 3\打印一个矩形
//		 		********
//		 		********
//		 		********
//		 		********
//		 		********
//		for (int i = 1; i <= 5; i++) {  //共5行
//			for (int j = 0; j < 8; j++) { //每行打印 * 的个数
//				System.out.print("*");   //不换行打印 *
//			}
//			System.out.println();  //换行
//		}
		
//		 4、		//题目二：
//		 		*
//		 		**
//		 		***
//		 		****
//		for (int i = 1; i <= 4; i++) {  //共4行
//			for (int j = 0; j < i; j++) {  //每行打印 * 呈+1形式递增 
//				System.out.print("*");  //不换行打印 *
//			}
//			System.out.println();  //换行
//		}
		
//		 5、九九乘法表
//		for (int i = 1; i <= 9; i++) {  //共9行
//			for (int j = 1; j <= i; j++) {  //第几行循环几次
//				int s=i*j;   //赋值变量s为每一个乘积
//				System.out.print(j+"*"+i+"="+s+"\t");  //设置每行乘式样式
//			}
//			System.out.println();  //换行
//		}
		
//		 6、 1!+2!+3!+4!+....+10!=? 两种方式实现  （1*1+1*2+1*2*3+1*2*3*4+.....+1*2*3*4*5*6*7*8*9*10=多少？）
//		int sum=0;  //声明sum为所求和(阶乘和)
//		int x=1;  //每次都是1*....
//		for (int i = 1; i <= 10; i++) {  //循环10次
//			x*=i;  //第几行就1*几
//			sum+=x;  //乘完再把和相加
//		}
//		System.out.println("sum="+sum);  //输出阶乘和
		
//		int sum=0; //阶乘和
//		for (int i = 1; i <= 10; i++) {  //由阶乘个数决定
//			int t=1;
//			for (int j = 1; j <= i; j++) {
//				t*=j;
//			}
//			sum+=t;
//		}
//		System.out.println("阶乘和为："+sum);
		
//		 7：
//		 		  ****
//		 		  ***
//		 		  **
//		 		  *
//		for (int i = 1; i <= 4; i++) {  //共四行
//			for (int j = i; j <= 4; j++) {  //每行打印 * 呈-1形式递减
//				System.out.print("*");  //不还行打印 *
//			}
//			System.out.println();  //换行
//		}
		
		//8、正立三角形(用户输入多少行，就打印多少行)
//		Scanner mys=new Scanner(System.in);  //用户输入构造器
//		while (true) {  //可以无限构造，玩到用户不想玩
//			System.out.println("请输入你要构造三角形的的层数：");  //提示用户输入要构造三角形的层数
//			int sr=mys.nextInt();  //获取输入的层数
//			System.out.println();  //换行
//			System.out.println("构成后的三角形：");  //提示字
//			System.out.println();  //换行
//			for (int i = 1; i <= sr; i++) {  //共sr(用户输入的行数)行
//				for (int j = i; j < sr; j++) {  //打印每行前面的空格  以输入的行数为基准，呈-1形式递减
//					System.out.print(" ");  //不换行打印空格
//				}
//				for (int k = 1; k <= 2*i-1; k++) {  //k为行数;每行循环的次数(呈奇数递增);
//				    if (k==1 || k==2*i-1 ) {  //判断循环次数为每行第一次或者为最后一次则打印一个 *  第一行则打印一个 *
//						System.out.print("*");  //不换行打印 *
//					}else if(i==sr){  //判断最后一行循环次数中间部分都为 *
//						System.out.print("*");
//					}else {  //除了第一行和最后一行，其他行数中间部分打印的空格
//						System.out.print(" ");
//					}
//				}
//				System.out.println();  //换行
//			}
//			System.out.println();
//			System.out.println();
//		}
		
		
//           ^^^^^^^^^           ^^^^^^^^^                
//        ^^^^^^^^^^^^^^^^^   ^^^^^^^^^^^^^^^^^            
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^          
//     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^         
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
//     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^         
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^          
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^          
//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^            
//         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^             
//          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^              
//            ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^                
//              ^^^^^^^^^^^^^^^^^^^^^^^^^                  
//                ^^^^^^^^^^^^^^^^^^^^^                    
//                   ^^^^^^^^^^^^^^^                       
//                      ^^^^^^^^^                          
//                         ^^^           
		
//		for(float y = (float) 1.5;y>-1.5;y -=0.1)  {  
//            for(float x= (float) -1.5;x<1.5;x+= 0.05){  
//                  float a = x*x+y*y-1;  
//                  if((a*a*a-x*x*y*y*y)<=0.0)  {    
//                         System.out.print("^");  
//                  }  
//                  else  
//                         System.out.print(" ");  
//            }  
//            System.out.println();  
//        } 
//		
//		 9//题目：
//		 		****
//		 		 ***
//		 		  **
//		 		   *
//		for (int i = 1; i <= 4; i++) {  //共4行
//			for (int j = 1; j < i; j++) {  //每行打印的空格数  呈+1递增
//				System.out.print(" ");  //不换行打印空格
//			}
//			for (int j = i; j <= 4; j++) {  //每行打印的 * 呈-1递减
//			    System.out.print("*");	//不换行打印 *
//			}
//			System.out.println();  //换行
//		}
		
//		 10、等腰三角形
//		 	    *
//		 	   ***
//		 	  *****
//		 	 *******
//		 	*********
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 4; j++) {  //每行前面空格呈总行数-1并每行-1递减
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2*i-1; j++) {  //每行打印 *数量呈奇数递增规律 
//				System.out.print("*");
//			}
//			System.out.println();  //换行
//		}
		
		
//		 11、求10-50之间的完数（因子之和等于自己本身）
//		for (int i = 10; i <= 50; i++) {  //数的区间(10-50)
//			int sum=0;
//			for (int j = 1; j < i; j++) {
//				if (i%j==0) {  //被整除了(j就是i的因子)
//					sum+=j;  //求因子和
//				}
//			}
//			if (sum==i) {  //判断因子和是否等于它本身
//				System.out.println(i);  //输出是完数的i
//			}
//		}
		
//		 12、求出 100-200之间的素数(只能1和自己整除的数，因子只有自己和本身)
//		for (int i = 100; i <= 200; i++) {
//			boolean f=true;  //假如这个数是素数(布尔类型：判断依据)
//			for (int j = 2; j < i; j++) {
//				if (i%j==0) {  //表示里面有因子
//					f=false;  //不是素数
//					break;  //找到一个不自己本身和1的因子就停止
//				}
//			}
//			if (f==true) {
//				System.out.println("素数"+i);
//			}
//		}

//		 13
//
//		             *
//		 		    ***
//		 		   *****
//		 		  *******
//		 		   *****
//		 		    ***
//		             *
		//上面正立大金字塔
//		for (int i = 1; i <= 4; i++) {
//			for (int j = i; j <= 3; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//下面倒立小金字塔
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 7-i*2; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//第一种做法：上下两部分
//		//上部分
//		for (int i = 0; i < 4; i++) {
//			for (int j = i; j < 3; j++) {  //打印空格
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i*2; j++) {  //打印星星
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//下部分
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j <= i; j++) {  //打印空格
//				System.out.print(" ");
//			}
//			for (int j = i*2; j < 5; j++) {  //打印星星
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		//第二种做法：
//		while (true) {  //无限构造
//			Scanner mys=new Scanner(System.in);
//			System.out.println("请输入要构造菱形的个数：");
//			int a=1;
//			int b=mys.nextInt();
//			System.out.println("构造的菱形：");
//			System.out.println();
//			while (a<=b) {  //构造的个数
//				System.out.println("   "+"第"+a+"个");
//				int zh=7/2+1;  //找中间
//				for (int i = 1; i <= 7; i++) {
//					int kg=0;  //记录打印的空格数
//					int xx=0;  //记录打印的星星数
//					if (i<=zh) {  //判断上半部分 
//						kg=zh-i;  //空格逻辑：-1递减
//						xx=i*2-1;  //星星逻辑：奇数递增
//					}else {  //判断下半部分
//						kg=i-zh;  //空格：+1递增
//						xx=(7-i)*2+1;  //星星：奇数递减
//					}
//					for (int j = 1; j <= kg; j++) {  //打印空格
//						System.out.print(" ");
//					}
//					for (int j = 1; j <= xx; j++) {  //打印星星
//						System.out.print("*");
//					}
//					System.out.println();  //空行
//				}
//				System.out.println();
//				a++;
//			}
//		}

//		 13
//
//		             *
//		 		    * *
//		 		   *   *
//		 		  *     *
//		 		   *   *
//		 		    * *
//		             *
		//上半部分
//		for (int i = 1; i <= 4; i++) {
//			for (int j = i; j < 4; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i*2-1; k++) {
//				if (k==1 || k==i*2-1) {
//					System.out.print("*");
//				} else {
//                    System.out.print(" ");
//				}
//			}
//			System.out.println();  //换行
//		}
//		//下半部分
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int x = 1; x <= 7-i*2; x++) {
//				if (x==1 || x==7-i*2) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();  //换行
//		}
		
//		int zh=7/2+1;  //找中间
//		for (int i = 1; i <= 7; i++) {
//			int kg=0;  //记录打印的空格数
//			int xx=0;  //记录打印的星星数
//			if (i<=zh) {  //判断上半部分 
//				kg=zh-i;  //空格逻辑：-1递减
//				xx=i*2-1;  //星星逻辑：奇数递增
//			}else {  //判断下半部分
//				kg=i-zh;  //空格：+1递增
//				xx=(7-i)*2+1;  //星星：奇数递减
//			}
//			for (int j = 1; j <= kg; j++) {  //打印空格
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= xx; j++) {  //打印星星
//				if (j==1 || j==xx) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();  //空行
//		}
		

//		 16 判断101-200之间有多少个素数，并输出所有素数。所谓素数表示该数只能被1和本身整除
//		int sum=0;  //存素数个数(个数和)
//		System.out.println();
//		System.out.println("—————————————————————————————————————————————————————————————————————————————————————————");
//	     for (int i = 101; i <= 500; i++) {  //101-200区间
//			boolean x=true;  //布尔类型 x true表示是素数
//			for (int j = 2; j < i; j++) {
//				if (i%j==0) {
//					x=false;  //不是素数
//					break;
//				}
//			}
//			if (x==true) {
//				sum++;  //素数个数+1
//                System.out.print("素数："+i+"  │  ");
//                	if (sum%7==0) {
//    					System.out.println();
//    					System.out.println("—————————————————————————————————————————————————————————————————————————————————————————");
//    				}
//			}
//		}
//	    System.out.println();
//	    System.out.println("总共有"+sum+"个素数");
		
		

		
	}

}
