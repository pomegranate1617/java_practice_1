package book;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Gpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("1번");
		String[] name= {"홍길동","김철수","이영희"};
		int[] score= {90,85,95};
		saveNSearch(name,score,sc);
		//2
		System.out.println("2번");
		duplicationManage();
		//3
		System.out.println("3번");
		String[] fruits= {"banana","apple","orange"};
		int[] num= {5,10,3};
		Map<String,Integer> output=containTarget(fruits,num,sc);
		//4
		System.out.println("4번");
		removeNPrintAll(output,sc);
		//5
		System.out.println("5번");
		Map<String,Integer> map=new Hashtable<>();
		map.put("Math",90);
		map.put("English", 85);
		allCircuit(map);
		//6
		System.out.println("6번");
		Map<String,Integer> userMap=new Hashtable<>();
		userMap.put("user1", 1000);
		userMap.put("user2", 1500);
		chageValue(userMap,sc);
		//7
		System.out.println("7번");
		ifAbsentkey(sc);
		//8
		System.out.println("8번");
		Map<String,Integer> player=new Hashtable<>();
		for(int i=0;i<5;i++) {
			player.put("선수"+i, i*10);
		}
		notAbsentPrintZero(player,sc);
		//9
		System.out.println("9번");
		String[] dupliFruits= {"apple","banana","apple","orange","banana","apple"};
		wordNum(dupliFruits);
		//10
		System.out.println("10번");
		sellNumSave(sc);
		
	}
	public static void saveNSearch(String[] name,int[] score,Scanner sc) {
		//1
		Map<String,Integer> map=new Hashtable<>();
		for(int i=0;i<name.length;i++) {
			map.put(name[i], score[i]);
		}
		System.out.println("점수를 출력할 사람의 이름을 입력하세요.");
		String target=sc.nextLine();
		System.out.println(target+"의 점수는"+map.get(target)+"입니다.");
	}
	public static void duplicationManage() {
		//2
		Map<String,Integer> map=new Hashtable<>();
		map.put("apple",100);
		map.replace("apple", 200);
		System.out.println("apple의 값 출력:"+map.get("apple"));
		System.out.println("Map의 전체 크기:"+map.size());
	}
	public static Map<String,Integer> containTarget(String[] str1,int[] str2,Scanner sc) {
		//3
		Map<String,Integer> map=new Hashtable<>();
		for(int i=0;i<str1.length;i++) {
			map.put(str1[i], str2[i]);
		}
		System.out.println("조회하고 싶은 과일이나 값을 입력하세요.");
		String search=sc.nextLine();
		int change=-2;
		try {
			change=Integer.parseInt(search);
		}catch(Exception e) {
//			System.out.println("예외발생");
			change=-1;
		}
		if(change!=-1) {
			System.out.println(change+"값의 존재 여부:"+map.containsValue(change));
		}else {
			System.out.println(search+"key의 존재 여부:"+map.containsKey(search));
		}
		return map;
	}
	public static void removeNPrintAll(Map<String,Integer> map,Scanner sc) {
		//4
		System.out.println("삭제할 데이터를 입력하세요.");
		System.out.print("입력:");
		String del=sc.nextLine();
		System.out.println();
		map.remove(del);
		Set<Map.Entry<String,Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator=setMap.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> oneEntry=entryIterator.next();
			System.out.println(oneEntry.getKey()+" "+oneEntry.getValue());
		}	
	}
	public static void allCircuit(Map<String,Integer> map) {
		//5
		Set<Map.Entry<String,Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter=setMap.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String,Integer> entryOne=entryIter.next();
			System.out.println("과목: "+entryOne.getKey()+", 점수: "+entryOne.getValue());
		}
	}
	public static void chageValue(Map<String,Integer> map,Scanner sc) {
		//6
		while(true) {
			System.out.println("변경할 유저와 값을 입력하세요.(입력종료:-1)");
			String user=sc.nextLine();
			if(user.equals("-1")){
				System.out.println("입력을 종료합니다.");
				break;
			}
			int value=sc.nextInt();
			sc.nextLine();
			map.put(user, value);
			System.out.println("등록된 유저의 값을 변경합니다.");
			System.out.print("유저 입력:");
			String name=sc.nextLine();
			System.out.println();
			System.out.print("값입력:");
			int value2=sc.nextInt();
			sc.nextLine();
			System.out.println();
			try {
				int prevValue=map.replace(name, value2);
			}catch(Exception e) {
				System.out.println(name+"이 존재하지 않아 변경에 실패하였습니다.");
			}
		}
	
		Set<Map.Entry<String, Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter=setMap.iterator();
		while(entryIter.hasNext()) {
			System.out.println(entryIter.next());	
		}
	}
	public static void ifAbsentkey(Scanner sc) {
		//7
		Map<String,Integer> map=new Hashtable<>();
		System.out.println("찾을 키를 입력하세요.");
		System.out.print("키 입력:");
		String key=sc.nextLine();
		System.out.println();
		System.out.println("넣을 값을 입력하세요.");
		System.out.print("갑입력:");
		int value=sc.nextInt();
		sc.nextLine();
		System.out.println();
		boolean orNot=true;
		try {
			map.putIfAbsent(key, value);	
		}catch(Exception e){
			orNot=false;
		}
		System.out.println("입력여부:"+orNot);	
	}
	public static void notAbsentPrintZero(Map<String,Integer> map,Scanner sc) {
		//8
		System.out.println("점수를 조회할 학생을 입력하세요.");
		String name=sc.nextLine();
		int value=map.getOrDefault(name, 0);
		if(value!=0) {
			System.out.println(value);
		}else {
			System.out.println("해당키는 존재하지 않습니다.");

		}
	}
	public static void wordNum(String[] str) {
		//9 f
		Map<String,Integer> map=new Hashtable<>();
		for(int i=0;i<str.length;i++) {
			map.compute(str[i], (k,v)->v==null ? 1:v+1);
		}
		Set<Map.Entry<String, Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter=setMap.iterator();
		while(entryIter.hasNext()) {
			System.out.println(entryIter.next());
		}
	}
	public static void sellNumSave(Scanner sc) {
		//10
		Map<String,Integer> map=new Hashtable<>();
		//상품추가
		while(true) {
			System.out.println("판매할 상품을 입력하세요.(입력종료:-1)");
			String goods=sc.nextLine();
			if(goods.equals("-1")) {
				break;
			}
			if(!map.containsKey(goods)) {
				map.put(goods, 1);
			}else {
				map.compute(goods,(k,v)->v+1);
			}
		}
		//전체 상품 목록 출력
		System.out.println("전체 상품 목록 출력");
		map.forEach((k,v)->System.out.println(k+","+v));
		//가장 많이 팔린 상품 이름 출력
		int maxNum=0;
		String max="";
		Set<Map.Entry<String, Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter=setMap.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String,Integer> oneEntry=entryIter.next();
			if(oneEntry.getValue()>maxNum) {
				max=oneEntry.getKey();
				maxNum=oneEntry.getValue();
			}
		}
		System.out.println("가장 많이 팔린 상품:"+max+", 팔린 수량:"+maxNum);
	}
	
}
