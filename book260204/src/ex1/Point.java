package ex1;

public class Point implements Comparable<Point>{
	//5
	private int x;
	private int y;
	
	@Override
	public int compareTo(Point o) {
		if(this.x<o.x) return -1;
		else if(this.x==o.x){
			if(this.y<o.y) return -1;
			else if(this.y==o.y) return 0;
			else return 1;
		}
		else return 1;
	}
}
