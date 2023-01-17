package ex02_ranbom;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	public static void main(String[] args) {  // 보안이 필요한 랜덤은 이거 쓰자

		// java.security.SecureRandom
		
		SecureRandom secureRandom = new SecureRandom();
		
		// 정수 난수
		int dice = secureRandom.nextInt(6) + 1;
		System.out.println(dice);
		
	}

}
