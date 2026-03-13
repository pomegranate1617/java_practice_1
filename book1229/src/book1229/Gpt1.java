package book1229;

import java.util.Scanner;

public class Gpt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.println("정수를 1개 입력하세요.");
		int a=sc.nextInt();
		System.out.println(a);
		//2
		System.out.println("실수 1개를 입력하세요.");
		double b=sc.nextDouble();
		System.out.println(b);
		//3
		System.out.println("문자열 1개를 입력하세요.");
		sc.nextLine();
		String c=sc.nextLine();
		System.out.println(c);
		//4 f
		System.out.println("문자1개를 입력하세요.");
		char d=sc.nextLine().charAt(0);
		System.out.println(d);
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
		System.out.println("정수를 3개 입력하세요.");
		int h=sc.nextInt();
		int i=sc.nextInt();
		int j=sc.nextInt();
		float avg=(h+i+j)/3.0f;
		System.out.println(avg);
		//8
		System.out.println("정수1개와 실수 1개를 차례대로 입력하세요.");
		int k=sc.nextInt();
		float l=sc.nextFloat();
		System.out.println(k*l);
		//9
		System.out.println("이름과 나이를 순서대로 입력하세요.");
		sc.nextLine();
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.printf("이름: %1$s, 나이: %2$d",name,age);
		//10
		System.out.println("문자열 2개를 입력하세요");
		sc.nextLine();
		String m=sc.nextLine();
		String n=sc.nextLine();
		System.out.println(m+n);
		//11
		System.out.println("문장을 입력하세요.");
		String o=sc.nextLine();
		System.out.println(o);
		//12 f
		System.out.println("단어 2개를 공백으로 구분하여 입력하세요.");
		String p=sc.nextLine();
		String[] q=p.split(" ");
		System.out.println(q[0]+","+q[1]);
		//13
		System.out.println("문자열을 입력하세요.");
		String r=sc.nextLine();
		System.out.println(r.length());
		//14
		System.out.println("문자열을 입력하세요.");
		String s=sc.next();
		System.out.println(s.toUpperCase());
		//15
		sc.nextLine();
		System.out.println("문자열을 입력하세요.");
		String t=sc.nextLine();
		System.out.println(t.toLowerCase());
		//16
		System.out.println("정수를 하나 입력하세요.");
		int u=sc.nextInt();
		int v=0;
		for(int w=1;w<=u;w++) {
			v+=w;
		}
		System.out.println(v);
		//17 f
		System.out.println("정수를 입력하세요.");
		int x=sc.nextInt();
		if(x%2==0) {
			System.out.println(x+"는 짝수입니다.");
		}
		//18
		System.out.println("정수를 입력하세요.");
		int y=sc.nextInt();
		if(y>0) {
			System.out.println(y+"은 양수입니다.");
		}
		else if(y==0) {
			System.out.println(y+"은 0입니다.");
		}
		else System.out.println(y+"은 음수입니다.");
		//19
		System.out.println("정수를 입력하세요.");
		int z=sc.nextInt();
		if(z%3==0) {
			System.out.println(z+"는 3의 배수입니다.");
		}
		else System.out.println(z+"는 3의 배수가 아닙니다.");
		//20f
		System.out.println("정수 5개를 입력하세요");
		int qq=sc.nextInt();
		int ww=sc.nextInt();
		int ee=sc.nextInt();
		int rr=sc.nextInt();
		int tt=sc.nextInt();
		int max=0;
		int[] str= new int[5];
		str[0]=qq;
		str[1]=ww;
		str[2]=ee;
		str[3]=rr;
		str[4]=tt;
		for(int aa=0;aa<str.length;aa++) {
			if(max<=str[aa]) {
				max=str[aa];
			}
		}
		System.out.println(max);
		//21
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int ss=sc.nextInt();
		int[] arr=new int[ss];
		for(int dd=0;dd<arr.length;dd++) {
			System.out.println((dd+1)+"번째 정수를 입력합니다.");
			int ff=sc.nextInt();
			arr[dd]=ff;
		}
		int sum=0;
		for(int dd=0;dd<arr.length;dd++) {
			sum+=arr[dd];
		}
		System.out.println(sum);
		//22
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int zz=sc.nextInt();
		int[] arr2=new int[zz];
		for(int xx=0;xx<arr2.length;xx++) {
			System.out.println((xx+1)+"번째 정수를 입력합니다.");
			int cc=sc.nextInt();
			arr2[xx]=cc;
		}
		int sum2=0;
		for(int xx=0;xx<arr2.length;xx++) {
			sum2+=arr2[xx];
		}
		float avg2=sum2/(float)zz;
		System.out.println(avg2);
		//23f
		System.out.println("입력할 문자열의 갯수를 입력하세요.");
		int vv=sc.nextInt();
		String[] arr3=new String[vv];
		for(int bb=0;bb<arr3.length;bb++) {
			System.out.println((bb+1)+"번째 문자열을 입력합니다.");
			sc.nextLine();
			String yy=sc.nextLine();
			arr3[bb]=yy;
		}
		String arrSum="";
		for(int bb=0;bb<arr3.length;bb++) {
			arrSum+=arr3[bb];
		}
		System.out.println(arrSum);
		//24 ff
		System.out.println("입력할 문자열의 갯수를 입력하세요.");
		int uu=sc.nextInt();
		String[] arr4=new String[uu];
		for(int ii=0;ii<arr4.length;ii++) {
			System.out.println((ii+1)+"번째 문자를 입력합니다.");
			sc.nextLine();
			String oo=sc.nextLine();
			arr4[ii]=oo;
		}
		String maxLength="";
		for(int ii=0;ii<arr4.length-1;ii++) {
			if(arr4[ii].length()>=arr4[ii+1].length()) {
				maxLength=arr4[ii];
			}
			else if(arr4[ii].length()<=arr4[ii+1].length()) {
				maxLength=arr4[ii+1];
			}
			else maxLength=arr4[ii];
		}
		System.out.println(maxLength);
		//25
		System.out.println("입력할 정수의 갯수를 입력하세요.");
		int pp=sc.nextInt();
		int[] arr5=new int[pp];
		for(int hh=0;hh<arr5.length;hh++) {
			System.out.println((hh+1)+"번째 정수를 입력합니다.");
			int jj=sc.nextInt();
			arr5[hh]=jj;
		}
		for(int hh=0;hh<arr5.length;hh++) {
			if(arr5[hh]%2==0) {
				System.out.println(arr5[hh]);
			}
		}
		//26
		System.out.println("숫자 여러개를 공백으로 구분하여 입력하세요.");
		sc.nextLine();
		String kk=sc.nextLine();
		String [] arr6=kk.split(" ");
		int sum3=0;
		for(int ll=0;ll<arr6.length;ll++) {
			int ll1=Integer.parseInt(arr6[ll]);
			sum3+=ll1;	
		}
		System.out.println(sum3);
		//27
		System.out.println("숫자 여러개를 공백으로 구분하여 입력하세요.");
		String aaa=sc.nextLine();
		String [] arr7=aaa.split(" ");
		double total=0;
		for(int sss=0;sss<arr7.length;sss++) {
			double sss1=Double.parseDouble(arr7[sss]);
			total+=sss1;
		}
		double avg5=total/arr7.length;
		System.out.println(avg5);
		
		//28
		System.out.println("이름,국어,영어,수학점수를 차례대로 입력하세요.");
		String name2=sc.nextLine();
		int kr=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		int total5=kr+eng+math;
		float avg3=(kr+eng+math)/3.0f;
		System.out.printf("총점:%1$d,평균:%2$f",total5,avg3);
		System.out.println(avg3);
		//29
		System.out.println("y 또는 n 중 하나를 입력하세요.");
		sc.nextLine();
		String qqq=sc.nextLine();
		if(qqq.equals("y")) {
			System.out.println("y를 입력하였습니다.");
		}
		else if(qqq.equals("n")) {
			System.out.println("n을 입력하였습니다.");
		}
		else System.out.println("다른 문자를 입력하였습니다.");
		System.out.println(qqq);
		//30
		System.out.println("문자열과 정수를 차례대로 입력하세요.");
		String www=sc.nextLine();
		int eee=sc.nextInt();
		System.out.printf("문자열: %1$s, 숫자: %2$d",www,eee);
		
		
		
	
		
	}
}
