package ex1;

public class Order implements Comparable<Order>{
	private String orderId;
	private Status status;
	
	@Override
	public int compareTo(Order o) {
		if(this.status != o.status) {
			//enum의 상수 하나하나는 객체 취급...
			return this.status.compareTo(o.status);
		}
		return this.orderId.compareTo(o.orderId);
		//ordinal()을 그대로 쓰면 안되는 이유:enum에 작성된 
		//상수의 순서대로 오름차순이 정해지기때문?		
	}
}
