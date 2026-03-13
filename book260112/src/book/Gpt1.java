package book;

import java.util.Date;

public class Gpt1 {
	//1
	public static void one() {
		Date now=new Date();
		System.out.println(now);
	}
	//2
	public static void two() {
		Date now=new Date();
		long time=now.getTime();
		System.out.println(time);
	}
	//3
	public static void three() {
		Date now=new Date(0);
		System.out.println(now);
	}
	//4
	public static void four() {
		Date now=new Date();
		Date basic=new Date(0);
		boolean time=now.after(basic);
		if(time==true) {
			System.out.println("현재시간보다 1970년1월1일이 더 느립니다.");
		}else {
			System.out.println("현재시간보다 1970년1월1일이 더 빠릅니다.");
		}
	}
	//5
	public static void five() {
		Date now=new Date();
		Date seven=new Date(0);
		long nowmil=now.getTime();
		long sevenmil=seven.getTime();
		System.out.println(nowmil-sevenmil);
	}
	//6
	public static void six() {
		Date now=new Date();
		long nowMil=now.getTime();
		long betYester=nowMil-(24*60*60*1000);
		Date yester=new Date(betYester);
		System.out.println(yester);
	}
	//7
	public static void seven() {
		Date date=new Date();
		Date[] args=new Date[3];
		long now=date.getTime();
		long afterSec=now+(1*1000);
		long afterMin=now+(1*60*1000);
		Date sec=new Date(now+afterSec);
		Date min=new Date(now+afterMin);
		args[0]=date;
		args[1]=sec;
		args[2]=min;
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
	//8
	public static void eight() {
		Date now=new Date();
		Date[] args=new Date[3];
		Date[] re=new Date[3];
		long one=now.getTime()-(3*60*1000);
		long two=now.getTime()+(70*60*1000);
		Date oneRe=new Date(one);
		Date twoRe=new Date(two);
		args[0]=now;
		args[1]=oneRe;
		args[2]=twoRe;
//		int oneb=now.compareTo(oneRe);
//		int twob=now.compareTo(twoRe);
//		int threeb=oneRe.compareTo(twoRe);
		for(int i=0;i<args.length;i++) {
			if(args[i].compareTo(args[i+1])==1) {
				if(args[i].compareTo(args[i+2])==1) {
					re[3]=args[i];
				}	
			}
			else if(args[i].compareTo(args[i+1])==-1) {
				if(args[i].compareTo(args[i+2])==-1){
					re[0]=args[i];
				}
			}
			else {
				
			}
		}
		
		
		
	}
	//9
	public static void nine() {
		Date one=new Date();
//		long plus=one.getTime()+(60*60*1000);
		Date two=new Date(45287558);
		int compare=one.compareTo(two);
		if(compare>0) {
			System.out.println("더 미래");
		}else if(compare==0) {
			System.out.println("같은 날짜");
		}else {
			System.out.println("더 과거");
		}
			
	}
	//10
	public static void ten() {
		Date now=new Date();
		long start=now.getTime();
		int a=0;
		for(int i=0;i<1000;i++) {
			a+=i;
		}
		Date endNow=new Date();
		long end=endNow.getTime();
		System.out.println(end-start);
	}
	
}
