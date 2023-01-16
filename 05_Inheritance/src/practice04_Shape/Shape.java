package practice04_Shape;  // 인터페이스는 필드 가지지 못함, 파이널처리로 상수는 가질 수 있음.

public interface Shape {

	// final 상수
	public final static double PI = 3.141592;
	
	// 추상 메소드
	public double getArea();	//	도형의 넓이를 반환
	
	
}
