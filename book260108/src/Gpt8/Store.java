package Gpt8;

public class Store {
	//필드
	private int stock;
	private boolean success=false;
	//생성자
	public Store(int stock) {
		this.stock=stock;
	}
	
	//메서드
	public void buying(int num) throws OutOfStockException{
		
			if(num>stock) {
				System.out.println("구매수량이 재고수량을 초과하였습니다./n"+stock+"이하의 구매수량을 입력하세요.");
			}else if(num==stock){
				stock-=num;
				success=true;
				System.out.println(num+"개의 상품을 구매하였습니다.");
				throw new OutOfStockException("재고수량이 0입니다.");	
			}
			else {
				stock-=num;
				success=true;
				System.out.println(num+"개의 상품을 구매하였습니다.");
				System.out.println("남은 재고수량은"+stock+"입니다.");
			}
		}
	
	//getter,setter
	public void setStock(int stock) {
		this.stock=stock;
	}
	public int getStock() {
		return this.stock;
	}
	public void setSuccess(boolean success) {
		this.success=success;
	}
	public boolean getSuccess() {
		return this.success;
	}
}
