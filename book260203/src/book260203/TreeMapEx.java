package book260203;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree=new TreeMap<>();
		tree.put(1003,"Kim");
		tree.put(1001,"Lee");
		tree.put(1002,"Park");
		tree.put(1002,"Choi");
		tree.put(1005,"Jung");
		allPrint(tree);
		searchNabscent(tree);
		searchNabscent(tree);
		maxNMin(tree);
		standardFBFind(tree);
		rangeSearch(tree);
		entryDel(tree);
		allCircuit(tree);
		keyNValueHandle(tree);
		initializeNCopy(tree);
		comparisonStandardChange(tree);
	}
	public static void allPrint(TreeMap<Integer,String> treeMap) {
		Set<Map.Entry<Integer,String>> entry=treeMap.entrySet();
		Iterator<Map.Entry<Integer,String>> entryIter=entry.iterator();
		while(entryIter.hasNext()) {
			System.out.println(entryIter.next());
		}
	}
	public static void searchNabscent(TreeMap<Integer,String> treeMap) {
		System.out.println("1002의 고객이름:"+treeMap.get(1002));
		System.out.println("1004고객의 존재여부:"+treeMap.containsKey(1004));
		System.out.println("Lee의 존재여부:"+treeMap.containsValue("Lee"));
	}
	public static void maxNMin(TreeMap<Integer,String> treeMap) {
		System.out.println("가장 작은 주문번호:"+treeMap.firstKey());
		System.out.println("가장 큰 주문번호:"+treeMap.lastKey());
		System.out.println("가장 작은 주문번호의 엔트리:"+treeMap.firstEntry());
		System.out.println("가장 큰 주문번호의 엔트리:"+treeMap.lastEntry());
	}
	public static void standardFBFind(TreeMap<Integer,String> treeMap) {
		System.out.println("1002보다 작은 키 중 가장 큰 키:"+treeMap.lowerKey(1002));
		System.out.println("1002보다 큰 키 중 가장 작은 키:"+treeMap.higherKey(1002));
		System.out.println("1002이하:"+treeMap.floorKey(1002));
		System.out.println("1002이상:"+treeMap.ceilingKey(1002));
	}
	public static void rangeSearch(TreeMap<Integer,String> treeMap) {
		System.out.println("주문번호1001이상 1004미만:"+treeMap.subMap(1001,true,1004,false));
		//boolean기본값false
		System.out.println("주문번호1003미만:"+treeMap.headMap(1003));
		//boolean기본값 true
		System.out.println("주문번호1002이상:"+treeMap.tailMap(1002));
	}
	public static void entryDel(TreeMap<Integer,String> treeMap) {
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap.remove(1003));
		System.out.println(treeMap.isEmpty());
		System.out.println(treeMap.size());
	}
	public static void allCircuit(TreeMap<Integer,String> treeMap) {
		//오름차순 출력(Map의 함수 사용)
		Set<Map.Entry<Integer, String>> entryTree=treeMap.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIter=entryTree.iterator();
		while(entryIter.hasNext()) {
			System.out.println(entryIter.next());
		}
		//내림차순 출력(TreeMap의 함수 사용)
		NavigableMap<Integer,String> navTree=treeMap.descendingMap();
		System.out.println(navTree);
	}
	public static void keyNValueHandle(TreeMap<Integer,String> treeMap) {
		//key들 가져오기
		Set<Integer> keysSet=treeMap.keySet();
		for(int key:keysSet) {
			System.out.println(key);
		}
		//value들 가져오기
		Collection<String> valueColl=treeMap.values();
		Iterator<String> collIter=valueColl.iterator();
		while(collIter.hasNext()) {
			System.out.println(collIter.next());
		}
	}
	public static void initializeNCopy(TreeMap<Integer,String> treeMap) {
		treeMap.clear();
		System.out.println(treeMap.isEmpty());
		treeMap.put(1005,"Kim");
		treeMap.put(1006,"Lee");
		treeMap.put(1001,"Park");
		treeMap.put(1003,"Choi");
		treeMap.put(1004,"Jung");
		TreeMap<Integer,String> copyMap=new TreeMap<>();
		//putAll은 또 뭐야?
		copyMap.putAll(treeMap);
	}
	public static void comparisonStandardChange(TreeMap<Integer,String> treeMap) {
		//주문번호 내림차순
		NavigableSet<Integer> navTree=treeMap.descendingKeySet();
		treeMap.put(1007, "k");
		treeMap.put(1009, "C");
		treeMap.put(1008, "D");
		System.out.println(navTree);
		
	}
}
