package ex1;

import java.time.LocalDate;

public class Member implements Comparable<Member>{
	//10
	private String name;
	private Grade grade;
	private LocalDate joinDate;
	
	//등급 내림차순?
	//가입일 오름차순
	@Override
	public int compareTo(Member o) {
		//grade필드가 같다면 가입일이 빠른순으로 정렬
		if(this.grade == o.grade) {
			return this.joinDate.compareTo(o.joinDate);
		}
		else return this.grade.compareTo(o.grade);
 	}
}
