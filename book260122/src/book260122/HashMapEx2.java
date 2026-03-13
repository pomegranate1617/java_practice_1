package book260122;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("1번");
		Map<String,Integer> addMap=addStudent(sc);
		//2
		System.out.println("2번");
		scorePrint(addMap);
		//3
		System.out.println("3번");
		absentCheck(addMap);
		//4
		System.out.println("4번");
		valueChange(addMap);
		//5
		System.out.println("5번");
		addConditional(addMap);
		//6
		System.out.println("6번");
		dataDel(addMap);
		//7
		System.out.println("7번");
		initializeMap(addMap);
		//8
		addMap.put("Alice", 90);
		addMap.put("Bob", 85);
		addMap.put("Charlie", 95);
		System.out.println("8번");
		searchKVE(addMap);
		//9
		System.out.println("9번");
		addMap.put("Tom", 60);
		addMap.put("Sara", 40);
		printNameNOtoCorrection(addMap);
		//10
		System.out.println("10번");
		statisticsNSearch(addMap);
		
		sc.close();
	}
	public static Map<String,Integer> addStudent(Scanner sc) {
		//1
		System.out.println("학생의 이름과 점수를 입력하세요.(입력을 멈추고 싶을 시 -1 두번 입력)");
		//Alice,90,Bob,85,Charlie,95입력
		Map<String,Integer> map=new HashMap<>();
		while(true) {
			System.out.print("이름:");
			String name=sc.nextLine();
			System.out.print("점수:");
			int score=sc.nextInt();
			sc.nextLine();
			if(!name.equals("-1") && score!=-1) {
				map.put(name, score);	
			}
			else {
				System.out.println("입력을 종료합니다.");
				return map;
			}	
		}	
	}
	public static void scorePrint(Map<String,Integer> map) {
		//2
		int BobScore=map.get("Bob");
		System.out.println("Bob의 점수:"+BobScore);
		int davidScore=map.getOrDefault("David",0);
		System.out.println("David의 점수:"+davidScore);
	}
	public static void absentCheck(Map<String,Integer> map) {
		//3
		boolean checkName=map.containsKey("Alice");
		if(checkName==true) {
			System.out.println("Alice는 데이터에 등록되어 있습니다.");
		}else {
			System.out.println("Alice는 데이터에 존재하지 않습니다.");
		}
		boolean checkScore=map.containsValue(100);
		if(checkScore) {
			System.out.println("점수가 100점인 학생이 존재합니다.");
		}else {
			System.out.println("점수가 100점인 학생은 없습니다.");
		}
	}
	public static void valueChange(Map<String,Integer> map) {
		//4
		//replace는 변경 이전 값을 반환하므로 받아서 이전값으로 그대로 쓰면 좋음
		int beforeScore=map.replace("Alice", 95);
		System.out.println("Alice의 이전점수:"+beforeScore);
		int afterScore=map.get("Alice");
		System.out.println("Alice의 수정 후 점수:"+afterScore);
	}
	public static void addConditional(Map<String,Integer> map) {
		//5
		map.putIfAbsent("Bob", 100);
		System.out.println("Bob의 점수:"+map.get("Bob"));
	}
	public static void dataDel(Map<String,Integer> map) {
		//6
		int removeValue=map.get("Charlie");
		map.remove("Charlie");
		System.out.println("삭제한 값:"+removeValue);
		if(map.containsKey("Charlie")) {
			System.out.println("Charlie이 삭제되지 않았습니다.삭제할 값:"+removeValue);	
		}else {
			System.out.println("Charlie이 삭제되었습니다.삭제된 값:"+removeValue);
		}
	}
	public static void initializeMap(Map<String,Integer> map) {
		//7
		boolean clear=map.isEmpty();
		if(clear==true) {
			System.out.println("Map이 비어있습니다.");
		}else {
			System.out.println("Map에 데이터가 있습니다.데이터를 삭제합니다.");
			map.clear();
			boolean reCheck=map.isEmpty();
			if(reCheck==true) {
				System.out.println("데이터 삭제 성공.");
			}
			else {
				System.out.println("데이터 삭제 실패");
			}
		}
	}
	public static void searchKVE(Map<String,Integer> map) {
		//8
		Set<String> key=map.keySet();
		Iterator<String> setIterator=key.iterator();
		System.out.print("모든 Key출력:");
		while(setIterator.hasNext()) {
			System.out.println(setIterator.next()+" ");
		}
		System.out.println();
		Collection<Integer> value=map.values();
		Iterator<Integer> collIterator=value.iterator();
		System.out.print("모든 Value출력:");
		while(collIterator.hasNext()) {
			System.out.println(collIterator.next()+" ");
		}
		System.out.println();
		Set<Map.Entry<String, Integer>> pair=map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryPair=pair.iterator();
		System.out.println("모든 Entry출력");
		int cnt=1;
		while(entryPair.hasNext()) {
			System.out.println(cnt+"번째 Entry:"+entryPair.next());
			cnt++;
		}
	}
	public static void printNameNOtoCorrection(Map<String,Integer> map) {
//9 f
//forEach();,replaceAll();??
//9-1
//		Collection<Integer> score=map.values();
//		Iterator<Integer> scoreIterator=score.iterator();
//		while(scoreIterator.hasNext()) {
//			int oneScore=scoreIterator.next();
//			System.out.print("점수가 90점 이상인 학생:");
//			if(oneScore>=90) {
//				
//				System.out.println(" ");
//			}
//			else if(oneScore<80){
//				
//				map.replace(null, 80);
//			}
//			
//		}
//9-2
//		Set<Map.Entry<String,Integer>> entry=map.entrySet();
//		Iterator<Map.Entry<String,Integer>> entryIterator=entry.iterator();
//		int repeat=0;
//		while(entryIterator.hasNext()) {
//			int oneStudentScore=entryIterator.next().getValue();
//			String oneStudentName=entryIterator.next().getKey();
//			if(oneStudentScore>=90) {
//				if(repeat==0) {
//					System.out.print("점수가 90이상인 학생 이름:");
//				}
//				System.out.println(oneStudentName+" ");
//			}
//			else if(oneStudentScore<80) {
//				int beforeScore=oneStudentScore;
//				map.replace(oneStudentName, 80);
//				System.out.println(oneStudentName+"의 점수를 수정하였습니다.");
//				int afterScore=map.get(oneStudentName);
//				System.out.println(oneStudentName+"의 수정 전 점수:"+beforeScore+"-> 수정 후 점수:"+afterScore);
//			}
//		}
//		
//	}
	public static void statisticsNSearch(Map<String,Integer> map) {
//10 f
//forEach();
//10-1		
//		Set<Map.Entry<String,Integer>> set=map.entrySet();
//		Iterator<Map.Entry<String,Integer>> entryIter=set.iterator();
//		int maxScore=0;
//		int total=0;
//		float avg=0;
//		String maxName="";
//		while(entryIter.hasNext()) {
//			if(maxScore<entryIter.next().getValue()) {
//				maxScore=entryIter.next().getValue();
//				maxName=entryIter.next().getKey();
//			}
//		}
//		Collection<Integer> values=map.values();
//		Iterator<Integer> valueIter=values.iterator();
//		while(valueIter.hasNext()) {
//			total+=valueIter.next();
//		}
//		avg=total/(float)map.size();
//		System.out.println("최고점수 학생:"+maxName);
//		System.out.println("점수의 합계:"+total);
//		System.out.println("평균:"+avg);
	}
	
}
