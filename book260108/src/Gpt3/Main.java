package Gpt3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		try {
			System.out.println("파일 읽기 시도");
			int length=input.length();
		}catch(NullPointerException e) {
			System.out.println("문자열의 길이를 구할 수 없습니다.");
		}finally {
			System.out.println("파일 종료");
			sc.close();
		}
	}
}
