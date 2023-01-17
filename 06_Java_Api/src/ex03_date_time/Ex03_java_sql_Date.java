package ex03_date_time;

import java.sql.Date;

public class Ex03_java_sql_Date { // 날짜의 long 타입은 타임스탬프 값  long date

	public static void main(String[] args) {

		Date now = new Date(System.currentTimeMillis()); // 이걸 사용 할 일이 없음.
		System.out.println(now);	// 몰라도 된다.
		
	}

}
