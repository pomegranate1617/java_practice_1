package book;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//1
		List<Integer> vector=new Vector<>();
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			vector.add(arr[i]);
		}
		List<Integer> print=allPrint(vector);
		//2
		firstLastPrint(print);
		//3
		removeAfterPrint(print);
		//4
		List<String> string=new Vector<>();
		String[] arrLang= {"Java","Python","C++"};
		for(int i=0;i<arr.length;i++) {
			string.add(arrLang[i]);
		}
		printString(string);
		//5
		List<String> season=new Vector<>();
		String[] seaArr= {"Spring","Summer","Fall","Winter"};
		for(int i=0;i<seaArr.length;i++) {
			season.add(seaArr[i]);
		}
		findSpring(season);
		//6
	}
	public static List<Integer> allPrint(List<Integer> list) {
		//1
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}
		return list;
	}
	public static void firstLastPrint(List<Integer> list) {
		//2
		int first=list.get(0);
		int last=list.get(list.size()-1);
		System.out.println("첫번째 요소:"+first+",마지막 요소:"+last);
	}
	public static void removeAfterPrint(List<Integer> list) {
		//3
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list.size());
	}
	public static void printString(List<String> list) {
		//4
		for(int j=0;j<list.size();j++) {
			list.get(j);
		}
	}
	public static void findSpring(List<String> list) {
		//5
		if(list.contains("Spring")) {
			System.out.println("존재함");
		}
		else {
			System.out.println("존재하지 않음");
		}
	}
	//6
	//ArrayList의 경우 동기화 되지않아 멀티스레드환경에서 데이터의 입력에 오류가 발생할 수 있지만 
	//Vector의 경우 동기화되어있어 멀티스레드환경에서 데이터입력시 서로간의 개입없이 정확히 입력이 가능하다.
}
