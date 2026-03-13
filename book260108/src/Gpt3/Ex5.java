package Gpt3;

import java.util.Scanner;

public class Ex5 {
	public static double two(int a) throws IllegalArgumentException{
		if(a<=0) {
			throw new IllegalArgumentException();
		}
		double result=Math.sqrt(a);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("정수를 입력하세요.");
			int input=sc.nextInt();
			double re=two(input);
			System.out.println(re);
		}catch(IllegalArgumentException e){
			System.out.println("음수를 입력하였습니다.양수로 다시 입력하세요.");
		}finally {
			sc.close();
		}
	}
}
