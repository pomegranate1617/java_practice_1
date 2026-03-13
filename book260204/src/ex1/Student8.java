package ex1;

public class Student8 implements Comparable<Student8>{
	//8 
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	@Override
	public int compareTo(Student8 o) {
		float total=(this.kor+this.eng+this.math)/3.0f;
		float totalO=(o.kor+o.eng+o.math)/3.0f;
		if(total<totalO) return 1;
		else if(total==totalO) {
			return this.name.compareTo(o.name);
		}
		else return -1;
		
	}
}
