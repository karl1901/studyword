package wrok001;

import java.awt.image.BandCombineOp;
import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 1.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("����������");
		// boolean f=mys.nextBoolean();
		// if (f==true) {
		// System.out.println("ԭ����������ѽ���Ǻ�");
		// }
		// if (f==false) {
		// System.out.println("����Ա��ѵ���Ů��");
		// }

		// 2.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x=mys.nextInt();
		// if (x>1000) {
		// System.out.println("�������>=1000");
		// }else {
		// System.out.println("�������<1000");
		// }

		// 3.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x=mys.nextInt();
		// if (x%2==0) {
		// System.out.println("�������ż��");
		// }else {
		// System.out.println("�����������");
		// }

		// 4.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x=mys.nextInt();
		// if (x%2==1) {
		// System.out.println("������");
		// }

		// 5.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������a:");
		// int a=mys.nextInt();
		// System.out.println("������һ������b:");
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
		// System.out.println("������һ������:");
		// int x=mysScanner.nextInt();
		// if (x==0) {
		// System.out.println("������0");
		// }else if(x>0) {
		// System.out.println("������0");
		// }else {
		// System.out.println("��С��0");
		// }

		// 7.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x=mys.nextInt();
		// if (x==0) {
		// System.out.println("������һֻ����");
		// }else if (x==1) {
		// System.out.println("������һֻ����");
		// }else if (x==2) {
		// System.out.println("������һֻ����");
		// }else {
		// System.out.println("������һֻ������");
		// }

		// 8.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������:");
		// int x=mys.nextInt();
		// //�߼������ ||���ߣ� &������ &&˫����
		// if (x>=0 && x<=100) {
		// System.out.println("����>=0 and ����<=100");
		// }else if (x>100) {
		// System.out.println("����>100");
		// }else {
		// System.out.println("����<0");
		// }

		// 9.
		// Scanner mys=new Scanner(System.in);
		// System.out.println("��������ӻ��ļ۸�:");
		// double x=mys.nextDouble();
		// System.out.println("���������ļ۸�:");
		// double y=mys.nextDouble();
		// double sum=x+y;
		// if (sum<100) {
		// System.out.println("�ܼ۸�:"+sum);
		// }else if (sum>=100&&sum<1000) {
		// double sum1=sum*0.9;
		// System.out.println("�ܼ۸�:"+sum1);
		// }else if (sum>=1000&&sum<=5000) {
		// double sum2=sum*0.8;
		// System.out.println("�ܼ۸�:"+sum2);
		// }else if (sum>5000) {
		// double sum3=sum*0.7;
		// System.out.println("�ܼ۸�:"+sum3);
		// }

		 //1.�û�����5���������5�����ĺ�
		// Scanner mys=new Scanner(System.in);
		// int sum=0;
		// for (int i = 0; i < 5; i++) { //i��ʾѭ������
		// System.out.println("�������������:");
		// int x=mys.nextInt(); //xÿ���û����������
		// sum+=x;
		// }
		// System.out.println("�ܺ�Ϊ��"+sum);

		// 2.��������һ������n�����1-n֮���ܱ�5����3����������
		// Scanner mys=new Scanner(System.in);
		// System.out.println("������һ������(n):");
		// int n=mys.nextInt();
		// for (int i = 1; i < n; i++) {
		// if (i%5==0 || i%3==0) {
		// System.out.println(i);
		// }
		// }

		// 3.��5�Σ��ԶԴ������������ַ�Χ�ǣ�0-3��//����¶�5�β��˳�

		// //��ʦ������ȷ��:
		// Scanner mys = new Scanner(System.in);
		// Random myr = new Random();
		// int count = 0; // �û��¶ԵĴ���
		// int count1 = 0; // �û��µĴ���
		// while (true) {
		// if (count == 5) { // �¶���5��
		// System.out.println("��ͨ���ˣ�");
		//
		// break; // ֹͣ-����
		// }
		// for (int i = 0; i < 5; i++) {
		// int r = myr.nextInt(4); // �������������
		// System.out.println(r); // ���������
		// System.out.println("��������Ҫ�µ�����");
		// int x = mys.nextInt(); // �û����������
		// if (x == r) {
		// System.out.println("��¶���");
		// count++; // count=count+1;
		// } else {
		// System.out.println("��´���!");
		// }
		// System.out.println("�Ҳ¶ԵĴ�����" + count);
		// count1++;
		// System.out.println("�Ҳ��˵Ĵ�����" + count1);
		// System.out.println(); // ����
		// } // forѭ������
		// if (count == 5) { // �¶���5��
		// count1--;
		// }
		// if (count1 == 5) { // �û�����5��
		// count = 0; // ���ò¶ԵĴ���
		// count1 = 0; // ���òµĴ���
		// System.out.println("�ұ�������");
		// }
		// } // whileѭ������

		// 3.�¹ʣ���ϰ��
		// Scanner mys = new Scanner(System.in); // �û����빹����
		// Random myr = new Random(); // �����������
		// int a = 0; // �û��¶ԵĴ���
		// int b = 0; // �û����˵Ĵ���
		// while (true) { //����ѭ������
		// if (a==5) { //�¶����-��ʾ��ͨ�ء���break-����
		// System.out.println("��ϲ�㣬��Ϸ��ͨ�أ�");
		// break;
		// }
		// for (int i = 0; i < 5; i++) { //���һ�غ�
		// int y = myr.nextInt(6); // ������ɵ���
		// System.out.println("�����������"+y); //����������ɵ������
		// System.out.println("��������Ҫ�µ�����(0-5)"); //��ʾ�û�����
		// int x = mys.nextInt(); // �û��������
		// if (x == y) { //�ж��û��Ƿ�¶�
		// System.out.println("��ϲ����¶���");
		// a++; //�¶Դ���+1
		// } else {
		// System.out.println("��´���!");
		// }
		// System.out.println("��¶ԵĴ�����" + a);
		// b++; //�µĴ���+1
		// System.out.println("����˵Ĵ�����" + b);
		// System.out.println(); //����
		// if (a==5) { //�жϲ¶���� -
		// b=b-2; //����for�����if(b==5)�жϲ����У�ֱ�ӽ���if(a==5)�жϣ������ͨ�أ�������Ϸ��
		// }
		// } // for����
		// if (b==5) { //��5��һ���غ�
		// a=0; //����¶ԵĴ���
		// b=0; //������˵Ĵ���
		// System.out.println("���غϽ�������Ϸ������");
		// System.out.println(); //����
		// }
		// } // while����

		// 4����дJava���򣬼���100~999֮���ȫ����ˮ�ɻ�������ƽ��ֵ��ν��ˮ�ɻ�������ָһ����λ�������λ���ֵ������͵��ڸ����������磺153=1^3+5^3+3^3����153��
		// double x=0; //ˮ�ɻ����ĸ���
		// double sum=0; //ˮ�ɻ����ĺ�
		// for (int i = 100; i < 1000; i++) {
		// int a=i/100; //ȡ��λ��
		// int b=(i-100*a)/10; //ȡʮλ�� �����÷���(i%100/10)
		// int c=(i-b*10-a*100); //ȡ��λ�� �����û���(i%10)
		// if (i==c*c*c+b*b*b+a*a*a) { //�ж��Ƿ�Ϊˮ����
		// sum+=i; //sum=sum+1;
		// x++; //������һ
		// }
		// }
		// System.out.println("����ƽ��ֵΪ��"+sum/x); //sum/x �ܺ�/�ܸ���-ƽ��ֵ

		// 5������1+3+5+���������������ӵ����ĺ���500ʱ
		// int sum = 0; // ��ֵ����
		// for (int i = 0; sum <= 500; i++) { // �жϺ��Ƿ�С��500
		// if (i % 2 == 1) { // �ж��Ƿ�Ϊ����
		// sum += i;
		// }
		// }
		// System.out.println("�����Ϊ��" + sum);

		// ��ʦ�����
		// int sum=0; //���
		// for (int i = 1; ; i+=2) {
		// sum+=i;
		// if (sum>=500) { //�˳�����
		// System.out.println("�ﵽָ������"+i);
		// System.out.println("��Ϊ��"+sum);
		// break;
		// }
		// }

		// 6���û������ꡢ�¡��գ������һ���Ǳ���ȵĵڶ�����
		// Scanner mys = new Scanner(System.in); // ���빹����
		// while (true) { // ����ѭ������-�ж�-������
		// System.out.println("�����룺�� �� ��"); // ��ʾ�û�����
		// int year = mys.nextInt(), month = mys.nextInt(), date = mys
		// .nextInt(); // ����������
		// int sum = 0; // ������
		// int leap = 0; // ������������
		// switch (month) { // ����ĳһ��֮ǰ������
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
		// System.out.println("��������!����������"); // �û������������ʾ
		// break;
		// }
		// sum += date; // ���ϵ��µ�����
		// if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { // �ж���������
		// leap = 1;
		// } else {
		// leap = 0;
		// }
		// if (leap == 1 && month > 2) { // �ж������꣬�����·ݴ���2��������+1
		// sum++;
		// }
		// System.out.println("������������Ǳ���ȵģ�" + sum + "��"); // ������
		// System.out.println(); // �ո�
		// }

		// ��ʦ�����
		// Scanner mys = new Scanner(System.in);
		// System.out.println("��������ݣ�");
		// int y = mys.nextInt(); // ���յ���
		// System.out.println("�������·ݣ�");
		// int m = mys.nextInt(); // ���յ���
		// System.out.println("���������ڣ�");
		// int d = mys.nextInt(); // ��������
		// // �Ա���ȵ�1��1��(2020-1-1)
		// int sum = 0; // ������
		// for (int i = 1; i < m; i++) { // �ӱ���ĵ�һ�쵽�����·ݵ�����
		// if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10
		// || i == 12) { // ����(31)
		// sum += 31;
		// }
		// if (i == 4 || i == 6 || i == 9 || i == 11) { // С��(30)
		// sum += 30;
		// }
		// if (i == 2) { // ƽ��
		// sum += 28;
		// if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { //�����ж�
		// sum++;
		// }
		// }
		// }
		// sum += d; // �ѵ�����������
		// System.out.println("�����������ǽ���ĵ�"+sum + "��");

		// 7������һ����ȭ��Ϸ��ʯͷ����������ÿ���û�������10�Σ���Ϸ����֮��Ҫ�����û��÷������Ӯ�˼�3�� ƽ�˵�1�� ���˼�1�֣�
		// int i = 1; // ��ֵ����������ʼΪ��
		// int sum = 2; // ��ֵ�û���ʼ����Ϊ��2
		// while (i < 11) { // �������ƣ�10��
		// Scanner mys = new Scanner(System.in); // �û����빹����
		// Random myr = new Random(); // �����������
		// int x = myr.nextInt(3); // ��������ɣ�(0,1,2)�ֱ�Ϊ(ʯͷ����������)
		// System.out.println("�����������"+x); //��ʾ���������
		// System.out.println("��ǰ������"+sum); //��ʾ�û���ǰ����
		// System.out.println("���������ѡ��(0:ʯͷ,1:����,2:��)");
		// System.out.println("��" + i + "��"); // ��ʾ��ǰ����
		// int y = mys.nextInt(); // �û������ѡ��
		// switch (x) { // �ж������
		// case 0: // ���Գ�ʯͷ
		// switch (y) { // �ж��û������ѡ��
		// case 0: // �û���ʯͷ
		// System.out.println("ƽ�֣�");
		// sum += 1; // ƽ�֣��ܷ�+1��
		// break;
		// case 1: // �û�������
		// System.out.println("�����ˣ�");
		// sum -= 1; // ���ˣ�-1��
		// break;
		// case 2: // �û�����
		// System.out.println("��Ӯ�ˣ�");
		// sum += 3; // Ӯ�ˣ�+3��
		// break;
		// default:
		// System.out.println("�����������������룡"); // ��������������ʾ
		// break;
		// }
		// break;
		// case 1: // ���Գ�����
		// switch (y) { // �ж��û���ѡ��
		// case 0: // �û���ʯͷ
		// System.out.println("��Ӯ�ˣ�");
		// sum += 3; // Ӯ�ˣ�+3��
		// break;
		// case 1: // �û�������
		// System.out.println("ƽ�֣�");
		// sum += 1; // ƽ�֣�+1��
		// break;
		// case 2:
		// System.out.println("�����ˣ�");
		// sum -= 1; // ���ˣ�-1��
		// break;
		// default:
		// System.out.println("�����������������룡"); // ��������������ʾ
		// break;
		// }
		// break;
		// case 2: // ���Գ���
		// switch (y) { // �ж��û������ѡ��
		// case 0: // �û���ʯͷ
		// System.out.println("�����ˣ�");
		// sum -= 1; // ���ˣ�-1��
		// break;
		// case 1: // �û�������
		// System.out.println("��Ӯ�ˣ�");
		// sum += 3; // Ӯ�ˣ�+3��
		// break;
		// case 2: // �û�����
		// System.out.println("ƽ�֣�");
		// sum += 1; // ƽ�֣�+1��
		// break;
		// default:
		// System.out.println("�����������������룡"); // ��������������ʾ
		// break;
		// }
		// break;
		// }
		// i++; // ѭ��һ����Ϸ�����+1��
		// System.out.println(); // �ո�һ��(������ʽ)
		// }
		// System.out.println("����"); // ��Ϸ����
		// System.out.println(); //����
		// System.out.println("�����Ϸ�ܷ��ǣ�" + sum); // �����û����յ÷�
		// System.out.println("��Ϸ������" + (i - 1)); // �鿴��Ϸ����
		// // ���Ի���ʾ
		// if (sum <= 3) { // �ܷ�С��3
		// System.out.println("����Ŭ���ɣ�");
		// } else if (3 < sum & sum <= 9) { // �ܷ�Ϊ3-9֮��
		// System.out.println("�������ӰѾ�����");
		// } else if (sum > 9) { // �ִܷ���9
		// System.out.println("��������������Ϊ����");
		// }

		// 1��ʯͷ 2������ 3����
		// Scanner mys = new Scanner(System.in); // ���빹����
		// Random myr = new Random(); // ���������
		// int sum=2; //�û�����
		// for (int i = 0; i < 10; i++) {
		// int r = myr.nextInt(3)+1; // ���������123
		// System.out.println("���������"+r);
		// System.out.println("���������ѡ��(1��ʯͷ  2������  3����)��"); // ��ʾ�û�����ѡ��
		// int x = mys.nextInt(); // �����û�¼���
		// if (r == 1) { // ���������ʯͷ
		// System.out.println("���Գ���ʯͷ");
		// if (x == 1) { // �û�ѡ��ʯͷ
		// System.out.println("ƽ��");
		// sum += 1;
		// }
		// if (x == 2) { // �û�ѡ�����
		// System.out.println("����");
		// sum -= 1;
		// }
		// if (x == 3) { // �û�ѡ��
		// System.out.println("Ӯ��");
		// sum += 3;
		// }
		// }
		// if (r == 2) { // �������������
		// System.out.println("���Գ��˼���");
		// if (x == 1) { // �û�ѡ��ʯͷ
		// System.out.println("Ӯ��");
		// sum += 3;
		// }
		// if (x == 2) { // �û�ѡ�����
		// System.out.println("ƽ��");
		// sum += 1;
		// }
		// if (x == 3) { // �û�ѡ��
		// System.out.println("����");
		// sum -= 1;
		// }
		// }
		// if (r == 3) { // �����������
		// System.out.println("���Գ��˲�");
		// if (x == 1) { // �û�ѡ��ʯͷ
		// System.out.println("����");
		// sum -= 1;
		// }
		// if (x == 2) { // �û�ѡ�����
		// System.out.println("Ӯ��");
		// sum += 3;
		// }
		// if (x == 3) { // �û�ѡ��
		// System.out.println("ƽ��");
		// sum += 1;
		// }
		// }
		// }
		// System.out.println("�û��÷֣�"+sum);

		// 8��ѭ��¼��Java�ε�ѧ���ɼ���ͳ�Ʒ������ڵ���80�ֵ�ѧ������ (���û�����һ��999�˳�)
		// Scanner mys = new Scanner(System.in); // ���빹����
		// double sum = 0; // ��������80�ֵ�ѧ������
		// double jsum = 0; // ��¼�������ѧ������
		// while (true) { // ����ѭ��¼��(��ѭ��)
		// System.out.println("������ѧ���ĳɼ���"); // �ɼ�¼���ַ���ʾ
		// double x = mys.nextInt(); // �û�����ɼ�
		// if (x == 999) { // �û�����999ʱ
		// System.out.println(); // ����
		// System.out.println("�˳�"); // ��ʾ�˳�
		// break; // �˳�
		// }
		// if (x >= 80) { // ¼���������80
		// sum++; // ��������80�ĸ���+1
		// jsum++; // ¼��ѧ������+1
		// } else { // ¼����������
		// jsum++; // ¼��ѧ������+1
		// }
		// System.out.println("��������80�ֵ�ѧ���ٷֱȣ�" + ((sum / jsum) * 100) + "%"); //
		// ���ͳ�ưٷֱ�
		// System.out.println("��������80�ֵ�ѧ�����У�" + (int) (sum) + ":"
		// + (int) (jsum));
		// // ���ͳ�Ʊ���
		// System.out.println(); // �ո�-��ʽ����
		// }

		// 9���û�������:����0-5֮�������������û��������֣��������������ˣ���������ٲ�
		// Scanner mys = new Scanner(System.in); // �û����빹����
		// Random myr = new Random(); // �����������
		// int i = 0; // ��ֵ���¶ԵĴ���
		// while (i < 1) { // �жϲ¶Դ���
		// int r = myr.nextInt(6); // �������0-5��
		// System.out.println("�����������" + r); // ���������
		// System.out.println("��������Ҫ�µ�����(0-5)");
		// int y = mys.nextInt();
		// if (0 <= y && y <= 5) {
		// if (y == r) {
		// i++; // �¶Դ���+1
		// System.out.println("�������¶���!");
		// System.out.println(); // ����
		// } else {
		// System.out.println("���ź�����´���!");
		// System.out.println(); // ����
		// }
		// } else {
		// System.out.println("�Բ�����������������������룡");
		// System.out.println(); // ����
		// }
		// }

		// ��������(����)
		// int ���� long ������ short ������ byte �ֽ�
		// double С�� float ������
		// char �ַ� booleam ��������
		// string �ַ���

		// ���������
		// ��ֵ���ͣ�����ѧ����(/:ȡ�� %:ȡ��)
		// ����ֵ���ͣ�+(ƴ��)

		// x<y<z:JAVAû�������Ƚ������д��

		// �߼������(|| & &&)

		// ��Ԫ����� ��������?a:b ����������Ϊtrue����ȡa������������Ϊ��false����ȡb

		// < + * || && ͬһ�г�����Щ���ᰴ������˳��ִ�У����������ִ��
		//<   +  *   ||   &&
		//()-->!(������˼)-->���������-->�Ƚ������-->&&-->||-->=(��ֵ)

		// �ύ�ж�
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

		// ѭ��(while do while for )
		
		int name[]={1,4,5,7};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		
		
		
		
		

	}
}