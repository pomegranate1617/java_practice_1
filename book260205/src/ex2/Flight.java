package ex2;

import java.time.LocalDateTime;

public class Flight implements Comparable<Flight>{
	//7
	private String flightNo;
	private LocalDateTime departure;
	private int delayMinutes;
	
	@Override
	public int compareTo(Flight o) {
		//지연없는 항공편
		if(this.delayMinutes ==0) {
			//출발시간 빠른 순
			if(!this.departure.equals(o.departure)) {
				return this.flightNo.compareTo(o.flightNo);
			}
			//비행기 번호 오름차순
			return this.flightNo.compareTo(o.flightNo);
		}
		//지연있는 항공편
		else {
			//출발시간 빠른순
			if(!this.departure.equals(o.departure)) {
				return this.departure.compareTo(o.departure);
			}
			//지연시간 짧은 순
			if(this.delayMinutes !=o.delayMinutes) {
				return Integer.compare(this.delayMinutes, o.delayMinutes);
			}
			return this.flightNo.compareTo(o.flightNo);
		}
	}
}
