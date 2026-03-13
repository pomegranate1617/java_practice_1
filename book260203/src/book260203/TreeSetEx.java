package book260203;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<>();
		int[] arr= {50,20,40,10,30,40,60};
		//여기서 toString()메서드를 왜 사용하라고 그랬지?;;
		for(int i=0;i<arr.length;i++) {
			tree.add(arr[i]);
		}
		searchScore(tree);
		overNUnder(tree);
		rangeCut(tree);
		delNExtraction(tree);
		//-----------------------------------------
		TreeSet<Integer> tree2=new TreeSet<>();
		for(int i=1;i<10;i++) {
			tree2.add(10*i);
		}
		allCircuit(tree2);
		initializeNCopy(tree2);
		
	}
	public static void searchScore(TreeSet<Integer> treeSet) {
		System.out.println("점수 30의 존재여부:"+treeSet.contains(30));
		System.out.println("점수 25의 존재여부:"+treeSet.contains(25));
		System.out.println("가장 낮은 점수:"+treeSet.first());
		System.out.println("가장 높은 점수:"+treeSet.last());
	}
	public static void overNUnder(TreeSet<Integer> treeSet) {
		System.out.println("30보다 작은 값 중 가장 큰 값"+treeSet.floor(30));
		System.out.println("30보다 큰 값 중 가장 작은 값"+treeSet.ceiling(30));
		//boolean 생략시 false
		System.out.println("30이하:"+treeSet.headSet(30,true));
		//boolean 생략시 true
		System.out.println("30이상:"+treeSet.tailSet(30));
	}
	public static void  rangeCut(TreeSet<Integer> treeSet) {
		System.out.println("점수 20이상 50미만:"+treeSet.subSet(20, true,50,false));
		System.out.println("점수 40미만:"+treeSet.headSet(40));
		System.out.println("점수 30이상:"+treeSet.tailSet(30));
	}
	public static void delNExtraction(TreeSet<Integer> treeSet) {
		System.out.println("가장 낮은 점수 제거:"+treeSet.pollFirst());
		System.out.println("가장 높은 점수 제거:"+treeSet.pollLast());
		System.out.println("점수30제거:"+treeSet.remove(30));
		System.out.println("현재 TreeSet공백 상태:"+treeSet.isEmpty());
		System.out.println("전체 갯수:"+treeSet.size());
	}
	public static void allCircuit(TreeSet<Integer> treeSet) {
		//오름차순 출력
		Iterator<Integer> treeIter=treeSet.iterator();
		while(treeIter.hasNext()) {
			System.out.print(treeIter.next()+" ");
		}
		System.out.print("\n");
		//내림차순 출력
		Iterator<Integer> descIter=treeSet.descendingIterator();
		while(descIter.hasNext()) {
			System.out.println(descIter.next());
		}
		
	}
	public static void initializeNCopy(TreeSet<Integer> treeSet) {
		treeSet.clear();
		System.out.println("TreeSet의 공백확인:"+treeSet.isEmpty());
		TreeSet<Integer> copyTree=new TreeSet<>();
		copyTree.addAll(treeSet);
		System.out.println("카피한 treeSet의 내용물");
		Iterator<Integer> copyIter=copyTree.iterator();
		while(copyIter.hasNext()) {
			System.out.println(copyIter.next());
		}
	}
	
}
