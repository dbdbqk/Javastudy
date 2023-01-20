package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	

	public void addCar() {
		System.out.println("현재 등록된 차량은 : " + idx + "대");
		if(idx == cars.length) {  
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
	

			System.out.print("차량번호 >>> ");
			String carNo = sc.next();
			System.out.print("모델 >>> ");
			String model = sc.next();
			cars[idx++] = new Car(carNo, model);
			System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		
	}
	
	
	public void deleteCar() {
		if(idx == 0) {
			System.out.println("차량이 없습니다.");
			return;
		}
		System.out.print("제거할 차량번호 >>> ");
		String number = sc.next(); 
		// String carNo = sc.next();   // 문제풀이
		for(int i = 0; i < idx; i++){
			// Car car = cars[i]; <-- 이걸 빼먹음
				if(number.equals(cars[i].getCarNo())) {
					System.out.println("차량번호 " + cars[i].getCarNo() + " 차량이 삭제되었습니다.");
					cars[i] = cars[--idx];   // 여기서 cars[i] = cars[idx - 1];
					return;					// 빠진 차량 idx에 널값 저장 cars[--idx] = null; << 이 널값을 저장 해야하는데 빠져버림
				} 
	/* for(int i = 0; i <idx; i++) {
			Car car = cars[i];
			if(carNo.equals(car.getCarNo())) {
				- 방법1. 마지막 차량을 제거된 위치로 옮겨오기 - 
				* 제거할 차량의 위치 : i *
				* 마지막 차량의 위치 : idx - 1 *
				cars[i] = cars[idx -1];
				cars[--idx] = null;
				return;	
				- 방법2. 삭제할 요소의 뒤에 있는 것들을 모두 한 칸씩 앞으로 옮기기 -
				System.arraycopy(cars, i + 1, cars, i, idx-i-1<땡겨올갯수>)
								요기를		여기로		몇개를
				cars[--idx] = null;
				sysout("차량번호" + carNo + "인 차량이 삭제되었습니다.");		
			}	
		}
	*/					
				
		}
		System.out.println("대상 차량이 존재하지 않습니다.");
	}
	
	
	
	public void printAllCars() {
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다..");
			return;
		}
		System.out.println(name + " 차량 목록");
		for(int n = 0; n < idx; n++) {
			System.out.println(cars[n]);
			// 문제 풀이
			//Car car = cars[i];   <---- 정답
			//sysout(car);
			
			/*	for(int i = 0; i < cars.length; i++) {  // 이건 널값까지 다 불러와서 널값을 제외 후 출력 
			 	Car car =cars[i];
			  	if(car != null) {
			  	sysout(car);
			  	
			  	for(Car car : cars) {      // 향상포문
			  	sysout(car)
			  	}
			 
			 */
		}
	}
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료>>> ");
			
			String choice = sc.next();
			switch(choice) {
			case "1": 
				addCar();	
				break;
			case "2":
				deleteCar();
				break;
			case "3":
				printAllCars();
				break;
			case "0":
				System.out.println("종료합니다.");
				return;			
				default :
					System.out.println("존재하지 않는 메뉴입니다..");
			}
			
		
		}
	}
	
}
