package ex2;

import java.time.LocalDateTime;

public class LoginLog implements Comparable<LoginLog>{
	//2
	private String userId;
	private LocalDateTime loginTime;
	private boolean success;
	
	@Override
	public int compareTo(LoginLog o) {
		//true가 먼저
		int num=this.success ==true && o.success == true ? Boolean.compare(this.success, o.success): -1;
		if(num!=-1) return num;
		if(!this.loginTime.equals(o.loginTime)) {
			return this.loginTime.compareTo(o.loginTime);
		}
		return this.userId.compareTo(o.userId);
	}
}
