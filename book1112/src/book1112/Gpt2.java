//package book1112;
//
//public class Gpt2 {
//
//	public static void main(String[] args) {
//		int score=85;
//		String grade=switch(score) {
//		case 95->"A";
//		case 85->"B";
//		case 75->"C";
//		default ->"F";
//		};
//		System.out.println(grade);
//		
//		int menu=3;
//		String name=switch(menu) {
//		case 1->"햄버거";
//		case 2->"치킨";
//		default->"피자";
//		};
//		
//		int num=4;
//		String nName=switch(num) {
//		case 1->"One";
//		case 2->"Two";
//		case 3->"Three";
//		case 4->"Four";
//		default->"Five";
//		};
//		System.out.println(nName);
//		
//		String grade="silver";
//		String percent=switch(grade) {
//		case "silver"->"10%";
//		case "gold"->"20%";
//		default ->"30%";	
//		};
//		
//		int month=12;
//		String sMonth=switch(month) {
//		case 1,2,3,4,5,6,7,8,9,10,11,12->{
//			String result1=month+"월";
//			yield result1;
//		}
//		default->"월은 1월부터~12월까지 입력";
//		};
//		System.out.println(sMonth);
//	}
//
//}
