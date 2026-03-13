package example;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else System.out.println("F");
		//2
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		if(num%2==0)System.out.println("짝수");
		else System.out.println("홀수");
		//3
		System.out.println("연도를 입력하세요");
		int year=sc.nextInt();
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			System.out.println("윤년입니다");
		}
		else System.out.println("평년입니다");
		//4
		System.out.println("정수 3개를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
		//5
		System.out.println("나이와 국가유공자여부(true(=yes)/false(=no))를 입력하세요.");
		int age=sc.nextInt();
		sc.nextLine();
		boolean isVeteran=sc.nextBoolean();
		if(age>=65 || isVeteran==true) {
			System.out.println("무료");
		}
		else if(age<19) {
			System.out.println("5000원");
		}
		else System.out.println("10000원");
		//6
		int x=sc.nextInt();
		if(x>0) {
			System.out.println("양수");
		}
		else if(x==0) {
			System.out.println("0");
		}
		else System.out.println("음수");
		//7(오답:수정함,.equals()활용)
		System.out.println("아이디와 비밀번호를 입력하세요");
		sc.nextLine();
		String userId=sc.nextLine();
		int userPw=sc.nextInt();
		if(userId.equals("java_dev") && userPw==1234) {
			System.out.println("로그인 성공");
		}
		else if(!userId.equals("java_dev") && userPw==1234) {
			System.out.println("아이디 오류");
		}
		else if(!userId.equals("java_dev") && userPw!=1234) {
			System.out.println("비밀번호 오류");
		}
		else System.out.println("로그인 실패");
		//8
		System.out.println("문자열을 입력하세요");
		String text=sc.nextLine();
		if(text.length()>=10) {
			System.out.println("긴 문자열");
		}
		else if(text.length()>=5) {
			System.out.println("적당한 문자열");
		}
		else System.out.println("짧은 문자열");
		//9
		System.out.println("정수를 입력하세요");
		int value=sc.nextInt();
		if(value>=10 && value<=20) {
			System.out.println("10이상 20이하");
		}
		else System.out.println("범위기준 미달");
		//10(오답:수정함)
		System.out.println("온도를 입력하세요(정수만 작성)");
		int temp=sc.nextInt();
		if(temp>=30) {
			System.out.println("폭염 경고");
		}
		else if(temp<0) {
			System.out.println("한파 경고");
		}
		else if(temp<10 && temp>=0) {
			System.out.println("추움");
		}
		else System.out.println("쾌적함");

	}
}
