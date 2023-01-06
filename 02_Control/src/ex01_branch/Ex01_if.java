package ex01_branch;

public class Ex01_if {

	

	
	
	public static void ex01() {
	
		// if 문
		// if(score >= 60); 는 안됨 마침표이기 때문에 조건전에 마침.
		int score = 50;
		
		if(score >= 60)
			System.out.println("합격");
		
		if(score <60)
			System.out.println("불합격");
	}
	
	public static void ex02() {
		
		// if 문의 중괄호 if문의 적용범위는 1가지, 2가지로 늘리려면 중괄호를 이용
		// 실행문이 1개인 경우 생략할 수 있다.
		// 실행문이 2개 이상인 경우 반드시 필요하다.
		// 보편적으로는 실행문이 1개여도 중괄호를 사용함
		
		int score = 50;
		
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다.");
		}
		if(score < 60) { // else { 이렇게 하면 됨 이 상황은 단지 테스트
			System.out.println("불합격");
			System.out.println("보충수업입니다.");
		}
	}
	public static void main(String[] args) {
		ex02();
		
		
		
		
	}

}
