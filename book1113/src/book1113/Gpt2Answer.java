package book1113;

import java.util.Scanner;

public class Gpt2Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1. 1부터 10까지 출력
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. 1부터 n까지 합
        System.out.print("n 입력: ");
        int n = sc.nextInt();
        int sum = 0, a = 1;
        while (a <= n) {
            sum += a;
            a++;
        }
        System.out.println("합: " + sum);

        // 3. 1~20 짝수 출력
        int b = 1;
        while (b <= 20) {
            if (b % 2 == 0) System.out.println(b);
            b++;
        }

        // 4. 비밀번호 맞추기
        int pw;
        do {
            System.out.print("비밀번호 입력: ");
            pw = sc.nextInt();
        } while (pw != 1234);
        System.out.println("비밀번호 일치!");

        // 5. 1~100 중 3의 배수 합
        int d = 1, sum3 = 0;
        while (d <= 100) {
            if (d % 3 == 0) sum3 += d;
            d++;
        }
        System.out.println("3의 배수 합: " + sum3);

        // 6정답1) 0이 입력될 때까지 합
        int num, total = 0;
        do {
            System.out.print("정수 입력 (0 입력 시 종료): ");
            num = sc.nextInt();
            if (num != 0) total += num;
        } while (num != 0);
        System.out.println("합계: " + total);
        //6정답2)
     // 6. 입력된 숫자가 0이 될 때까지 합 구하기
        int nonZeroSum = 0;
        
        while (true) {
            System.out.println("정수를 입력하세요 (0 입력시 종료):");
            int input = sc.nextInt();
            if (input == 0) break;
            nonZeroSum += input;
        }
        System.out.println("입력값 합: " + nonZeroSum);
        // 7. 구구단 전체
        int dan = 2;
        while (dan <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.println(dan + "x" + j + "=" + (dan * j));
                j++;
            }
            dan++;
            System.out.println();
        }

        // 8. 숫자 거꾸로
        sc.nextLine(); // 버퍼 제거
        System.out.print("숫자 입력: ");
        String s = sc.nextLine();
        String rev = "";
        int idx = s.length() - 1;
        while (idx >= 0) {
            rev += s.charAt(idx);
            idx--;
        }
        System.out.println("역순: " + rev);

        // 9. 정답1랜덤 숫자 맞추기
        int target = (int)(Math.random() * 100 + 1);
        int guess;//(int guess=0;도 가능)
        do {
            System.out.print("1~100 사이 정수 입력: ");
            guess = sc.nextInt();
            if (guess > target) System.out.println("더 작습니다");
            else if (guess < target) System.out.println("더 큽니다");
        } while (guess != target);
        System.out.println("정답!");
        //9.정답2
        int random = (int) (Math.random() * 100) + 1; // 1~100
        int guess2 = 0;
        while (guess2 != random) {
            System.out.println("1~100 사이 숫자를 입력하세요:");
            guess2 = sc.nextInt();
        }
        System.out.println("정답!! → " + random);

        // 10. 정답1)팩토리얼
        System.out.print("팩토리얼 구할 n 입력: ");
        int fn = sc.nextInt();
        int fact = 1;
        int t = 1;
        while (t <= fn) {
            fact *= t;
            t++;
        }
        System.out.println(fn + "! = " + fact);
        //10.정답2)
        System.out.println("양의 정수를 입력하세요:");
        int fac = sc.nextInt();
        int mul = 1;
        while (fac > 0) {
            mul *= fac;
            fac--;
        }
        System.out.println("팩토리얼 값: " + mul);

        sc.close();
	}

}
