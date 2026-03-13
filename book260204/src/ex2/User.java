package ex2;

public class User implements Comparable<User>{
	//3
	private String id;
	private String nickname;//nullable
	
	@Override
	public int compareTo(User o) {
		//하나라도 닉네임이 null이 아닌경우 true 또는 두개가 null이 아닌경우 true
		if((this.nickname != null ^ o.nickname != null) || 
				(this.nickname != null && o.nickname != null)) {
			return this.nickname.compareTo(o.nickname);
		}
		//둘다 닉네임이 null인경우 true
		else {
			//id순...(사전순->오름차순)
			return this.id.compareTo(o.id);
		}
	}
}
