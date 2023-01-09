package ex01_one_dim;

public class Ex02_reference {
	/*int[] arr;
	
	arr = new int[5];
	
	System.out.println(arr);
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
arr, arr[0], arr[1], arr[2], ... arr[6]	*/ 
			
			
	public static void ex01() {
		
		int[] arr;
		
		arr = new int[5];
		
		System.out.println(arr); // 5개 배열 요소의 참조(주소, 번지) 값 @ 뒷 부분이 참조 값
		
		
		
	}

	public static void ex02() {
		
		int[] a = new int[5];
		int[] b;
		
		b = a;
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 
	}
	
	public static void ex03() { // 심화
		
		// 생성된 배열의 크기를 늘이는 방법
		
		// 기존 배열
		int[] a = new int[5];
		
		// 신규 배열
		int[] b = new int[10];
		
		// 기존 배열 요소를 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		ex03();

		
		
	}

}
