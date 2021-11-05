package hiding;

public class MyDate {

//	접근제어자
//	default : 같은 패키지내에서
//	public -> 다른 패키지에서도 사용 가능
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;

	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
//	alt shift s & getters and setters
//  중요한 정보는 set을 제공안할 수 도 있음
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}
		else {
			this.month = month;
			isValid = true;
		}

	}

	public void setYear(int year) {
		
		this.year = year;
	}

	public void showDate() {
		if(isValid) {
		System.out.println(year + "년 " + month +"월 " + day + "일");
	}
		
		else
			System.out.println("유효하지 않은 날짜 입니다.");
		
	}
	
}
