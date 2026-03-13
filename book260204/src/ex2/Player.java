package ex2;

public class Player implements Comparable<Player>{
	//1
	private String name;
	private int score;
	private int playTime;
	
	@Override
	public int compareTo(Player o) {
		if(this.score<o.score) return 1;
		else if(this.score==o.score) {
			if(this.playTime<o.playTime) return -1;
			else if(this.playTime==o.playTime) {
				return this.name.compareTo(o.name);
			}
			else return 1;
		}
		else return-1;
	}
}
