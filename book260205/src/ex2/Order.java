package ex2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order implements Comparable<Order>{
	//3
	private String orderId;//id
	private BigDecimal totalPrice;//가격
	private LocalDate orderDate;//주문날짜
	
	@Override
	public int compareTo(Order o) {
		if(!this.orderDate.equals(o.orderDate)) {
			return this.orderDate.compareTo(o.orderDate);
		}
		if(this.totalPrice != o.totalPrice) {
			return this.totalPrice.compareTo(o.totalPrice);
		}
		return this.orderId.compareTo(o.orderId);
	}
}
