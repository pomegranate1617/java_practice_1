package ex2;

public class Item implements Comparable<Item>{
	//8
	private String name;
	private int attack;
	private int defense;
	
	
	@Override
	public int compareTo(Item o) {
		int cal=this.attack*2+this.defense;
		int cal2=o.attack*2+o.defense;
		if(cal != cal2) {
			return Integer.compare(cal2, cal);
		}
		if(this.attack != o.attack) {
			return Integer.compare(o.attack, this.attack);
		}
		return this.name.compareTo(o.name);
	}
}
