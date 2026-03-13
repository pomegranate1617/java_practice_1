package book;

import java.util.Scanner;

public class Gpt1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("1~7사이의 정수를 입력하세요.");
		int day=sc.nextInt();
		String weekend=switch(day) {
		case 1->"월요일";
		case 2->"화요일";
		case 3->"수요일";
		case 4->"목요일";
		case 5->"금요일";
		case 6->"토요일";
		case 7->"일요일";
		default->"잘못된 숫자 입력";
		};
		System.out.println(weekend);
		//2
		sc.nextLine();
		System.out.println("해당 달을 영어로 입력하세요.");
		String month=sc.nextLine();
		String session=switch(month) {
		case "March","April","May"->"Spring";
		case "June","July","August"->"Summer";
		case "September","October","November"->"Fall";
		case "January","February","December"->"Winter";
		default ->"해당 월은 존재하지 않습니다.";
		};
		//3
		System.out.println("등급을 입력하세요.");
		String grade=sc.nextLine();
		String bool=switch(grade) {
		case "A","B","C"->"Pass";
		case "D","F"->"Fail";
		default ->"등급을 다시 입력하세요.";
		};
		//4
		System.out.println("1~10중에 한개의 숫자를 입력하세요.");
		int num=sc.nextInt();
		String eo=switch(num) {
		case 2,4,6,8->"Even";
		case 1,3,5,7->"Odd";
		default ->"허용숫자 초과";
		};
		//5
		System.out.println("과일을 입력하세요.");
		sc.nextLine();
		String fruit=sc.nextLine();
		String color=switch(fruit) {
		case "Apple"->"red";
		case "Banana"->"yellow";
		case "Grape"->"purple";
		default ->"해당 과일은 등록되지 않았습니다.";
		};
		//6
		System.out.println("점수를 입력하세요.");
		int score=sc.nextInt();
		String grade2=switch(score/10) {
		case 10,9->"A";
		case 8->"B";
		case 7->"C";
		default->"F";
		};
		//7
		System.out.println("해당 방향의 영문첫글자를 입력하세요.");
		sc.nextLine();
		String direction=sc.nextLine();
		String sdir=switch(direction) {
		case "N"->"North";
		case "S"->"South";
		case "W"->"West";
		case "E"->"East";
		default->"방향을 다시 입력하세요.";
		};
		//8
		System.out.println("1~31중 하나의 숫자를  입력하세요.");
		int monthNumber=sc.nextInt();
		String days=switch(monthNumber) {
		case 31,30,29->monthNumber+"days";
		default ->"해당일자는 표시되지 않습니다.";
		};
		//9
		System.out.println("정수를 입력하세요.");
		int n=sc.nextInt();
		Boolean bool2=switch(n) {
		case 1,2,3->true;
		default ->false;
		};
		//10
		System.out.println("요일을 입력하세요");
		sc.nextLine();
		String dayName=sc.nextLine();
		String week=switch(dayName) {
		case "월","화","수","목","금"->"Weekday";
		case "토","일"->"Weekend";
		default ->"해당월은 존재하지 않습니다.";
		};
		//11
		System.out.println("점수를 입력하세요.");
		int score2=sc.nextInt();
		String grade3=switch(score2/10) {
		case 10,9->"Excellent";
		case 8,7->"Good";
		default->{
			yield "Average";
		}
		};
		
		
		
		
		
	}

}
