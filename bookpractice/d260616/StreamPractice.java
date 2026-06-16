package d260616;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(evenFiltering()));
		System.out.println(Arrays.toString(changeUpperCase()));
		System.out.println(Arrays.toString(strLengthArr()));
		System.out.println(Arrays.toString(descSort()));
		System.out.println(Arrays.toString(lengthSort()));
		System.out.println(Arrays.toString(ascSort()));
		System.out.println(isLengthOver());
		System.out.println(isAnyEven());
		System.out.println(sumAndAvg());
		System.out.println(Arrays.toString(transArr()));
	}
	//1
	public static int[] evenFiltering() {
		List<Integer> nums = Arrays.asList(3,7,12,15,18,21,24);
		//mapToInt없이 하면 Integer타입이라 toArray()가 Object타입으로만 반환
		//toArray(int[] :: new)나(기본타입은 객체생성 불가)
		//toArray(Integer[] :: new)같은거는 없음. =>가능 포장객체등등 객체타입으로 선언한 배열은 참조타입이므로 new로 객체 생성가능
		// 가능. Integer[]는 참조형 배열이며 배열도 객체이므로
		// Integer[]::new 형태의 생성자 참조를 사용할 수 있음.
		int[] evenArr = nums.stream().filter(num -> num % 2 == 0)
							.mapToInt(Integer :: intValue).toArray();
		
		return evenArr;
	}
	//2
	public static String[] changeUpperCase() {
		List<String> names = Arrays.asList("kim","lee","park");
		//map(str -> str.toUpperCase())를 매개변수의 메소드 참조식으로 바꿈
		String[] upper = names.stream().map(String :: toUpperCase)
								.toArray(String[] :: new);
		
		return upper;
	}
	//3
	public static int[] strLengthArr() {
		List<String> words = Arrays.asList("apple","banana","kiwi","grape");
		
		int[] lengthArr = words.stream().mapToInt(word -> word.length())
								.toArray();
		//Integer[] :: new도 가능한지 테스트
//		Integer[] lengthArr2 = words.stream().map(word -> word.length())
//				.toArray(Integer[] :: new);
		return lengthArr;
	}
	//4
	public static String[] descSort() {
		List<String> names = Arrays.asList("Kim","Lee","Park","Choi");
		
//		String[] sortArr = names.stream().sorted((str1,str2) -> {
//			if(str1.compareTo(str2) > 0) return -1;
//			else if(str1.compareTo(str2) == 0) return 0;
//			else return 1;
//		}).toArray(String[] :: new);
		String[] sortArr = names.stream().sorted(Comparator.reverseOrder())
								.toArray(String[] :: new);
		
		return sortArr;
	}
	//5
	public static String[] lengthSort() {
		List<String> words = Arrays.asList("banana","kiwi","watermelon","apple");
		
		String[] sortArr = words.stream().sorted(
				Comparator.comparing(String :: length))
				.toArray(String[] :: new);
		
		return sortArr;
	}
	
	//6
	public static int[] ascSort() {
		List<Integer> nums = Arrays.asList(5,3,1,5,2,3,7,1);
		
		int[] sortNums = nums.stream().distinct()
							.sorted(Integer :: compare)
							.mapToInt(Integer :: intValue)
							.toArray();
		
		return sortNums;
	}
	
	//7
	public static boolean isLengthOver() {
		List<String> names = Arrays.asList("Kim","Lee","Park","Choi");
		
		boolean isThreeOver = names.stream()
									.allMatch(str -> str.length() >= 3);
		
		return isThreeOver;
	
	}
	//8
	public static boolean isAnyEven() {
		List<Integer> nums = Arrays.asList(1,3,5,7,8,9);
		
		return nums.stream().anyMatch(num -> num % 2 == 0);
	}
	//9
	public static String sumAndAvg() {
		List<Integer> nums = Arrays.asList(10,20,30,40,50);
		
		int sum = nums.stream().mapToInt(Integer :: intValue).sum();
		double avg = nums.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		
		String str = "합 : " + sum + "\n평균 : " + avg;
		
		return str;
	}
	
	//10
	public static String[] transArr() {
		List<String> words = Arrays.asList("apple","banana","kiwi","grape","watermelon","melon");
		
		String[] newArr = words.stream().filter(s -> s.length() >= 5)
								.map(String :: toUpperCase)
//								.sorted(Comparator.compareTo(str1,str2)))
//								.sorted(Comparator :: compareTo)
								.sorted(Comparator.comparing(s -> s.length()))
//								.sorted((str1,str2) -> {
//									int str1Length = str1.length();
//									int str2Length = str2.length();
//									return 
//								})
//								.sorted((str1,str2) ->{
//									if(str1.length() < str2.length()) return -1;
//									else if(str1.length() == str2.length()) return 0;
//									else return 1;
//								})
								//이건 뭔 원리지?;;
//								.sorted(Comparator.comparingInt(String :: length))
								.toArray(String[] :: new);
		
		return newArr;
	}
}
