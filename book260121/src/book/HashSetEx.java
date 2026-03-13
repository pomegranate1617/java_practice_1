package book;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		int[] arr= {1,2,3,3,5,3};
		cloneRemove(arr);
		//2 f
		String[] strArr1= {"apple","banana","apple","grape"};
		String[] strArr2= {"apple","banana","grape","pear"};
		boolean arr1=eqFruitremove(strArr1);
		boolean arr2=eqFruitremove(strArr2);
		//3f
		studentCheck(sc);
		//4
		int[] arr3= {4,5,7,3};
		int[] arr4= {2,3,4,6,8};
		duplicationSet(arr3,arr4);
		//5
		diffChar(sc);
		//6
		wordRemove(sc);
		//7
		int[] newId= {1111,2222,3333,4444};
		int[] exitId={3333,6666,2222,8888};
		rejectId(newId,exitId);
		//8f
		String[] application= {"홍길동","김길동","이길동","박길동"};
		String[] completed= {"김길동","박길동"};
		completedNum(application,completed);
		//9f
		int[] aSet= {1,3,5,2,6,7};
		int[] bSet= {2,6,5,1,3};
		onlyABNum(aSet,bSet);
		//10
		emailDuplication(sc);
		
		sc.close();
	}
	public static void cloneRemove(int[] arr) {
		//1
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println("중복제거 후 원소수:"+set.size());
	}
	public static boolean eqFruitremove(String[] arr) {
		//2 f
		Set<String> set=new HashSet<>();
		boolean eq=false;
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
			else {
				System.out.println("중복된 과일입니다.");
				eq=true;
			}
		}
		System.out.println(eq);
		return eq;
	}
	public static void studentCheck(Scanner sc) {
		//3f
		System.out.println("학생들의 학번의 입력하세요.(입력 종료를 원할시 -1을 입력하세요.)");
		Set<Integer> set=new HashSet<>();
		while(true) {
			int schoolNum=sc.nextInt();
			sc.nextLine();
			if(schoolNum!=-1) {
				set.add(schoolNum);
			}
			else {
				System.out.println("입력을 종료합니다.");	
				System.out.println(set.size()+"명이 출석하였습니다.");
				break;
			}
		}	
	}
	public static void duplicationSet(int[] arr1,int[] arr2) {
		//4
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		int cnt=0;
		for(int j=0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				cnt++;
			}
		}
		System.out.println("공통적인 숫자의 갯수:"+cnt);
	}
	public static void diffChar(Scanner sc) {
		//5
		System.out.println("원하는 문자열을 입력하세요.");
		String str=sc.nextLine();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));	
		}
		System.out.println("서로 다른 문자의 갯수:"+set.size());
	}
	public static void wordRemove(Scanner sc) {
		//6
		System.out.println("여러 단어들을 공백으로 구분하여 입력하세요.");
		String wordMul=sc.nextLine();
		String[] arr=wordMul.split(" ");
		Set<String> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.print("중복을 제거한 단어 출력: ");
		for(String out:set) {
			System.out.print(out+" ");
		}
	}
	public static void rejectId(int[] arr1,int[] arr2) {
		//7
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		int rejectNum=0;
		for(int j=0;j<arr1.length;j++) {
			if(set.contains(arr1[j])) {
				rejectNum++;
			}
			else {
				set.add(arr1[j]);
			}
		}
		System.out.println("가입 불가능한 Id의 갯수:"+rejectNum);
	}
	public static void completedNum(String[] application,String[] completed) {
		//8 f
//		Set<String> set=new HashSet<>();
//		//참가자를 set에 저장
//		for(int i=0;i<application.length;i++) {
//			set.add(application[i]);
//		}
//		int existence=0;//같은 이름이 존재하는 경우
//		int leavingOut=0;//탈락자 수
//		
//		for(String name:set) {
//			for(int j=0;j<completed.length;j++) {
//				if( name.equals(completed[j])) {
//					existence++;
//				}
//			}
//			//for문 종료 후 같은 이름이 없었다면 탈락자 수 1증가후 set에서 이름 삭제 
//			if(existence==0) {
//				leavingOut++;
//				set.remove(name);//enhanced for문 도는 중 삭제는 매우 위험
//			}
//			//enhanced for문 돌기전에 같은 이름을 가진 사람 수 초기화
//			existence=0;
//		}
//		//탈락자 수 출력
//		System.out.println("탈락자 수:"+leavingOut);
		Set<String> set=new HashSet<>();
		for(int i=0;i<application.length;i++) {
			set.add(application[i]);
		}
		for(int j=0;j<completed.length;j++) {
			if(set.contains(completed[j])) {
				set.remove(completed[j]);
			}
		}
		System.out.println("완주하지 못한 사람:"+set.size());	
	}
	public static void onlyABNum(int[] set1,int[] set2) {
		//9 f
		Set<Integer> set1Set=new HashSet<>();
		Set<Integer> set2Set=new HashSet<>();
		for(int i=0;i<set1.length;i++) {
			set1Set.add(set1[i]);
		}
		for(int j=0;j<set2.length;j++) {
			set2Set.add(set2[j]);
		}
		int onlyA=set1Set.size();
		int onlyB=set2Set.size();
		for(int search:set1Set) {
			if(set2Set.contains(search)) {
				onlyA--;
				onlyB--;
			}	
		}
		System.out.println("A집합 또는 B집합에만 존재하는 원소의 갯수: "+(onlyA+onlyB));
	}
	public static void emailDuplication(Scanner sc) {
		//10
		System.out.println("여러개의 이메일을 공백으로 구분하여 입력하세요.");
		String email=(sc.nextLine()).toLowerCase();
		String[] emailArr=email.split(" ");
		Set<String> set=new HashSet<>();
		for(int i=0;i<emailArr.length;i++) {
			set.add(emailArr[i]);
		}
		System.out.println("서로 다른 이메일의 갯수:"+set.size());
	}
	
}
