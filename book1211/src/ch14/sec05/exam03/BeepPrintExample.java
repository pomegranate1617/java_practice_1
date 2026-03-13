package ch14.sec05.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	//Thread자식클래스로 생성
	public static void main(String[] args) {
		Thread thread =new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		};
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
