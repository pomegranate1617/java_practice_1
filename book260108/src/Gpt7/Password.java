package Gpt7;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요.");
		int password=sc.nextInt();
		boolean pass=false;
		while(pass==false) {
			try {
				if(password==1234) {
					pass=true;
					System.out.println("로그인 성공");
				}else {
					throw new InvalidPasswordException("비밀번호를 다시 입력하세요.");
				}
			}catch(InvalidPasswordException e){
				System.out.println(e.getMessage());
				password=sc.nextInt();
			}
			
		}
		sc.close();
	
	}

}
