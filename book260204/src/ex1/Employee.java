package ex1;

public class Employee implements Comparable<Employee>{
	//7 f
	private int empNo;
	private String name;
	
	@Override
	public int compareTo(Employee o) {
		if(this.empNo<o.empNo) return -1;
		else if(this.empNo==o.empNo) return 0;
		else return 1;
	}
}
