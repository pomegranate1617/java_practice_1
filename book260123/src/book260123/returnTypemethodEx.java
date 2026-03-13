package book260123;

import java.util.HashMap;
import java.util.Map;

public class returnTypemethodEx {
	public static void main(String[] args) {
		//1
		System.out.println("1번");
		Map<String,Integer> map=putReturnCheck();
		//2
		System.out.println("2번");
		removeReturnCheck(map);
		//3
		System.out.println("3번");
		getReturnCheck(map);
		//4
		System.out.println("4번");
		ifAbsentReturnCheck(map);
		//5
		System.out.println("5번");
		computeReturnCheck();
	}
	public static Map<String,Integer> putReturnCheck() {
		//1
		Map<String,Integer> map=new HashMap<>();
		Integer value=map.put("key1", 100);
		map.replace("key1", 200);
		System.out.println("put의 반환값:"+value);
		System.out.println("key1의 최종값:"+map.get("key1"));
		return map;
	}
	public static void removeReturnCheck(Map<String,Integer> map) {
		//2
		map.put("key2", 300);
		int re=map.remove("key2");
		System.out.println(re);//key가 있으면 지우기 이전의 값을 출력
		Integer three=map.remove("key3");
		System.err.println(three);//key가 없으면 null출력
	}
	public static void getReturnCheck(Map<String,Integer> map) {
		//3
		map.put("key4", 400);
		System.out.println(map.get("key4"));//이전값 출력
		System.out.println(map.get("key5"));//key가 없으면 null출력
		System.out.println(map.getOrDefault("key5",-1));//key가 없으면 두번째 매개변수의-1값 출력
	}
	public static void ifAbsentReturnCheck(Map<String,Integer> map)  {
		//4
		map.put("key6", 600);//put이전의 값을 반환
		System.out.println(map.putIfAbsent("key6", 1000));//putIfAbsent이전의 값을 반환
		map.put("key7", 700);
		System.out.println(map.putIfAbsent("key7",700));
	}
	public static void computeReturnCheck() {
		//5
		Map<String,Integer> map=new HashMap<>();
		map.put("score1", 50);
		System.out.println(map.compute("score1", (k,v)->v+30));
		System.out.println(map.computeIfAbsent("score2",k->100));
		System.out.println(map.merge("score1",20,Integer::sum));	
	}
}
