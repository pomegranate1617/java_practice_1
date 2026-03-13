package book260129;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExGpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		containPrint(sc);
		//2
		printName(sc);
		//3
		targetSearch(sc);
		//4
		lowerNumPrint(sc);
		//5
		beforeWordAllPrint(sc);
		//6
		lowerCutLine(sc);
		//7
		higherStandard(sc);
		//8
		standardAfterSearch(sc);
		//9
		higherScores(sc);
		//10
		
		sc.close();
	}
	public static void containPrint(Scanner sc) {
		//1
		TreeSet<Integer> set=new TreeSet<>();
		set.addAll(Arrays.asList(10,20,30,40,50,60,70));
		System.out.println("시작값과 끝값을 입력하세요.");
		System.out.println("시작값: ");
		int start=sc.nextInt();
		System.out.println();
		System.out.println("끝 값: ");
		int end=sc.nextInt();
		sc.nextLine();
		System.out.println();
		//NavigableSet<Integer>쓰려다가 문제 조건때문에 바꿈...무슨 관계인거지?SortedSet이랑 호환이 되네?
		SortedSet<Integer> sortedSet=set.subSet(start, true,end,false);
		System.out.println(sortedSet);
	}
	public static void printName(Scanner sc) {
		//2
		TreeSet<String> names=new TreeSet<>();
		names.addAll(Arrays.asList("Allice","Bob","Charlie","David","Eve","Frank","Grace","helen"));
		System.out.println("해당 범위내의 알파벳으로 시작하는 이름검색");
		System.out.print("시작 알파벳입력: ");
		String start=sc.nextLine();
		System.out.println();
		System.out.print("끝 알파벳입력: ");
		String end=sc.nextLine();
		System.out.println();
		//이름을 하나씩 꺼내서 맨 앞글자를 charAt()하지 않아도 정렬가능
		NavigableSet<String> navSet=names.subSet(start,true, end,false);
		System.out.println(navSet);
	}
	public static void targetSearch(Scanner sc) {
		//3
		TreeSet<Integer> scores=new TreeSet<>();
		scores.addAll(Arrays.asList(45,44,60,65,70,75,80,85,90));
		System.out.print("최소 점수: ");
		int min=sc.nextInt();
		System.out.println();
		System.out.print("최대 점수: ");
		int max=sc.nextInt();
		sc.nextLine();
		System.out.println();
		NavigableSet<Integer> navSet=scores.subSet(min,true,max,true);
		System.out.println(navSet);
	}
	public static void lowerNumPrint(Scanner sc) {
		//4
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.addAll(Arrays.asList(5,10,15,20,25,30));
		System.out.print("기준 값:");
		int standard=sc.nextInt();
		sc.nextLine();
		//매개변수가 하나인 headSet()의 리턴 타입은 무엇인가?NavigableSet으로는 매개변수 2개넣어야됨;;
		NavigableSet<Integer> navScores=numbers.headSet(standard,false);
		System.out.println(navScores);
	}
	public static void beforeWordAllPrint(Scanner sc) {
		//5
		TreeSet<String> words=new TreeSet<>();
		words.addAll(Arrays.asList("apple","banana","cherry","date","fig","grape"));
		System.out.print("기준 단어: ");
		String stanWord=sc.nextLine();
		System.out.println(words.headSet(stanWord));
	}
	public static void lowerCutLine(Scanner sc) {
		//6
		TreeSet<Integer> scores=new TreeSet<>();
		scores.addAll(Arrays.asList(40,55,60,70,75,80,90));
		System.out.print("커트라인 점수: ");
		int cutLine=sc.nextInt();
		NavigableSet<Integer> navScores=scores.headSet(cutLine,true);
		System.out.println(navScores);
	}
	public static void higherStandard(Scanner sc) {
		//7
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.addAll(Arrays.asList(3,6,9,12,15,18));
		System.out.print("기준값: ");
		int stanNum=sc.nextInt();
		sc.nextLine();
		System.out.println();
		//두번째 매개변수 미입력시 자동으로 true설정
		NavigableSet<Integer> navNum=numbers.tailSet(stanNum,false);
		System.out.println(navNum);
	}
	public static void standardAfterSearch(Scanner sc) {
		//8
		TreeSet<String> ids=new TreeSet<>();
		ids.addAll(Arrays.asList("A101","A205","B110","B250","C300","D010"));
		System.out.print("기준 ID: ");
		String stanId=sc.nextLine();
		System.out.println();
		NavigableSet navId=ids.tailSet(stanId,false);
		System.out.println(navId);
	}
	public static void higherScores(Scanner sc) {
		//9
		TreeSet<Integer> scores=new TreeSet<>();
		scores.addAll(Arrays.asList(35,45,55,65,75,85,95));
		System.out.print("합격 기준 점수: ");
		int stanScore=sc.nextInt();
		sc.nextLine();
		System.out.println(scores.tailSet(stanScore));
	}
	public static void minDel() {
		//10
	}
}
