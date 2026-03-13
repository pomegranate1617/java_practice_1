package Gpt2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//방법1)
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String input=sc.nextLine();
		try {
			if(input==null || input.trim().isEmpty()) {
				throw new NullPointerException();
			}
			input.length();
			int num=Integer.parseInt(input);
		}catch(NullPointerException e) {
			System.out.println("입력한 값이 비어있습니다.");
		}catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
	}

}
