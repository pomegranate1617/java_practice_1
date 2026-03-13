package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

public class VectorExample {
	public static void main(String[] args) {
		//List는 부모 인터페이스 Vector는 자식구현클래스
		//List안에는 Board타입을 사용하는 필드나 메서드가있음.
		List<Board> list = new Vector<>();
		//Thread익명자식객체생성
		Thread threadA =new Thread() {
			@Override
			public void run() {
				for(int i =1;i<=1000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		//Thread익명자식객체생성
		Thread threadB =new Thread() {
			@Override
			public void run() {
				for(int i =1001;i<=2000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		//메인스레드,ThreadA,ThreadB총 3개의 스레드가 동시 실행하면 작업처리
		threadA.start();
		threadB.start();
		//메인메서드는 ThreadA를 join()하여 ThreadA가 작업을 종료할때까지 실행 일시정지
		//메인메서드는 ThreadB를 join()하여 ThreadB가 작업을 종료할때까지 실행 일시정지
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
			
		}
		//list에 들어간 객체의 총 갯수를 구해 size에 반환
		int size =list.size();
		System.out.println("총 객체 수:"+size);
		System.out.println();
	}

}
