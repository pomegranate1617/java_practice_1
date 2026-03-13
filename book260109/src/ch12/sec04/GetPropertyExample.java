package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		String userHome=System.getProperty("user.Home");
		String spec=System.getProperty("java.specification.version");
		String home=System.getProperty("java.home");
		String dir=System.getProperty("user.dir");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(spec);
		System.out.println(home);
		System.out.println(dir);
		
		System.out.println("-----------------");
		System.out.println("key:value");
		System.out.println("----------------");
		Properties props=System.getProperties();
		Set keys=props.keySet();
		for(Object objKey:keys) {
			String key =(String)objKey;
			String value=System.getProperty(key);
			System.out.printf("%-40s: %s\n", key,value);
		}
	}
}
