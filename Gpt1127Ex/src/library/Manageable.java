package library;

public interface Manageable {
	void add(Book book);
	void remove(String title);
	Book find(String title);
	void printAll();//추상메서드 작성

}
