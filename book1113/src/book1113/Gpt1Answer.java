package book1113;

import java.util.Scanner;

public class Gpt1Answer {

	public static void main(String[] args) {
		//1
		for (int i = 1; i <= 10; i++) {
		    System.out.print(i + " ");
		}
		
		
		//2
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
		    sum += i;
		}
		System.out.println(sum);

		
		//3
		for (int i = 2; i <= 50; i += 2) {
		    System.out.println(i);
		}

		
		//4
		int threeSum = 0;
		for (int i = 3; i <= 100; i += 3) {
		    threeSum += i;
		}
		System.out.println(threeSum);
		
		
		//5
		Scanner scanner = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = scanner.nextInt();
		for (int i = 1; i <= 9; i++) {
		    System.out.println(dan + " x " + i + " = " + (dan * i));
		}

		
		//6
		for (int i = 1; i <= 5; i++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		//7
		for (int i = 5; i >= 1; i--) {
		    for (int j = 0; j < i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		//8
		int count = 0;
		for (int i = 1; i <= 100; i += 2) {
		    count++;
		}
		System.out.println(count);
		
		
		//9
		int[] arr = {1, 3, 5, 7, 9};
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
		    sumArr += arr[i];
		}
		System.out.println(sumArr);

		
		//10
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i < 8; i++) {
		    int c = a + b;
		    System.out.print(c + " ");
		    a = b;
		    b = c;
		}

	}

}
