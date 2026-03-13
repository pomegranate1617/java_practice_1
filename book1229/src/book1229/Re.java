package book1229;

import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//20
		System.out.println("정수를 5개 입력하세요.");
		int[] arr=new int[5];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else max=max;
		}
//		int max = arr[0]; // 첫 번째 값으로 초기화
//		for(int i=1; i<arr.length; i++) {
//		    if(max < arr[i]) {
//		        max = arr[i];
//		    }
//		}
		System.out.println(max);
		
	}

}
