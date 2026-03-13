package ex2;

import java.time.LocalDateTime;

public class Meeting implements Comparable<Meeting>{
	//4
	private String title;
	private LocalDateTime start;
	
	@Override
	public int compareTo(Meeting o) {
		return this.start.compareTo(o.start);
	}
}
