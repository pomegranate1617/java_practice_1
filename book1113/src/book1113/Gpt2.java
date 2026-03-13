//package book1113;
//
//import java.util.Scanner;
//
//public class Gpt2 {
//
//	public static void main(String[] args) {
//		//1
//		int i=0;
//		while(i<=10) {
//			++i;
//			System.out.println(i);
//		}
//		//2
//		Scanner sc=new Scanner(System.in);
//		System.out.println("양의 정수를 입력하세요");
//		int n=sc.nextInt();
//		int a=1;
//		while(a>=1&&a<=n) {
//			a++;
//		}
//		System.out.println(a);
//		//3
//		int b=1;
//		while(b<=20) {
//			if(b%2==0) {
//				System.out.println(b);
//				++b;
//			}	
//		}
//		//4
//		System.out.println("비밀번호를 입력하세요");
//		int c=sc.nextInt();
//		while(c==1234) {
//			break;
//		}
//		
//		//5
//		int d=1;
//		int sum=0;
//		while(d<=100) {
//			if(d%3==0) {
//				sum+=d;
//			}
//		}
//		System.out.println(sum);
//		
//		//6
//		int sum2=0;
//		int e;
//		do{
//			System.out.println("정수를 입력하세요");
//			e=sc.nextInt();
//			sum2+=e;
//		}while(e!=0);
//		 System.out.println(sum2);
//		 //7
//		 int k=1;
//		 int j=1;
//		 while(k<10) {
//			 while(j<10) {
//				 System.out.println(k+"x"+j+"="+k*j);
//			 }
//		 }
//		 
//		 //8
//		 sc.nextLine();
//		 System.out.println("숫자를 입력하세요");
//		 String aa=sc.nextLine();
//		 String reverse="";
//		 int o=aa.length()-1;
//		 while(o>=0) {
//			 reverse+=aa.charAt(o);
//			 --o;
//		 }
//		 System.out.println(reverse);
//		 //9
//		 int f=(int)(Math.random()*100+1);
//		 int g;
//		 do{
//			 System.out.println("정수를 입력하세요");
//			 g=sc.nextInt();
//		 }while(g!=f);
//		 
//		 //10
//		 int n=(int)((Math.random()*10)+1);
//		 int mul;
//		 while(t<n) {
//			int t=1;
//			mul=t*(t+1);
//			++t;
//				 
//		 }
//		System.out.println(mul);
//
//	}
//
//}
