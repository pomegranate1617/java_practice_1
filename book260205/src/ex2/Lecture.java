package ex2;

public class Lecture implements Comparable<Lecture>{
	//6
	private String title;
	private int studentCount;//수강생 수
	private double rating;//평점
	
	@Override
	public int compareTo(Lecture o) {
		if(this.rating != o.rating) {
			return Double.compare(this.rating, o.rating);
		}
		if(this.studentCount != o.studentCount) {
			return Integer.compare(this.studentCount, o.studentCount);
		}
		return this.title.compareTo(o.title);
	}
}
