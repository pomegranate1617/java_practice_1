package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();//실행정지상태인것을 실행대기상태로
		try {
			wait();//실행정지
		}catch(InterruptedException e) {
			
		}
		
	}
	
	public synchronized void methodB() {
		Thread thread =Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}	
	}
}
