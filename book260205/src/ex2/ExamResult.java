package ex2;

public class ExamResult implements Comparable<ExamResult>{
	//1번 모르겠다 패스
	private String name;
	private Integer score;
	//점수가 null이 아닌학생 먼저 오름차순
	//점수가 둘다 null이 아닌경우 점수 내림차순
	
	//이름이 null이면 항상 뒤로
	
	
	@Override
	public int compareTo(ExamResult o) {
		//Integer는 객체
		//점수 내림차순
		//점수가 null이 아닌학생 먼저 오름차순
		//둘다 점수가 null이 아닌경우->
		if((this.score !=null) && (o.score != null)) {
			if(!this.score.equals(o.score)) {
				return (int)Integer.compare(o.score,this.score);
			}
			//점수가 같으면 이름 오름차순
			//이름이 둘다 null이 아닌경우
			if(this.name !=null && o.name !=null) {
				return this.name.compareTo(o.name);
			}
			//이름이 하나만 null인경우 null이 아닌게 먼저
			if(this.name ==null ^ o.name ==null) {
				if(this.name ==null) {
					return 1;
				}
				else {
					return -1;
				}
			}
			//이름 둘다 null인경우동등
			return 0;
		}
		//점수가 null인경우 무조건 1
		//둘중 하나가 null인경우
		//--------------------------------------------------
		else if(this.score ==null ^ o.score ==null) {
			if(this.scoreNullCheck()!=2) {
				//this가 뒤에 정렬
				return 1;
			}
			else {
				//this가 앞으로 정렬
				return -1;
			}
			
		}
		//---------------------------------------------------
		//모두 점수가 null인경우
		else {
			//이름 오름차순
			//이름이 둘다 null이 아닌경우
			if(this.name != null && o.name != null) {
				return this.name.compareTo(o.name);
			}
			//이름이 하나만 null인 경우
			else if(this.name ==null ^ o.name ==null) {
				if(this.nameNullCheck() !=2) {
					//this가 null일 경우 this가 뒤로 정렬
					return 1;
				}
				//this가 null이 아니고 o가 null일 경우 this는 앞으로 정렬
				else return -1;	
			}
			//이름이 모두 null인경우(점수,이름 모두 null인경우->동등 객체)
			else {
				return 0;
			}
				
			
		}
		
	}
	//메서드
	public int scoreNullCheck() {
		if(this.score==null) {
			return -1;
		}
		else return 2;//만약 2가 나오면 null이 아닌거
	}
	public int nameNullCheck() {
		if(this.name == null) {
			return -1;
		}
		else return 2;//만약 2가 나오면 null이 아닌거
	}
}
