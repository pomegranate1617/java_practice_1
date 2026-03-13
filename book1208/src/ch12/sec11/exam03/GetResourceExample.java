package ch12.sec11.exam03;

import java.util.Arrays;
import java.util.Calendar;

public class GetResourceExample {

	public static void main(String[] args) {
		Class clazz=Car.class;
		
//		String photo1Path=clazz.getResource("photho1.jpg").getPath();
//		String photo2Path=clazz.getResource("images/photo2.jpg").getPath();
//		
//		System.out.println(photo1Path);
//		System.out.println(photo2Path);
		
		String specName=System.getProperty("java.specification.version");
		System.out.println(specName);
		String data="자바";
		byte[] arr1=data.getBytes();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String str1=new String(arr1);
		System.out.println(str1);
		
		Integer obj1=300;
		
		Calendar now=Calendar.getInstance();
		
		int year=now.get(Calendar.YEAR);
		System.out.println(year);
	
	}

}
