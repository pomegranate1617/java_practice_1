package example;

import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("1부터 7까지의 정수를 입력하세요");
		int day=sc.nextInt();
		switch(day){
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
				System.out.println("해당요일 없음");
		}
		//2
		System.out.println("해당 달을 입력하세요");
		int month=sc.nextInt();
		switch(month) {
			case 3,4,5:
				System.out.println("봄");
				break;
			case 6,7,8:
				System.out.println("여름");
				break;	
			case 9,10,11:
				System.out.println("가을");
				break;
			case 12,1,2:
				System.out.println("겨울");
				break;
			default:System.out.println("해당 달은 존재하지 않습니다.");
			
		}
		//3
		System.out.println("정수두개를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.nextLine();
		System.out.println("사칙연산 기호를 입력하세요");
		String operator=sc.nextLine();
		switch(operator) {
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println((int)(num1/num2));
				break;
			default:
				System.out.println("해당 기호는 사용불가합니다.");
		}
		//4
		System.out.println("정수를 입력하세요");
		int level=sc.nextInt();
		switch(level) {
			case 1:
				System.out.println("관리자");
				break;
			case 2:
				System.out.println("편집자");
				break;
			case 3:
				System.out.println("일반사용자");
				break;
			default: 
				System.out.println("손님");
		}
		//5
		sc.nextLine();
		System.out.println("START,STOP,PAUSE중 하나를 입력하세요");
		String command=sc.nextLine();
		switch(command) {
			case "START":
				System.out.println("시스템 시작");
				break;
			case "STOP":
				System.out.println("시스템 중지");
				break;
			case "PAUSE":
				System.out.println("시스템 일시정지");
				break;
			default:
				System.out.println("알 수 없는 명령");
			
		}
		//6
		System.out.println("점수를 입력하세요");
		int scoreUnit=sc.nextInt()/10;
		switch(scoreUnit) {
			case 9:
			case 10:
				System.out.println("매우 잘함");
				break;
			case 8:
				System.out.println("잘함");
				break;
			case 7:
				System.out.println("보통");
				break;
			default:
				System.out.println("노력필요");
		}
		//7
		sc.nextLine();
		System.out.println("색깔을 입력하세요");
		String colorCode=sc.nextLine();
		switch(colorCode) {
			case "R":
				System.out.println("빨강");
				break;
			case "B":
				System.out.println("파랑");
				break;
			case "G":
				System.out.println("초록");
				break;
			default:
				System.out.println("지원하지 않는 색상");
		}
		//8
		System.out.println("버전을 입력하세요");
		int version=sc.nextInt();
		switch(version) {
			case 8:
				System.out.println("Lambda");
				break;
			case 11:
				System.out.println("HttpClient");
				break;
			case 17:
				System.out.println("Sealed Classes");
				break;
			default:
				System.out.println("새로운 버전");
		
		}
		//9
		System.out.println("1부터 12사이의 정수를 입력하세요");
		int month2=sc.nextInt();
		switch(month2) {
			case 1,3,5,7,8,10,12:
				System.out.println("31일");
				break;
			case 4,6,9,11:
				System.out.println("30일");
				break;
			case 2:
				System.out.println("28일");
				break;
			default: System.out.println("존재하지 않는 달");
		}
		//10
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt()/10;
		switch(age) {
		case 6,7,8,9,10,11:
			System.out.println("경로우대 할인 적용");
			break;
		case 0:
			System.out.println("어린이 할인 적용");
			break;
		default:
			System.out.println("일반 요금 적용");
		}
		
		
		
		
			
		
		
	}

}
