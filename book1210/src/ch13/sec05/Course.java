package ch13.sec05;

public class Course {
	
	//모든 사람
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course1을 등록함");
	}
	//학생
	public static void registerCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course2를 등록함");
	}
	//직장인,일반인
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course3을 등록함");
	}
}
