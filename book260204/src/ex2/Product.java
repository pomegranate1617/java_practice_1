package ex2;

public class Product implements Comparable<Product>{
	//2
	private String name;
	private double rating;
	
	@Override
	public int compareTo(Product o) {
		//double같은 소수를 사용하는 것들은 부동소수점 방식이라 값이 정확하지 
		//않아서 비교연산자 사용불가능하다...?
		double result=Double.compare(this.rating, o.rating);
		return (int)result;
	}
}
