package book1231;

import java.util.Scanner;

public class Gpt2 {
	public static void main(String[] args) {
		//1
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//2
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		//3
		for(int i=1;i<=100;i++) {
			if(i%2!=0) System.out.println(i);
		}
		//4
		int evenSum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) evenSum+=i;
		}
		System.out.println(evenSum);
		//5
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		//6
		int sum3=0;
		for(int i=1;i<=50;i++) {
			if(i%3==0) sum3+=i;
		}
		System.out.println(sum3);
		//7
		int cnt=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) cnt++;
		}
		System.out.println(cnt);
		//8
		for(int i=1;i<=100;i++) {
			if((i%5==0) && (i%7!=0)) System.out.println(i);
		}
		//9
		System.out.println("정수 5개를 차례대로 입력하세요.");
		int sum5=0;
		for(int i=0;i<5;i++) {
			int input1=sc.nextInt();
			sum5+=input1;
		}
		//10
		System.out.println("정수 하나를 입력하세요.");
		int num=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) System.out.println(i);
		}
		//11
		int gugu2=2;
		for(int i=1;i<10;i++) {
			System.out.println("gugu2"+"x"+i+"="+(gugu2*i));
		}
		//12
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		//13
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		//14
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//15
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-(i-1));j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//16
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-i);j++) {
				System.out.print("");
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
			}
		}
//		//17
//		for(int i=1;i<=100;i++) {
//			if()
//		}
		//18
		int input1=sc.nextInt();
		int mul=1;
		for(int i=1;i<=input1;i++) {
			mul*=i;
		}
		System.out.println(mul);
		//19피보나치
		//20
		System.out.println("숫자 두개를 차례대로 입력하세요.");
		String num3=sc.nextLine();
		String num4=sc.nextLine();
		int length3=String.valueOf(num3).length();
		int length4=String.valueOf(num4).length();
		int sum1=0;
		int sum2=0;
		for(int i=0;i<length3;i++) {
			char a=String.valueOf(num3).charAt(i);
			sum1+=(a-'0');
		}
		for(int i=0;i<length4;i++) {
			char b=String.valueOf(num4).charAt(i);
			sum1+=(b-'0');
		}
		System.out.println(sum1+sum2);
		//21
		int[] arr= {11,12,13,14,15};
		int sumArr=0;
		for(int i=0;i<arr.length;i++) {
			sumArr+=arr[i];
		}
		System.out.println(sumArr);
		//22
		int[] maxMin= {13,26,93,33,23};
		int max=0;
		int min=0;
		for(int i=0;i<maxMin.length;i++) {
			if(max<maxMin[i]) max=maxMin[i];
		}
		for(int j=0;j<maxMin.length;j++) {
			if(min>maxMin[j]) min=maxMin[j];
		}
		System.out.println("최댓값:"+max+",최솟값:"+min);
		//23
		int[] arrn= {23,4,56,77,33,52};
		int cnt2=0;
		for(int i=0;i<arrn.length;i++) {
			if(arr[i]>=34) cnt2++;
		}
		System.out.println(cnt2);
		//24
		int[] reverse= {34,55,25,544,55};
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.println(reverse[i]);
		}
		//25
		int[] one= {1,3,4,5,6};
		int[] two= {2,4,5,6,10,11};
		int equal=0;
//		int nn;
//		int mm;
//		int equal=0;
//		if(one.length>=two.length) {
//			nn=one.length;
//			mm=two.length;
//		}
//		else {
//			nn=two.length;
//			mm=one.length;
//		}
//		for(int i=0;i<nn;i++) {
//			for(int j=0;j<mm;j++) {
//				if()
//			}
//		}
		for(int i=0;i<two.length;i++) {
			for(int j=0;j<one.length;j++) {
				if(two[i]==one[j]) equal++;
			}
		}
		System.out.println(equal);
		//26
		int[][] twoArr= {{1,2,3},{2,3,7},{5,8,6},{33,45,43}};
		for(int i=0;i<twoArr.length;i++) {
			for(int j=0;j<twoArr[i].length;j++) {
				System.out.println(twoArr[i][j]);
			}
		}
		//27
		int sumOne=0;
		int [][] oneArr= {{2,4},{3,4},{5,6,7}};		
		for(int i=0;i<oneArr.length;i++) {
			for(int j=0;j<oneArr[i].length;j++) {
				sumOne+=oneArr[i][j];
				if(j==oneArr[i].length-1) {
					System.out.println(sumOne);
					sumOne=0;
				}
			}
		}
		//28
		int[] score={34,56,55,88,98,89};
		int total=0;
		float avg;
		int student=0;
		for(int i=0;i<score.length;i++) {
			total+=score[i];
		}
		avg=total/score.length;
		for(int j=0;j<score.length;j++) {
			if(score[j]>=avg) student++;
		}
		System.out.println(student);
		//29 배열에서 중복값 제거하고 출력
//		int[] arre= {3,5,3,7,9};
//		for(int i=0;i<arre.length;i++) {
//			for(int j=0;j<arre.length;j++) {
//				if(arre[i]!=arr[]
//			}
//		}
		//30로또번호 1~45개 중 6개를 중복없이 출력
		int[] arrlotto=new int[6];
		for(int i=1;i<=6;i++) {
			int random=(int)(Math.random()*45+1);
			for(int j=0;j<arrlotto.length;j++) {
				
			}
		}
			
		
		
		
		
		
		
	}

}
