package book;

public class Car {
	private Tire tire1 =new Tire();
	
	private Tire tire2=new Tire() {
		@Override
		public void roll() {
			System.out.println("익명자식 Tire객체1이 굴러갑니다.");
		}
	};
	
	public void run2() {
		Tire tire =new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {
		tire.roll();
	}
}
