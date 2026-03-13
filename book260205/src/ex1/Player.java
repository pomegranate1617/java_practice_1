package ex1;

public class Player implements Comparable<Player>{
	private String name;
	private int score;
	private int playTime;
	
	
	@Override
	public int compareTo(Player o) {
		if(this.score !=o.score) {
			return Integer.compare(o.score,this.score);
		}
		if(this.playTime !=o.playTime) {
			return Integer.compare(this.playTime, o.playTime);
		}
		return this.name.compareTo(o.name);
	}	
}
