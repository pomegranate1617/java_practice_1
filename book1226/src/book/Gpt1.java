package book;

import java.util.Scanner;

public class Gpt1 {
	public static void main() {
		
		Scanner sc=new Scanner(System.in);
		
		//1
		System.out.println("정수를 입력하세요.");
		int a=sc.nextInt();
		System.out.println(a);
		
		//2 f
		System.out.println("실수를 입력하세요.");
		float b=sc.nextInt();
		System.out.println(b);
		
		//3
		sc.nextLine();
		System.out.println("문자열을 입력하세요.");
		String c=sc.nextLine();
		System.out.println(c);
		
		//4 f
		System.out.println("문자를 입력하세요.");
		//모름
		
		//5
		System.out.println("논리값을 입력하세요.");
		boolean e=sc.nextBoolean();
		System.out.println(e);
		
		//6
		System.out.println("정수를 2개 입력하세요.");
		int f=sc.nextInt();
		int g=sc.nextInt();
		System.out.println(f+g);
		
		//7
		System.out.println("정수 3개를 입력하세요.");
		int h=sc.nextInt();
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println((h+i+j)/3.0);
		
		//8
		System.out.println("정수1개와 실수1개를 차례대로 입력하세요.");
		int k=sc.nextInt();
		float l=sc.nextFloat();
		System.out.println(k*l);
		
		//9 △
		sc.nextLine();
		System.out.println("이름과 나이를 차례대로 입력하세요");
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.printf("이름:%1$s, 나이:%2$d",name,age);
		
		//10
		sc.nextLine();
		System.out.println("문자열을 두개 입력하세요.");
		String m=sc.nextLine();
		String n=sc.nextLine();
		System.out.printf("%1$s+%2$s",m,n);
		
		//11 △
		System.out.println("문장 한줄을 입력하세요.");
		String o=sc.nextLine();
		System.out.println(o);
		
		//12 f
		System.out.println("공백으로 구분된 단어 2개를 입력하세요.");
		String p=sc.nextLine();
		System.out.println(p.split(""));
		//공백으로 문자나누기?split()?
		
		//13
		System.out.println("문자열을 입력하세요.");
		String q=sc.nextLine();
		System.out.println(q.length());
		
		//14
		System.out.println("문자열을 입력하세요.");
		String r=sc.nextLine();
		System.out.println(r.toUpperCase());
		
		//15
		System.out.println("문자열을 입력하세요");
		String s=sc.nextLine();
		System.out.println(s.toLowerCase());
		
		//16 f
		System.out.println("정수를 하나 입력하세요.");
		int n1=sc.nextInt();
		int sum1=0;
		for(i=1;i<=n1;i++) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		//17 △짝수를 출력
		System.out.println("정수를 입력하세요.");
		int n2=sc.nextInt();
		if(n2%2 == 0) {
			System.out.println(n2);
		}
		else System.out.println("n2는 짝수가 아닙니다.");
		
		//18 △양수음수판별
		System.out.println("정수를 입력하세요.");
		int n3=sc.nextInt();
		if(n3%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		//19 f
		System.out.println("정수를 입력하세요.");
		int n4=sc.nextInt();
		if(n4%3==0) System.out.println("3의 배수입니다.");
		System.out.println("3의 배수가 아닙니다.");
		
		//20 f
		System.out.println("정수를 5개 입력하세요.");
		int[] arr=new int[5];
		int max=0;
		for(int i2=0;i2<arr.length;i2++) {
			arr[i2]=sc.nextInt();
		}
		
		for(int i3=0;i3<arr.length;i3++) {
			if(arr[i3]>arr[i3+1]) max=i3;
			else max=i3+1;
			if(i3+1==(arr.length-1)) {
				System.out.println(max);
				break;
			}
		}
		System.out.println(max);
		
		//21 f
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int nn=sc.nextInt();
		int[] arr2=new int[nn];
		int sum2=0;
		System.out.println("설정한 갯수만큼 정수를 입력하세요");
		for(int i4=0;i4<arr2.length;i++) {
			System.out.println((i4+1)+"번째 정수를 입력합니다.");
			arr[i4]=sc.nextInt();
		}
		for(int i5=0;i5<arr2.length;i5++) {
			sum2+=arr2[i5];
		}
		System.out.println(sum2);
		
		//22 f
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int qq=sc.nextInt();
		int[] arr3=new int[qq];
		int sum=0;
		float avg=0;
		System.out.println("설정한 갯수만큼 정수를 입력하세요.");
		for(int i6=0;i6<arr3.length;i6++) {
			System.out.println((i6+1)+"번째 정수를 입력합니다.");
			arr[i6]=sc.nextInt();
		}
		for(int i6=0;i6<arr3.length;i6++) {
			sum+=arr3[i6];
		}
		avg=sum/3.0f;
		System.out.println(avg);
		
		//23
		System.out.println("입력할 문자열의 갯수를 입력하세요.");
		int ww=sc.nextInt();
		String[] arr4=new String[ww];
		String sumarr4="";
		sc.nextLine();
		System.out.println("설정한 갯수만큼의 문자열을 입력합니다.");
		for(int i7=0;i7<arr4.length;i7++) {
			System.out.println((i7+1)+"번째 문자열을 입력합니다.");
			arr4[i7]=sc.nextLine();
		}
		for(int i7=0;i7<arr4.length;i7++) {
			sumarr4+=arr4[i7];
		}
		System.out.println(sumarr4);
		
		//24 f
		System.out.println("입력할 문자열의 갯수를 입력하세요.");
		int ee=sc.nextInt();
		String[] arr5=new String[ee];
		String maxLong="";
		sc.nextLine();
		System.out.println("설정한 갯수만큼의 문자열을 입력합니다.");
		for(int i8=0;i8<arr5.length;i8++) {
			System.out.println((i8+1)+"번째 문자열을 입력합니다.");
			arr5[i8]=sc.nextLine();
		}
		for(int i8=0;i8<arr5.length;i8++) {
			if(arr5[i8].length()>=arr5[i8+1].length()) maxLong=arr5[i8];
			else maxLong=arr5[i8+1];
			if((i8+1)==(arr5.length-1)) {
				System.out.println("가장 긴 문자열은"+maxLong+"입니다.");
			}
		}
		
		//25 f
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int rr=sc.nextInt();
		int[] arr6=new int[rr];
		int even=0;
		System.out.println("설정한 갯수만큼의 정수의 입력을 시작합니다.");
		for(int j1=0;j1<arr6.length;j1++) {
			System.out.println((j1+1)+"번째 정수를 입력합니다.");
			arr6[j1]=sc.nextInt();
		}
		for(int j1=0;j1<arr6.length;j1++) {
			if(arr6[j1]%2==0) {
				System.out.print("짝수인 정수:");
				System.out.printf("%1$d/t",arr[j1]);
			}
		}
		
		//26
		//뭔가 입력받는 수를 정수,실수,문자열 상관없이 받아서 변수에 저장하고 
		//정수로 변환해서 합계를 출력하고 싶었으나 
		//int,double,String등을 구분할 방법을 알지못해 포기하고 실수로 제한
		System.out.println("입력할 숫자의 갯수를 입력하세요.");
		int tt=sc.nextInt();
		int sum3=0;
		sc.nextLine();
		//여러가지 숫자를 입력할 수 있게 하려고 챗지피티에 질문해서 nextLine()쓰고 변환시키라고 조언 얻음..
		System.out.println("숫자를 입력하세요.");
		for(int j2=0;j2<tt;j2++) {
			System.out.println((j2+1)+"번째 숫자를 입력합니다.");
			int aa=Integer.parseInt(sc.next());
			sum3+=aa;
		}
		System.out.println(sum3);
		
		//27 f
		System.out.println("입력할 숫자의 갯수를 입력하세요.");
		int aa=sc.nextInt();
		int sum4=0;
		float avg2=0.0f;
		sc.nextLine();
		System.out.println("숫자를 입력하세요.");
		for(int j3=0;j3<aa;j3++) {
			System.out.println((j3+1)+"번째 숫자를 입력합니다.");
			int bb=Integer.parseInt(sc.next());
			sum+=bb;
		}
		avg2=sum/(float)aa;
		System.out.println(avg2);
		
		//28 f
		int total=0;
		float avg3=0.0f;
		System.out.println("이름,국어,영어,수학 점수를 차례대로 입력하세요.");
		sc.nextLine();
		String name1=sc.nextLine();
		int kr=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		total=kr+eng+math;
		avg=total/3.0f;
		System.out.printf("총점:%1$d 평균:%2$s",total,avg);
		
		//29 △문제요구는 선택결과 출력 지금은 그냥 출력만 함
		sc.nextLine();
		System.out.println("y 또는 n을 입력하세요.");
		String bi=sc.nextLine();
		System.out.println(bi);
		
		//30 f
		System.out.println("문자열과 정수를 차례대로 입력하세요.");
		String ss=sc.nextLine();
		int dd=sc.nextInt();
		System.out.printf("문자열:%1$s, 숫자:%2$d");
		
	}
		
}
