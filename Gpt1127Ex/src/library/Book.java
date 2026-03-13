package library;

public class Book {
	private String title;
	private String author;
	private int year;
	private boolean borrowed=false;
	
	//생성자1
	public Book(String title,String author,int year,boolean borrowed) {
		this.title=title;
		this.author=author;
		this.year=year;
		this.borrowed=borrowed;	
	}
	//생성자2
	public Book(String title,String author,int year) {
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	public void borrow()throws BorrowException{
		//borrowed가 true라면 BorrowException발생
		if(borrowed=true) {
			throw new BorrowException("이미 대여중인 책입니다.");
		}
	
	}
	public void returnBook() throws ReturnException{
		//borrowed가 false라면 ReturnException발생
		if(borrowed=false) {
			throw new ReturnException("이미 반납된 책입니다.");
		}
	}
	public void printInfo() {
		System.out.println("제목: "+title+" / 저자: "+author+"/ 출판년도: "+year+"/ 대여여부: "+borrowed);
	}
}
