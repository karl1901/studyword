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

		// ����

		// int a;
		// a = 10;
		// ��������(����):װ�������

		// ��������1��
		// int[] x; //����һ������
		// x=new int[5];

		// ��������2��
		// double[] b = new double[6]; // ���õ�������ʽ����������ͬʱ���涨���鳤��

		// ��������3��
		// ������ͬʱ����ֵ������ĳ����ɸ�ֵ���ݵĴ�Сȷ��
		// String[] strings = { "aaaa", "bbbb" }; //������ͬʱ����ֵ {}�ڿ������޸�ֵ

		// int[] x = new int[7];
		// x.length:�õ�����ĳ���
		// System.out.println(x.length);
		// x[0]=11; //[0],[1]...[5]:�±�
		// x[1]=13;
		// x[3]=16;
		// x[4]=83;
		// x[5]=9379;

		// ���鴴����ÿ��Ԫ�ػ���Ĭ��ֵ int ��������û�и�ֵ���ͻ���Ĭ��ֵ��
		// int��Ĭ��ֵΪ0 stringĬ��ֵ��null���գ� charĬ��ֵ����
		// doubleĬ��ֵ��0.0 booleanĬ��ֵ��false

		// for (int i = 0; i < x.length; i++) {
		// System.err.println(i); //x���������±�
		// System.out.println(x[i]); //�õ���������Ԫ��
		// }

		// double[] d = new double[8]; // װһ����ĳɼ�
		// Scanner mys = new Scanner(System.in);
		//
		// for (int i = 0; i < d.length; i++) {
		// System.out.println("��������ĳɼ���");
		// d[i]= mys.nextDouble();
		// // d[i]=fen; //���û�����ÿһ�γɼ����������Ӧ��λ��
		// }
		// //��ӡ�����������еĳɼ�
		// for (int i = 0; i < d.length; i++) {
		// System.out.print(d[i]+"\t");
		// }

		// int[]
		// y={12,23,23,13,12,12,323,32321,13232,13232,1323,13131,13131,13213,13232343,34343,4242,343};
		// System.out.println(y.length);
		// System.out.println(y[y.length-1]); //y.length-1���õ��������һ����
		// for (int i = 0; i < y.length; i++) {
		// System.out.println(y[i]); //��ӡ��������Ԫ��
		// }

		// int[] z={32,23,434,54,23,234,243443};
		// //��������������ֵ
		// int max=z[0]; //�ȸ�ֵ�����һ����Ϊ���ֵ
		// for (int i = 0; i < z.length; i++) { //ѭ����=���鳤����
		// if (max<z[i]) { //�жϵ�ǰ���ֵ�Ƿ�
		// max=z[i];
		// }
		// }
		// System.out.println("���ֵ��"+max);

		// int[] a=new int[5]; //��������Ĵ�С�����ȣ�
		// // �������������Сֵ
		// Scanner mys=new Scanner(System.in); //�û����빹����
		// for (int i = 0; i < a.length; i++) { //������������鳤�����
		// System.out.println("������¼�������"); //��ʾ�û�¼����
		// a[i]=mys.nextInt(); //���û�¼����������Ӧ��λ��
		// }
		// int min=a[0]; //��ֵ�����һ����Ϊ��Сֵ
		// for (int i = 0; i < a.length; i++) { //ѭ������=���鳤��
		// if (min>a[i]) { //�ж�������������Ƿ�����У������һ������С---��������Сֵ�Ƚϣ���С����ֵ����Сֵ
		// min=a[i]; //��ֵ����������������Сֵ
		// }
		// }
		// System.out.println("¼�����С��Ϊ��"+min); //��ӡ¼��������������С��

		// int[] y={12,34,35,67,11,4};
		// //������ĺͣ�ƽ����
		// int sum=0;
		// int avg=0;
		// for (int i = 0; i < y.length; i++) {
		// sum+=y[i];
		// }
		// avg=sum/y.length;
		// System.out.println(sum);
		// System.out.println(avg);

		// //����Ԫ���滻
		// String[] s={"����","����","����","����"};
		// //�����������"����"���滻Ϊ"����"
		// //���ҵ� ����
		// boolean f=false; //��ʾ��û���ҵ�
		// int z=0; //���˷�ʽ2 װ�ҵ��˵��±�
		// for (int i = 0; i < s.length; i++) {
		// if ("����".equals(s[i])) { //�ж����������Ԫ���Ƿ�Ϊ����
		// .equals��������int�����е�"=="�жϣ������������ַ������ж�(�ַ���ר���ж�)
		// System.out.println("�ҵ��ˣ�"+i);
		// // s[i]="����"; //���ҵ��͸��� ������ʽ1
		// z=i; //��ʽ2 ���ҵ��˵��±��z
		// break;
		// }
		// }
		//		
		// if (f==false) { //��û���ҵ�
		// System.out.println("��û���ҵ�");
		// }
		//		
		// if (f==true) { //�ж��ҵ���
		// s[z]="���"; //��ʽ2 ����Ϊ���
		// }
		//		
		// //������ӡ����Ԫ�ص�forѭ������ѭ��
		// for (String x : s) { //for(�������� ѭ������-����������Ԫ�� : ���������-������s)
		// System.out.println(x);
		// }
		//		

		// //���������(������s�������һ���Ÿ������ܸ�����������)
		// String[] s={"����","����","����","����"}; //���ڵ����鳤��Ϊ����
		// //���������µ�������װ������
		// String[] str=new String[s.length+1];
		// for (int i = 0; i < s.length; i++) { //ѭ��s���鳤�ȣ�ѭ��4��
		// str[i]=s[i]; //���ƣ���s������������Ԫ�ظ�str����
		// }
		//		
		// str[str.length-1]="�Ÿ�"; //������str���һ��Ԫ�ظ�ֵΪ"�Ÿ�"
		//		
		// for (String x : str) {
		// System.out.println(x);
		// }

		// ��ſռ�
		// int[] a = {1,2,34,5,23,21};
		// ջ:int a ��:1,2,34....21
		// ջ:�˴��������(����Դ����ռ�õ�ʱ�򣬴��ʱ��Ϊ30��)
		// �ѣ����������(��Ӧ�±��Ԫ��)

		// ��ҵһ��
		// 1��ѭ�����ѧ����������
		// String[] name={"������","����","С��"};
		// for (int i = 0; i < name.length; i++) {
		// System.out.println(name[i]);
		// }

		// 2��ѭ�����ѧ���ɼ�����
		// int[] x={45,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }

		// 3�����ѧ���ɼ��ܺ�
		// int[] x={45,67,89,90};
		// int sum=0;
		// for (int i = 0; i < x.length; i++) {
		// sum+=x[i];
		// }
		// System.out.println("�ɼ��ܺ�Ϊ��"+sum);

		// 4�����ƽ����
		// int[] x={45,67,89,90};
		// double sum=0; //ƽ�����������ΪС���࣬���������ɼ���ΪС����
		// for (int i = 0; i < x.length; i++) {
		// sum+=x[i];
		// }
		// System.out.println("ƽ����Ϊ��"+(sum/x.length)); //�������鳤���������ƽ����

		// 5����ӡ���ɼ����鵱�в�����ĳɼ�:����60�ֵ�
		// int[] x={45,34,12,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// if (x[i]<60) {
		// System.out.println(x[i]);
		// }
		// }

		// 6�����ɼ����鵱�е���60�ֵ�ȫ����Ϊ60��
		// int[] x={45,34,12,67,89,90};
		// for (int i = 0; i < x.length; i++) {
		// if (x[i]<60) {
		// x[i]=60; //��С��60�֣�Ԫ���޸�Ϊ60
		// }
		// }
		//		
		// //��ӡ�޸ĺ�����飬�鿴�Ƿ��޸ĳɹ�
		// for (int a : x) {
		// System.out.println(a);
		// }

		// �κ���ҵ

		// 1������һ���ַ��������飬�ռ�Ϊ5��������һ���ռ��ֵ����Ϊ�����������ڶ����ռ��ֵΪ�����ġ���
		// �������ռ��ֵΪ�������������ĸ��ռ��ֵΪ�����ӡ���������ռ��ֵΪ��С�족��Ȼ����������пռ��е�ֵ��
		// String[] name={"����","����","����","����","С��"};
		// for (String x : name) {
		// System.out.println(x);
		// }

		// String[] str = new String[5];
		// str[0] = "����";
		// str[1] = "����";
		// str[2] = "����";
		// str[3] = "����";
		// str[4] = "С��";
		// for (int i = 0; i < str.length; i++) {
		// System.out.print(str[i] + "\t");
		// }

		// 2������һ���ַ��������飬�ռ�Ϊ5����ʹ��ѭ���������ѧ������������ʹ��ѭ����������ѧ��������.
		// Scanner mys = new Scanner(System.in); //�û����빹����
		// String[] name = new String[5]; //��������Ϊ5��name��������
		// for (int i = 0; i < name.length; i++) { //ѭ��¼��ѧ������
		// System.out.println("������¼��ѧ����������");
		// name[i] = mys.next(); //��ȡ¼���ѧ������
		// if (i == (name.length - 1)) { //¼�����һ��ѧ����
		// System.out.println("¼�����!��ӡ����¼��ѧ����Ϣ��"); //��ʾ¼����ϣ���ʼ��ӡѧ������
		// for (String y : name) { //ѭ����ӡѧ������
		// System.out.print(y + "\t");
		// }
		// }
		// }

		// 3������һ��int�͵����飬ѭ������8��ѧ���ĳɼ���������8��ѧ�����ּܷ�ƽ���֡�
		// Scanner mys = new Scanner(System.in); // �û����빹����
		// int[] a = new int[8]; // ����int����Ϊ8��������ճɼ�
		// double sum = 0; // �ɼ��ܺ�ΪС�����ͣ���ʼֵΪ0
		// for (int i = 0; i < a.length; i++) { //ѭ��¼��ѧ���ĳɼ�
		// System.out.println("������¼���ѧ���ĳɼ���");
		// a[i] = mys.nextInt();
		// sum += a[i]; // ¼��ɼ���ĳɼ��ӵ��ܺ���
		// if (i == a.length - 1) { // �ж�¼�����һ�κ������ֺܷ�ƽ����
		// System.out.println("¼��ѧ���ĳɼ��ܷ�Ϊ��" + sum);
		// System.out.println("ƽ���֣�" + (sum / a.length));
		// }
		// }

		// 4������һ��char�͵����飬�ڴ�����ĵ�Ԫ���з���"�Ұ���"�����ַ���Ȼ��ʹ��ѭ�����������������"�㰮��"��
		// char[] x = { '��', '��', '��' }; //char�ַ����͵�����Ҫ�õ�����('')����
		// // ����һ�����ͱ���iΪÿ�δ�ӡԪ�ص��±� (x.length-1��ʾ�����һ���±꿪ʼ); �ж��Ƿ���ڵ��ڵ�һ���±꣬
		// // ѭ�����������鳤�� ; i-- ����ѭ������������±��ǵݼ���
		// for (int i = x.length - 1; i >= 0; i--) {
		// System.out.print(x[i]);
		// }

		// 5��ѭ������5��ѧ�����������ɼ����뵽�����У�Ȼ�������5��ѧ����ƽ���֣���������ʽ���£�
		// ���� ���� ���� ���� С����
		// 80 90 95 82 96
		// ƽ�����ǣ�����

		Scanner mys = new Scanner(System.in);
		int[] a = new int[5];
		String[] name = new String[5];
		double sum = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.println("������ѧ��������");
			name[i] = mys.next();
			System.out.println("������ɼ���");
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
				System.out.println("ƽ�����ǣ�" + sum / name.length);
			}
		}

		// Scanner mys = new Scanner(System.in); // ���빹����
		// String[] name = new String[5]; // �����ַ������鳤��Ϊ5��װѧ������
		// int[] a = new int[5]; // �����������鳤��Ϊ5��װѧ���ɼ�
		// double sum = 0; // ����С�����͵�sumװѧ���ܳɼ�����ʼֵΪ0
		// for (int i = 0; i < name.length; i++) { // ��ѭ��¼��ѧ���������ͳɼ�
		// System.out.println("������¼��ѧ��������");
		// name[i] = mys.next();
		// System.out.println("������¼���ѧ���ĳɼ���");
		// a[i] = mys.nextInt();
		// sum += a[i]; // ��¼��ĳɼ��ӵ��ɼ���������ڼ���ƽ����
		// if (i == (name.length - 1)) { // �ж�¼�����һ��ѧ����
		// for (int j = 0; j < name.length; j++) {
		// System.out.print(name[j] + "\t"); // ѭ����ӡ¼��ѧ��������
		// }
		// System.err.println(); // ����
		// for (int j = 0; j < a.length; j++) {
		// System.out.print(a[j] + "\t"); // ѭ����ӡ¼��ѧ���ĳɼ�
		// }
		// System.out.println(); // ����
		// System.out.println("ƽ�����ǣ�" + (sum / a.length));
		// }
		// }

		// 6(��ս��)����һ������Ϊ10���������飬ѭ������10��������Ȼ����ʹ��ѭ�����ҳ��������е������Сֵ��
		// Scanner mys = new Scanner(System.in); //�û����빹����
		// int[] x = new int[10]; //��������Ϊ10����������
		// for (int i = 0; i < x.length; i++) { //ѭ��¼����
		// System.out.println("������Ҫ¼�������");
		// x[i] = mys.nextInt();
		// if (i == x.length - 1) { //�ж�¼�����һ������
		// int max = x[0]; //����maxΪ���ֵ
		// int min = x[0]; //����minΪ��Сֵ
		// for (int i1 = 0; i1 < x.length; i1++) { //ѭ���ж������Сֵ
		// if (max < x[i1]) {
		// max = x[i1];
		// }
		// if (min > x[i1]) {
		// min = x[i1];
		// }
		// }
		// //��������Сֵ
		// System.out.println("���ֵΪ��" + max);
		// System.out.println("��СֵΪ��" + min);
		// }
		// }

		// 7������һ������Ϊ5���������飬ѭ�����븳ֵ��Ȼ�󽫸������е�Ԫ�ظ��Ƶ�����һ��������
		// Scanner mys=new Scanner(System.in);
		// int[] a=new int[5]; //��������a
		// for (int i = 0; i < a.length; i++) {
		// System.out.println("����������");
		// a[i]=mys.nextInt();
		// }
		//		
		// for (int y : a) {
		// System.out.print("��������a��"+y+"\t");
		// }
		//		
		// System.out.println(); //����
		//		
		// //����������b
		// int[] b=new int[5];
		//		
		// //����a����Ԫ�ص�����b
		// for (int i = 0; i < a.length; i++) {
		// b[i]=a[i];
		// }
		//		
		// for (int x : b) {
		// System.out.print("��������b��"+x+"\t");
		// }

	}

}
