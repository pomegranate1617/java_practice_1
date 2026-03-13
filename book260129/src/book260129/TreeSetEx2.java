package book260129;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<>();
		treeset.add(200);
		treeset.add(100);
		treeset.add(500);
		treeset.add(400);
		treeset.add(300);
		//11
		System.out.println("-------------");
		System.out.println(treeset.ceiling(150));
		
		//12
		System.out.println("-------------");
		System.out.println(treeset.subSet(200,400));
		//13
		System.out.println("----------------");
		System.out.println(treeset.subSet(200, true, 400, false));
		//14
		System.out.println("----------------");
		System.out.println(treeset.headSet(300));
		//15
		System.out.println("----------------");
		System.out.println(treeset.headSet(300,true));
		//16
		System.out.println("------------");
		System.out.println(treeset.tailSet(300));
		//17
		System.out.println("----------------");
		System.out.println(treeset.tailSet(300,false));
		//18
		System.out.println("18번");
		Iterator<Integer> treesetIter=treeset.iterator();
		while(treesetIter.hasNext()) {
			System.out.println(treesetIter.next());
		}
		//19
		System.out.println("19번");
		Iterator<Integer> treedescIter=treeset.descendingIterator();
		while(treedescIter.hasNext()) {
			System.out.println(treedescIter.next());
		}
		//20
		System.out.println("20번");
		NavigableSet<Integer> navSet=treeset.descendingSet();
		Iterator<Integer> navSetIter=navSet.iterator();
		while(navSetIter.hasNext()) {
			System.out.println(navSetIter.next());
		}
		//21
		System.out.println("21번");
		System.out.println(treeset.toArray());
	
	
	
	
	
	}
}
