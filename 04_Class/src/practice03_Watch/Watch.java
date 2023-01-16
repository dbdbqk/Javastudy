package practice03_Watch;

public class Watch {

	// 필드
	private int hour;  // 0 ~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	// 메소드
	
	public void addHour(int addHour) {
		int mod = addHour % 24;
		if(addHour / 24 >= 1) {
			hour += mod;
			System.out.println(addHour + "시간 후" + "(" + mod + "시간" + ")");
			}
		else {hour += addHour;
		System.out.println(addHour + "시간 후");
			}
	}
	
	public void addMinute(int addMinute) {
		int div = addMinute / 60;
		int mod = addMinute % 60;
		if(div >= 1) {
			hour += div;
			minute += mod;
			System.out.println(addMinute + "분 후" + "(" + (div % 24) + "시간 " + mod + "분" + ")");
			}
			else {
				minute += addMinute;
				System.out.println(addMinute + "분 후");
			}
		}
	
	public void addSecond(int addSecond) {
		int div = addSecond / 60;
		int mod = addSecond % 60;
		int addMin = 0;
		int addHo = 0;
		if(div >= 1) {
			addMin += div % 60;
			addHo += addMin % 60;  
			minute += addMin;
			second += mod;
			hour += addHo;
			System.out.println(addSecond + "초 후" + "(" + (addHo % 24) + "시간 " + (addMin % 60) + "분 " + mod + "초" + ")");
		}
		else {
			second += addSecond;
			System.out.println(addSecond + "초 후");
		}
	
		
	}
	
	
	// 시간
	public void see() {
		
		hour = hour % 24;
		minute = minute % 60;
		second = second % 60;
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
	
	
	
}
