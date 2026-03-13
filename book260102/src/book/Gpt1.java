package book;

import java.util.Scanner;

public class Gpt1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1-----------------------------
		int n=5;
		int cnt=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<cnt;j++) {
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
		cnt=n-1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=cnt;k++) {
				System.out.print("*");
			}
			cnt--;
			System.out.println();
		}
		//2--------------------------------
		
		System.out.println("2이상의 양의 정수 하나를 입력하세요.");
		int n1=sc.nextInt();
		for(int i=2;i<=n1;i++) {
			if(n1%i==0) {
				if(i!=n1) {
					System.out.println( n1+"은(는) 소수가 아닙니다.");
					break;
				}
				else System.out.println(n1+"은(는) 소수입니다.");
			}
			
		}
		
//		3----------------------------------
//arr[3][3]= {{1,2,3},
//{4,5,6},
//{7,8,9}};
//arr[4][4]= {{1,2,3,4},
//{5,6,7,8},
//{9,10,11,12},
//{13,14,15,16}};	
		System.out.println("양의 정수를 입력하세요.");
		int n2=sc.nextInt();
		int[][] arr= new int [n2][n2];
		int [][] arr2=new int[n2][n2];
		int sumArr=0;
		int sumArr2=0;
		//arr배열에 랜덤한 정수 넣기 
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n2;j++) {
				arr[i][j]=(int)(Math.random()*9+1);
			}
		}
		//arr배열의 대각선 수의 합
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n2;j++) {
				if(i==j) {
					sumArr+=arr[i][j];
				}
			}
		}
		//arr 배열을 각 열마다 거꾸로해서 arr2배열의 값을 입력 
		for(int i=0;i<n2;i++) {
			int cnt2=n2-1;
			for(int j=0;j<n2;j++) {
				arr2[i][j]=arr[i][cnt2];
				cnt2--;
			}
		}
		//arr2배열의 대각선 수의 합
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n2;j++) {
				if(i==j) {
					sumArr2+=arr2[i][j];
				}
			}
		}
		//두 대각선의 합
		System.out.println(sumArr+sumArr2);
		//4------------------------------------
		int[] arr1= {1,2,2,3,4,1};
		int cnt2=0;
		int result=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<arr1[i+1]) {
				cnt2++;
			}
			else {
				result=cnt2;
				cnt2=0;
			}
			if((i+1)==arr1.length) break;
		}
		System.out.println(result);
		//5-------------------------------
		System.out.println("문자열을 입력하세요.");
		sc.nextLine();
		String sig=sc.nextLine();
		int length=sig.length();
		int cnt3=0;
		for(int i=0;i<length;i++) {
			if((sig.charAt(i)+"").equals(sig.charAt(i+1)+"")) {
				cnt3++;
			}
			else {
				System.out.print(sig.charAt(i-1)+""+cnt3);
				cnt3=1;				
			}
			if((i+1)==length) {
				System.out.println(sig.charAt(i)+""+cnt3);
				break;	
			}
		}
		//6
		System.out.println("문자열을 입력하세요.");
		String input=sc.nextLine();
		int length2=input.length();
		int cnt4=length2-1;
		for(int i=0;i<length2/2;i++) {
			String instant=input.charAt(0)+"";
			if(!instant.equals(input.charAt(cnt4)+"")) {
				System.out.println(input+"문자열은 회문이 아닙니다.");
				break;
			}
			if(i==((length2/2)-1)){
				System.out.println(input+"문자열은 회문입니다.");
			}
		}
		//7
		System.out.println("양의 정수를 입력하세요.");
		int clear=sc.nextInt();
		int add=0;
		//n까지의 모든 양의 정수 가져오기
		for(int i=1;i<=n;i++) {
			//정수의 약수 찾기
			for(int j=1;j<i;j++) {
				if(i%j==0) add+=j;
				if(j==(i-1) && add==i) {
					System.out.println(i);
					add=0;
				}
			}
		}
		//8
		int[] arr5= {3,4,5,3,6};
		int minus=arr5.length;
		int[] arr6;
		int cnt6=0;
		for(int i=0;i<arr5.length;i++) {
				for(int j=i+1;j<arr5.length;j++) {
					if(arr5[i]==arr5[j]) {
						for(int l=j;l<arr5.length;l++) {
							if((l+1)!=arr5.length) {
								arr5[l]=arr5[l+1];
								arr5[l+1]=0;
								minus--;
							}
							else arr5[l]=0;
						}	
					}					
				}
				for(int o=0;o<minus;o++) {
					arr6=new int[minus];
					arr6[o]=arr5[o];
					System.out.println(arr6[o]);
				}
//				if((i+1)==arr5.length-1) {
//					arr6=new int[minus];
//					for(int k=0;k<arr6.length;i++) {
//						arr6[k]=arr5[k];
//					}
//					break;
//				}
//				for(int o=0;o<arr6.length;o++) {
//					
//				}
		}
		//9
		System.out.println("문자열을 입력하세요.");
		String x=sc.nextLine().toLowerCase();
		int xLeng=x.length();
		int cntX=1;
		int cntResult=0;
		String maxSig="";
		for(int i=0;i<xLeng;i++) {
			for(int j=0;j<xLeng;j++) {
				if((x.charAt(i)+"").equals(x.charAt(j)+"")) {
					cntX++;	
				}	
			}
			if(cntX>cntResult) {
				cntResult=cntX;
				maxSig=x.charAt(i)+"";
			}
		}
		System.out.println("가장 많이 등장한 문자:"+maxSig+",등장 횟수:"+cntResult);
		//10
		int[] arr7={1,2,3,2,5};
		System.out.println("int[] arr7={1,2,3,2,5}");
		System.out.println("위에서 주어진 배열의 원소 중 원하는 k1의 값을 입력하세요.");
		int k1=sc.nextInt();
		int cntK=0;
		//배열순회
		for(int i=0;i<arr7.length;i++) {
			if(arr7[i]==k1) cntK++;
		}
		for(int i=0;i<arr.length-1;i++) {
			if((arr7[i]+arr7[i+1])==k1) cntK++;
		}
		for(int i=0;i<arr7.length-2;i++) {
			if((arr7[i]+arr7[i+1]+arr7[i+2])==k1) cntK++;
		}
		for(int i=0;i<arr7.length-3;i++) {
			if((arr7[i]+arr7[i+1]+arr7[i+2]+arr7[i+3])==k1) cntK++;
		}
		System.out.println(cnt);
	}	
}
