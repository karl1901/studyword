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

		// java��ά�Ǵ����Ͻǿ�ʼx,y��;��ѧ�Ǵ����½ǿ�ʼ�ġ�

		// ��ά����
		// ��һ��������ʽ
		// int[][] x=new int[5][6];
		// x[0][0]=8;
		// x[2][5]=7;
		// //��ӡ��ά���飨��ʽ��ѭ��Ƕ�ף�
		// for (int i = 0; i < x.length; i++) { //��ӡ����
		// for (int j = 0; j < x[i].length; j++) { //��ӡÿ�и���
		// System.out.print(x[i][j]+"\t"); //�����д�ӡ����
		// }
		// System.out.println(); //����
		// }

		// �ڶ���������ʽ
		// int[][] x={{2,34,345,3},
		// {3,23,45,23,45,6},
		// {3,56,67,5,45,57,3}};
		// int sum=0; //װ�������������ܺ�
		// int avg=0; //ƽ��������ʼֵΪ0
		// int count=0; //װ�������ĸ�������ʼֵΪ0
		// //�������Сֵ
		// int max=x[0][0]; //�������ֵ
		// int min=x[0][0]; //������Сֵ
		// for (int i = 0; i < x.length; i++) { //��ӡ����
		// for (int j = 0; j < x[i].length; j++) { //��ӡÿ�и���
		// System.out.print(x[i][j]+"\t");
		// sum+=x[i][j]; //��ÿ�����ӵ��ܺ�
		// if (max<x[i][j]) { //�ж����ֵ
		// max=x[i][j];
		// }
		// if (min>x[i][j]) { //�ж���Сֵ
		// min=x[i][j];
		// }
		// count++; //��ӡһ���������ĸ���+1
		// }
		// System.out.println(); //����
		// }
		// avg=sum/count; //����/�ܸ���=ƽ����
		// System.out.println("avg:"+avg);
		// System.out.println("max: "+max+"min: "+min);

		// ����(һά����):����
		// 9,13,56,88,120
		// int[] x = { 88, 56, 8, 13, 120 };
		// for (int i = 0; i < x.length - 1; i++) { // ��ӡ����
		// for (int j = 0; j < x.length - 1 - i; j++) { // ��ӡÿ�е���
		// if (x[j] > x[j + 1]) { // �ж�ǰ���Ƿ�Ⱥ��ߴ󣬷�֮���ǽ���
		// int t = x[j]; // �Ȱ�ǰ�߸����±�����t
		// x[j] = x[j + 1]; // �Ѻ��߻�λ��ǰ��
		// x[j + 1] = t; // ��ǰ�߻�λ������
		// }
		// }
		// }
		//
		// for (int a : x) {
		// System.out.print(a + "\t");
		// }

		// ��λ�����������򣩣�
		// �����λ����Ԫ�ظ���--����һά���飨��װ�¶�ά���飩--�Ѷ�ά�����Ԫ�ض����Ƶ�һά����--��һά��������--�ź��˰�һά�����ٸ���ά����
		// int[][] x = { { 2, 34, 55, 3 }, { 12, 23, 45, 23, 45, 6 },
		// { 3, 56, 67, 5, 45, 57, 3 } };
		//
		// // 1�������λ���������ж��ٸ�Ԫ�أ��ô�ӡ��ά��������Ԫ�صķ�����ȡ���и�����
		// int count = 0; //װ�����������ĸ���
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// count++;
		// }
		// }
		// // System.out.println(count);
		//
		// // 2������һ����װ�¶�ά��������Ԫ�ص�һά���飨���鳤��Ϊ��ά�����һά���飩
		// int[] newx = new int[count]; //����count=��ά������������Ԫ�صĸ���
		//
		// // 3���Ѷ�ά��������ݸ��Ƹ�һά���飨ͬ���ô�ӡ���ж�ά����Ԫ�صķ���������Ԫ�ظ��Ƶ�һά�������棩
		// int w = 0; // �������±�w��ģ���±�
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// newx[w] = x[i][j]; //�Ѷ�λ�������Ԫ�ظ�ֵ��һά�����Ԫ��
		// w++; //�±�w=w+1
		// }
		// }
		// // for (int i = 0; i < newx.length; i++) {
		// // System.out.print(newx[i]+"\t");
		// // }
		//
		// // 4����һά��������(����)
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
		// //5������������˵�һά���鸴�Ƹ���ά����
		// int a=0; //ģ���±�
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// x[i][j]=newx[a];
		// a++;
		// }
		// }
		//		
		// //��ӡ��ά����
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j]+"\t");
		// }
		// System.out.println();
		// }

		// 1������һ����ά���鱣��6*8�����֣������е�ż�����뵽һ��һά������
		// Random ran = new Random(); // ���������
		// int[][] x = new int[6][8]; // ����6*8�Ķ�ά����
		// int count = 0; // װ��ά����x����Ԫ�ظ���
		//
		// // ��ֵ����ά���飬��ȡ��ά�����Ԫ�ظ���
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// int r = ran.nextInt(17); // ��ȡ�����
		// x[i][j] = r; // �������������ֵ����ά�����Ԫ��
		// count++; // ��ֵһ��Ԫ�أ�Ԫ�ظ���+1
		// }
		// }
		//
		// // ��ӡ��ά���飨ÿ���������һ�������Զ�ά�����Ԫ�ض���ͬ��
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// }
		// System.out.println(); // ����
		// }
		// int[] y = new int[count]; // ��������Ϊcount��һά����y
		// int a = 0; // ����ģ���±�a����ʼΪ0
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// if (x[i][j] % 2 == 0 & x[i][j] != 0) { // �ж��Ƿ�Ϊż�����ų�0(�����ż)
		// y[a] = x[i][j]; // �ѷ���������Ԫ�ظ�ֵ��y������
		// a++;
		// }
		// }
		// }
		//
		// System.out.println(); // ���д�ӡһά����y
		// // ��ӡһά����y
		// for (int i = 0; i < y.length; i++) { // ��ӡż���ĸ���--a:����y��ż���ĸ����������Ŀ�ֵ����ӡ
		// if (i % 7 == 0) { // ��7����
		// System.out.println();
		// }
		// System.out.print(y[i] + "\t");
		// }
		//
		// //���˿��Դ�ֹ����Ϊ��ĿҪ���Ѿ��ﵽ�ˡ�
		// // �����µ�һά����z,����Ϊ����y�в�Ϊ0��Ԫ�صĸ���
		// int[] z = new int[a];
		// for (int i = 0; i < y.length; i++) {
		// if (y[i] != 0) { // �ж�����y��Ԫ���Ƿ�Ϊ0
		// z[i] = y[i];
		// }
		// }
		// System.out.println(); // ����
		// System.out.println(); // ����
		//
		// // ��ӡ���յ�һά����z
		// for (int i = 0; i < z.length; i++) {
		// if (i % 6 == 0) {
		// System.out.println();
		// }
		// System.out.print(z[i] + "\t");
		// }

		// //����6*8�Ķ�ά����
		// int[][] x={{2,14,12,23,34,5,6,78},
		// {12,14,12,23,34,5,6,78},
		// {4,14,12,24,34,5,6,78},
		// {34,14,32,23,34,5,6,78},
		// {44,14,12,63,34,5,6,78},
		// {21,54,12,23,34,5,6,78},
		// };
		// //1�����ҳ���ά���������ж��ٸ�ż��
		// int a=0; //��¼ż������
		// for(int i=0;i<x.length;i++){
		// for(int j=0;j<x[i].length;j++){
		// if(x[i][j]%2==0){
		// a++;
		// }
		// }
		// System.out.println();
		// }
		// //2������һ��һά���飨������ż������һ�£�
		// int[] y=new int[a];
		// //�Ѷ�ά������ż�����η���һά����
		// int t=0; //ģ��һά������±�
		// for(int i=0;i<x.length;i++){
		// for(int j=0;j<x[i].length;j++){
		// if(x[i][j]%2==0){ //�ж��Ƿ�Ϊż��
		// y[t]=x[i][j]; //��ʼ��ֵ
		// t++;
		// }
		// }
		// }
		// System.out.println();
		// //4����ӡһά����
		// for(int b : y){
		// System.out.print(b+"\t");
		// }

		// 2����ά��������ݳ�ʼ�� �Լ���α�����ά���鲢��ӡ�������鵱�е����ֵ����Сֵ���Լ���
		// ��ά�����ʼ��
		// int[][] x = { { 1, 23, 34, 3, 21, 5 }, { 3, 45, 565, 5, 4, 3 },
		// { 3, 4, 65, 75, 5, 56, 56 } };
		// int max = x[0][0], min = x[0][0]; //�������Сֵ
		// int sum = 0; //�����ͣ���ʼֵΪ0
		// // ������ӡ��ά����
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// sum += x[i][j]; //��ֵÿ��Ԫ�ص�����
		// }
		// System.out.println(); //����
		// }
		//
		// //�����Сֵ���
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
		// System.out.println("���ֵ��"+max);
		// System.out.println("��Сֵ��"+min);
		// System.out.println("�ͣ�"+sum);

		// 3����ά�����ʹ�ã�����8*8�Ķ�ά���飬��Խ��ߵĺͣ�������ͬ��
		//����8*8��ά���飨������ͬ��
		// int[][] x={{2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54},
		// {2,12,34,15,37,75,78,54}
		// };
		// int sum=0; //װ�Խ��ߺ�
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// if(i==j || i+j==7){ //if(����-���¶Խ��ߵ�Ԫ�� || ����-���¶Խ��ߵ�Ԫ��)
		// sum+=x[i][j];
		// }
		// }
		// }
		// System.out.println("�Խ��ߺͣ�"+sum);

		// 4��(��ս��)ʹ�ö�ά������ɣ�Ҫ��ʹ��ѭ����
		// ʾ��ʮ:�������
		// 1 0 0 0 0
		// 1 1 0 0 0
		// 1 2 1 0 0
		// 1 3 3 1 0
		// 1 4 6 4 1

		// while (true) {
		// Scanner mys = new Scanner(System.in); // ���빹����
		// System.out.println("�����������"); // �������ݱ���
		// System.out.println("������Ҫ����Ĵ�С(x*x),x:"); //�����СΪ5*5,�ʴ˴�����5
		// int a = mys.nextInt(); // ��ȡ����Ĵ�С:x
		// int[][] x = new int[a][a]; // ������ά���飬�Ѵ�С��ֵ������
		// // �����������
		// for (int i = 0; i < x.length; i++) {
		// x[i][0] = 1;
		// x[i][i] = 1;
		// if (i >= 2) {
		// for (int j = 1; j <= i - 1; j++) {
		// x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
		// }
		// }
		// }
		// // ��ӡ�������
		// for (int i = 0; i < x.length; i++) {
		// for (int j = 0; j < x[i].length; j++) {
		// System.out.print(x[i][j] + "\t");
		// }
		// System.out.println();
		// }
		// System.out.println(); //����
		// }

	}
}
