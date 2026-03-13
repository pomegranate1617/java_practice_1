package ex1;

import java.time.LocalDate;

public class Log implements Comparable<Log>{
	private String message;
	private LocalDate timeStamp;
	private int seq;
	
	
	@Override
	public int compareTo(Log o) {
		if(!this.timeStamp.equals(o.timeStamp)) {
			return this.timeStamp.compareTo(o.timeStamp);
		}
		return Integer.compare(this.seq, o.seq);
	}
	//seq가 없으면 생기는 문제:동일한 시간대의 메세지가 덮어씌워진다?
	
}
