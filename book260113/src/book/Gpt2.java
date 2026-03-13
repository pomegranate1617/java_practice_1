package book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Gpt2 {
	public static void main(String[] args) {
		
	}
	public static void one() {
		Scanner sc=new Scanner(System.in);
		System.out.println("현재날짜를 입력하세요.(0000/00/00의 형식으로 작성)");
		String now=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		Date start=new Date();
		sdf.format(start);
		Date end=new Date();
	}
	public static void two() {
		
	}
}
