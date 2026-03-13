package ex1;

import java.time.LocalDateTime;

public class Meeting implements Comparable<Meeting>{
	private String title;
	private LocalDateTime start;
	
	@Override
	public int compareTo(Meeting o) {
		//시작 시간이 빠른 순 정렬
		return this.start.compareTo(o.start);
	}
	
}
