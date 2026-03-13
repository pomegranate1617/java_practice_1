package example;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//1
		int i=10;
		while(i>=1) {
			System.out.println(i);
			--i;
		}
		//2
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.println("정수를 입력하세요");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println(sum);
				break;
			}
			else sum+=num;
		}
		//3
		System.out.println("정수를 입력하세요");
		int fac=sc.nextInt();
		int mulResult=1;
		while(fac!=0) {
			mulResult*=fac;
			--fac;
		}
		System.out.println(mulResult);
		//4(오답:Integer.parseInt는 String 값만 받으므로 char을 String으로 형변환 해줘야 됨.)
		System.out.println("양의 정수를 입력하세요");
		int number=sc.nextInt();
		int sumPartnum=0;
		int k=0;
		while(k<=String.valueOf(number).length()-1) {
			sumPartnum+=Integer.parseInt(String.valueOf((String.valueOf(number)).charAt(k)));
			k++;
		}
		System.out.println(sumPartnum);
		//5
		int randomNum=(int)(Math.random()*101);
		System.out.println("1부터 100까지의 수 중 하나를 입력하세요");
		int input=sc.nextInt();
		while(input!=randomNum) {
			if(input<randomNum) {
				System.out.println("Up");
			}
			else System.out.println("Down");
			System.out.println("다시 입력하세요");
			input=sc.nextInt();
		}
		System.out.println(randomNum);
		//6
		int two=1;
		while(two<=1000) {
			two*=2;
		}
		System.out.println(two/2);
//		int two=1;
//		while(two<=1000) {
//			two*=2;
//			if(two*2>1000) {
//				break;
//			}
//		}
//		System.out.println(two);
		//7
		int[] data= {5,8,1,9,3};
		int t=0;
		while(t<data.length) {
			System.out.println(data[t]);
			t++;
		}
		//8
		String sentence="Hello Java World";
		int h=0;
		int strA=0;
		while(h<sentence.length()) {
			if(String.valueOf(sentence.charAt(h)).equals("a")) {
				strA++;
			}
			h++;
		}
		System.out.println(strA);
		//9
		System.out.println("정수 2개를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(int)(Math.random()*9+1);
		//2357111317
		//x는 최대공약수
		//a=x+y;
		//b=x+z;
		while() {
			if(a>b) {
				System.out.println();
			}
			else if(a==b) {
				
			}
			else(a<b){
				
			}
		}
			
		//10
		String id="admin";
		int pw=1234;
		System.out.println("1)아이디와 2)비밀번호를 입력하세요");
		sc.nextLine();
		String inputId=sc.nextLine();
		int inputPw=sc.nextInt();
		int q=1;
		while(q<=3) {
			if(id.equals(inputId) && pw==inputPw) {
				System.out.println("로그인 성공");
				break;
			}
			else if(!id.equals(inputId) || pw!=inputPw) {
				System.out.println("1)아이디와 2)비밀번호를 재입력하세요");
				sc.nextLine();
				inputId=sc.nextLine();
				inputPw=sc.nextInt();
				q++;
				if(q==4) {
					System.out.println("로그인 횟수 초과");
				}
			}
		}
		
		
		

	}

}
