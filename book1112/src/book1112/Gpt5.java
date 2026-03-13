//package book1112;
//
//public class Gpt5 {
//
//	public static void main(String[] args) {
//		//7..?
//		int score=55;
//		String grade=switch(score/10) {
//		case 10,9->"최고";
//		case 8,7->"좋음";
//		default->"재시험";
//		};
//		System.out.println(grade);
//		
//		
//		//8
//		int a=4;
//		String range=switch(a) {
//		case 1,2,3,4,5,6,7,8,9,10->{
//			String result="1~10";
//			yield result;
//		}
//		case 11,12,13,14,15,16,17,18,19,20->{
//			String result="11~20";
//			yield result;
//		}
//		case 21,22,23,24,25,26,27,28,29,30->{
//			String result="21~30";
//			yield result;
//		}
//		default->"31~40";
//		};
//		System.out.println(range);
//		
//		
//		//9
//		int day=3;
//		String alram=switch(day) {
//		case 1,2,3,4,5->{
//			String result="주중 - 알람 설정";
//			yield result;
//		}
//		case 6,7->{
//			String result="주말 - 늦잠 가능";
//			yield result;
//		}
//		default->"해당요일없음";
//		};
//		System.out.println(alram);
//		
//		
//		//10
//		int price=10000;
//		int discount=20;
//		String total=switch(price) {
//		case 10000->{
//			String result=price-(price*(discount/100))+"원";
//			yield result;
//		}
//		default->{
//			String result="할인적용불가능";
//			yield result;
//		}
//		};
//		System.out.println(total);
//		
//	}
//
//}
