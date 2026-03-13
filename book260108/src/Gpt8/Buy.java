package Gpt8;

import java.util.Scanner;

public class Buy {

	public static void main(String[] args) {
		Store st=new Store(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("구매하고자 하는 수량을 입력하세요.");
		int want=sc.nextInt();
			try {
				while(st.getSuccess()==false) {
					st.buying(want);
					if(want>st.getStock()&& st.getSuccess()==false) {
						System.out.println("구매하고자 하는 수량을 다시 입력하세요.");
						want=sc.nextInt();
					}
				}
				st.setSuccess(false);
			}catch(OutOfStockException e) {
				st.setSuccess(true);
				System.out.println(e.getMessage());
			}
		sc.close();
	}

}
