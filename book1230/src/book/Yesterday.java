package book;

import java.util.Scanner;

public class Yesterday {
	public static void main(String[] args) {
		//1229gpt3이어서
		Scanner sc=new Scanner(System.in);
		//3
				System.out.println("학점을 입력하세요(A~F)");
				sc.nextLine();
				String grade=sc.nextLine();
				switch(grade) {
				case "A":
					System.out.println("최우수");
					break;
				case "B":
					System.out.println("우수");
					break;
				case "C":
					System.out.println("보통");
					break;
				case "D":
					System.out.println("미흡");
					break;
				case "F":
					System.out.println("탈락");
					break;
				}
				//4
				System.out.println("메뉴의 번호를 입력하세요.");
				int menu=sc.nextInt();
				switch(menu) {
				case 1:
					System.out.println("짜장면");
					break;
				case 2:
					System.out.println("짬뽕");
					break;
				case 3:
					System.out.println("탕수육");
					break;
				default:
					System.out.println("해당 메뉴는 존재하지 않습니다.");
				}
				//5
				System.out.println("월을 입력하세요.");
				int day1=sc.nextInt();
				switch(day1) {
				case 1,3,5,7,8,10,12:
					System.out.println("31일");
					break;
				case 2:
					System.out.println("28일 또는 29일");
					break;
				case 4,6,9,11:
					System.out.println("30일");
					break;
				default:
					System.out.println("해당 월은 존재하지 않습니다.");	
				}
				//6
				System.out.println("숫자와 기호를 차례대로 입력하세요.");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				sc.nextLine();
				String simbol=sc.nextLine();
				switch(simbol){
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
					System.out.println(num1/num2);
					break;
				case "%":
					System.out.println(num1%num2);
					break;
				default:
					System.out.println("기호를 다시 입력하세요.");
				}
				//7 f
				System.out.println("주민번호를 -기호 없이 입력하세요.");
				sc.nextLine();
				String numa=sc.nextLine();
				int nums=numa.charAt(6);
				switch(nums) {
				case 1,3:
					System.out.println("남성");
					break;
				case 2,4:
					System.out.println("여성");
					break;
				default:
					System.out.println("잘못된 주민번호입니다.");
				}
				//8
				System.out.println("0~9사이의 숫자를 입력하세요.");
				int num3=sc.nextInt();
				switch(num3) {
				case 0,4:
					System.out.println("apple");
					break;
				case 1,5:
					System.out.println("banana");
					break;
				case 2,6:
					System.out.println("kiwi");
					break;
				case 3,7:
					System.out.println("persimon");
					break;
				case 8,9:
					System.out.println("orange");
					break;
				default:
					System.out.println("숫자를 다시 입력하세요.");
				}
				//9
				System.out.println("점수를 입력하세요");
				int score=sc.nextInt();
				switch(score/10) {
				case 10,9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
				}
				//10
				System.out.println("라떼,에스프레소,아이스아메리카노 중 하나를 입력하세요.");
				sc.nextLine();
				String coffee=sc.nextLine();
				switch(coffee) {
				case "라떼":
					System.out.println("4000원");
					break;
				case "에스프레소":
					System.out.println("5000원");
					break;
				case "아이스아메리카노":
					System.out.println("3000원");
					break;
				default:
					System.out.println("커피종류를 다시 입력하세요.");
				}
				//11 
				System.out.println("국가 코드를 입력하세요.");
				int ncode=sc.nextInt();
				switch(ncode) {
				case 1:
					System.out.println("대한민국");
					break;
				case 2:
					System.out.println("미국");
					break;
				case 3:
					System.out.println("일본");
					break;
				default:
					System.out.println("등록된 국가가 없습니다.");
				}
				//12
				System.out.println("신호등의 색상을 입력하세요.");
				sc.nextLine();
				String color=sc.nextLine();
				switch(color) {
				case "red":
					System.out.println("정지");
					break;
				case "orange":
					System.out.println("서행");
					break;
				case "green":
					System.out.println("출발");
					break;
				default:
					System.out.println("색을 다시 입력하세요.");
				}
				//13
				System.out.println("주사위에서 나온 눈 수를 입력하세요.");
				int dot=sc.nextInt();
				switch(dot) {
				case 1:
					System.out.println("1개");
					break;
				case 2:
					System.out.println("2개");
					break;
				case 3:
					System.out.println("3개");
					break;
				case 4:
					System.out.println("4개");
					break;
				case 5:
					System.out.println("5개");
					break;
				case 6:
					System.out.println("6개");
					break;
				default:
					System.out.println("숫자를 다시 입력하세요.");
				}
				//14
				System.out.println("요일을 입력하세요.");
				String day2=sc.nextLine();
				switch(day2) {
				case "월","화","수","목","금":
					System.out.println("평일");
					break;
				case "토","일":
					System.out.println("주말");
					break;
				default:
					System.out.println("요일을 다시 입력하세요.");
				}
				//15
				System.out.println("1~5사이의 등급을 입력하세요.");
				int grade2=sc.nextInt();
				switch(grade2) {
				case 1:
					System.out.println("1급보안");
					break;
				case 2:
					System.out.println("2급보안");
					break;
				case 3:
					System.out.println("3급보안");
					break;
				case 4:
					System.out.println("담당자 접근가능");
					break;
				case 5:
					System.out.println("공개 정보");
					break;
				default:
					System.out.println("해당등급은 존재하지 않습니다.");
					
				}
				//16
				System.out.println("문자 하나를 입력하세요.");
				String sig=sc.nextLine();
				switch(sig) {
				case "ㅏ","ㅑ","ㅓ","ㅕ","ㅗ","ㅛ","ㅡ","ㅣ","ㅒ","ㅖ":
					System.out.println("모음");
					break;
				case "ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ":
					System.out.println("자음");
					break;
				default:
					System.out.println("없는 문자입니다. 다시입력하세요.");
				}
				//17
				System.out.println("원하는 사칙연산의 번호를 선택하세요.");
				System.out.println("--------------------------");
				System.out.println("1.+ 2.- 3.* 4. /");
				System.out.println("--------------------------");
				int a=sc.nextInt();
				System.out.println("두개의 정수를 차례로 입력하세요.");
				int num11=sc.nextInt();
				int num12=sc.nextInt();
				switch(a) {
				case 1:
					System.out.println(num11+num12);
					break;
				case 2:
					System.out.println(num11-num12);
					break;
				case 3:
					System.out.println(num11*num12);
					break;
				case 4:
					System.out.println(num11/num12);
					break;
				default:
					System.out.println("사칙연산을 다시 선택하세요.");
				}
				//18
				System.out.println("학년을 입력하세요.");
				int st=sc.nextInt();
				switch(st) {
				case 1:
					System.out.println("501호");
					break;
				case 2:
					System.out.println("502호");
					break;
				case 3:
					System.out.println("503호");
					break;
				case 4:
					System.out.println("504호");
					break;
				default:
					System.out.println("학년을 다시 입력하세요.");
				}
				//19
				System.out.println("과목 코드를 입력하세요.");
				int scode=sc.nextInt();
				switch(scode) {
				case 1:
					System.out.println("국어");
					break;
				case 2:
					System.out.println("수학");
					break;
				case 3:
					System.out.println("영어");
					break;
				default:
					System.out.println("과목코드를 다시 입력하세요.");
				}
				//20
				System.out.println("혈액형을 입력하세요.");
				sc.nextLine();
				String qw=sc.nextLine();
				switch(qw) {
				case "A":
					System.out.println("그냥 A형");
					break;
				case "B":
					System.out.println("그냥 B형");
					break;
				case "O":
					System.out.println("그냥 O형");
					break;
				case "AB":
					System.out.println("그냥 AB형");
					break;
				default:
					System.out.println("혈액형을 다시 입력하세요.");

				}
				//21
				System.out.println("1~3단계 중 게임 난이도를 선택하세요.");
				int diffi=sc.nextInt();
				switch(diffi) {
				case 1:
					System.out.println("초보자단계");
					break;
				case 2:
					System.out.println("중급자 단계");
					break;
				case 3:
					System.out.println("고급 단계");
					break;
				default:
					System.out.println("해당 단계는 존재하지 않습니다.");

				}
				//22
				System.out.println("할인쿠폰번호 4자리를 입력하세요.");
				int cou=sc.nextInt();
				switch(cou) {
				case 1234:
					System.out.println("10프로 할인");
					break;
				case 5678:
					System.out.println("20프로 할인");
					break;
				default:
					System.out.println("발급되지 않은 쿠폰번호입니다.");
				}
				//23
				System.out.println("통신사 코드를 입력하세요.");
				int code=sc.nextInt();
				switch(code) {
				case 1:
					System.out.println("KT");
					break;
				case 2:
					System.out.println("LG");
					break;
				case 3:
					System.out.println("SKT");
					break;
				default:
					System.out.println("해당 통신사 코드는 없습니다.");
				}
				//24
				System.out.println("계절을 입력하세요.");
				String ses=sc.nextLine();
				switch(ses) {
				case "봄":
					System.out.println(1);
					break;
				case "여름":
					System.out.println(2);
					break;
				case "가을":
					System.out.println(3);
					break;
				case "겨울":
					System.out.println(4);
					break;
				default:
					System.out.println("계절을 다시 입력하세요.");
				}
				//25
				System.out.println("원하는 층수를 입력하세요.");
				int floor=sc.nextInt();
				switch(floor){
					case 1:
						System.out.println("1층");
						break;
					case 2:
						System.out.println("2층");
						break;
					case 3:
						System.out.println("3층");
						break;
					default:
						System.out.println("해당 층은 없습니다.");
						
				}
				//26
				System.out.println("언어코드를 입력하세요.");
				int lcode=sc.nextInt();
				switch(lcode) {
				case 1:
					System.out.println("안녕하세요.");
					break;
				case 2:
					System.out.println("Hello");
					break;
				default:
					System.out.println("해당 언어코드가 존재하지 않습니다.");
				}
				//27 f
				System.out.println("숫자를 입력하세요.");
				int num23=sc.nextInt();
				switch(num23) {
				case 1:
					System.out.println("Ⅰ");
					break;
				case 2:
					System.out.println("Ⅱ");
					break;
				case 3:
					System.out.println("Ⅲ");
					break;
				default:
					System.out.println("해당 숫자는 로마자로 표시 불가능합니다.");
				}
				//28
				System.out.println("시험 결과를 입력하세요.");
				sc.nextLine();
				String result=sc.nextLine();
				switch(result) {
				case "A":
					System.out.println(12345);
					break;
				case "B":
					System.out.println(67894);
					break;
				case "C":
					System.out.println(123785);
					break;
				case "D":
					System.out.println(45786);
					break;
				case "F":
					System.out.println(4587238);
					break;
				default:
					System.out.println("등급을 다시 입력하세요.");
				}
				//29
				System.out.println("번호를 입력하세요.");
				int numd=sc.nextInt();
				switch(numd) {
				case 1:
					System.out.println("클릭");
					break;
				case 2:
					System.out.println("더블클릭");
					break;
				case 3:
					System.out.println("드래그");
					break;
				default:
					System.out.println("번호를 다시 입력하세요.");
				}
				//30
				System.out.println("에러 코드를 입력하세요.");
				sc.nextLine();
				String err=sc.nextLine();
				switch(err) {
				case "Exception":
					System.out.println("일반예외");
					break;
				case "RunTimeException":
					System.out.println("런타임예외");
					break;
				default:
					System.out.println("새로운 예외입니다.");
				}
	}
	

}
