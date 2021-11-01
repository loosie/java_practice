package chapter5;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day,int month,int year) {
		
		 this.setMonth(month);
		 this.setYear(year);	
		 this.setDay(day);
	}
	
	public boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		
		switch(month) {
			case 1: case 3:case 5:case 7:case 8:case 10: case 12: 
				if(day>31 || day<1) {
					isValid = false;
				}
				else {
					this.day = day;
					isValid =true;
				}
				break;
		
		
			case 4:case 6:case 9:case 11:		
				if(day>30 || day<1) {
					isValid =false;
				}
		
				else {
					this.day =day;
					isValid =true;	
				}
				break;
				
			case 2:
				if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //윤년인 경우
					if (day <0  || day >29) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}
				else {
					if (day <0 || day >28) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}
				break;	
			default:
				isValid = false;
		}
					
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
	
	public void isValid() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월" + day + "일 입니다.");
		}
		else
			System.out.println("달력에 존재 하지 않는 날짜 입니다.");
	}
	
	
	
}
