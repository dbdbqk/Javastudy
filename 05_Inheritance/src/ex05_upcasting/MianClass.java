package ex05_upcasting;

public class MianClass { // 중요함 장단점 모두 기억 하기 

	/*
		업캐스팅
		1. upcasting
		2. 자식 클래스 객체를 부모 클래스 타입으로 저장할 수 있다.
		3.강제로 캐스팅하지 않아도 자동으로 처리된다.      * 자식을 저장 할 때는 보통 부모에 저장 한다. *
	*/
	/*
		업캐스팅의 장점
		1. 하나의 클래스로 여러 가지 객체를 저장할 수 있다.
		2. 부모 타입으로 모든 자식 객체를 저장할 수 있다.  * 후손 객체도 부모 타입으로 저장 가능 *
		3. 부모 타입 배열 선언 하나로 모든 자식 객체를 저장할 수 있다.
	*/
	/*
		업캐스팅의 단점
		1. 부모 타입으로 저장되기 때문에 부모 클래스의 메소드만 호출할 수 있다.
		2. 자식 클래스의 메소드를 호출할 수 있도록, 부모 클래스에도 자식 클래스에서 호출할 메소드를 추가해 준다.
	*/
	public static void main(String[] args) {

		// 부모 타입 선언
		Person person;
		
		// 자식 객체 선언
		person = new Student();
		
		//메소드 호출 확인하기
		person.eat();
		person.sleep();
		person.study(); 
		
		/*
		 	Person person;
		 	person = new Student();
			person.study() 동작 방식

			1. Person person이므로 Person 클래스의 study 메소드를 호출한다.
			2. study 메소드를 실행하기 위해서 person 객체를 확인한다.
			3. person = new Student()이므로 Student 클래스의 study 메소드를 가져온다.
			4. 최종적으로 Student 클래스의 study 메소드가 실행된다.
		*/
		
	}

}
