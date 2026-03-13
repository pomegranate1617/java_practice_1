package Gpt1;

public class ZeroDivideException extends RuntimeException{
	public ZeroDivideException() {}
	
	public ZeroDivideException(String message) {
		super(message);
	}
	
}
