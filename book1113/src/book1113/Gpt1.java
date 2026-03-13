package book1113;

import java.util.Scanner;

public class Gpt1 {

	public static void main(String[] args) {
		//1
		for(int i=0;i<10;i++) {
			System.out.print(i+1);
		}
		
		//2
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=(i+1);
		}
		System.out.println(sum);
		
		//3
		for(int i=1;i<51;i++) {
			if(i%2==0) System.out.println(i);
		}
		
		//4
		int threeSum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				threeSum+=i;
			}
			
		}
		System.out.println(threeSum);
		
		//5
		Scanner scanner=new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요");
		int gugu=scanner.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(gugu+"x"+i+"="+(gugu*i));
		}
		
		//6
				//별찍기
				String star="";
				for(int i=0;i<5;i++) {
					star+="*";
					System.out.println(star);	
				}
		
		
		
		//7 별찍기 역순
				String star2="";
				for(int i=5;i>=1;i--) {
					for(int j=1;j<(i+1);j++) {
						star2+="*";
					}
					System.out.println(star2);
					star2="";
				}
		//오답
//		//7
//		String str2="";
//		for(int i=5;i>0;i--) {
//			for(int j=1;j<(i+1);j++) {
//				str2+="*";
//			}
//			System.out.println(str2);
//		}
		
		//8
		int odd=0;
		for(int i=1;i<101;i++) {
			if(i%2!=0) odd+=1;
		}
		System.out.println(odd);
		
		//9
		int arrSum=0;
		int[] arr= {1,3,5,7,9};
		for(int i=0;i<5;i++) {
			arrSum+=arr[i];
		}
		System.out.println(arrSum);
		
		
		//10 피보나치
				int a1=0;
				int b1=1;
				System.out.println(a1);
				System.out.println(b1);
				for(int i=1;i<=8;i++) {
					int voSum=a1+b1;//01 11 12 23
					System.out.println(voSum);//1 2 3 5
					a1=b1;//1 1 2 3
					b1=voSum;//1 2 3 5
				}		
//오답		
//		//10
//		int a=0;
//		int b=1;
//		System.out.println(a);
//		System.out.println(b);
//		int sum1=0;
//		for(int i=0;i<8;i++) {
//			System.out.println(a+b);
//			++a;
//			++b;	
//		}
//		0   1      1        2              3                                        5                            8               13 21 34
//		n  n+1  n+(n+1) (n+1)+(n+(n+1))  (n+(n+1))+((n+1)+(n+(n+1)))
//		
//		n  n+1    2n+1       3n+2               5n+3                           8n+5                       13n+8
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
