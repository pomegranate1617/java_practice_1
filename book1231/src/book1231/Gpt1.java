package book1231;

import java.util.Scanner;

public class Gpt1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("난이도와 점수를 입력하세요.");
		String difficulty=sc.nextLine();
		int score=sc.nextInt();
		String result=switch(difficulty) {
		case "Hard"->{
			if(score>=80) {
				yield "Excellent";
			}
			else if(score>=50) {
				yield "Good";
			}
			else {
				yield "Average";
			}
		}
		case "Medium"->{
			if(score>=90) {
				yield "Excellent";
			}
			else if(score>=70) {
				yield "Good";
			}
			else {
				yield "Average";
			}
		}
		case "Easy"->{
			if(score>=100) {
				yield "Excellent";
			}
			else if(score>=80) {
				yield "Good";
			}
			else {
				yield "Average";
			}
		}
		default->"해당 난이도는 없습니다.";
		};
		//2
		System.out.println("신호등의 색깔을 입력하세요.");
		sc.nextLine();
		String trafficLight=sc.nextLine();
		System.out.println("시간을 입력하세요(0~23)");
		int time=sc.nextInt();
		String bstop=switch(trafficLight) {
		case "Red"->"Stop";
		case "Yellow"->"Wait";
		case "Green"->{
			if(time<=5) {
				yield "Caution";
			}
			else {
				yield "Go";
			}
		}
		default-> "신호등 색깔을 다시 입력하세요.";
		};
		//3
		System.out.println("연도와 달을 차례로 입력하세요.");
		int year=sc.nextInt();
		int month=sc.nextInt();
		String days=switch(month){
		case 1,3,5,7,8,10,12->"31days";
		case 4,6,9,11->"30days";
		case 2->{
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				yield "29days";
			}
			else {
				yield "28days";
			}
		}
		default->"달을 다시 입력하세요.";
		
		};
		//4
		System.out.println("과일을 입력하세요.");
		sc.nextLine();
		String fruit=sc.nextLine();
		String cns=switch(fruit) {
		case "Apple"->"Red in Fall";
		case "Banana"->"Yellow in Summer";
		case "Grape"->"purple in Summer";
		default->"해당 과일은 등록되지 않았습니다.";
		};
		//5
		System.out.println("나이를 입력하세요.");
		int age=sc.nextInt();
		String generation=switch(age/10) {
		case 10,9,8,7,6,5,4,3,2->{
			if(age>=20 && age<=64) {
				yield "Adult";
			}
			else {
				yield "Senior";
			}
		}
		case 0,1->{
			if(age>=19 && age<=13) {
				yield "Teen";
			}
			else {
				yield "Child";
			}
		}
		default->"나이를 다시 입력하세요.";
		};
		//6
		System.out.println("점수를 입력하세요.");
		int score1=sc.nextInt();
		String grade1=switch(score1/10) {
		case 10,9->{
			if(score1%10<=2 && score1%10>=0) {
				yield "A-";
			}
			else if(score1%10>=3 && score1%10<=6) {
				yield "A";
			}
			else {
				yield "A+";
			}
		}
		case 8->{
			if(score1%10<=2 && score1%10>=0) {
				yield "B-";
			}
			else if(score1%10>=3 && score1%10<=6) {
				yield "B";
			}
			else {
				yield "B+";
			}
		}
		case 7->{
			if(score1%10<=2 && score1%10>=0) yield "C-";
			else if(score1%10>=3 && score1%10<=6) yield "C";
			else yield "C+";
		}
		case 6->{
			if(score1%10<=2 && score1%10>=0) yield "D-";
			else if(score1%10>=3 && score1%10<=6) yield "D";
			else yield "D+";
		}
		default->"F";
		};
		//7
		System.out.println("요일과 쉬는날 여부를 입력하세요.");
		sc.nextLine();
		String day=sc.nextLine();
		boolean isHoliday=sc.nextBoolean();
		String bwork=switch(day) {
		case "Mon","Tue","Wed","Thur","Fri"->{
			if(isHoliday) yield "Holiday";
			else yield "Workday";
		}
		case "Sat","Sun"->"Weekend";
		default->"요일을 다시 입력하세요.";
		};
		//8
		System.out.println("문자를 입력하세요.");
		sc.nextLine();
		char ch=((sc.nextLine()).toLowerCase()).charAt(0);
		String pattern=switch(ch) {
		case 'a','e','i','o','u'->"Vowel";
		case 'b','c','d','f','g','j','k',
			'l','m','n','p','r','s','t','v','w','x','y','z'->"Consonant";
		default->"Others";	
		};
		//9
		System.out.println("숫자를 입력하세요.");
		int num=sc.nextInt();
		String result1=switch(num/10) {
		case 1,2->"Low";
		case 3->{
			if(num%10>=4) yield "Medium";
			else yield "Low";
		}
		case 4,5->"Medium";
		case 6->{
			if(num%10>=7) yield "High";
			else yield "Medium";
		}
		case 7,8,9,10->"High";
		default->"입력숫자 범위초과";
		};
		//10
		System.out.println("날씨와 온도를 차례대로 입력하세요.");
		String weather=sc.nextLine();
		int temperature=sc.nextInt();
		String outside=switch(weather) {
		case "Sunny"->{
			if(temperature>=10) yield "Go out";
			else if(temperature<10 && temperature>=0) yield "Go out,Wear jacket";
			else yield "Stay home";
		}
		case "Rainy"->{
			if(temperature>=10) yield "Go out,Take umbrella";
			else if(temperature<10 && temperature>=0) yield "Go out,Take umbrella,Wear jacket";
			else yield "Stay home";
		}
		case "Cloudy"->{
			if(temperature>=10) yield "Go out";
			else if(temperature<10 && temperature>=0) yield "Go out,Wear jacket";
			else yield "Stay home";
		}
		default->"날씨를 재입력하세요.";
		};
		//11
		System.out.println("월과 북반구 또는 남반구 위치를 입력하세요.");
		int month2=sc.nextInt();
		sc.nextLine();
		String ud=sc.nextLine();
		String season=switch(month2) {
		case 3,4,5->{
			if(ud.equals("North")) yield "Spring";
			else yield "Fall";
		}
		case 6,7,8->{
			if(ud.equals("North")) yield "Summer";
			else yield "Winter";
		}
		case 9,10,11->{
			if(ud.equals("North")) yield "Fall";
			else yield "Spring";
			
		}
		case 12,1,2->{
			if(ud.equals("South")) yield "Winter";
			else yield "Summer";
		}
		default ->"월을 다시 입력하세요.";
		};
		//12
		System.out.println("점수와 학년난이도(1~12)를 입력하세요.");
		int score3=sc.nextInt();
		int gradeLevel=sc.nextInt();
		String result2=switch(gradeLevel) {
		case 1,2,3->{
			if(score3>=70) yield "Excellent";
			else if(score3>=50) yield "Good";
			else  yield "Average";
		}
		case 4,5,6->{
			if(score3>=80) yield "Excellent";
			else if(score>=60) yield "Good";
			else yield "Average";
		}
		case 7,8,9->{
			if(score3>=90) yield "Excellent";
			else if(score>=70) yield "Good";
			else yield "Average";
			
		}
		case 10,11,12->{
			if(score3>=100) yield "Excellent";
			else if(score>=80) yield "Good";
			else yield "Average";
		}
		default->"학년난이도를 확인하여 재입력하세요.";
		};
		//13
		System.out.println("상품의 가격($)과 카테고리를 입력하세요.");
		int price=sc.nextInt();
		sc.nextLine();
		String category=sc.nextLine();
		String grade=switch(category) {
		case "Electronics"->{
			if(price>=1000) yield "Premium";
			else if( price>=555 && price<=999) yield "Standard";
			else yield "Basic";
		}
		case "Clothes"->{
			if(price>=100) yield "Premium";
			else if(price>=99 && price<=50) yield "Standard";
			else yield "Basic";
		}
		case "Food"->{
			if(price>=50) yield "Premium";
			else if(price<=29 && price>=19) yield "Medium";
			else yield "Standard";
		}
		default->"카테고리를 다시 작성하세요.";
		};
		//14 
//		System.out.println("이름을 입력하세요.");
//		sc.nextLine();
//		String name=sc.nextLine();
//		String length=switch(name) {
//		case !name.equals(null)->{
//			if(name.length()<3) yield "Short";
//			else if(name.length()<7) yield "Medium";
//			else yield "Long";	
//		}
//		default->"이름을 재입력하세요.";
//		};
		System.out.println("이름을 입력하세요.");
		sc.nextLine();
		String name=sc.nextLine();
		String length=switch(name.length()) {
		case 1,2,3->"Short";
		case 4,5,6->"Medium";
		default->"Long";
		};
		
		//15
//		System.out.println("정수를 입력하세요.");
//		int num4=sc.nextInt();
//		char numc=String.valueOf(num4).charAt(0);
//		String pm=switch(numc) {
//		case "-"->{
//			if(Integer.parseInt(String.valueOf(num4).charAt(1)%2==0) yield "Even"; 
//		}
//		
//		};
		System.out.println("0~10중 하나의 정수를 입력하세요.");
		int num5=sc.nextInt();
		String state=switch(num5) {
		case  0->"Zero";
		case 1,2,3,4,5,6,7,8,9,10->{
			if(num5%2==0) yield "Even";
			else yield "Odd";
		}
		default->"초과된 숫자 입력";
		};
		//16
		System.out.println("요일과 날씨를 입력하세요.");
		sc.nextLine();
		String days2=sc.nextLine();
		String weather2=sc.nextLine();
		String go=switch(days2) {
		case "Mon","Tue","Wed","Thur","Fri"->{
			if(weather2.equals("Sunny")) yield "Company Work";
			else if(weather2.equals("Rainy")) yield "Work from home";
			else yield "Work from cafe";
		}
		case "Sat","Sun"->{
			if(weather2.equals("Sunny")) yield "Picnic";
			else yield "Home";
		}
		default-> "요일을 재입력하세요";
		
		};
		//17
		System.out.println("월과 휴가 여부를 입력하세요.");
		int month3=sc.nextInt();
		boolean isVacation=sc.nextBoolean();
		String boolwork=switch(month3) {
			case 1,2,3,4,5,6,9,10,11,12-> "Work";
			case 7,8->{ 
				if(isVacation==true) {
				yield "On vacation";
			}
			else yield "Work";
			}
			default->"월을 다시 입력하세요.";
		};
		//18
		System.out.println("교통수단과 거리(km)를 입력하세요.");
		sc.nextLine();
		String transport=sc.nextLine();
		int distance=sc.nextInt();
		String price2=switch(transport) {
		case "Bus"-> "Normal";
		case "Taxi"->{
			if(distance>10) yield "Expensive";
			else yield "Normal";
		}
		case "Subway"->"Normal";
		default->"교통수단을 다시 입력하세요.";
		};
		//19
		System.out.println("계절을 입력하세요.");
		sc.nextLine();
		String season4=sc.nextLine();
		String activity=switch(season4) {
		case "Spring","Fall"->"Hiking";
		case "Summer"->"Swimming";
		case "Winter"->"Skiing";
		default->"계절을 다시 입력하세요.";
		};
		//20
		System.out.println("시간대(0~23)와 에너지레벨(Tired,Energetic)을 입력하세요.");
		String energy=sc.nextLine();
		int time0=sc.nextInt();
		String nWork=switch(time0/5) {
		case 0,1->{
			if(energy.equals("Tired")) yield "Sleep";
			else yield "Work";
		}
		case 2,3,4->{
			if(energy.equals("Energetic")) yield "Work";
			else yield "Sleep";
		}
		default->"시간을 다시 입력하세요.";
		};
		//21
		System.out.println("점수와 출석률을 입력하세요.");
		int score6=sc.nextInt();
		int attendance=sc.nextInt();
		String gState=switch(score6/10) {
		case 10,9,8->{
			if(attendance>=90) yield "Excellent";
			else yield "Pass";
		}
		case 6->{
			if(attendance>=80) yield "Pass";
			else yield "Fail";
		}
		default->"Fail";
		};
		//22
		System.out.println("시간(0~23)을 입력하세요.");
		int time4=sc.nextInt();
		String food=switch(time4) {
		case 6,7,8,9->"Breakfast";
		case 12,13->"Lunch";
		case 18,19,20->"Dinner";
		default->"Snack";
		};
		//23
		System.out.println("온도(섭씨)와 계절을 입력하세요.");
		int temperature2=sc.nextInt();
		sc.nextLine();
		String season0=sc.nextLine();
		String clothes=switch(season0) {
		case "Spring","Fall"->"Light jacket";
		case "Summer"->{
			if(temperature2>=25) yield "T-shirt";
			else yield "Light jacket";
		}
		case "Winter"->{
			if(temperature2<0) yield "Heavy coat";
			else  yield "Lightjacket";
		}
		default->"계절을 다시 입력하세요.";	
		};
		//24
		System.out.println("로그인 횟수를 입력하세요.");
		int loginCount=sc.nextInt();
		String user=switch(loginCount) {
		case 0->"New user";
		case 1,2,3,4,5,6,7,8,9->"Normal user";
		default->"Active user";
		};
		//25
		System.out.println("나이와 학생여부를 입력하세요.");
		int age7=sc.nextInt();
		boolean isStudent=sc.nextBoolean();
		String bStudent=switch(age7/10) {
		case 0->{
			if(age7>=7) yield "School Student";
			else yield "Non-student";
		}
		case 1,2->{
			if(age7>=19 && age7<=23) yield "College student";
			if(age>=24 &&age<=25 && isStudent==true) yield "College student";
			else if(age>=10 && age7<19) yield "School student";
			else yield "Non-student";
		}
		default->"Non-student";
		};
		//26
		System.out.println("시험 점수를 입력하세요.");
		int score8=sc.nextInt();
		String reTest=switch(score8/10) {
		case 10,9,8,7,6->"Pass";
		case 4,5->"Retake exam";
		default->"Fail";
		};
		//27
		System.out.println("요일과 시간(0~23)을 입력하세요.");
		sc.nextLine();
		String days6=sc.nextLine();
		int time8=sc.nextInt();
		String alarm=switch(days6) {
		case "Mon","Tue","Wed","Thur","Fri"->{
			if(time>=9 && time<18) yield "Work notification";
			else yield "Silent";
		}
		case "Sat","Sun"->{
			if(time>=10 && time<=22) yield "Leisure notification";
			else yield "Silent";
		}
		default->"요일을 재입력하세요.";
		};
		//28
		System.out.println("키(cm)와 나이를 입력하세요.");
		int height=sc.nextInt();
		int age11=sc.nextInt();
		String bactive=switch(height/10) {
		case 14,15,16,17,18,19,20,21->{
			if(age>=10) yield "Allowed";
			else yield "Not Allowed";
		}
		default->"Not Allowed";
		};
		//29
		System.out.println("파일(MB)과 확장자를 입력하세요.");
		int size=sc.nextInt();
		sc.nextLine();
		String extension=sc.nextLine();
		String upload=switch(extension) {
		case "img"->{
			if(size<=10) yield "Upload allowed";
			else if (size>10) yield "File too large";
			else yield "Unsupported format";
		}
		default->"Unsupported format";
		};
		//30
		System.out.println("배터리의 잔량과 충전 상태를 입력하세요.");
		int battery=sc.nextInt();
		boolean isCharging=sc.nextBoolean();
//		String statement=switch(isCharging) {
//		case true->"Normal";
//		case false->{
//			if(battery<20) yield "Low battery";
//			else if(battery==100) yield "Fully charged";
//			else yield "Normal";
//		}
//		default->"충저여부를 다시 입력하세요.";
//		};
		String statement=switch(battery/10) {
		case 10->"Fully charged";
		case 2,3,4,5,6,7,8,9-> "Normal";
		case 0,1->{
			if(isCharging == false) yield "Low battery";
			else yield "Normal";
		}
		default->"배터리 잔량을 다시 입력하세요.";	
		};
	}

}
