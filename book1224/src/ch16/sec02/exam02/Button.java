package ch16.sec02.exam02;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	//Button의 필드
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
