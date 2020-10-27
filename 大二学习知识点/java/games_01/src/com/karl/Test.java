/**
 * 
 */
package com.karl;

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

		// 推箱子
		
		// 1、游戏地图（二维数组模拟）
		int[][] map = new int[10][10];
		int x = 2, y = 8;
		map[x][y] = 1; // 人
		int x1=3,y1=2;
		map[x1][y1] = 2; // 箱子
		int x2=2,y2=7;
		map[x2][y2] = 3; // 终点
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					System.out.print("-\t");
				}
				if (map[i][j] == 1) { // 人所在位置
					System.out.print("人\t");
				}
				if (map[i][j] == 2) { // 箱子所在位置
					System.out.print("田\t");
				}
				if (map[i][j] == 3) { // 终点所在位置
					System.out.print("终点\t");
				}
			}
			System.out.println();
		}
		
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("请操作：w:上  s:下  a:左  d:右");
			String str = mys.next();
			
			if (str.equals("w")) {  //人向下走
				x--;
				if (x<0) {  //人已经到达边界
					x++;
				}
				if (map[x][y]==0) {  //人前面面是空地
					map[x][y]=1;
					map[x+1][y]=0;  //把人原来在的地方变成地图
				}
				if (map[x][y]==2) {  //前面是箱子
					x1--;
					if (x1<0) {
						x1++;
						x++;
					}
					map[x1][y1]=2;
					map[x1+1][y1]=1;
					map[x1+2][y1]=0;
				}
				if (map[x][y]==3) {  //前面是终点
					map[x][y]=1;
					map[x+1][y]=0;
				}
				if (x!=x2 || y!=y2) {  //人和终点没有重合
					map[x2][y2]=3;  //让终点重新出现
				}
			}
			
			if (str.equals("s")) {  //人向下走
				x++;
				if (x>9) {  //人已经到达边界
					x--;
				}
				if (map[x][y]==0) {  //人前面面是空地
					map[x][y]=1;
					map[x-1][y]=0;  //把人原来在的地方变成地图
				}
				if (map[x][y]==2) {  //前面是箱子
					x1++;
					if (x1>9) {
						x1--;
						x--;
					}
					map[x1][y1]=2;
					map[x1-1][y1]=1;
					map[x1-2][y1]=0;
				}
				if (map[x][y]==3) {  //前面是终点
					map[x][y]=1;
					map[x-1][y]=0;
				}
				if (x!=x2 || y!=y2) {  //人和终点没有重合
					map[x2][y2]=3;  //让终点重新出现
				}
			}
			
			if (str.equals("a")) {  //人向左走
				y--;
				if (y<0) {  //人已经到达边界
					y++;
				}
				if (map[x][y]==0) {  //人前面面是空地
					map[x][y]=1;
					map[x][y+1]=0;  //把人原来在的地方变成地图
				}
				if (map[x][y]==2) {  //前面是箱子
					y1--;
					if (y1<0) {
						y1++;
						y++;
					}
					map[x1][y1]=2;
					map[x1][y1+1]=1;
					map[x1][y1+2]=0;
				}
				if (map[x][y]==3) {  //前面是终点
					map[x][y]=1;
					map[x][y+1]=0;
				}
				if (x!=x2 || y!=y2) {  //人和终点没有重合
					map[x2][y2]=3;  //让终点重新出现
				}
			}
			
			if (str.equals("d")) {  //人向右走
				y++;
				if (y>9) {  //人已经到达边界
					y--;
				}
				if (map[x][y]==0) {  //人前面面是空地
					map[x][y]=1;
					map[x][y-1]=0;  //把人原来在的地方变成地图
				}
				if (map[x][y]==2) {  //前面是箱子
					y1++;
					if (y1>9) {
						y1--;
						y--;
					}
					map[x1][y1]=2;
					map[x1][y1-1]=1;
					map[x1][y1-2]=0;
				}
				if (map[x][y]==3) {  //前面是终点
					map[x][y]=1;
					map[x][y-1]=0;
				}
				if (x!=x2 || y!=y2) {  //人和终点没有重合
					map[x2][y2]=3;  //让终点重新出现
				}
			}
			
			if (x1==x2 && y1==y2) {  //箱子到达终点
				System.out.println("恭喜!通关了");
				break;
			}
			
			//地图刷新
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 0) {
						System.out.print("-\t");
					}
					if (map[i][j] == 1) { // 人所在位置
						System.out.print("人\t");
					}
					if (map[i][j] == 2) { // 箱子所在位置
						System.out.print("田\t");
					}
					if (map[i][j] == 3) { // 终点所在位置
						System.out.print("终点\t");
					}
				}
				System.out.println();
			}
		}
		
		
		
		

	}

}
