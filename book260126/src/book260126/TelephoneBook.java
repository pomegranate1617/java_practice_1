package book260126;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TelephoneBook {
	//맵으로 학생의 학생의 이름과 전화번호 정보 묶어서 저장
	private Map<String,String> studentTel;
	
	//생성자
	public TelephoneBook() {
		
	}
	
	//<메서드>
	
	//setter
	public void setStudentTel(Map<String,String> studentTel) {
		this.studentTel=studentTel;
	}
	
	//그외 메서드
	//전화번호 등록.수정메서드
	//매개변수:스캐너,클래스의 리스트필드,학생의 이름과 점수를 따로 빼서 저장한 map,전화번호부의 맵필드
	public void telephoneAddList(Scanner sc,List<Student> classStudent,Map<String,String> strMap) throws Exception{
		//2 f왜 다 뛰어넘어서 삭제메서드로 가는가;;
		//2차)
		System.out.println("전화번호를 등록합니다.");
		System.out.println("이름을 입력하세요.");
		System.out.print("이름:");
		String name=sc.nextLine();
		//반 클래스에 학생의 존재여부 확인
		
		out:if(classStudent.contains(name)) {
			//반 클래스에 학생이 존재할 경우
			//strMap에서 학생이 등록되어있는지 확인필요
			if(strMap.containsKey(name)) {
				//strMap에서 학생이 등록되어 있을 경우
				System.out.println("학생이 전화번호부에 이미 등록되어있습니다.전화번호를 변경하시겠습니까?(yes/no입력)");
				String answer=sc.nextLine();
				if(answer.toLowerCase().equals("yes")) {
					//입력값이 yes인경우 전화번호를 새로 입력
					System.out.println("전화번호를 수정합니다.");
					System.out.print("전화번호 입력(-포함하여 입력):");
					String number=sc.nextLine();
					strMap.put(name, number);	
				}else if(answer.toLowerCase().equals("no")){
					//입력값이 no인경우 강제 종료
					//입력값이 yes도 no도 아닌경우 trycatch로 받아 "잘못된 응답을 입력하였습니다"출력
					System.out.println("전화번호수정을 종료합니다.");
					break out;
				}
			}
			else {
				//반 클래스의 필드에서는 학생이 존재하지만 strMap에서 학생이 등록되어 있지 않을 경우
				System.out.println("등록되어 있지 않은 학생입니다.전화번호를 새로 추가합니다.");
				System.out.println("이름입력:");
				String newName=sc.nextLine();
				System.out.println();
				System.out.print("전화번호 입력:");
				String newNumber=sc.nextLine();
				strMap.put(newName, newNumber);
			}	
		}else {
			//반 클래스에 학생이 존재하지 않을 경우
			//반클래스에 학생이 존재하지 않을 경우에는 존재하지 않는 학생으로 처리하고 전화번호부 등록거부
			System.out.println("반에 등록되어 있지 않은 학생입니다.전화번호를 추가할 수 없습니다.");
			System.out.println("전화번호부 등록 종료");
		}
		
//1차)
//		System.out.println("전화번호를 등록합니다.");
//		System.out.println("이름을 입력하세요.");
//		System.out.println("이름:");
//		String name=sc.nextLine();
//		System.out.println("DEBUG name = [" + name + "]");//<<<<<<<<<<<<<<<<<
//		out:if(map.containsKey(name)) {
//				if(strMap.containsKey(name)) {
//					System.out.println("이름이 이미 전화번호부에 등록되어있는 학생입니다.같은 이름으로 덮어쓰시겠나요?,yes/no를 입력하세요.");
//					System.out.print("입력:");
//					String answer=sc.nextLine();
//					System.out.println();
//					if((answer.toLowerCase()).equals("yes")) {
//						System.out.println("전화번호를 수정합니다.");
//						String telephone=sc.nextLine();
//						//TelephoneBook필드에 입력내용 저장
//						strMap.put(name, telephone);
//						this.studentTel=strMap;
//						//Student클래스의 telephon필드에 전화번호 저장
//						for(int i=0;i<classStudent.size();i++) {
//							Student target=classStudent.get(i);
//							if(target.getName().equals(name)) {
//								target.setTelephone(telephone);
//								break;
//							}
//						}	
//					}else {
//						System.out.println("전화번호부 입력을 종료합니다.");
//						break out;
//					}
//				}	
//		}else {
//			System.out.println("등록되지 않은 학생입니다.학생을 먼저 등록하세요.");
//		}	
		}
	//전화번호부에서 이름삭제 메서드
	public void delName(Scanner sc) {
		//삭제할 특정 이름
		//삭제 전 이름 존재 여부 확인
		System.out.println("삭제할 이름을 입력하세요.");
		String name=sc.nextLine();
		if(this.studentTel.containsKey(studentTel)==true) {
			System.out.println(name+"의 연락처를 삭제합니다.");
			this.studentTel.remove(name);
		}else {
			System.out.println("전화번호부에 해당 이름이 저장되어있지 않습니다.");
		}
		
		
	}
	public void allPrintBook() {
		//전체 전화번호부 출력
		Map<String,String> map=this.studentTel;
		//어떤 String을 가져와서 순환하는가...?;;>>>keySet사용 보류
		Set<Map.Entry<String, String>> setMap=map.entrySet();
		Iterator<Map.Entry<String, String>> iterator=setMap.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry=iterator.next();
			String name=entry.getKey();
			String telephone=entry.getValue();
			System.out.println("이름:"+name+", 전화번호:"+telephone);
		}
	}
}
