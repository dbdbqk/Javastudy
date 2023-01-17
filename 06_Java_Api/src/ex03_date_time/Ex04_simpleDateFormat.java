package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_simpleDateFormat {

	/* 그래도 조금은 외워두는게 좋음    	날짜 형식
		형식
		1. yy	:	23
		2. yyyy	:	2023
		3. M	:	1
		4. MM	:	01
		5. MMM	:	1월
		6. d	:	17
		7. dd	:	17
		8. E	:	화
		9. a	:	오후
		10.	h	:	2	(1 ~ 12)
		11. hh	:	02
		12. H	:	14 	(0 ~ 23)
		13.	HH	:	14	(00 ~ 23)
		15.	m	:	8	(0 ~ 59)
		15.	mm	:	08	(00 ~ 59)
		16.	s	:	30	(0 ~ 59)
		17.	ss	:	30	(00 ~ 59)
	*/
	
	public static void pratice() {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MMM/dd/E a hh시 mm분");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
	}
	
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);		
		
		pratice();
		
	}

}
