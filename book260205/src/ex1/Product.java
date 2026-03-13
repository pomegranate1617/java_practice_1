package ex1;

public class Product implements Comparable<Product>{
	private String name;
	private double rating;
	
	@Override
	//double,float같은 실수타입들은 비교연산자가 사용이 불가능한데 그 이유는
	//실수 타입들이 부동 소수점 방식을 사용하기 때문이다.
	public int compareTo(Product o) {
		return Double.compare(o.rating, this.rating);
	}
}
