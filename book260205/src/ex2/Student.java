package ex2;

import java.util.List;

public class Student implements Comparable<Student>{
	private String name;
	private List<Integer> scores;
	
	@Override
	public int compareTo(Student o) {
		//평균 점수 내림차순
		if(this.scores !=null && o.scores !=null) {
			double avg=0;
			double avg2=0;
			int max=0;
			int max2=0;
			for(int score:this.scores) {
				avg+=score;
				if(max<score) {
					max=score;
				}
			}
			for(int score2:o.scores) {
				avg2+=score2;
				if(max<score2) {
					max=score2;
				}
			}
			if(avg != avg2) {
				return Double.compare(avg, avg);
			}
			if(max != max2) {
				return Integer.compare(max2, max);
			}
			return this.name.compareTo(o.name);
		}
		//---------------------------------
		return this.name.compareTo(o.name);
	}
		
}
