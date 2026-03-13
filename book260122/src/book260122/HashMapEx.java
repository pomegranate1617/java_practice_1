package book260122;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		//1
		System.out.println("1번");
		Map<String,Integer> saveMap=studentSave();
		//2
		System.out.println("2번");
		searchNGetScore(saveMap);
		//3
		System.out.println("3번");
		checkNameNScore(saveMap);
		//4
		System.out.println("4번");
		scoreReplace(saveMap);
		//5
		System.out.println("5번");
		absentCheckNPutScore(saveMap);
		System.out.println(saveMap.get("Bob"));
		//6
		System.out.println("6번");
		targetDel(saveMap);
		//7
		System.out.println("7번");
		printAllKeys(saveMap);
		//8
		System.out.println("8번");
		printAllValues(saveMap);
		//9
		System.out.println("9번");
		printAllMap(saveMap);
		//10
		System.out.println("10번");
		initializeNCheck(saveMap);
		//추가문제
		System.out.println("추가문제");
		saveMap.put("Alice", 90);
		saveMap.put("Bob", 85);
		saveMap.put("Charlie", 95);
		addProblem(saveMap);
		
		
	}
	public static Map<String,Integer> studentSave() {
		//1
		Map<String,Integer> map=new HashMap<>();
		map.put("Alice", 90);
		map.put("Bob", 85);
		map.put("Charlie", 95);
		return map;
	}
	public static void searchNGetScore(Map<String,Integer> map) {
		//2
		System.out.println(map.get("Bob"));
		System.out.println(map.getOrDefault("David",0));
	}
	public static void checkNameNScore(Map<String,Integer> map) {
		//3
		boolean checkName=map.containsKey("Alice");
		System.out.println(checkName);
		boolean checkScore=map.containsValue(100);
		System.out.println(checkScore);
	}
	public static void scoreReplace(Map<String,Integer> map) {
		//4
		System.out.println(map.get("Alice"));
		map.replace("Alice",95);
		System.out.println(map.get("Alice"));
	}
	public static void absentCheckNPutScore(Map<String,Integer> map) {
		//5 세모
		map.putIfAbsent("Bob", 100);
	}
	public static void targetDel(Map<String,Integer> map) {
		//6
		map.remove("Charlie");
		System.out.println(map.size());
	}
	public static void printAllKeys(Map<String,Integer> map) {
		//7
		Set<String> set=map.keySet();
		Iterator<String> iteratorName=set.iterator();
		while(iteratorName.hasNext()) {
			System.out.println(iteratorName.next());
		}
	}
	public static void printAllValues(Map<String,Integer> map) {
		//8
		Collection<Integer> collection=map.values();
		Iterator<Integer> iteratorScore=collection.iterator();
		while(iteratorScore.hasNext()) {
			System.out.println(iteratorScore.next());
		}
	}
	public static void printAllMap(Map<String,Integer> map) {
		//9
		Set<Map.Entry<String, Integer>> set=map.entrySet();
		Iterator<Map.Entry<String,Integer>> iteratorEntry=set.iterator();
		while(iteratorEntry.hasNext()) {
			Map.Entry<String,Integer> getOneEntry=iteratorEntry.next();
			System.out.printf("이름: %1$s, 점수: %2$d %n",getOneEntry.getKey(),getOneEntry.getValue());
		}
	}
	public static void initializeNCheck(Map<String,Integer> map) {
		//10
		boolean check=map.isEmpty();
		System.out.println("데이터 삭제전:"+check);
		map.clear();
		boolean afterDel=map.isEmpty();
		System.out.println("데이터 삭제후:"+afterDel);
	}
	public static void addProblem(Map<String,Integer> map) {
		//추가문제
//		Collection<Integer> collection=map.values();
//		Iterator<Integer> iterator=collection.iterator();
//		while(iterator.hasNext()) {
//			if(iterator.next()>=90) {
//				System.out.println(map.get());
//			}
//			
//		}
		//90점 이상
		Set<Map.Entry<String,Integer>> set=map.entrySet();
		Iterator<Map.Entry<String, Integer>> iteratorEntry=set.iterator();
		int total=0;
		int maxScore=0;
		System.out.print("90점 이상인 학생 출력:");
		while(iteratorEntry.hasNext()) {
			Map.Entry<String, Integer> oneEntry=iteratorEntry.next();
			int oneScore=oneEntry.getValue();
			if(oneScore>=90) {
			
				System.out.print(oneEntry.getKey()+" ");
			}
			total+=oneScore;
			if(maxScore<oneScore) {
				maxScore=oneScore;
			}
		}
		System.out.println();
		//평균점수
		float avg=total/map.size();
		System.out.println("평균점수:"+avg);
		//가장 높은 점수
		System.out.println("가장 놆은 점수:"+maxScore);
		
	}
}

