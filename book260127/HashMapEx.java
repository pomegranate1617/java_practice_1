package book260127;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//1반생성
		OneClass one=new OneClass(1);
		//<학생 점수 관리 프로그램>
		//한반에 들어갈 학생들을 저장하는 List를 생성
		List<Student> studentList=new ArrayList<>();
		int cnt=1;
		//1-1학생5명 점수 입력(학생의 이름과 점수를 따로 빼놓은 Map생성)
		//한반의 학생List에서 학생들을 차례로 가졍와 이름과 점수만 따로 추출하여 Map에 저장
		Map<String,Integer> map=new HashMap<>();
//		for(int i=0;i<studentList.size();i++) {
//			//각 인덱스 저장되어있는 학생들을 빼내기
//			Student departStudent=studentList.get(i);
//			//한 학생의 이름과 점수를 추출하여 map에 저장
//			mapSet(map,departStudent);
//		}
		while(true) {
			//학생객체생성
			Student oneStudent=returnInstance(sc);
			//현재 학생의 이름,나이,점수,반만 들어감(반에서의 번호,전화번호추가 필요)
			//한반에 들어갈 학생을 List에 저장	
			if(oneStudent==null) {
				break;
			}else {
				//학생 객체에 반에서의 번호 저장
				oneStudent.setNumber(cnt);
				//새로 생성한 리스트에 학생 한명의 정보를 추가(반 클래스의 List필드에 studentList의 정보를 추가하는 과정필요)
				studentList.add(oneStudent);
				//반 클래스의 List필드에 새로 생성했던 리스트의 정보를 그대로 입력
				one.setClassStudent(studentList);
				//한 학생의 이름과 점수를 추출하여 따로 생성한 map에 저장
				map.put(oneStudent.getName(), oneStudent.getScore());
				cnt++;
			}
		}		
		//1-2특정학생 점수조회//1-3학생 이름 검색시 이름이 없을 경우 학생 없음 출력
		one.scoreSearch(map, sc);
		//1-4전체 학생 수 출력
		one.studentNum(map);
		//1-5모든 학생과 점수 출력
		one.allStudentNScorePrint(map);
		
		//<전화번호부>
		//전화번호부 생성
		TelephoneBook oneTelbook=new TelephoneBook();
		//2-1전화번호부 추가
		//학생의 이름과 전화번호 쌍을 저장할 맵 생성
		//2-2기존에 저장되어있던 이름이면 번호수정(덮어쓰기)
		//HashMap새로 생성했던거 버리고 필드가져옴...
		Map<String,String> oneStudentTel=oneTelbook.getStudentTel();
		//매개변수:스캐너,클래스의 리스트필드,학생의 이름과 점수를 따로 빼서 저장한 map,전화번호부의 맵필드
		//전화번호 여러번 입력반복
		boolean stopOrNot=false;
		try {
			while(!stopOrNot) {
				stopOrNot=oneTelbook.telephoneAddList(sc,one.getClassStudent(),oneStudentTel);
			}
			
		}catch(Exception e) {
			System.out.println("잘못된 응답을 입력하였습니다.");
		}
		stopOrNot=false;
		//2-3특정이름 삭제
		while(!stopOrNot) {
			stopOrNot=oneTelbook.delName(sc,oneTelbook);
		}
		//2-4전체 전화번호부 출력
		oneTelbook.allPrintBook(oneStudentTel);
		//스캐너 닫기
		sc.close();
			
	}
	//main종료
	//학생 객체를 생성하는 메서드
	public static Student returnInstance(Scanner sc) {
		System.out.println("학생의 이름과 나이,점수를 입력하세요.(-1입력시 입력중단)");
			System.out.print("이름:");
			String name=sc.nextLine();
			System.out.println();
			if(name.equals("-1")) {
				System.out.println("입력을 중단합니다.");
				return null;
			}
			System.out.print("나이:");
			int age=sc.nextInt();
			System.out.println();
			System.out.print("점수:");
			int score=sc.nextInt();
			sc.nextLine();
			System.out.println();
			Student student=new Student(name,age,score);
			return student;				
	}
	//학생이름과 점수를 Map으로 묶는 메서드
	public  static Map<String,Integer> mapSet(Map<String,Integer> map,Student student) {
		//1
		map.put(student.getName(), student.getScore());
		return map;
	}
	
}
