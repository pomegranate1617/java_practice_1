package book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Gpt1 {
	public static void main(String[] args) {
		//1
		//TimeZone을 어떻게 활용해야 될지 모르겠음...ㅠㅠ
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		TimeZone korea=TimeZone.getTimeZone("Asia/Seoul");
		String seoul=sdf.format(now);
		System.out.println(seoul);
	}
}
