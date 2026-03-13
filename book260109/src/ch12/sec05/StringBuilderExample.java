package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
					.append("DEF")
					.insert(0, "ABC")
					.delete(3, 4)
					.replace(3,4,"NEW")
					.insert(1, "Sert")
					.toString();
		System.out.println(data);

	}

}
