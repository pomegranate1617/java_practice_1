package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		int[] input={10,20,30,20,10,40};
		saveNPrint(input);
		//2
		String[] fruits= {"apple","banana","apple","orange","banana"};
		duplicationRemove(fruits);
		//3
		saveValuePrint(sc);
		//4
		String[] language= {"Java","Python","C++","Java"};
		exitsValue(language);
		//5
		int[] number= {1,2,3,4,5};
		elimination(number);
		//6
		six();
		//7
		List<Integer> list=Arrays.asList(1,2,2,3,1,4);
		doubleConversion(list);
		//8
		String[] alphabet= {"A","B","C"};
		iteratorPrint(alphabet);
		//9
		String[] includeNull= {null,"Java",null,"Spring"};
		nullSaveTest(includeNull);
		//10
		String[] visit= {"home","login","board","home","logout","login"};
		visitRecord(visit);
		sc.close();
	}
	public static void saveNPrint(int[] arr) {
		//1
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int out:set) {
			System.out.println(out);
		}
	}
	public static void duplicationRemove(String[] arr) {
		//2
		Set<String> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void saveValuePrint(Scanner sc) {
		//3
		System.out.println("정수 5개를 입력하세요.");
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<5;i++) {
			int num=sc.nextInt();
			set.add(num);
		}
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void exitsValue(String[] arr) {
		//4
		Set<String> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		if(set.contains("Python")) {
			System.out.println("Python은 존재합니다.");
		}else {
			System.out.println("Python은 존재하지 않습니다.");
		}
		if(set.contains("JavaScript")) {
			System.out.println("JavaScript가 존재합니다.");
		}else {
			System.out.println("JavaScript는 존재하지 않습니다.");
		}	
	}
	public static void elimination(int[] arr) {
		//5
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		set.remove(3);
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	}
	public static void six() {
		//6
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(2);
		
		System.out.println(set);
		//결과 예측 51352로 순서 일관되게 출력
		//HashSet의 경우 무작위로 순서없이 값이 나올가라 예상
	}
	public static void doubleConversion(List<Integer> list) {
		//7
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i));
		}
		List<Integer> newList=new ArrayList<>();
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()){
			newList.add(iterator.next());
		}
		System.out.print("List로 변환후 출력:");
		for(int j=0;j<newList.size();j++) {
			System.out.print(newList.get(j)+" ");
		}	
	}
	public static void iteratorPrint(String[] arr) {
		//8
		Set<String> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator<String> iterator=set.iterator();
		System.out.print("LinkedHashSet 모든 요소 출력:");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	public static void nullSaveTest(String[] arr) {
		//9
		Set<String> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator<String> iterator=set.iterator();
		int nullCount=0;
		System.out.print("LInkedHashSet의 모든 요소 출력:");
		while(iterator.hasNext()) {
			String word=iterator.next();
			if(word==null) {
				nullCount++;
			}
			System.out.print(word+" ");
		}
		System.out.println();
		System.out.println("저장된 null갯수:"+nullCount);
	}
	public static void visitRecord(String[] arr) {
		Set<String> set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator<String> iterator=set.iterator();
		System.out.print("최종방문기록:");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	
}
