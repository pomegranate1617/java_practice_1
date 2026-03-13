package Gpt4;

public class Tongjang {
	//필드
	private long money;
	//생성자
	public Tongjang() {
		
	}
	public Tongjang(long money) {
		this.money=money;
	};
	//
	public void output(long won) throws InsufficientBalanceException{
		if(won>money) {
			throw new InsufficientBalanceException("잔액이"+(won-money)+"만큼 부족합니다.");
		}else {
			money-=won;
			System.out.println(won+"원이 출금되었습니다.");
			System.out.println("잔액은"+money+"입니다.");
		}
	}
	//getter,setter
	public long getMoney() {
		return money;
	}
	public void setMoney(long charge) {
		money+=charge;
	}
}
