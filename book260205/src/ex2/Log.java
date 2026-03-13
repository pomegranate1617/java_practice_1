package ex2;

import java.time.LocalDateTime;

public class Log implements Comparable<Log>{
	//10
	private String level;//ERROR,WARN,INFO
	private LocalDateTime time;
	private String message;
	
	@Override
	public int compareTo(Log o) {
//		int num= this.level.equals("ERROR")? 3:this.level.equals("WARN") ? 4:5;
		//레벨이 다를경우
		if(!this.level.equals(o.level)) {
			if(this.levelMatchNum() < o.levelMatchNum()) return -1;
			else if(this.levelMatchNum() == o.levelMatchNum()) return 0;
			else return 1;
		}
		//레벨이 같을 경우
		else {
			//시간이 서로 다를경우
			if(!this.time.equals(o.time)) {
				return this.time.compareTo(o.time);
			}
			//시간이 서로 같을 경우
			else {
				//메세지 길이 짧은 순
				if(this.message.length() != o.message.length()) {
					return Integer.compare(this.message.length(), o.message.length());
				}
				//메세지 길이 같은 경우,사전순
				return this.message.compareTo(o.message);
			}
		}
	}
	public int levelMatchNum(){
		if(this.level.equals("ERROR")) return 3;
		else if(this.level.equals("WARN")) return 4;
		else if(this.level.equals("INFO")) return 5;
		else return 6;
	}
}
