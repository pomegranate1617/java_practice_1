package ex1;

public class Student implements Comparable<Student>{
	//1
	private String name;
	private int score;
	
	@Override
	public int compareTo(Student o) {
		//점수 오름차순
		if(this.score<o.score) return -1;
		else if(this.score==o.score) {
			//점수가 같으면 이름 사전순
			return this.name.compareTo(o.name);
		}
		else return 1;	
	}
}
