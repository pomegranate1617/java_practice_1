package book260126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
	//학생 한명
	private String name;
	private int age;
	//반에서 번호가 몇번인지?
	private int number;
	//몇 반인지?
	private OneClass personalClass; 
	private int score;
	private String telephone;
	//생성자
	public Student(String name,int age,int score) {
		this.name=name;
		this.age=age;
		this.score=score;
	}
	//메서드
	//setter
	public void setScore(int score) {
		this.score=score;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	//getter
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public String getTelephone() {
		return this.telephone;
	}
	
	
}
