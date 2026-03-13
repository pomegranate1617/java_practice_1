package library;

public class EBook extends Book{
	double fileSize;
	String format;
	
	EBook(String title,String author,int year,boolean borrowed,String format){
		super(title,author,year,borrowed);
		this.fileSize=fileSize;
		this.format=format;	
	}
	public void printInfo(String title,String author,int year,boolean borrowed,String format){
		System.out.println("[E-Book]");
		System.out.println("제목: "+title+" / 저자: "+author+" / 출판년도: "+year+" / 대여여부: "+borrowed+" / 파일크기: "+fileSize+"MB"+" /포맷: "+format );
	}
}
