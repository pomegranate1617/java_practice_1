package book;

import java.util.Scanner;

public class Gpt2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("과목의 난이도와 점수를 입력하세요.");
		String subjectDifficulty=sc.nextLine();
		int score=sc.nextInt();
		String final1=switch(subjectDifficulty){
			case "Hard"->{
				if(score>=80) yield "Excellent";
				else if(score>=50) yield "Good";
				else  yield "Average";
			}
			case "Medium"->{
				if(score>=90) yield "Excellent";
				else if(score>=70) yield "Good";
				else yield "Average";
			}
			case "Easy"->{
				if(score>=100) yield "Excellent";
				else if(score>=80) yield "Good";
				else yield "Average";
			}
			default->"다시입력하세요.";
		};
		//2
		System.out.println("신호등의 색깔과 시간을 입력하세요.");
		sc.nextLine();
		String trafficLight=sc.nextLine();
		int hour=sc.nextInt();
		String hav=switch(hour) {
		case 6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22->{
			if(trafficLight.equals("Red")) yield "Stop";
			else if(trafficLight.equals("Yellow")) yield "Wait";
			else yield "Go";
		}
		case 23,0,1,2,3,4,5->{
			if(trafficLight.equals("Red")) yield "Stop";
			else if(trafficLight.equals("Yellow")) yield "Wait";
			else yield "Caution";
		}
		default->"해당시간은 존재하지 않습니다.";
		};
		//3
		System.out.println("해당 년과 월을 입력하세요.");
		int year=sc.nextInt();
		int month=sc.nextInt();
		String days=switch(month) {
		case 1,3,5,7,8,10,12->"31days";
		case 4,6,9,11->"30days";
		case 2->{
			if((year%4==0 && year%100!=0 )|| (year%400==0)){
			 yield "29days";	
			}
			else yield "28days";
		}
		default->"월을 다시 입력하세요.";
		};
		//4
		System.out.println("과일을 입력하세요.");
		String fruit=sc.nextLine();
		String color;
		String session;
		String cNs=switch(fruit) {
		case "Apple"->{
			color="Red";
			session="Fall";
			yield color+"in"+session;
		}
		case "Banana"->{
			color="Yellow";
			session="Summer";
			yield color+"in"+session;
		}
		case "Grape"->{
			color="Purple";
			session="Summer";
			yield color+"in"+session;
		}
		default->"해당과일은 등록되어있지 않습니다.";
		};
		//5
		System.out.println("0~100까지의 나이를 입력하세요");
		int age=sc.nextInt();
		String generation=switch(age/10) {
		case 10,9,8,7,6,5,4,3,2->{
			if((age/10)>=6) yield "Senior";
			else yield "Adult";
		}
		case 1->{
			if(age>=10) yield "Teen";
			else yield "Child";
		}
		default ->"입력할 수 있는 나이범위를 초과했습니다";
		};
		//6 
		System.out.println("점수를 입력하세요.");
		int score2=sc.nextInt();
		String fgrade="";
		String grade=switch(score2/10) {
		case 10,9->{
			fgrade="A";
			if(score2>=97) yield "+"+fgrade;
			else if(score2>=93) yield fgrade;
			else yield "-"+fgrade;
		}
		case 8->{
			fgrade="B";
			if(score>=87) yield "+"+fgrade;
			else if(score>=83) yield fgrade;
			else yield "-"+fgrade;
		}
		case 7->{
			fgrade="C";
			if(score>=77) yield "+"+fgrade;
			else if(score>=73) yield fgrade;
			else yield "-"+fgrade;
		}
		case 6->{
			fgrade="D";
			if(score>=67) yield "+"+fgrade;
			else if(score>=63) yield fgrade;
			else yield "-"+fgrade;
		}
		default->"F";
		};
		//7
		System.out.println("요일과 휴일여부를 입력하세요.");
		sc.nextLine();
		String dayName=sc.nextLine();
		Boolean isHoliday=sc.nextBoolean();
		String day=switch(dayName) {
		case "Mon","Tue","Wed","Thur","Fri"->{
			if(isHoliday==true) {
				yield "Holiday";
			}
			else {
				yield "Workday";
			}
		}
		case "Sat","Sun"-> "Weekend";
		default->"해당 요일은 없습니다.";
		};
		//8 c
		System.out.println("문자를 입력하세요.");
		String ch=sc.nextLine();
		String sig=switch(ch) {
		case "b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","x","y","z"->{
			yield "Consonant";
		}
		case"a","e","i","o","u"->"Vowel";
		default->"Others";
		};
		//9 모르겠다..
//		System.out.println("1~100 중 하나의 숫자를 입력하세요.");
//		int num5=sc.nextInt();
//		String hei=switch(num5) {
//		case num5->{
//			if(num5<=33) yield "Low";
//			else if(num5<=66) yield "Medium";
//			else yield "High";	
//		}
//		default->"입력가능한 숫자가 아닙니다.";
//		};
		//입력1~100
		//출력:Low,Medium,High
		//규칙:33 66 100
//		System.out.println("1~100중 하나의 숫자를 입력하세요.");
//		int num5=sc.nextInt();
//		boolean c;
//		if(num5>=1 && num5<=100) c=true;
//		else c=false;
//		String hei=switch(c) {
//		case true->{
//			if(num5<=33) yield "Low";
//			else if(num5<=66) yield "Medium";
//			else yield "High";	
//		}
//		default->"입력가능한 숫자가 아닙니다.";
//		};
		//10
		System.out.println("날씨와 온도를 입력하세요.");
		sc.nextLine();
		String weather=sc.nextLine();
		int temperature=sc.nextInt();
		String state=switch(weather) {
		case "Sunny"->{
			if(temperature>=10) yield "Go out";
			else if(temperature<10 && temperature>0) yield "Go out"+""+"Wear jacket";
			else yield "Stay home";
		}
		case "Rainy"->{
			if(temperature>=10) yield "Take umbrella";
			else yield "Take umbrella"+","+"Wear jacket";
		}
		case "Cloudy"->{
			if(temperature>=10) yield "Go out"+","+"Take umbrella";
			else if(temperature<10 && temperature>0) yield "Go out"+","+"Take umbrella"+"Wear jacket";
			else yield "Stay home";
		}
		default ->"등록되지 않은 날씨입니다.";
		};
		
		
		
		
		
		
		
		
	}
}
