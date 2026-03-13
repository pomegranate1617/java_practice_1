package ex1;

import java.time.LocalDate;

public class Event implements Comparable<Event>{
	//6
	private String title;
	private LocalDate date;
	
	@Override
	public int compareTo(Event o) {
		return this.date.compareTo(o.date);
	}
}
