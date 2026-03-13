package Gpt4;

import java.util.Scanner;

public class Ex6 {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tongjang tong1=new Tongjang(10000);
		System.out.println("원하는 출금액수를 입력하세요.");
		long want=Long.parseLong(sc.nextLine());
		try {
			tong1.output(want);
		}catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
