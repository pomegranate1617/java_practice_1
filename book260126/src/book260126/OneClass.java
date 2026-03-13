package book260126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OneClass {
	//반,이름입력
	//~반
	private int classNum;
	//여러명의 학생저장
	private List<Student> classStudent;
	
	//생성자
	public OneClass(int classNum) {
		this.classNum=classNum;
	}
	//setter
	public void setClassStudent(List<Student> classStudent) {
		this.classStudent=classStudent;
	}
	//메서드
	//getter
	public List<Student> getClassStudent(){
		return this.classStudent;
	}
	//그외 메서드
	
	//해당학생 점수 출력
	public void scoreSearch(Map<String,Integer> map,Scanner sc) {
		System.out.println("원하는 학생의 점수를 검색합니다.");
		while(true) {
			System.out.println("이름을 입력하세요.(검색 종료를 원할시 -1을 입력하세요.)");
			System.out.print("이름:");
			String name=sc.nextLine();
			if(name.equals("-1")){
				System.out.println("검색을 종료합니다.");
				break;
			}
			if(map.containsKey(name)) {
				System.out.println(name+"의 점수는"+map.get(name)+"입니다.");
				
			}else {
				System.out.println("학생 없음");
				System.out.println("학생의 이름을 다시 입력하세요.");
			}	
		}	
	}
	//전체 학생 수 출력메서드
	public int studentNum(Map<String,Integer> map) {
		System.out.println("전체 학생 수를 출력합니다.");
		System.out.print("전체 학생 수:"+map.size());
		System.out.println();
		return map.size();
	}
	//모든 학생의 이름,점수 출력메서드
	public void allStudentNScorePrint(Map<String,Integer> map){
		Set<Map.Entry<String,Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String,Integer>> setIter=setMap.iterator();
		System.out.println("모든 학생의 이름과 점수를 출력합니다.");
		while(setIter.hasNext()) {
			Map.Entry<String, Integer> entryIter=setIter.next();
			System.out.print("학생의 이름:"+entryIter.getKey()+" ");
			System.out.print("학생의 점수:"+entryIter.getValue());
			System.out.println();
		}
	}
}
