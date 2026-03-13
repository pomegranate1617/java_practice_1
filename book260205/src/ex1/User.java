package ex1;

public class User implements Comparable<User>{
	private String id;
	private String nickname;//nullable
	
	@Override
	public int compareTo(User o) {
		//nickname이 null이 아닌 사용자 먼저
		//닉네임이 둘다 null이 아닌 경우
		if((this.nickname !=null) && (o.nickname != null)) {
			return this.nickname.compareTo(o.nickname);
		}
		//닉네임이 하나만 null인 경우
		else if((this.nickname == null) ^ (o.nickname ==null)) {
			//null인 닉네임은 뒤로가기...
			if(this.nickname ==null) {
				return 1;
			}
			else return -1;//0썼었는데 틀렸대서 -1로 바꿈
		}
		//닉네임이 둘다 null인경우
		else {
			//id오름차순
			 return this.id.compareTo(o.id);
		}
	}
}
