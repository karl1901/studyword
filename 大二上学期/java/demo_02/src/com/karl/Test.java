package com.karl;

import java.util.Scanner;

public class Test {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
//  ����һ����������byte��ȡ��:rainbow
//  byte rainbow;
////  ��ֵ
//  rainbow=33;
//  System.out.println(rainbow); // ʹ��
//  
//  int x;// ������һ������
//  x=1314520;
//  System.out.println(x);
//  
  
//  // ����һ���������ͣ�boolean������ֵ
//  boolean f=true;
//  System.out.println(f);
//  
//        // ͬʱ��������������������ͣ��������������͵�
  // ȡ�� %
//  int a=11,b=20;
//     int c=b%a;
//     System.out.println(c); 
//  // ������ʹ����ֵ����ȥ���������+-*%��,%������ѧ�ļ��� /:���Ӱ������ٷ�ĸ����˼(ȡ��)
//  // ����ֵ����(char String boolean)
//  //�ַ���ֻ��װһ��������
//  char j='��';
//  //�ַ���(+���൱��ƴ��)
//  String str="�������ַ���";
//  String st="���������";
//  String s=str+st;
//  System.out.println(s);
//  
//  �Ƚ������(< > == != <= >=)
//   int a=11,b=20;
//   // ��������boolean�����ж϶����
//   boolean f=a<b;
//   System.out.println(f);
  
  // ʱ���ж�
//  if(�ж�������true false){
//   
//  }
//  
//     int a=21,b=20;
//     boolean f=a>b;
//  if(a>b){
//   // ֻ�е��ж�Ϊ���ʱ��Ż����������
//   System.out.println("�һ������");
//  }
//  System.out.println("�������գ�"+f);
  
//  ��ֵ���ͣ� int������  short��������
//          long��������  double��С������
//          float��������  byte���ֽ�����
//  ����ֵ���ͣ�char���ַ�    boolean����������
//  string���ַ���
  
//  ����������ʽ
//  ����
//  int x;
//  x=10;
//  int y=20;
//  �����ж�
//  if(x<y){
//   �������жϳ���(true)
//   System.out.println("���˾ͳ���");
//  }
//  
//  �ж������Ƿ���ȷ
//  �û�����String--�ַ��� ���룺int--����
//  String str="admin";
//  int pwd=123456;
//  �õ��Խ����û���Ϣ����������
//  Scanner mys=new Scanner(System.in);
//     System.out.println("�������û�����");
//     String ss=mys.next();// ��ʼ�����û���Ϣ
//  System.out.println("���������룺");
//  int x=mys.nextInt();
//  �����ж�
//  equals�����Ƚ��ַ���String
//  �߼��������||������ &������ &&��˫��
//  ||: ������ж�������ֻҪ��һ��Ϊtrue���ͱ�ʾ�����ж�������Ϊtrue
//  &: ������ж�������ֻҪ��һ��false�������ж�������Ϊfalse����֮Ϊtrue
//      ������ɴ���Ķ�·����ִ�е���
//  &&��������ж�������ֻҪ��һ��false�������ж�������Ϊfalse����֮Ϊtrue
//       ����ɴ���Ķ�·
//  if(str.equals(ss)&&pwd==x){
//   �ж���
//	  System.out.println("������û�����ȷ");
//	  System.out.println(ss);
//	  System.out.println(x);
//  }
//    //�����жϣ���ѡһ��
//	  Scanner mys=new Scanner(System.in);
//	  System.out.println("��������ĳɼ���");
//	  double b=mys.nextDouble();
//	  if(b>=0&&b<60){ //����˵ĳɼ�������
//		  System.out.println("��û�м���");
//	  }else {
//		  System.out.println("��ϲ�㣡������");
//	}
	  
	  //�����жϣ���ѡһ��
	  Scanner mys=new Scanner(System.in);
	  System.out.println("��������ĳɼ���");
	  double b=mys.nextDouble();
	  if(b>=0&&b<60){
		  System.out.println("������");
	  }else if (b>=60&&b<70) {
		System.out.println("����");
	}else if (b>=70&&b<90) {
		System.out.println("����");
	}else if (b>=90&&b<100) {
		System.out.println("����");
	}else {
		System.out.println("���벻�Ϸ�!");
	}
  
	  
  
  
 }
}

 