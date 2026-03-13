package book1229;

import java.util.Scanner;

public class Gpt3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1
		System.out.println("1부터 7까지의 정수 중 하나를 입력하세요.");
		int day=sc.nextInt();
		switch(day) {
		case 1: 
			System.out.println("월요일");
			break;		
		case 2: 
			System.out.println("화요일");
			break;
		case 3: 
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("해당요일이 없습니다.");
		
		}
		//2
		System.out.println("월(月)을 입력하세요");
		int month=sc.nextInt();
		switch(month) {
		case 12,1,2:
			System.out.println("겨울");
			break;
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		default:
			System.out.println("해당 계절은 존재하지 않습니다.");
		}
		
		
		
		
		
		
		
		
		
		
			
		}
		
	}

}
