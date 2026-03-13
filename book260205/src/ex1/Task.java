package ex1;

public class Task implements Comparable<Task>{
	private String name;
	//enum생성 필요한 줄 알았으나 정수자체는 상수로 변경을 못하는 것이었다..
	private int priority;//1~5
	//뭐야 이건
	private int createdAt;
	
	
	@Override
	public int compareTo(Task o) {
		//priority높을 수록 먼저
		if(this.priority != o.priority) {
			return Integer.compare(o.priority, this.priority);
		}
		return Integer.compare(this.createdAt, o.createdAt);
	}
}
