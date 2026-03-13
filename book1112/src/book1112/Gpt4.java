//package book1112;
//
//import java.time.LocalDate;
//
//public class Gpt4 {
//
//	public static void main(String[] args) {
//		//1
//		int num=3;
//		String day=switch(num) {
//		case 1,2,3,4,5->{
//			String beResult1="";
//			String str1="열심히!";
//			if(num==1) beResult1="월요일";
//			else if(num==2)beResult1="화요일";
//			else if(num==3)beResult1="수요일";
//			else if(num==4)beResult1="목요일";
//			else beResult1="금요일";
//			yield beResult1+str1;
//		}
//		case 6,7->{
//			String beResult2="";
//			String str2="쉬자!";
//			if(num==6) beResult2="토요일";
//			else beResult2="일요일";
//			yield beResult2+str2;
//		}
//		default->"존재하지 않는 요일";
//		};
//		
//		
//		//2
//		int score=54;
//		int hwScore=80;
//		int total=switch(score/10) {
//		case 10,9->{
//			int add=30;
//			int result=score+add+hwScore;
//			yield result;
//		}
//		case 8->{
//			int add=20;
//			int result=score+add+hwScore;
//			yield result;
//		}
//		case 7->{
//			int add=10;
//			int result=score+add+hwScore;
//			yield result;
//		}
//		default->{
//			int result=score+hwScore;
//			yield result;
//		}
//		};
//		System.out.println(total);
//		
//		
//		//3
//		int month=5;
//		String seasonActivity=switch(month) {
//		case 12,1,2->{
//			String activity="눈싸움";
//			String result="겨울"+activity;
//			yield result;
//		}
//		case 3,4,5->{
//			String activity="꽃구경";
//			String result="봄 - "+activity;
//			yield result;
//		}
//		case 6,7,8->{
//			String activity="서핑";
//			String result="여름 - "+activity;
//			yield result;
//		}
//		case 9,10,11->{
//			String activity="단풍구경";
//			String result="가을 - "+activity;
//			yield result;
//		}
//		default->"해당월은 존재하지 않음";
//		};
//		System.out.println(seasonActivity);
//		
//		
//		//4
//		String str1="a";
//		String afterStr1=switch(str1) {
//		case "a","b","c","d"->{
//			String type="소문자";
//			String result=type+str1;
//			yield result;
//		}
//		case "A","B","C","D"->{
//			String type="대문자";
//			String result=type+str1;
//			yield result;
//		}
//		case "!","@","#","$"->{
//			String type="특수문자";
//			String result=type+str1;
//			yield result;
//		}
//		case "1","2","3","4"->{
//			String type="숫자";
//			String result=type+str1;
//			yield result;
//		}
//		default->"해당 문자는 없습니다";
//		};
//		System.out.println(afterStr1);
//		
//		
//		
//		//5
//		//LocalDate,lengthOfMonth()몰라서 챗지피티한테 물어봄....ㅠㅠ
//		LocalDate firstDay = LocalDate.of(2025,2, 1);
//        int lengthOfMonth = firstDay.lengthOfMonth(); 
//        String moonYear=switch(lengthOfMonth) {
//        	case 28->{
//        		String result="평년 - 2월"+lengthOfMonth+"일";
//        		yield result;
//        	}
//        	default->{
//        		String result="윤년 - 2월"+lengthOfMonth+"일";
//        		yield result;
//        	}
//        };
//        System.out.println(moonYear);
//        
//        //6
//        int num1=7;
//        int num2=3;
//        String cal="+";
//        int result=switch(cal) {
//        case "+"->{
//        	int sum=num1+num2;
//        	yield sum;
//        }
//        case "-"->{
//        	int minus=num1-num2;
//        	yield minus;
//        }
//        case "*"->{
//        	int mul=num1*num2;
//        	yield mul;
//        }
//        case "/"->{
//        	int divide=num1/num2;
//        	yield divide;
//        }
//        default->0;
//        };
//        System.out.println(result);       
//       
//		
//		
//		
//
//	}
//
//}
