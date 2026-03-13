package ch16.sec02.exam02;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk =new Button();
		
		btnOk.setClickListener(()->{
			System.out.println("Ok 버튼을 클릭했습니다.");
			});
		//버튼을 클릭했습니다.
		btnOk.click();
		//버튼을 클릭했습니다.
		Button btnCancel =new Button();
		
		btnCancel.setClickListener(()->{
			System.out.println("Cancel버튼을 클릭했습니다.");
		});
		//버튼을 클릭했습니다.
		
		btnCancel.click();
		//버튼을 클릭했습니다.
		
	}

}
