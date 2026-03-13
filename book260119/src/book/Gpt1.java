package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gpt1 {
	public static void main(String[] args) {
		//1
		List<Integer> newArray=new ArrayList<>();
		for(int i=0;i<5;i++) {
			newArray.add(i);
		}
		returnArray(newArray);
		//2
		List<Integer> newList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			newList.add(i);
		}
		findSeven(newList);
		//3
		List<Integer> three=new ArrayList<>();
		int[] arr= {1,3,3,5,3,7};
		for(int i=0;i<arr.length;i++) {
			three.add(arr[i]);
		}
		valueNum(three);
		//4
		int[] newArr= {1,2,3,2,4,2,5};
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<newArr.length;i++) {
			list1.add(newArr[i]);
		}
		targetDel(list1);
		//5
		List<Integer> hello=new ArrayList<>();
		for(int i=0;i<10;i++) {
			hello.add(i);
		}
		divideList(hello);
		//6
		List<Integer> bye=new ArrayList<>();
		for(int i=0;i<10;i++) {
			bye.add(i);
		}
		findMin(bye);
		//7
		int[] scoreArr= {90,85,71};
		List<Integer> scoreList=new ArrayList<>();
		for(int i=0;i<scoreArr.length;i++) {
			scoreList.add(scoreArr[i]);
		}
		calculAvg(scoreList);
		//8
		end();
		//9
		List<String> studentName=new ArrayList<>();
		studentName.add("홍길동");
		studentName.add("김철수");
		studentName.add("이영희");
		searchName(studentName);
		
	
		
		
	}
	public static void returnArray(List<Integer> list) {
		//1
		for(int i=0;i<list.size();i++) {
			list.get(i);
			System.out.println(list.get(i));
		}
	}
	public static void findSeven(List<Integer> list) {
		//2
			if(list.contains(7)) {
				System.out.println("존재함");
			}
			else{
				System.out.println("존재하지 않음");
			}
	}
	public static void valueNum(List<Integer> list) {
		//3
		int cnt=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==3) {
				cnt++;
			}
		}
		System.out.println("3의 갯수:"+cnt);
	}
	public static void targetDel(List<Integer> list) {
		//4
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==2) {
				list.remove(i);
				i=i-1;
			}
		}
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}		
	}
	public static void divideList(List<Integer> list) {
		//5
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				even.add(list.get(i));
			}
			else {
				odd.add(list.get(i));
			}
		}
		System.out.print("odd리스트의 숫자:");
		for(int j=0;j<odd.size();j++) {
			System.out.print(odd.get(j)+" ");
		}
		System.out.println("");
		System.out.print("even리스트의 숫자"
				+ ":");
		for(int k=0;k<even.size();k++) {
			System.out.print(even.get(k)+" ");
		}	
	}
	public static void findMin(List<Integer> list) {
		//6
		int basic=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(basic>list.get(i)) {
				basic=list.get(i);
			}
		}
		System.out.println(basic);
	}
	public static void calculAvg(List<Integer> list) {
		//7
		int total=0;
		float avg=0;
		for(int i=0;i<list.size();i++) {
			total+=list.get(i);
		}
		avg=total/(float)(list.size());
		System.out.println("점수의 평균:"+avg);
	}
	public static void end() {
		//8
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		while(true) {
			System.out.println("정수를 하나 입력하세요.");
			int num=sc.nextInt();
			if(num==(-1)) {
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				sc.close();
				break;
			}
			list.add(num);
		}	
	}
	public static void searchName(List<String> list) {
		//9
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i))) {
				System.out.println(name+"학생은 존재합니다.");
				sc.close();
				break;
			}
			else if(i==list.size()-1) {
				System.out.println(name+"학생은 등록되어있지 않습니다.");
				sc.close();
			}
		}
	}
	
}
