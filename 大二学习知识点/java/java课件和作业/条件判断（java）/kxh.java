1.
Scanner mys=new Scanner (System.in) ;
String str="true";
String stt="false";
System.out.println("你是男人吗? ");
String s=mys.next() ;
if (str.equals(s)) {
System. out .println("原来你是男人呀，呵呵") ; 
}else if (stt.equals(s)) {
System. out .println ("你的性别难道是女?") ; }
else{
System. out.println("你输入的信息有误") ; }

2.		
System.out.println("请输入数：");
Scanner mys=new Scanner(System.in);
double b=mys.nextDouble();
if(b>=1000){  
System.out.println("输入的数>=1000！");
}else{
System.out.println("输入的数<1000！");
}
		
3.		
System.out.println("请输入一个整数");
int b=mys.nextInt();
if(b%2==0){
System.out.println("这个数是偶数");
}else{
System.out.println("这个数是奇数");
}

4.		
System.out.println("请输入一个整数");
int c=mys.nextInt();
if(c%2!=0){
System.out.println("这个数是奇数");
}else{
System.out.println("这个数不是奇数");
}

5.		
int a=20,b=20;
System.out.println("a=20,b=20");
System.out.println("请输入第一个整数");
int n=mys.nextInt();
System.out.println("请输入第二个整数");
int m=mys.nextInt();
if(n+a>=b+m){
System.out.println("将a与b变量的值进行交换,最后得到");
System.out.println("a的值为："+(a+m));
System.out.println("b的值为："+(b+n));
}else {
System.out.println("a与b中的值不交换");
}

6.						
System.out.println("请输入一个整数");
int h=mys.nextInt();
if(h>0){
System.out.println("这个数大于0");
}else if(h==0){
System.out.println("这个数等于0");
}else{
System.out.println("这个数小于0");
}

7.		
System.out.println("请输入一个整数");
int j=mys.nextInt();
if(j==0){
System.out.println("生成了一只白猪");
}else if(j==1){
System.out.println("生成了一只黑猪");
}else if(j==2){
System.out.println("生成了一只红猪");
}else {
System.out.println("生成了一直变形猪");
}

8.		
System.out.println("请输入一个整数");
int k=mys.nextInt();
if(k>=0&&k<=100){
System.out.println("整数>=0 and 整数<=100");
}else if(k>100){
System.out.println("整数>100");
}else {
System.out.println("整数<0");
}
		
9.		
System.out.println("请输入电视机的价格：");
double y=mys.nextDouble();
System.out.println("请输入冰箱的价格：");
double u=mys.nextDouble();
double p=(y+u)*0.9;
double o=(y+u)*0.8;
double l=(y+u)*0.7;
if(y+u<100){
System.out.println("不打折");
}else if(y+u>=100&&y+u<1000){
System.out.println("打九折，折后"+p+"元");
}else if(y+u>=1000&&y+u<=5000){
System.out.println("打八折，折后"+o+"元");
}else{
ystem.out.println("打七折，折后"+l+"元");		}