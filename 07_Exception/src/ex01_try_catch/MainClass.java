package ex01_try_catch;

import java.util.Scanner;

public class MainClass {

	public static void ex01() {

		try {
		
			String[] season = new String[4];
			
			season[0] = "spring";
			season[1] = "summer";
			season[2] = "autumn";
			season[3] = "winter";
			season[4] = "what??";
			for(String str : season) {
				System.out.println(str.substring(0, 3)); // 예외 처리가 없어도 돌아감 season[3]은 현재 널 값이라 substring 사용 못해서 오류가 나옴
			}
		} catch(Exception e) {  // 모든 예외는 Exception으로 처리 가능 이름은 e로 만듬 
			System.out.println("ArrayIndexOutofBoundException 발생");
			
		}
			
		
	}
	
	public static void ex02() {
		try {
			
		String input = "1,2,3, ,4,5";
		String[] numbers = input.split(",");
		int[] iNumbers = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			iNumbers[i] = Integer.parseInt(numbers[i]);
			System.out.println(iNumbers[i]);
			}
		}catch(NumberFormatException e) {	// Unchecked Exception이므로 RuntimeException 가능
			System.out.println("NumberFormatException 발생");
		}
		
	}
	
	public static void ex03() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("덧셈식을 입력 하시오(1+2) >>>");
			String expr = sc.next();
			String[] item = expr.split("[+]");   // +로 나눠달라
			int number1 = Integer.parseInt(item[0]);
			int number2 = Integer.parseInt(item[1]);
					System.out.println(number1 + number2);
					sc.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("+를 포함해서 입력하세요.");
		} catch(NumberFormatException e) {
			System.out.println("정수 덧셈만 가능합니다.");
		} catch(Exception e) {								// 마지막 catch 블록은 Exception으로 모든 예외를 처리한다.
			System.out.println("예외가 발생했습니다.");
		}
		
		}
	
	

	public static void main(String[] args) {
		ex03();
		
		
		
	}

}
