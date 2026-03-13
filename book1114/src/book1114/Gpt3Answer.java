package book1114;

public class Gpt3Answer {

	public static void main(String[] args) {
		//1
		for(int i = 1; i <= 10; i++) {
		    System.out.println(i);
		}

		//2
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
		    sum += i;
		}
		System.out.println(sum);

		//3
		for(int i = 1; i <= 10; i += 2) {  // i를 2씩 증가
		    System.out.println(i);
		}
		//4
		for(int i = 3; i > 0; i--) {
		    System.out.println(i);
		}
		//답:
		//3
		//2
		//1

		//5
		int dan = 5;
		for(int i = 1; i <= 9; i++) {
		    System.out.println(dan + " x " + i + " = " + (dan * i));
		}

		//6
		for(int i = 1; i <= 5; i++) {
		    if(i == 3) continue; // 3은 건너뜀
		    System.out.print(i);
		}
		//7
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
		    sum += arr[i];
		}

		System.out.println(sum);
		//8
		for(int i = 1; i <= 4; i++) {        // 줄 수
		    for(int j = 1; j <= i; j++) {    // 별 개수
		        System.out.print("*");
		    }
		    System.out.println();
		}
		//9
		for(int i = 0; i <= 20; i++) {
		    if(i % 3 == 0) {
		        System.out.println(i);
		    }
		}

		//10
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
		    sum += i;
		}
		System.out.println(sum);



	}

}
