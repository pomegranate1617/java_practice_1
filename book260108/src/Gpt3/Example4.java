package Gpt3;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,5,3,5,6};
		try {
			System.out.println("배열에서 가져올 인덱스를 입력하세요");
			int i=sc.nextInt();
			int num=arr[i];
			System.out.println(num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 접근입니다.");
		}finally {
			sc.close();
		}
	}
}
