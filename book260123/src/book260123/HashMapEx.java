package book260123;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		//1
		System.out.println("1번");
		Map<String,Integer> map1=valuePrintNEntryCount();
		//2
		System.out.println("2번");
		exitsOrNot(map1);
		//3
		System.out.println("3번");
		changeExecution(map1);
		System.out.println(map1.get("apple"));
		//키가 없으면 value저장 있으면 기존값
		//4
		System.out.println("4번");
		minusSetting(map1);
		//5
		System.out.println("5번");
		conditionDel(map1);
		//6
		System.out.println("6번");
		changeValue(map1);
		//7
		System.out.println("7번");
		allPrint(map1);
		//8
		System.out.println("8번");
		entryPrint(map1);
		//9
		System.out.println("9번");
		calData();
		//10
		System.out.println("10번");
		mixCal();
	}
	public static Map<String,Integer> valuePrintNEntryCount() {
		//1
		Map<String,Integer> map=new HashMap<>();
		map.put("apple", 1000);
		map.put("banana", 1500);
		map.put("orange", 2000);
		System.out.println("apple의 값:"+map.get("apple"));
		System.out.println("전체 엔트리의 갯수:"+map.size());
		return map;
	}
	public static void exitsOrNot(Map<String,Integer> map) {
		//2
		boolean banana=map.containsKey("banana");
		boolean three=map.containsValue(3000);
		if(banana==true) {
			System.out.println("banana라는 key가 있습니다.");
		}else {
			System.out.println("banana라는 key는 없습니다.");
		}
		if(three==true) {
			System.out.println("3000이라는 value는 존재합니다.");
		}else {
			System.out.println("3000이라는 value는 존재하지 않습니다.");
		}
	}
	public static void changeExecution(Map<String,Integer> map) {
		//3
		int value=map.putIfAbsent("apple", 5000);
		System.out.println(value);
	}
	public static void minusSetting(Map<String,Integer> map) {
		//4
		int value=map.getOrDefault("grape",-1);
		System.out.println(value);
	}
	public static void conditionDel(Map<String,Integer> map) {
		//5
		map.remove("banana");
		boolean orNot=map.remove("orange",2000);
		if(map.containsKey("banana")==true) {
			System.out.println("banana가 삭제되지 않았습니다.");
		}
		else {
			System.out.println("banana가 삭제되었습니다.");
		}
		if(orNot==true) {
			System.out.println("orange가 삭제되었습니다.");
		}
		else {
			System.out.println("orange가 삭제되지 않았습니다.");
		}
	}
	public static void changeValue(Map<String,Integer> map) {
		//6
		int before=map.replace("apple",3000);
		System.out.println("변경 전 값:"+before);
		System.out.println("변경 후 값:"+map.get("apple"));
	}
	public static void allPrint(Map<String,Integer> map) {
		//7
		Set<String> keys=map.keySet();
		Collection<Integer> values=map.values();
		System.out.print("모든 key출력:");
		for(String fruit:keys) {
			System.out.print(fruit+" ");
		}
		System.out.println();
		System.out.print("모든 value출력:");
		for(int num:values) {
			System.out.print(num+"");
		}	
	}
	public static void entryPrint(Map<String,Integer> map) {
		//8
		Set<Map.Entry<String, Integer>> entry=map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator=entry.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> oneEntry=entryIterator.next();
			System.out.println("상품명: "+oneEntry.getKey()+", 가격: "+oneEntry.getValue());
		}
	}
	public static void calData() {
		//9
		HashMap<String,Integer> scoreMap=new HashMap<>();
		scoreMap.put("kim",90);
		int before=scoreMap.get("kim");
		int after=scoreMap.compute("kim",(k,v)->(v+10));
		System.out.println("kim초기값:"+before);
		System.out.println("kim수정값:"+after);
		scoreMap.computeIfAbsent("lee",k->70);
	}
	public static void mixCal() {
		//10
		Map<String,Integer> lang=new HashMap<>();
		lang.put("java",80);
		int before=lang.get("java");
		System.out.println("java초기값:"+before);
		int after=lang.compute("java",(k,v)->v+20);
		System.out.println("java변경값:"+after);
		lang.clear();
		boolean zero=lang.isEmpty();
		if(zero==true) {
			System.out.println("Map이 비어있습니다.");
		}
		else {
			System.out.println("Map이 비어있지 않습니다.");
		}
	}
}
