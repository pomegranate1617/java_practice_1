package ex2;

import java.time.LocalDateTime;

public class Trade implements Comparable<Trade>{
	//5
	private String stockCode;//종목코드
	private LocalDateTime time;
	private int volume;//거래량
	
	@Override
	public int compareTo(Trade o) {
		//거래량 다를경우
		if(this.volume != o.volume) {
			return Integer.compare(this.volume, o.volume);
		}
		//거래량 같을 경우 시간 오름차순
		if(this.time.equals(o.time)) {
			return this.time.compareTo(o.time);
		}
		//시간 같을 경우 종목코드 오름차순	
		return this.stockCode.compareTo(o.stockCode);
	}
}
