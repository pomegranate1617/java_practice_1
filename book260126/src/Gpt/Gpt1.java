package Gpt;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Gpt1 {
	public static void main(String[] args) {
		//1
		String[] arr= {"민수","영희","민수","철수","영희","민수"};
		attendanceCheck(arr);
		//2
		duplicationSet();
		
	}
	public static void attendanceCheck(String[] arr) {
		//1
		Map<String,Integer> map=new Hashtable<>();
		int duplication=0;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], 0);
		}
		Set<Map.Entry<String,Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIter=setMap.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> oneEntry=entryIter.next();
			for(int i=0;i<arr.length;i++) {
				if(oneEntry.getKey().equals(arr[i])) {
					duplication++;
				}
				map.put(oneEntry.getKey(), duplication);
			}
			System.out.println(oneEntry.getKey()+": "+oneEntry.getValue());
			duplication=0;
		}
			
	}
	public static void duplicationSet() {
		//2
	}
}
