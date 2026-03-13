package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManaging {
	public static void main(String[] args) {
		//10 Student클래스랑 연동
//			Scanner sc=new Scanner(System.in);
//			System.out.println("학생의 이름과 나이를 차례대로 입력하세요.");
//			String name=sc.nextLine();
//			int age=sc.nextInt();
//			Student student=new Student(name,age);
//			System.out.println("이름:"+name);
//			System.out.println("나이:"+age);
		Scanner sc=new Scanner(System.in);
		List<Student> classStudent=new ArrayList<>();
		while(true) {
			Student newStudent=inputStudent(sc);
			classStudent.add(newStudent);
			if(newStudent!=null) {
				List<Integer> inputScorelist=newStudent.inputScore(newStudent,sc);
				int resultTotal=newStudent.scoreTotal(inputScorelist);
				newStudent.scoreAvg(resultTotal,inputScorelist);
				newStudent.minScore(inputScorelist);
				newStudent.maxScore(inputScorelist);
			}
			else {
				break;
			}
		}	
	}
	public static Student inputStudent(Scanner scanner) {
		System.out.println("학생의 이름과 나이를 차례대로 입력하세요.(학생을 더 이상 입력하고 싶지 않을시 -1을 2번 입력)");
		String name=scanner.nextLine();
		int age=scanner.nextInt();
		scanner.nextLine();
		if(name.equals("-1")||age==-1) {
			System.out.println("더이상 학생의 입력을 받지 않습니다.");
			return null;
		}
		else {
			Student student=new Student(name,age);
			return student;
		}
		
	}
	
}
