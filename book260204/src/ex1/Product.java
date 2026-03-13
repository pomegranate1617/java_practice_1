package ex1;

public class Product implements Comparable<Product>{
	//4
	private String name;
	private int price;
	
	@Override
	public int compareTo(Product o) {
		if(this.price<o.price) return 1;
		else if(this.price==o.price) {
			return this.name.compareTo(o.name);
		}
		else return -1;
	}
}
