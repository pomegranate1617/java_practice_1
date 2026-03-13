package book1229;

import java.util.Date;
import java.util.Scanner;

public class Gpt2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("정수 하나를 입력하세요.");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("양수입니다.");
		}
		else if(a==0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		//2
		System.out.println("정수 하나를 입력하세요.");
		int b=sc.nextInt();
		if(b%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		//3
		System.out.println("점수를 입력하세요.");
		int score=sc.nextInt();
		if(score>=60) {
			System.out.println("합격");
		}
		else System.err.println("불합격");
		//4
		System.out.println("점수를 입력하세요");
		int score1=sc.nextInt();
		if(score1>=90) System.out.println("A");
		else if(score1>=80) System.out.println("B");
		else if(score1>=70) System.out.println("C");
		else if(score1>=60) System.out.println("D");
		else System.out.println("F");
		//5
		System.out.println("나이를 입력하세요.");
		int age=sc.nextInt();
		if(age>=20) System.out.println("성인");
		else System.out.println("미성년자");
		//6
		System.out.println("정수 2개를 입력하세요.");
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(c>d) System.out.println(c);
		else if(c==d) System.out.println("두 수가 같습니다.");
		else System.out.println(d);
		//7
		System.out.println("서로 다른 정수 3개를 입력하세요.");
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();
		if(e>f && e>g) System.out.println(e);
		else if (f>e && f>g) System.out.println(f);
		else System.out.println(g);
		//8
		System.out.println("정수를 입력하세요.");
		int h=sc.nextInt();
		if(h%3==0) System.out.println("3의 배수입니다.");
		else System.out.println("3의 배수가 아닙니다.");
		//9
		System.out.println("정수를 입력하세요");
		int i=sc.nextInt();
		if(i%5==0 && i%7==0) System.out.println("5와 7의 공배수입니다.");
		else System.out.println("5와 7의 공배수가 아닙니다.");
		//10
		System.out.println("연도를 입력하세요.");
		int year=sc.nextInt();
		if(((year!=100) && (year%4==0)) || year%400==0) System.out.println("윤년입니다.");
		else System.out.println("평년입니다.");
		//11
		System.out.println("키와 몸무게(cm)를 차례로 입력하세요");
		float height=sc.nextInt()/100.0f;
		float weight=sc.nextInt();
		float bmi=weight/(height*height);
		if(bmi<18.5) System.out.println("저체중입니다.");
		else if(bmi>=18.5 && bmi<23) System.out.println("정상체중입니다.");
		else if(bmi>=23 && bmi<25) System.out.println("과체중입니다.");
		else System.out.println("비만입니다.");
		//12
		System.out.println("비밀번호 4자리를 입력하세요.");
		int j=sc.nextInt();
		if(j==1234) System.out.println("성공");
		else System.out.println("실패");
		//13
		System.out.println("아이디와 비밀번호를 차례대로 입력하세요");
		sc.nextLine();
		String id=sc.nextLine();
		int pw=sc.nextInt();
		if(id.equals("apple1") && pw==1234) System.out.println("로그인성공");
		else System.out.println("로그인 실패");
		//14
		System.out.println("문자 하나를 입력하세요.");
		sc.nextLine();
		char char1=sc.nextLine().charAt(0);
		if(char1>=65) System.out.println("대문자입니다.");
		else System.out.println("소문자입니다.");
		//15
		System.out.println("정수를 하나 입력하세요.");
		int k=sc.nextInt();
		if(k<0) System.out.println(-k);
		else System.out.println(k);
		//16
		System.out.println("두 정수를 입력하세요");
		int l=sc.nextInt();
		int m=sc.nextInt();
		if(l>m) System.out.println(l-m);
		else if(l<m) System.out.println(m-l);
		else System.out.println("두 수가 같습니다.");
		//17
		System.out.println("점수를 입력하세요");
		int score2=sc.nextInt();
		if(score2<0 || score2>100) System.out.println("잘못된 입력");
		//18
		System.err.println("정수를 입력하세요");
		int score3=sc.nextInt();
		if(score3>=10 && score3<=100) System.out.println("점수가 10이상이고 100이하 입니다.");
		//19
		System.out.println("삼각형의 세변의 길이를 짧은 순서대로 입력하세요.");
		int line1=sc.nextInt();
		int line2=sc.nextInt();
		int line3=sc.nextInt();
		if(line1+line2>line3) System.out.println("삼각형이 가능합니다.");
		else System.out.println("삼각형이 불가능합니다.");
		//20
		System.out.println("구매금액을 입력하세요.");
		int buy=sc.nextInt();
		if(buy>=100000) System.out.println("결제금액:"+buy*0.9);
		else System.out.println("결제금액:"+buy);
		//21
		System.out.println("숫자를 입력하세요.");
		int num=sc.nextInt();
		if(num>=0 && num<10) System.out.println("한자리 숫자입니다.");
		//22
		System.out.println("점수를 입력하세요.");
		int score4=sc.nextInt();
		if(score4<0) score4=0;
		//23
		System.out.println("국어,영어,수학 점수를 차례대로 입력하세요.");
		int kr=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		float total=(kr+eng+math)/3.0f;
		if(total>=80) System.out.println("우수");
		else System.out.println("미흡");
		//24
		System.out.println("시간을 입력하세요(ex)오후1시12분->1312)");
		int time=sc.nextInt();
		if(time>=1200 &&time<2400) System.out.println("오후입니다.");
		else if(time>=0 && time<1200)System.out.println("오전입니다.");
		else System.out.println("잘못된 시간입력");
		//25
		System.out.println("정수 두개를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1%2==0 && num2%2==0) System.out.println("모두 짝수");
		//26
		System.out.println("나이를 입력하세요.");
		int age2=sc.nextInt();
		if(age2>=20) System.out.println("성인요금");
		else if(age2<20 && age2>=8) System.out.println("청소년요금");
		else System.out.println("어린이 요금");
		//27 ff
		System.out.println("양의 정수를 입력하세요");
		int score5=sc.nextInt();
		int last=;
		while(last!=0) {
			last=score5/2;
			if(last==1) {
				System.out.println("2의 거듭제곱이 아닙니다.");
				break;
			}
		}
		System.out.println("2의 거듭제곱입니다.");
		
		//28
		System.out.println("숫자를 입력하세요.");
		int z=sc.nextInt();
		int dv=0;
		if(z!=0) dv=z/2;
		//29
		System.out.println("점수와 결석일을 차례대로 입력하세요");
		int score6=sc.nextInt();
		int not=sc.nextInt();
		if(score6>=90 && not<=3 ) System.out.println("장학생");
		//30
		System.out.println("오늘 날씨를 입력하세요 ex)맑음,비,눈,흐림");
		sc.nextLine();
		String weather=sc.nextLine();
		if(weather.equals("비")) System.out.println("우산을 챙긴다");
		else System.out.println("그냥 간다");
		
		
		
		
		
		
		
		
		
		
		
	}
}
