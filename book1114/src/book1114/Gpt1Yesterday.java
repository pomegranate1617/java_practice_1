package book1114;

import java.util.Scanner;

public class Gpt1Yesterday {
	//1113gpt2 문제 재풀이
	public static void main(String[] args) {
		//1
		int i=1;
		while(i<=10) {
			System.out.println(i);
		}
		
		//2
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int n=sc.nextInt();
		int nSum=0;
		for(int j=0;j<n;j++) {
			nSum+=j;
		}
		System.out.println(nSum);
		
		//3
		int even=1;
		while(even<=20) {
			if(even%2==0) {
				System.out.println();
			}
			
		}
		//4
		int pw=1234;
		System.out.println("비밀번호 4자리를 입력하세요");
		int inputPw=sc.nextInt();
		while(inputPw!=pw) {
			System.out.println("비밀번호 4자리를 입력하세요");
			inputPw=sc.nextInt();
		}
		System.out.println("정답");
		//5
		int threesum=0;
		int three=1;
		while(three<=100) {
			if(three%3==0) {
				threesum+=three;
			}
		}
		//6
		System.out.println("정수를 입력하세요");
		int input1=sc.nextInt();
		int inputSum=0;
		while(input1!=0) {
			inputSum+=input1;
			System.out.println("정수를 입력하세요");
			input1=sc.nextInt();
		}
		System.out.println(inputSum);
		//7
		int start=2;
		int end=2;
		while(start<10) {
			while(end<10) {
				System.out.printf("%1$sx%2$=%1$s*%$2s",start,end);
			}
		}
	}

}
