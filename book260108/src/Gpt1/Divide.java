package Gpt1;

public class Divide {
	public float divide(int int1,int int2) throws ZeroDivideException{
		if(int2==0) {
			throw new ZeroDivideException("0으로 나눌 수 없습니다.");
		}
		float a=(float)int1/int2;
		return a;
	}
}
