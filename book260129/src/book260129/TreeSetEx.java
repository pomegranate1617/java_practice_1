package book260129;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		//1
		addIntNPrintAll();
		//2
		duplicationTest();
		//3
		removeAfter();
		//4
		del();
		//5
		sizeCheck();
		//6
		absent();
		//---------------------------------
		//7
		TreeSet<Integer> treeset=new TreeSet<>();
		treeset.add(300);
		treeset.add(400);
		treeset.add(100);
		treeset.add(500);
		treeset.add(10);
		treeset.add(800);
		highNlow(treeset);
		//8
		moreThanLowerNHightest(treeset);
		//9
		moreThanHigherNLow(treeset);
		//10
		standardMax(treeset);
	}
	public static void addIntNPrintAll() {
		//1
		System.out.println("1번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(300);
		set.add(200);
		set.add(500);
		set.add(200);
		set.add(100);
		for(int out:set) {
			System.out.println(out);
		}
	}
	public static void duplicationTest() {
		//2
		System.out.println("2번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(200);
		set.add(200);
		Iterator<Integer> setIter=set.iterator();
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
	}
	public static void removeAfter() {
		//3
		System.out.println("3번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(300);
		set.add(400);
		set.add(100);
		System.out.println("삭제 전 출력:");
		for(int before:set) {
			System.out.println(before);
		}
		set.remove(400);
		System.out.println("삭제 후 출력:");
		for(int after:set) {
			System.out.println(after);
		}
	}
	public static void del() {
		//4
		System.out.println("4번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(300);
		set.add(400);
		set.add(100);
		set.clear();
		System.out.println(set.isEmpty());
	}
	public static void sizeCheck() {
		//5
		System.out.println("5번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(300);
		set.add(400);
		set.add(100);
		System.out.println(set.size());
	}
	public static void absent() {
		//6
		System.out.println("6번");
		TreeSet<Integer> set=new TreeSet<>();
		set.add(300);
		set.add(400);
		set.add(100);
		System.out.println(set.contains(100));
	}
	public static void highNlow(TreeSet<Integer> set) {
		//7
		System.out.println("7번");
		System.out.println(set.first());
		System.out.println(set.last());
	}
	public static void moreThanLowerNHightest(TreeSet<Integer> treeset) {
		//8
		System.out.println("8번");
		System.out.println(treeset.lower(300));
	}
	public static void moreThanHigherNLow(TreeSet<Integer> treeset) {
		//9
		System.out.println("9번");
		System.out.println(treeset.higher(300));
	}
	public static void standardMax(TreeSet<Integer> treeset) {
		//10
		System.out.println("10번");
		System.out.println(treeset.floor(200));
		System.out.println(treeset.floor(100));
	}
}
