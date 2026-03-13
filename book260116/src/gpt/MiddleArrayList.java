package gpt;

import java.util.ArrayList;
import java.util.List;

public class MiddleArrayList {
	
	public static void main(String[] args) {
		//1
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<5;i++) {
			list1.add(i);
		}
		allPrint(list1);
		//2
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<8;i++) {
			list2.add(i);
		}
		findSeven(list2);
		list2.remove(7);
		findSeven(list2);
		//3
		findThreeNum();
		//4
		
		
	}
	public static void allPrint(List<Integer> list) {
		//1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));	
		}
	}
	public static void findSeven(List<Integer> list) {
		//2
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==7) {
				System.out.println("존재함");
				break;
			}
			else if(i==list.size()-1) {
				System.out.println("존재하지 않음");	
			}
		}
	}
	public static void findThreeNum() {
		//3
		List<Integer> list=new ArrayList<>();
		int[] arr={1,3,3,5,3,7};
		for(int j=0;j<arr.length;j++) {
			list.add(arr[j]);
		}
		int cnt=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==3) cnt++;
		}
		System.out.println(cnt);
	}
	public static void targetDel() {
		List<Integer> list=new ArrayList<>();
		int[] arr= {1,2,3,2,5,2,5};
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int j=0;j<list.size();j++) {
			if(list.get(j)==2) {
				list.remove(j);
			}
		}
		for(int k=0;k<list.size();k++) {
			
		}
	}
	
}
