package d260615;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Gpt1 {
	public static void main(String[] args) {
		System.out.println(numAdd());
		System.out.println(Arrays.toString(strLengthArr()));
		System.out.println(Arrays.toString(evenFilter()));
		System.out.println(Arrays.toString(transUpperCase()));
		System.out.println(overTenCnt());
		System.out.println(Arrays.toString(duplicationDel()));
		System.out.println(Arrays.toString(strLengthSort()));
		System.out.println(findMax());
		System.out.println(Arrays.toString(overFiveLengthStr()));
		System.out.println(Arrays.toString(overThirtyAgeFind()));
	}
	//1
	public static int numAdd() {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//mapToInt(num -> num)식으로 간단하게 가능 return값은 int가 됨.
		//mapToInt(Integer::intValue) 로 참조식 넣는게 더 람다식 다움.
		//num -> num.intValue(); => 매개변수가 2개가 아니라 1개인경우
		//한개의 매개변수를 참조해서 메소드를 호출하면 매개변수의 메소드참조를 사용 가능
		int sum = list.stream().mapToInt(objNum -> {
			int num = objNum;
			return num;
		}).sum();
		return sum;
	}
	//2
	public static int[] strLengthArr() {
		
		List<String> list = Arrays.asList("apple","banana","kiwi");
		
		int[] arr = list.stream().mapToInt(str -> str.length()).toArray();
		
		return arr;
	}
	
	//3
	public static int[] evenFilter() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		//mapToInt(Integer :: intValue)사용권장 
		//굳이 mapToInt사용 필요없이 filter로 바로 걸러도 됨.
		// %등등 연산기호로 연산시 자동 언박싱 되기때문?
		int[] evenArr = list.stream().mapToInt(objNum -> {
			int num = objNum;
			return num;
		}).filter(num -> num % 2 == 0).toArray();
		
		return evenArr;
	}
	//4
	public static String[] transUpperCase() {
		
		List<String> list = Arrays.asList("java","stream","api");
		//왜 String도 객체인데 toArray()하면 Object타입으로 반환되지?다른 포장타입은
		//제대로 타입 맞게 나오는데;; => 포장객체는 toArray()하면 포장객체 타입배열로 반환됨.
		//peek()등 단순 순회메소드에서 람다식으로 toUpperCase()한다고 
		//객체의 원래 형태가 변환되지는 않음.
		
		//map(String :: toUpperCase)처럼 메소드 참조로도 작성가능
		//toArray()에 매개변수로 String[] :: new 넣어주면 String배열로 반환됨.
		//toArray(String[] :: new)
		//근데 String[] 타입 클래스라는게 있었나?
		Object[] objUpper =  list.stream().map(str -> str.toUpperCase()).toArray();
		
		String[] upperStr = new String[list.size()];
		
		for(int i = 0; i < objUpper.length; i++) {
			String str = objUpper[i].toString();
			upperStr[i] = str;
		}
		
		return upperStr;
		
	}
	
	//5
	//Integer등의 포장객체는 int로 변경이 필요 또는 equals로 비교해야 됨.
	public static int overTenCnt() {
		List<Integer> list = Arrays.asList(3,15,8,20,7,11);
		//int로 다운캐스팅보다 그냥 count()반환타입에 맞게 long타입으로 받는게 나음
		int cnt = (int)list.stream().mapToInt(numObj -> {
			int num = numObj;
			return num;
		}).filter(num -> num > 10).count();
		
		return cnt;
		
	}
	
	//6
	public static int[] duplicationDel() {
		List<Integer> list = Arrays.asList(1,1,2,2,3,4,4,5);
		
		int[] delSame = list.stream().mapToInt(objNum -> {
			int num = objNum;
			return num;
		}).distinct().toArray();
		
		return delSame;
	}
	
	//7
	public static String[] strLengthSort() {
		List<String> list = Arrays.asList("banana","kiwi","apple","watermelon");
		
//		Object[] objSort = list.stream().sorted((str1,str2) 
//				-> str1.compareTo(str2)).toArray();
		
		//sorted의 매개변수에 str1.length()이런식 불가. 
		//=> 해당 스트림에 흐르는 데이터와 같은 타입만 가능
		//sorted(Comparator.comparing(String::length)로 참조 가능
		//comparing은 static메소드
		//매개변수 타입이 Comparator이므로 Comparator를 사용하는 comparing은 람다식없이 직접 대입가능
		//comparing()메소드의 매개변수는 Funtion 함수형 인터페이스 타입으로 메소드참조나 람다식 사용가능
		//sorted(Comparator.comparing(str -> str.length())의 메소드 참조형
		//toArray(String[] :: new)
		Object[] objSort = list.stream().sorted((str1,str2) 
		-> {
			if(str1.length() > str2.length()) return 1;
			else if(str1.length() < str2.length()) return -1;
			else return 0;
		}).toArray();

		String[] sortStr = new String[list.size()];
		
		for(int i = 0; i < objSort.length; i++) {
			sortStr[i] = objSort[i].toString();
		}
		
		return sortStr;
		
	}
	
	//8
	public static int findMax() {
		List<Integer> list = Arrays.asList(3,7,1,9,5);
		
		//max(Integer::compareTo)처럼 메소드 참조 가능
		//orElse(int타입)는 int반환해서 (int)로 다운 캐스팅 안해도 됨.
		int maxNum = (int)list.stream()
				.max((num1,num2) -> num1.compareTo(num2)).orElse(-1);
		
		return maxNum;
		
	}
	
	//9
	public static String[] overFiveLengthStr() {
		List<String> list = Arrays.asList("java","stream","api","lambda","code");
		//문제 의동 filter -> map -> collect식 풀이였는데 다르게 풀어버림
		//map보다 filter를 먼저 사용해 필요없는 데이터 먼저 버리고 시작하는게 효율적
		Object[] objStr = list.stream()
				.map(str -> str.toUpperCase())
				.filter(str -> str.length() >= 5)
				.toArray();
		
		String[] passStr = new String[objStr.length];
		
		for(int i = 0; i < objStr.length; i++) {
			passStr[i] = objStr[i].toString();
		}
		
		return passStr;
	}
	
	//10
	public static Person[] overThirtyAgeFind() {
		//문제 의도는 ["Lee","Choi"]식으로 String출력
		//.filter와 .map사용하여 풀어야 됨
		List<Person> list = Arrays.asList(
				new Person("Kim", 20),
				new Person("Lee", 35),
				new Person("Park", 28),
				new Person("Choi", 40)
				);
		
		Object[] filterObj = list.stream()
								.filter(p -> p.age >= 30).toArray();
		
		Person[] passPerson = new Person[filterObj.length];
		
		for(int i = 0; i < filterObj.length; i++) {
			passPerson[i] = (Person)filterObj[i];
		}
		
		return passPerson;
	}
	
	
}
class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name;
	}
}