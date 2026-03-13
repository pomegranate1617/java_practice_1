package book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		scorePrint(sc);
		
		sc.close();
	}
	public static void scorePrint(Scanner sc) {
		//1
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<3;i++) {
			System.out.println("학생의 이름과 점수를 차례대로 입력하세요.");
			System.out.print("학생이름 입력:");
			String name=sc.nextLine();
			System.out.print("학생점수 입력:");
			int score=sc.nextInt();
			sc.nextLine();
			map.put(name, score);
		}
		System.out.println("찾으려는 학생의 이름을 입력하세요.");
		String searchName=sc.nextLine();
		if(map.containsKey(searchName)) {
			System.out.println("해당학생의 점수를 출력합니다.");
			System.out.println("점수:"+map.get(searchName));
		}
		else {
			System.out.println("학생을 찾을 수 없습니다.");
		}	
	}
}
