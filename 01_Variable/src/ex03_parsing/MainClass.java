package ex03_parsing;

public class MainClass {

	public static void main(String[] args) {

		// 구문 분석(parsing)
		// 문자열을 기본 타입으로 변화는 과정으로 의미한다.
		
		String strScore = "90";
		String strMoney = "10000000000";
		String strEye = "0.7";
		
		// String -> int로 변환 (Integer.parseInt)
		int score = Integer.parseInt(strScore);
		System.out.println(score);
		
		// String -> long으로 변환 (Long.parseLong)
		long money = Long.parseLong(strMoney);
		System.out.println(money);
		
		// String -> double로 변환 (Double.parseDouble)
		double eye = Double.parseDouble(strEye);
		System.out.println(eye);
		
	}

}
