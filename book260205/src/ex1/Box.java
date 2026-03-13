package ex1;

public class Box implements Comparable<Box>{
	private long width;
	private long heigth;
	
	
	@Override
	public int compareTo(Box o) {
		long area=this.width*this.heigth;
		long area2=o.width*o.heigth;
		return Long.compare(area, area2);
		//compareTo의 경우는 자체적으로 비교(동등비교?)하기 때문에 항상 0이 나오고
		//equals의 경우는 객체의 번지로 판단함.정수에서 일정 범위이상의 
		//수가 나왔을 경우 같은 객체로 판단하지 않기 때문에 서로 다른 수로 판단 가능성이 있다?
	}
	
}
