package Gpt1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			Divide di=new Divide();
			float result=di.divide(num1, num2);
			System.out.println(result);
		}catch(ZeroDivideException e){
			System.out.println("에외 처리:"+e.getMessage());
		}finally {
			sc.close();
		}
	}
}
