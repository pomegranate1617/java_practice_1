package book1114;

import java.util.Scanner;

public class Gpt2 {

	public static void main(String[] args) {
		//1
		int a=1;
		while(a<=5) {
			System.out.println(a);
			++a;
		}
		//2
		int sum=0;
		int cnt=1;
		while(cnt<=10) {
			sum+=cnt;
			++cnt;
		}
		System.out.println(sum);
		//3
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int non=sc.nextInt();
		int nonSum=0;
		while(non!=0) {
			nonSum+=non;
			System.out.println("정수를 입력하세요");
			non=sc.nextInt();
		}
		System.out.println(nonSum);
		//4
		//답:3
		//5
		int add=1;
		while(add<=20) {
			if(add%2==0) {
				System.out.println(add);
			}
			++add;
		}
		//6
		//답:531
		//7
		int i1=0;
		while(i<=10) {
			i1+=2;
		}
		//8
		int pw=1234;
		System.out.println("비밀번호4자리를 입력하세요");
		int inputPw=sc.nextInt();
		while(inputPw!=pw) {
			System.out.println("비밀번호4자리를 입력하세요");
			inputPw=sc.nextInt();
		}
		System.out.println("정답");
		//9 1번방법
		int i2=1;
		while(sum<=50) {
			sum+=i2;
			if(sum==50) {
				System.out.println(i2);
			}
			i2++;
			
		}
		//9 2번방법
//		int i2=1;
//		while(sum<=50) {
//			sum+=i2;
//			i2++;
//			if(sum==50) {
//				System.out.println(i2-1);
//			}
//			
//			
//		}
		//10
		//정답:JavaJavaJava
//		int n=1;
//		while(n<=3) {
//			System.out.println("Java");
//			n++;
//		}
		

	}

}
