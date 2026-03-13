package book;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gpt2 {
	public static void dd() {
		//1
		Date now =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today=sdf.format(now);
		System.out.println(today);
	}
	public static void one() {
		//1
		Date now=new Date();
		String time=now.toString();
		System.out.println(time);
	}
	public static void two() {
		Date date=new Date();
		String re="2025-01-01";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String now=sdf.format(date);
		
	}
}
