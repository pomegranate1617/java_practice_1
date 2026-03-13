package gpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		//1
		getList();
		//2
		printList();
		//3
		getSize();
		//4
		getIndex();
		//5
		remove();
		//6
		delete();
		//7
		allSum();
		//8
		maxValue();
		//9
		input();
		//10
		evenPrint();
		
	}	
	public static void getList() {
		//1
				List<Integer> list=new ArrayList<>();
				for(int i=1;i<=5;i++) {
					list.add(i*10);
				}
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
	}
	public static void printList() {
		//2
		List<String> list=new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		for(String fruits:list) {
			System.out.println(fruits);
		}
	}
	public static void getSize() {
		//3
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list.size());
	}
	public static void getIndex() {
		//4
		List<Integer> list =new ArrayList<>();
		for(int i=1;i<=4;i++) {
			list.add(i*100);
		}
		System.out.println(list.get(1));
	}
	public static void remove() {
		//5
		List<Integer> list =new ArrayList<>();
		for(int i=1;i<=3;i++) {
			list.add(i*10);
		}
		list.set(1, 25);
		for(int newList:list) {
			System.out.println(newList);
		}
	}
	public static void delete() {
		//6
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
	}
	public static void allSum() {
		//7
		List<Integer> list=new ArrayList<>();
		int sum=0;
		for(int i=1;i<=4;i++) {
			list.add(i*5);
		}
		for(int j=0;j<list.size();j++) {
			sum+=list.get(j);
		}
		System.out.println(sum);
	}
	public static void maxValue() {
		//8
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(3);
		list.add(25);
		list.add(8);
		list.add(17);
		int max=0;
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) max=list.get(i);
		}
		System.out.println(max);
	}
	public static void input() {
		//9
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}
		sc.close();
	}
	public static void evenPrint() {
		//10
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=20;i++) {
			if(i%2==0) list.add(i);
		}
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}
	}
}
