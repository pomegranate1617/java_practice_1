package ex1;

import java.time.LocalDateTime;

public class Employee implements Comparable<Employee>{
	private String name;
	private String department;
	private Grade grade;
	private long salary;
	private LocalDateTime joinDate;
	
	@Override
	public int compareTo(Employee o) {
		if(this.grade != o.grade) return this.grade.compareTo(o.grade);
		if(this.salary !=o.salary) return Long.compare(o.salary,this.salary);
		if(this.joinDate != o.joinDate) return this.joinDate.compareTo(o.joinDate);
		return this.name.compareTo(o.name);
	}
}
