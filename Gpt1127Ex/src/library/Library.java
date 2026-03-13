package library;


public class Library implements Manageable{
	Book[] books=new Book[100];
	int count=0;
	
	public void add(Book book) {
		//books배열에 추가
			Book[i]=book;
		
	}
	public void remove(String title) {
		//해당 제목의 책을 배열에서 제거(빈 칸 생기면 앞으로 당기기)
	}
	public String find(String title) {
		return "메롱";
		//해당 제목의 책 반환(업으면 null)
	}
	public Book printAll() {
		//등록된 모든 책 정보 출력
		
	}

}
