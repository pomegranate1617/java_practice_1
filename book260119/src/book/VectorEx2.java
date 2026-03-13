package book;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		//7
		Scanner sc=new Scanner(System.in);
		//학생생성
		VectorStudent newStudent=inputStudent(sc);
		//점수 입력,결과값 출력
		List<Integer> newScores=newStudent.inputScore(sc);
		newStudent.setScores(newScores);
		newStudent.getScores();
		newStudent.setTotal(newScores);
		int calTotal=newStudent.getTotal();
		newStudent.setAvg(calTotal,newScores);
		double calAvg=newStudent.getAvg();
		sc.close();
		
		
		
	
	}
	//학생 추가 메서드
	public static VectorStudent inputStudent(Scanner scanner) {
		System.out.println("학생의 이름과 나이를 차례로 입력하세요.(입력중지:-1적어도 한번 입력)");
		String name=scanner.nextLine();
		int age=scanner.nextInt();
//		if(name.equals("-1")|| age==(-1)) {
//			System.out.println("학생정보의 입력을 중단합니다.");
//			return null;
//		}
//		else {
//			
//		}
		scanner.nextLine();
		VectorStudent vs=new VectorStudent(name,age);
		return vs;
	
	}
	
}
