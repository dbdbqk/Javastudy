package practice02_soldier;

/*
	has a 관계
	1. 상속 관계로 만들 수 있는 관계이다.
	2. Soldier has a Gun (총의 기능을 솔져가 사용 할 수 있다)
	3. 자식 has a 부모   
	
	* 사용 하는 경우가 상대적으로 덜 나옴 주로 is a 상속관계 많이 사용*

*/
public class Gun {

	// 필드
	private String model;
	private int bullet;
	private final int MAX_BULLE = 20;
	
	
	// 메소드
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getBullet() {
	return bullet;
}
public void setBullet(int bullet) {
	this.bullet = bullet;
}
	
	// 총알 넣기
	public void reload(int bullet) {
		if(this.bullet == MAX_BULLE) {
			return;
		}
			this.bullet += bullet;
			this.bullet = (this.bullet > MAX_BULLE)? MAX_BULLE : this.bullet;
		
	}

	// 총 쏘기
	public void shoot() {
		if(bullet == 0) {
			System.out.println("헛빵");
			return;
		}
		bullet--;
		System.out.println("빵");
		
	}
	
}
