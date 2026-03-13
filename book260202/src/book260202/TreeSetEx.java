package book260202;

import java.awt.Point;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1
		System.out.println("1번");
		ascendingPrint();
		//2
		System.out.println("2번");
		kthSmallNum(sc);
		//3
		System.out.println("3번");
		maxNMinPrint(sc);
		//4
		System.out.println("4번");
		rangeAscendingPrint(sc);
		//5
		System.out.println("5번");
		findNearestNum(sc);
		//6
		System.out.println("6번");
		dictionaryArray(sc);
		//7
		System.out.println("7번");
		lengthNdictionArray(sc);
		//8
		System.out.println("8번");
		middleValuePrint(sc);
		//9
		System.out.println("9번");
		int[] aSet= {1,3,5,3,5,6,7};
		int[] bSet= {1,2,6,8,9};
		setDifference(aSet,bSet);
		//10
		System.out.println("10번");
		coordinateAlignment(sc);
		
		
	}
	public static void ascendingPrint() {
		//1
		TreeSet<Integer> tree=new TreeSet<>();
		for(int i=0;i<10;i++) {
			tree.add(i);
			if(i%2==0) {
				tree.add(i);
			}
		}
		Iterator<Integer> treeIter=tree.iterator();
		while(treeIter.hasNext()) {
			System.out.println(treeIter.next());
		}
		
	}
	public static void kthSmallNum(Scanner sc) {
		//2f
		TreeSet<Integer> tree=new TreeSet<>();
		for(int n=0;n<10;n++) {
			tree.add(n);
			if(n%2!=0) {
				tree.add(n);
			}
		}
		System.out.print("몇번째 작은수를 찾으시겠습니까? 입력:");
		int k=sc.nextInt();
		sc.nextLine();
		System.out.print("\n");
		int[] arr=new int[10];
		Iterator<Integer> treeIter=tree.iterator();
		int cnt=0;
		while(treeIter.hasNext()) {
			arr[cnt]=treeIter.next();
			cnt++;
		}
		try {
			System.out.println("k번째 작은수 출력:"+arr[k-1]);
		}catch(Exception e) {
			System.out.println("-1");
		}	
	}
	public static void maxNMinPrint(Scanner sc) {
		//3
		TreeSet<Integer> tree=new TreeSet<>();
		System.out.println("정수를 입력하세요.");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			tree.add(i);
		}
		System.out.println("최대값 출력:"+tree.last());
		System.out.println("최소값 출력:"+tree.first());
	}
	public static void rangeAscendingPrint(Scanner sc) {
		//4
		TreeSet<Integer> tree=new TreeSet<>();
		while(true) {
			System.out.print("추가할 정수를 입력하세요.(입력종룡:-1입력)정수입력:");
			int num=sc.nextInt();
			System.out.print("\n");
			if(num!=-1) {
				tree.add(num);
			}else {
				break;
			}
		}
		sc.nextLine();
		System.out.println("찾을 범위를 입력하세요.");
		System.out.print("최솟값 입력:");
		int min=sc.nextInt();
		System.out.print("\n");
		System.out.print("최대값 입력:");
		int max=sc.nextInt();
		sc.nextLine();
		System.out.print("\n");
		NavigableSet<Integer> navTree=tree.subSet(min,true,max,true);
		System.out.println("범위 값출력:"+navTree);
	}
	public static void findNearestNum(Scanner sc) {
		//5f
		TreeSet<Integer> tree=new TreeSet<>();
		System.out.print("정수를 입력하세요. 정수입력:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			tree.add(i);
		}
		System.out.print("\n");
		System.out.print("기준이 될 정수를 입력하세요. 정수입력:");
		int x=sc.nextInt();
		sc.nextLine();
		int under=tree.floor(x);
		int over=tree.ceiling(x);
		System.out.print("\n");
		if(Math.abs(x-under)>Math.abs(x-over)) {
			System.out.println("x와 가장 가까운 값:"+under);
		}
		else if(Math.abs(x-over)>Math.abs(x-under)){
			System.out.println("x와 가장 가까운 값:"+over);
		}
		else {
			System.out.println("x와 가장 가까운 값:"+x);
		}
	}
	public static void dictionaryArray(Scanner sc) {
		//6
		//사전순이면 오름차순인가?
		TreeSet<String> tree=new TreeSet<>();
		while(true) {
			System.out.println("넣을 문자열을 입력하세요.(입력종룡:-1입력) 입력:");
			String input=sc.nextLine();
			System.out.print("\n");
			if(input.equals("-1")) {
				break;
			}
			tree.add(input);
		}
		Iterator<String> treeIter=tree.iterator();
		while(treeIter.hasNext()) {
			System.out.println(treeIter.next());
		}
	}
	public static void lengthNdictionArray(Scanner sc) {
		//7f
		//오버라이딩된 Comparator사용 생성자 몰라서 Ai도움받음...
		//길이를 기준으로 정렬하기 위해 Comparator사용(오름차순,길이 짧은 순))
		TreeSet<String> tree=new TreeSet<>((a,b)->a.length()-b.length());
		while(true) {
			System.out.println("넣을 문자열을 입력하세요.(입력종료:-1입력) 입력:");
			String input=sc.nextLine();
			if(input.equals("-1")) {
				break;
			}
			tree.add(input);
		}
		//사전(오름차순)순으로 꺼내기 위해?->근데 위에 생성자에 넣었던 람다식으로 이미 사전식이 된건가?
		//아니면 람다식은 길이만을 기준으로 오름차순으로 정렬하나?
		Iterator<String> treeIter=tree.iterator();
		while(treeIter.hasNext()) {
			System.out.println(treeIter.next());
		}
	}
	public static void middleValuePrint(Scanner sc) {
		//8f
		//뭔가 잘못됨;;
		//람다식을 사용하여 TreeSet자체적으로 오름차순 정렬
		TreeSet<Integer> tree=new TreeSet<>((a,b)->a-b);
		while(true) {
			System.out.print("정수를 입력하세요.(입력중지:-1입력)  입력:");
			int input=sc.nextInt();
			sc.nextLine();
			System.out.println();
			if(input!=-1) {
				tree.add(input);
				Iterator<Integer> treeIter=tree.iterator();
				//현재 정렬된 TreeSet의 몇번째 인자를 가져왔는지 확인하기 위한 카운터 변수생성
				int cnt=0;
				//중앙값:정렬했을때 가운데 값
				while(treeIter.hasNext()) {
					cnt++;
					int setInput=treeIter.next();
					if(tree.size()%2==0) {
						//짝수개면 작은쪽 중앙값
						if(cnt==(tree.size()/2)) {
							System.out.println("중앙값 출력:"+ setInput);
							break;
						}
					}
					else {
						//홀수개
						if(cnt==((tree.size()/2)+1)) {
							System.out.println("중앙값 출력:"+ setInput);
							break;
						}
					}
				}
			}
			else {
				break;
			}	
		}
	}
	public static void setDifference(int[] a,int[] b) {
		//9
		TreeSet<Integer> treeA=new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			treeA.add(a[i]);
		}
		TreeSet<Integer> treeB=new TreeSet<>();
		for(int j=0;j<b.length;j++) {
			treeB.add(b[j]);
		}
		//차집합?
		treeA.removeAll(treeB);
		System.out.println(treeA);
	}
	public static void coordinateAlignment(Scanner sc) {
		//10f
		//좌표(x,y)x오름차순으로 정렬,x같으면 y오름차순
		//Point클래스가 뭔지 몰라서 ai에 찾아봄;;
		TreeSet<Point> tree=new TreeSet<>();
		while(true) {
			System.out.print("x와 y의 좌표를 입력하세요.(압력 중단:-1입력) 입력:");
			int x=sc.nextInt();
			if(x==-1) {
				break;
			}
			int y=sc.nextInt();
			sc.nextLine();
			System.out.print("\n");
			Point point=new Point(x,y);
			tree.add(point);
		}
		Iterator<Point> treeIter=tree.iterator();
		while(treeIter.hasNext()) {
			System.out.println(treeIter.next());
		}
	}
		
}
