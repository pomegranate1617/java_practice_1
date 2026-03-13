package example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		//1
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//2
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
		//3(오답)
		Scanner sc=new Scanner(System.in);
		System.out.println("출력할 단 수를 입력하세요");
		int dan=sc.nextInt();
		for(int i=1;i<10;i++) {
//			System.out.println(dan+"x"+i+"="+(dan*i));
			System.out.printf("%1$d x 2$d=1$d*2$d",dan,i);
		}
		//4(오답:수정함)
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//5
		int [] numbers= {10,20,30,40,50};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//6
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		//7
		int five=0;
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				five++;
			}
		}
		System.out.println(five);
		//8
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		//9(오답:수정함)
		String reverse="";
		String text="JavaProgramming";
		for(int i=text.length()-1;i>=0;i--) {
			reverse+=text.charAt(i);
		}
		System.out.println(reverse);
		//10
		int seven=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				seven+=i;
			}
		}
		System.out.println(seven);
		
	}

}
