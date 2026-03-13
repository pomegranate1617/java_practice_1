package book;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorStudent {
	private String name;
	private int age;
	private List<Integer> scores;
	private int personalTotal;
	private double personalAvg;
	
	
	public VectorStudent(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//----------------------------------------
	
	//점수입력 메서드
	public List<Integer> inputScore(Scanner scanner) {
		List<Integer> score=new Vector<>();	
		while(true) {
				System.out.println("점수를 입력하세요.");
				int inScore=scanner.nextInt();
				scanner.nextLine();
				if(inScore==-1) {
					System.out.println("점수입력을 중단합니다.");
					return score;
				}
				score.add(inScore);
			}	
		}
	//점수목록 setter
	public void setScores(List<Integer> list) {
		this.scores=list;
	}
	//점수목록 getter
	public List<Integer> getScores() {
		return this.scores;
	}
	//총합설정 메서드(setter)
	public void setTotal(List<Integer> list) {
		this.personalTotal=0;
		for(int i=0;i<list.size();i++) {
			personalTotal+=list.get(i);
		}
	}
	//총합반환 메서드(getter)
	public int getTotal() {
		System.out.println("총합:"+this.personalTotal);
		return this.personalTotal;
	}
	//평균설정 메서드(setter)
	public void setAvg(int total,List<Integer> list) {
		this.personalAvg=total/(double)(list.size());
	}
	//평균반환 메서드(getter)
	public double getAvg() {
		System.out.println("평균:"+this.personalAvg);
		return this.personalAvg;
	}
	

}
