package ex1;

public class Word implements Comparable<Word>{
	//3
	private String text;
	
	@Override
	public int compareTo(Word o) {
		if(this.text.length()<o.text.length()) return -1;
		else if(this.text.length()==o.text.length()) {
			return this.text.compareTo(o.text);
		}
		else return 1;
	}
}
