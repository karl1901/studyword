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

		// ������
		
		// 1����Ϸ��ͼ����ά����ģ�⣩
		int[][] map = new int[10][10];
		int x = 2, y = 8;
		map[x][y] = 1; // ��
		int x1=3,y1=2;
		map[x1][y1] = 2; // ����
		int x2=2,y2=7;
		map[x2][y2] = 3; // �յ�
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					System.out.print("-\t");
				}
				if (map[i][j] == 1) { // ������λ��
					System.out.print("��\t");
				}
				if (map[i][j] == 2) { // ��������λ��
					System.out.print("��\t");
				}
				if (map[i][j] == 3) { // �յ�����λ��
					System.out.print("�յ�\t");
				}
			}
			System.out.println();
		}
		
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("�������w:��  s:��  a:��  d:��");
			String str = mys.next();
			
			if (str.equals("w")) {  //��������
				x--;
				if (x<0) {  //���Ѿ�����߽�
					x++;
				}
				if (map[x][y]==0) {  //��ǰ�����ǿյ�
					map[x][y]=1;
					map[x+1][y]=0;  //����ԭ���ڵĵط���ɵ�ͼ
				}
				if (map[x][y]==2) {  //ǰ��������
					x1--;
					if (x1<0) {
						x1++;
						x++;
					}
					map[x1][y1]=2;
					map[x1+1][y1]=1;
					map[x1+2][y1]=0;
				}
				if (map[x][y]==3) {  //ǰ�����յ�
					map[x][y]=1;
					map[x+1][y]=0;
				}
				if (x!=x2 || y!=y2) {  //�˺��յ�û���غ�
					map[x2][y2]=3;  //���յ����³���
				}
			}
			
			if (str.equals("s")) {  //��������
				x++;
				if (x>9) {  //���Ѿ�����߽�
					x--;
				}
				if (map[x][y]==0) {  //��ǰ�����ǿյ�
					map[x][y]=1;
					map[x-1][y]=0;  //����ԭ���ڵĵط���ɵ�ͼ
				}
				if (map[x][y]==2) {  //ǰ��������
					x1++;
					if (x1>9) {
						x1--;
						x--;
					}
					map[x1][y1]=2;
					map[x1-1][y1]=1;
					map[x1-2][y1]=0;
				}
				if (map[x][y]==3) {  //ǰ�����յ�
					map[x][y]=1;
					map[x-1][y]=0;
				}
				if (x!=x2 || y!=y2) {  //�˺��յ�û���غ�
					map[x2][y2]=3;  //���յ����³���
				}
			}
			
			if (str.equals("a")) {  //��������
				y--;
				if (y<0) {  //���Ѿ�����߽�
					y++;
				}
				if (map[x][y]==0) {  //��ǰ�����ǿյ�
					map[x][y]=1;
					map[x][y+1]=0;  //����ԭ���ڵĵط���ɵ�ͼ
				}
				if (map[x][y]==2) {  //ǰ��������
					y1--;
					if (y1<0) {
						y1++;
						y++;
					}
					map[x1][y1]=2;
					map[x1][y1+1]=1;
					map[x1][y1+2]=0;
				}
				if (map[x][y]==3) {  //ǰ�����յ�
					map[x][y]=1;
					map[x][y+1]=0;
				}
				if (x!=x2 || y!=y2) {  //�˺��յ�û���غ�
					map[x2][y2]=3;  //���յ����³���
				}
			}
			
			if (str.equals("d")) {  //��������
				y++;
				if (y>9) {  //���Ѿ�����߽�
					y--;
				}
				if (map[x][y]==0) {  //��ǰ�����ǿյ�
					map[x][y]=1;
					map[x][y-1]=0;  //����ԭ���ڵĵط���ɵ�ͼ
				}
				if (map[x][y]==2) {  //ǰ��������
					y1++;
					if (y1>9) {
						y1--;
						y--;
					}
					map[x1][y1]=2;
					map[x1][y1-1]=1;
					map[x1][y1-2]=0;
				}
				if (map[x][y]==3) {  //ǰ�����յ�
					map[x][y]=1;
					map[x][y-1]=0;
				}
				if (x!=x2 || y!=y2) {  //�˺��յ�û���غ�
					map[x2][y2]=3;  //���յ����³���
				}
			}
			
			if (x1==x2 && y1==y2) {  //���ӵ����յ�
				System.out.println("��ϲ!ͨ����");
				break;
			}
			
			//��ͼˢ��
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 0) {
						System.out.print("-\t");
					}
					if (map[i][j] == 1) { // ������λ��
						System.out.print("��\t");
					}
					if (map[i][j] == 2) { // ��������λ��
						System.out.print("��\t");
					}
					if (map[i][j] == 3) { // �յ�����λ��
						System.out.print("�յ�\t");
					}
				}
				System.out.println();
			}
		}
		
		
		
		

	}

}
