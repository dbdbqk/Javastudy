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
		System.out.println("현재 등록된 차량은 : " + idx + "대"); //현재 등록된 차량은 idx 대
		if(idx == cars.length) {  // 최대 10대까지 등록, 10대가 다 차면 등록 불가
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
	
		System.out.println("차량번호와 모델명을 순서대로 입력하세요");  //이렇게도 가능
		Car car = new Car(sc.next(), sc.next());
		cars[idx++] = car;  //  ----> cars[0] = car;   cars[1] = car; .... // 이런방법도 있음
		System.out.println("차량번호 " + car.getCarNo() + "차량이 등록 되었습니다.");
	/*	public void addCar() {
			System.out.println("현재 등록된 차량 : " + idx + "대");
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
		}*/
	}
	
	
	public void deleteCar() {
		if(idx == 0) {
			System.out.println("차량이 없습니다.");
		}
		
	}
	
	public void printAllCars() {
		for(int n = 0; n < idx; n++) {
			System.out.println(cars[n].getCarNo() + cars[n].getModel());
			
		}
	}
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료>>> ");
			
			String choice = sc.next();
			switch(choice) {
			case "1": 
				addCar();	// addCar 호출
				break;
			case "2":
				deleteCar();
				break;
			case "3":
				printAllCars();
				break;
			case "0":
				return;			// return; manage 메소드 종료 만약 break;를 입력 하면 스위치가 끝나서 무한 while에 걸림
				default :
					System.out.println("존재하지 않는 메뉴입니다..");
			}
			
		
		}
	}
	
}
