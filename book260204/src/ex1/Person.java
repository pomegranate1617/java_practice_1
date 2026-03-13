package ex1;

public class Person implements Comparable<Person>{
	//2
	private String name;
	private int age;
	
	@Override
	public int compareTo(Person o) {
		//나이 순으로 
		if(this.age<o.age) return 1;
		else if(this.age==o.age) return 0;
		else return -1;
	}
	//Collections.sort()는 또 뭐야;;
}
	
