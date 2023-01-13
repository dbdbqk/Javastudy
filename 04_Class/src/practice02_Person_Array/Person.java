package practice02_Person_Array;

public class Person {
	
	// 필드
	private String name;
	private int age;
	
	//생성자  디폴트 생성자는 생성자가 없을 경우에만 디폴트 생성자 사용 생성자 있으면 만들어줘야함
	public Person() { }  // new Person()
	public Person(String name, int age) { // new Person("alice", 20)
		this.name = name;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
