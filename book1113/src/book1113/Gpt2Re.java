package book1113;

import java.util.Scanner;

public class Gpt2Re {

	public static void main(String[] args) {
		//1
		int a=1;
		while(a<=10) {
			System.out.println(a);
			++a;
		}
		
		//2
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int n=sc.nextInt();
		int i=1;
		int nSum=0;
		while(i<=n) {
			nSum+=i;
			++i;
		}
		System.out.println(nSum);
		
		
		//3
		int j=1;
		while(j<20) {
			if(j%2==0) {
				System.out.println(j);
			}
			++j;
		}
		//4
		int password;
		do {
			System.out.println("비밀번호4자리를 입력하세요.");
			password=sc.nextInt();
		}while(password!=1234);
		
		//5
		int base=1;
		int threeSum=0;
		while(base<=100) {
			if(base%3==0) {
				threeSum+=base;
			}
		}
		System.out.println(threeSum);
		
		//6다시다시
		System.out.println("정수를 입력하세요");
		int input2=sc.nextInt();
		int nonZeroSum=0;
		while(input2!=0) {
			nonZeroSum+=input2;
			System.out.println("정수를 입력하세요");
			input2=sc.nextInt();
		}
		nonZeroSum+=input2;
		System.out.println(nonZeroSum);

		
		//7
		int q=2;
		int w=1;
		while(q<=9) {
			while(w<=9) {
				System.out.println(q+"x"+w+"="+(q*w));
			}
			
		}
		//8
		sc.nextLine();
		System.out.println("양의정수를 입력하세요");
		String num=sc.nextLine();
		String reverse="";
		int e=num.length()-1;
		while(e>=0) {
			reverse+=num.charAt(e);
			--e;
		}
		System.out.println(reverse);
		
		//9다시다시
		int random=(int)(Math.random()*101);
		System.out.println("100이하의 양의 정수를 입력하세요");
		int answer=sc.nextInt();
		while(answer!=random) {
			System.out.println("100이하의 양의 정수를 입력하세요");
			answer=sc.nextInt();
		}
		System.out.println(answer);
		//10
		System.out.println("양의 정수를 입력하세요.");
		int facnum=sc.nextInt();
		int ii=facnum;
		int mul=1;
		while(ii>0) {
			mul*=ii;
		}
		System.out.println(mul);
		
		
	}

}
