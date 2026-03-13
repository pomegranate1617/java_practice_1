package book;

import java.util.Hashtable;
import java.util.Map;
import java.util.NavigableSet;

public class Gpt2 {
	public static void main(String[] args) {
		//1
		putEx();
		//2
		getEx();
	}
	public static void putEx() {
		//1-1
		Map<String,Integer> map=new Hashtable<>();
		Integer returnA=map.put("A", 100);
		System.out.println(returnA);
		//1-2
		map.put("B", 200);
		int returnB=map.put("B", 300);
		System.out.println(returnB);
//		//1-3
//		map.put("C", null);
//		Integer returnC=map.put("C", 400);
//		System.out.println(returnC);
		
	}
	public static void getEx() {
		//2-1
		Map<String,Integer> map=new Hashtable<>();
		map.put("X", 500);
		Integer returnX=map.get("X");
		System.out.println(returnX);
		//2-2
		Integer returnY=map.get("Y");
		System.out.println(returnY);
		//2-3
		map.put("Z", null);
		Integer getZ=map.get("Z");
		System.out.println(getZ);
		NavigableSet<String> a=null;
	}
}
