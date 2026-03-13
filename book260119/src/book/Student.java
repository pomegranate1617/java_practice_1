package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private List<Integer> score;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//----------------------------------------
	public void setScore(List<Integer> score) {
		this.score=score;
	}
	//---------------------------------------
	
	public  List<Integer> inputScore(Student student,Scanner scanner) {
		List<Integer> list=new ArrayList<>();
		System.out.println("학생의 국어,수학,영어 등등 그외의 점수를 차례대로 입력하세요.");
		while(true) {
			System.out.println("점수를 입력하세요.");
			int score=scanner.nextInt();
			if(score!=(-1)) {
				list.add(score);
			}
			else {
				 scanner.nextLine();
				 System.out.print("학생의 점수목록:");
				 student.setScore(list);
				 System.out.println(list);
				 return list;
			}
		}	
	}
	
	public int scoreTotal(List<Integer> list) {
		int total=0;
		for(int i=0;i<list.size();i++) {
			total+=list.get(i);
		}
		System.out.println("점수의 총합:"+total);
		return total;
	}
	
	public float scoreAvg(int total,List<Integer> list) {
		float avg=total/(float)(list.size());
		System.out.println("평균:"+avg);
		return avg;
	}
	
	public void minScore(List<Integer> list) {
		int min=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(min>list.get(i)) {
				min=list.get(i);
			}
		}
		System.out.println("가장 낮은 점수:"+min);
	}
	
	public void maxScore(List<Integer> list) {
		int max=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("가장 높은 점수:"+max);
	}
	
}
