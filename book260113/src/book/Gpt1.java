package book;

import java.util.Date;

public class Gpt1 {
	public static void main(String[] args) {
		//1
		Gpt1.one();
		//2
		Gpt1.two();
		//3
		Gpt1.three();
		//4
		Gpt1.four();
		//5
		Gpt1.five();
		//6
		Gpt1.six();
		//7
		Gpt1.seven();
	}
	public static void one() {
		//1
		Date date=new Date();
		String day=date.toString();
		System.out.println(day);
	}
	public static void two() {
		//2
		Date date=new Date(0);
		String basic=date.toString();
		System.out.println(basic);
	}
	public static void three() {
		//3
		Date date=new Date();
		long todayMil=date.getTime();
		System.out.println(todayMil);
	}
	public static void four() {
		//4
		Date now=new Date();
		Date before=new Date();
		before.setTime(now.getTime()-(10*1000));
		boolean bool=now.after(before);
		if(bool==false) {
			System.out.println("now은 before보다 과거입니다.");
		}else {
			System.out.println("before는 now보다 과거입니다.");
		}
	}
	public static void five() {
		//5
		Date now=new Date();
		Date end=new Date(now.getTime()-(10*1000));
		boolean ing=now.after(end);
		if(ing==false) {
			System.out.println("이벤트가 진행 중입니다.");
		}
		else {
			System.out.println("이벤트가 종료되었습니다.");
		}	
	}
	public static void six() {
		//6
		Date now=new Date();
		Date before=new Date();
		before.setTime(now.getTime()-(3*1000));
		long between=now.getTime()-before.getTime();
		long second=between/1000;
		System.out.println("시간차이: "+second+"초");
	}
	public static void seven() {
		//7
		Date now=new Date();
		Date afterMin=new Date();
		afterMin.setTime(now.getTime()+60000);
		String afterDay=afterMin.toString();
		System.out.println(afterDay);
		
	}
}
