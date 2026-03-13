package book1114;

public class Gpt3 {

	public static void main(String[] args) {
		//1
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//2
		int sumhund=0;
		for(int i=1;i<=100;i++) {
			sumhund+=i;
		}
		System.out.println(sumhund);
		//3
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		//4 정답:3
		//		2
		//		1
//		for(int i=3;i>0;i--) {
//			System.out.println(i+"");
//		}
		//5
		int dan=5;
		for(int i=1;i<10;i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
		}
		//6 정답:1245
//		for(int i=1;i<=5;i++) {
//			if(i==3)continue;
//			System.out.print(i);
//		}
		//7
		int[]arr= {1,2,3,4,5};
		int arrSum=0;
		for(int j=0;j<arr.length;j++) {
			arrSum+=arr[j];
		}
		System.out.println(arrSum);
		//8
		String star="*";
		for(int k=1;k<5;k++) {
			for(int t=1;t<=k;t++) {
				System.out.print(star);
			}
			System.out.println();
		}
		//9
		for(int a=0;a<=20;a++) {
			if(a%3==0) {
				System.out.println(a);
			}
			++a;
		}
		//10 정답:15
//		int sum=0;
//		for(int i=1;i<=5;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		

	}

}
